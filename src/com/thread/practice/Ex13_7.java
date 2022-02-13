package com.thread.practice;

public class Ex13_7 implements Runnable{

	static boolean autoSave = false;
	
	public static void main(String[] args) {

		Thread t = new Thread(new Ex13_7());  
		t.setDaemon(true); //t를 데몬쓰레드로 지정 => 이 부분이 없으면 종료되지 않는다.
		t.start(); //이 때 이 start() 메소드가 위의 데몬쓰레드 지정하는것보다 먼저 올라가면, 위의 t쓰레드를 데몬쓰레드로 지정할 수 없으니 주의해야한다.
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==5) {
				autoSave = true; //5가 되면 종료되도록 false로 변경 
			}
		}//for

		System.out.println("프로그램을 종료합니다.");
	}//main
	
	//Runnable 을 구현하였기 때문에 run() 메소드 작성 
	//바로 이것 run() 메소드가 데몬쓰레드 t가 하는일이다.
	public void run() {
		while(true) { //무한루프 => 하지만main쓰레드가 종료되면 이 데몬쓰레드의 기능도 종료된다.
			try {
				Thread.sleep(3*1000); //3초마다 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//autoSave의 값이 true 이면 autoSave() 메소드를 호출한다.
			if(autoSave) {
				autoSave();
			}//if
			
		}//while
	}//run
	
	public void autoSave() {
		System.out.println("파일이 자동저장되었습니다.");
	}

}

