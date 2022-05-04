package com.programmers;

import java.util.Scanner;

public class P0504_4 {
	//자릿수 더하기
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		while(n>0) {
			sum += n%10; //나머지를 누적하면 됨
			n/=10;
		}
		
		System.out.println(sum);
	}

}
