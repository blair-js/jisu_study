package com.thread.practice;

public class Ex13_11 {

	static long startTime = 0; 
	
	public static void main(String[] args) {

		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		th1.start();
		th2.start();

		startTime = System.currentTimeMillis();

		//join()�� ���
		//������ �ڵ尡 ���ٸ�, main ������� th1, th2�� �۾��� ��ٸ��� �ʱ� ������, 
		//�߰��� �ٷ� �ҿ�ð��� ������. 
		//������ �� �ڵ尡 ������ �ҿ�ð��� ���� �������� ������ �ȴ�. 
		try {
			th1.join(); //main �����尡 th1�� �۾��� ���������� ��ٸ���
			th2.join(); //main �����尡 th2�� �۾��� ���������� ��ٸ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�ҿ�ð� : " + (System.currentTimeMillis() - startTime)); //���� �ð����� ������ ���� �� �ð��� ���ָ� �ҿ�ð� ��� ����
	}//main
}

class ThreadEx11_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}//run
}

class ThreadEx11_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}//run
}