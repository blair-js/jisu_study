package com.thread.practice;

import javax.swing.JOptionPane;

public class Ex13_9 {

	public static void main(String[] args) {

		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //���� interrupted �� ���� => false
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); //��� ���� �Է��ϰ� �Ǹ� interrupted ���°� true�� �ٲ�鼭 
																		//th1 �������� ī��Ʈ �ٿ��� ���߰� ����Ǿ��ٴ� ��¹� ���
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
		th1.interrupt(); //interrupt()�� ȣ���ϸ�, interrupted ���°� true�� �ȴ�. 
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //���� interrupted �� ���� => true 
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //���� interrupted �� ���� => true
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //���� interrupted �� ���� => true
		//main �����尡 ���ͷ�Ʈ �Ǿ����� Ȯ��(th1 �����带 Ȯ���ϴ� ���� �ƴϴ�!!!!!!!!!!)
		//System.out.println("interrupted() : " + th1.interrupted()); //���� interrupted �� ���� => false
		//th1����Ű�� ��ó�� �������� ���������δ� main �����带 ����Ű�� �ִٴ� �� ����. static �޼ҵ��̴�.!!!
		System.out.println("interrupted() : " + Thread.interrupted()); //���� interrupted �� ���� => false
		System.out.println("===");
	}

}

class ThreadEx9_1 extends Thread{
	public void run() {
		int i = 10; 
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++); //�ð����� �ݺ���
		}//while
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
		
		System.out.println("isInterrupted() : " + this.isInterrupted()); //true
		System.out.println("isInterrupted() : " + this.isInterrupted()); //true
		//isInterrupted()�� �޸� interrupted()�� interrupted��� ���� ������ false�� �ʱ�ȭ �Ѵ�. 
		System.out.println("interrupted() : " + Thread.interrupted()); //true
		System.out.println("interrupted() : " + Thread.interrupted()); //false
	}
}