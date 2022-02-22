package com.algorithm.chap01;

import java.util.Scanner;

public class StarTree {

	static void spira(int n) {
		/* 규칙을 보면 별의 갯수는 "해당행*2-1" 이다. 
		 * 앞의 공백의 갯수는 "전체행-해당행" 이다. (뒤의 공백은 신경쓰지 않아도 됨)
		    * 
		   ***
		  *****
		 ******* 
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { //공백 출력
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) { //별 출력
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 : ");
		int n = sc.nextInt();
		
		spira(n);
	}

}
