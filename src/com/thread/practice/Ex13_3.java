package com.thread.practice;

public class Ex13_3 {

	static long startTime = 0; 
	
	public static void main(String[] args) {
		
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		
		startTime = System.currentTimeMillis(); //����ð�
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}//for
		System.out.println("�ҿ�ð�1 : " + (System.currentTimeMillis() - startTime));
	}

}

class ThreadEx3_1 extends Thread{
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}//for
		System.out.println("�ҿ�ð�2 : " + (System.currentTimeMillis() - Ex13_3.startTime));
	}//run
}