package com.backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) { //공백출력
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) { //별 출력
				System.out.print("*");
			}
			System.out.println(); //개행
		}//for
		
	}

}
