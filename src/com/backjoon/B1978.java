package com.backjoon;

import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0; //소수의 개수 
		
		while(n-- > 0) {
			boolean prime = true;
			
			int p = sc.nextInt(); 
			
			for(int i=2; i<=p-1; i++) {
				if(p%i == 0) {
					prime = false;
					break;
				}
			}//for

			if(prime && p != 1) {
				cnt++;
			}
			
		}//while
		
		System.out.println(cnt);
	}
}
