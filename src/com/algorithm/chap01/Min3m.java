package com.algorithm.chap01;

public class Min3m {

	static int min3m(int a, int b, int c) {
		int min = a; 
		
		if(b < min) min = b;
		if(c < min) min = c; 
		
		return min;
	}
	
	public static void main(String[] args) {

		System.out.println("min3m(3, 2, 1) = " + min3m(3, 2, 1));
		System.out.println("min3m(3, 2, 2) = " + min3m(3, 2, 2));
		System.out.println("min3m(3, 1, 2) = " + min3m(3, 1, 2));
		System.out.println("min3m(3, 2, 3) = " + min3m(3, 2, 3));
		System.out.println("min3m(2, 1, 3) = " + min3m(2, 1, 3));
		System.out.println("min3m(3, 3, 2) = " + min3m(3, 3, 2));
		System.out.println("min3m(3, 3, 3) = " + min3m(3, 3, 3));
		System.out.println("min3m(2, 2, 3) = " + min3m(2, 2, 3));
		System.out.println("min3m(2, 3, 1) = " + min3m(2, 3, 1));
		System.out.println("min3m(2, 3, 2) = " + min3m(2, 3, 2));
		System.out.println("min3m(1, 3, 2) = " + min3m(1, 3, 2));
		System.out.println("min3m(2, 3, 3) = " + min3m(2, 3, 3));
		System.out.println("min3m(1, 2, 3) = " + min3m(1, 2, 3));
		
	}

}
