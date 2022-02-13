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
			th1.suspend(); //th1 ��� �ߴ�
			Thread.sleep(2000);
			th2.suspend(); //th2 ��� �ߴ�
			
			Thread.sleep(3000);
			th1.resume(); //th1 �ٽ� ���� 
			
			Thread.sleep(3000);
			th1.stop(); //th1 ���� ����
			th2.stop(); //th2 ���� ����
			Thread.sleep(2000);
			th3.stop();
			
		} catch (InterruptedException e) {	}
		
	}//main

}

class MyThread implements Runnable{
	volatile boolean suspended= false; //volatile : �ش� ������ ���� ���� ���� �ٲ�� �����̴�. 
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
