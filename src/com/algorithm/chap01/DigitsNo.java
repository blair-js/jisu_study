package com.algorithm.chap01;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int num = sc.nextInt();
		int count = 0; //�� �� ���� �� �ִ��� üũ�ϴ� ���� => �ڸ����� �� ��
		do {
			count++;
			num/=10; //10���� ������
		}while(num > 0); //���� 0���� Ŭ������ => ���߿� ���ڰ� �� �ڸ����� �Ǹ� ���� 0�� �ȴ�.
		
		System.out.println("�� ���� " + count + "�ڸ� �Դϴ�.");
		
	}

}
