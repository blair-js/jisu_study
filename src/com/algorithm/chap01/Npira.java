package com.algorithm.chap01;

import java.util.Scanner;

public class Npira {

	static void npira(int n) {
		
		//공식은 트리모양별찍기랑 동일
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { //공백 출력
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) { //숫자 출력
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 : ");
		int n = sc.nextInt();
		
		npira(n);
	}

}
