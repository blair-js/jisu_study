package com.programmers;

public class P0502_6 {
	//Æò±Õ ±¸ÇÏ±â
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		
		int sum = 0; 
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println((double)sum/arr.length);
	}

}
