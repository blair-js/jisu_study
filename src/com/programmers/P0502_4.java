package com.programmers;

import java.util.Scanner;

public class P0502_4 {
	//�ϻ��� �� 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���1.���ڿ��� �޾Ƽ� �ϱ�
		/*String str = sc.nextLine();
		int n = 0;
		
		for(int i=0; i<str.length(); i++) {
			n += Character.getNumericValue(str.charAt(i));
			System.out.println(n);
		}
		
		System.out.println(Integer.parseInt(str)%n == 0 ? true : false);*/
		
		//���2.int������ �޾Ƽ� �ϱ�
		//�ʱ⿡ �Է¹޴� ��
		int harsa = sc.nextInt();
		
		int n = harsa; //�ʱⰪ�� ���� n�� �����ϰ� �ݺ��� ���� �ڸ����� ���� ���ҿ���
		int c = 0; //�ڸ����� ���� ���� c
		
		while(n>0) {
			c += n%10; //n�� 10���� ���� �������� ���Ѵ�
			n/=10;
		}
		
		//�ʱ⿡ �Է¹��� ���� �������� �ڸ����� ������ ���� �������� 0�̸� �ϻ����� �� �̴�.
		System.out.println(harsa%c == 0? true : false);
	}

}
