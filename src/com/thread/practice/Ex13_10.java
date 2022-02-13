package com.thread.practice;

public class Ex13_10 {

	public static void main(String[] args) {

		//RunImplEx10 r = new RunImplEx10();
		
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend(); //th1 잠시 중단
			Thread.sleep(2000);
			th2.suspend(); //th2 잠시 중단
			
			Thread.sleep(3000);
			th1.resume(); //th1 다시 동작 
			
			Thread.sleep(3000);
			th1.stop(); //th1 강제 종료
			th2.stop(); //th2 강제 종료
			Thread.sleep(2000);
			th3.stop();
			
		} catch (InterruptedException e) {	}
		
	}//main

}

class MyThread implements Runnable{
	volatile boolean suspended= false; //volatile : 해당 변수의 변수 값이 쉽게 바뀌는 변수이다. 
	volatile boolean stopped = false;
	
	Thread th; 
	
	public MyThread(String name) {
		th = new Thread(this, name); //Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {	}
			}//if
		}//while
	}//run
}
