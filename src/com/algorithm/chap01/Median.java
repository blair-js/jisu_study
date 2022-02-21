package com.algorithm.chap01;

import java.util.Scanner;

public class Median {

	static int median(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b; 
			}else if(a <= c) {
				return a; 
			}else {
				return c;
			}
		//위의 if문을 충족하지 못했으니 a < b인 상황
		}else if(a > c) {
			return a;
		//a < b 이고, a < c 인 경우
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		
		System.out.println("중앙값은 " + median(a, b, c) + "입니다.");
	}

}
