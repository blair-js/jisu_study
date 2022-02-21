package com.algorithm.chap01;

import java.util.Scanner;

public class Gaus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0; 
		
		if(n%2 == 0) { //짝수이면
			sum = (1+n)*(n/2);
		}else {
			sum = (1+n)*(n/2)+(n/2+1);
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
		
	}

}
