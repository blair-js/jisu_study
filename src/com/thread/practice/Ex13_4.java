package com.thread.practice;

import javax.swing.JOptionPane;

public class Ex13_4 {
	
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���"); // �� ����¿��� blocking �߻�
		System.out.println("�Է��Ͻ� ���� : " + input + " �Դϴ�.");
		
		//�̱� ������
		//�Ʒ��� �ݺ�����
		//������ ����ڰ� �Է��� �ϱ� ������ �������� ����� �� ����. 
		for(int i=10; i>0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1�ʰ� ������
		}//for
	}//main

}
