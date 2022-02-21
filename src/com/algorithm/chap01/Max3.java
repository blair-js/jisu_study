package com.algorithm.chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		
		//a를 먼저 max로 설정
		int max = a; 
		
		//b가 max보다 크다면 => 경우의 수는 1가지 b가 a보다 크다면
		if(b > max ) max = b;
		
		//c가 max 보다 크다면 => 경우의 수는 2가지 => b가 a보다 클 경우, b가 a와 b보다 클경우 
		if(c > max ) max = c;
		
		System.out.println("최댓값은 " + max + "입니다.");
		
	}

}
