package com.thread.practice;

import javax.swing.JOptionPane;

public class Ex13_5 {

	public static void main(String[] args) {
		
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
			
		//��Ƽ ������
		//�Ʒ��� �ݺ�����
		//th1 �����尡 ����ʰ� ���ÿ� ���� �۾��� �Ѵ�. => ����ڿ��� �Է��� �޴� �۾��� ī��Ʈ�ٿ��ϴ� �۾��� �и��Ǿ��� �����̴�.
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���"); // �� ����¿��� blocking �߻�
		System.out.println("�Է��Ͻ� ���� : " + input + " �Դϴ�.");
		
	}//main
}

class ThreadEx5_1 extends Thread{
	
	public void run() {
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1�ʰ� ������
		}//for
	}
}