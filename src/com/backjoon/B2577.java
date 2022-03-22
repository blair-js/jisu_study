package com.backjoon;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int result = num1 * num2 * num3;
		String str = String.valueOf(result);
		
		int[] arr = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			
			String s = String.valueOf(str.charAt(i));
			int n = Integer.parseInt(s);

			arr[n] = arr[n]+1;
		}//for
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
