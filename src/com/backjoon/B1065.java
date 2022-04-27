package com.backjoon;

import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�ڿ��� N �Է¹ޱ�
		
		int count = 0; //�Ѽ��� ����
		
		if(n < 100) { //1���� 99������ �Ѽ��̴�.
			count = n; //�ش� ���� count�� ����
		}else { //100�̻��� �� �� ���
			
			count = 99; //1���� 99������ ������ 99�� �ʱ�ȭ
			
			for(int i=100; i<=n; i++) { //100���� n������ �Ѽ��� ���� �˻�
				//a,b,c�� �� �ڸ��� ��� 
				//i�� 456�̶�� �����ϸ� 
				int a = i/100; //�����ڸ� : 456/100 = 4
				int b = (i/10) % 10; //�����ڸ� : (456/10)%10 => 45%10 = 5
				int c = i % 10; //�����ڸ� : 456%10 = 6
				
				if(b-a == c-b) { //������ �����ϴٸ�
					count++; //�Ѽ� ���� ����
				}//if
			}//for
			
		}//if~else
		
		System.out.println(count);
		
	}

}
