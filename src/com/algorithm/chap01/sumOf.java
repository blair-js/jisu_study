package com.algorithm.chap01;

import java.util.Scanner;

public class sumOf {

	static int sumof(int a, int b) {
		
		int min = a;
		int max = b; 
		if(b < a) {
			min = b; 
			max = a;
		}
		
		int sum = 0;
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a �Է� : "); int a = sc.nextInt();
		System.out.print("b �Է� : "); int b = sc.nextInt();
		
		System.out.println(a + "�� " + b + " ������ �� = " + sumof(a, b));
		
	}

}
