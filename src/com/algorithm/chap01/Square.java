package com.algorithm.chap01;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 :");
		int dan = sc.nextInt();
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
