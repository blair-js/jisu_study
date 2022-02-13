package com.thread.practice;

public class Ex13_8 {

	public static void main(String[] args) {
		
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		th1.start();
		th2.start();
		
//		try {
//			//th1.sleep(2000); //th1 2초동안 잠자게? => 그럴 수 없다. 자기 자신만 재울 수 있음. => main 쓰레드를 재운다. 이 코드는 헷갈리는 코드
//			Thread.sleep(2000); //위의 코드는 이렇게 해주어야 한다. => main 쓰레드를 재우는 것임
//		} catch (InterruptedException e) {	} //잠든 스레드가 일어나는 구문이므로 예외에 대한 처리를 해줄 필요는 없다. 단지 깨우기용으로 사용되는 느낌. 
		
		delay(2*1000); //아예 재우는 메소드를 따로 만들어 놓기 delay()
		System.out.println("<<main 종료>>"); //th1,th2 쓰레드가 모두 종료된 후 2초뒤에 출력 됨 
		
	}//main
	
	static void delay(long millis) {
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {	}
	}
}

class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
		System.out.println("<<th1 종료>>");
	}//run
}

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
		System.out.println("<<th2 종료>>");
	}//run
}
		
