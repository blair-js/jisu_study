package com.algorithm.chap01;

public class OnetoSeven {

	public static void main(String[] args) {

		int sum = 0; 
		
		for(int i=1; i<=7; i++) {
			
			sum += i; 
			
			if(i == 7) {
				System.out.print(i + "=" + sum);
			}else {
				System.out.print(i + "+");
			}
		}//for
		
	}//main

}
