package com.algorithm.chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� : "); int a = stdIn.nextInt();
		System.out.print("b�� �� : "); int b = stdIn.nextInt();
		System.out.print("c�� �� : "); int c = stdIn.nextInt();
		
		//a�� ���� max�� ����
		int max = a; 
		
		//b�� max���� ũ�ٸ� => ����� ���� 1���� b�� a���� ũ�ٸ�
		if(b > max ) max = b;
		
		//c�� max ���� ũ�ٸ� => ����� ���� 2���� => b�� a���� Ŭ ���, b�� a�� b���� Ŭ��� 
		if(c > max ) max = c;
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
		
	}

}
