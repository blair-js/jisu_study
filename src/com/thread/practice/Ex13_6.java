package com.thread.practice;

public class Ex13_6 {

	public static void main(String[] args) {

		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		//�켱������ 1-10���� ������ �� ������ 
		//���������� �������� �켱������ 32�ܰ�� �������� �ֱ⶧����
		//�츮�� �����ϴ�(th2�� ������ �ð��� ���� �� ���� ������)����� ��Ȯ�ϰ� ������ ���� ���� �ִ�. 
		//�� �츮�� set �ϴ� �켱������ ��������ϻ���. 
		//������� ���콺 �������� �켱������ ���� ����~~~��ȣ?
		
		//setPriority() �ش� �������� �켱������ �����ϴ� �޼ҵ�
		//th1.setPriority(5); //�⺻ �� 5�� ���� 
		th2.setPriority(7);
		
		//getPriority() ���� �������� �켱������ ������ �޼ҵ� 
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
		
	}//main

}

class ThreadEx6_1 extends Thread{

	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
			for(int x=0; x<100000000; x++); //�ð� ������ for�� => �ƹ��͵� ���ϰ� ������� ����.
		}//for
	}
	
	
}

class ThreadEx6_2 extends Thread{
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|")); //�ð� ������ for�� => �ƹ��͵� ���ϰ� ������� ����.
		}//for
	}
}