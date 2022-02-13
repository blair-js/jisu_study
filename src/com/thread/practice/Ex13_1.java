package com.thread.practice;

public class Ex13_1 {

	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread{ //Thread Ŭ������ ����Ͽ� ������ ����

	@Override
	public void run() { //������ ������ �۾��� �ۼ� 
		for(int i=0; i<5; i++) {
			System.out.println(this.getName()); //������ Thread�� getName() ȣ��, this�� ��������
		}
	}
	
}

class ThreadEx1_2 implements Runnable{ //Runnable �������̽��� �����ؼ� ������ ����

	@Override
	public void run() { //������ ������ �۾��� �ۼ� 
		for(int i=0; i<5; i++) {
			Thread.currentThread(); //���� �������� Thread�� ��ȯ�Ѵ�. 
			System.out.println(Thread.currentThread().getName());
			//Thread.currentThread() �� ���� �����带 �����ؾ��Ѵ�. �� ������ �ش� Ŭ������ Thread�� ��ӹ��� �ʾұ� �����̴�. 
		}
	}
	
}