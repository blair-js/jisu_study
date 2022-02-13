package com.thread.practice;

public class Ex13_8 {

	public static void main(String[] args) {
		
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		th1.start();
		th2.start();
		
//		try {
//			//th1.sleep(2000); //th1 2�ʵ��� ���ڰ�? => �׷� �� ����. �ڱ� �ڽŸ� ��� �� ����. => main �����带 ����. �� �ڵ�� �򰥸��� �ڵ�
//			Thread.sleep(2000); //���� �ڵ�� �̷��� ���־�� �Ѵ�. => main �����带 ���� ����
//		} catch (InterruptedException e) {	} //��� �����尡 �Ͼ�� �����̹Ƿ� ���ܿ� ���� ó���� ���� �ʿ�� ����. ���� ���������� ���Ǵ� ����. 
		
		delay(2*1000); //�ƿ� ���� �޼ҵ带 ���� ����� ���� delay()
		System.out.println("<<main ����>>"); //th1,th2 �����尡 ��� ����� �� 2�ʵڿ� ��� �� 
		
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
		System.out.println("<<th1 ����>>");
	}//run
}

class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
		System.out.println("<<th2 ����>>");
	}//run
}
		
