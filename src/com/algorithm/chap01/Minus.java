package com.algorithm.chap01;

import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a, b;
//		System.out.print("a�� �� : ");
//		a = sc.nextInt();
//		do {
//			System.out.print("b�� �� : ");
//			b = sc.nextInt();
//		}while(b<=a);
		
		System.out.print("a�� �� : ");
		a = sc.nextInt();
		while(true) {
			System.out.print("b�� �� : ");
			b = sc.nextInt();
			if(b>a) {
				break;
			}
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		
		int minus = b-a; 
		System.out.println("b-a�� " + minus + "�Դϴ�.");
	}

}
