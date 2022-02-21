package com.algorithm.chap01;

public class Min4m {

	static int min4m(int a, int b, int c, int d) {
		int min = a; 
		
		if(b < min) min = b;
		if(c < min) min = c; 
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {

		System.out.println("min4m(3, 2, 1, 4) = " + min4m(3, 2, 1, 4));
		System.out.println("min4m(3, 2, 2, 4) = " + min4m(3, 2, 2, 4));
		System.out.println("min4m(3, 1, 2, 4) = " + min4m(3, 1, 2, 4));
		System.out.println("min4m(3, 2, 3, 4) = " + min4m(3, 2, 3, 4));
		System.out.println("min4m(2, 1, 3, 4) = " + min4m(2, 1, 3, 4));
		
	}

}
