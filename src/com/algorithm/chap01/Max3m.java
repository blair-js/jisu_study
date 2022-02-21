package com.algorithm.chap01;

public class Max3m {

	//3개의 정수 중 최댓값을 구하는 메서드
	static int max3m(int a, int b, int c) {
		
		int max = a; 
		
		if(b > max) max = b;
		if(c > max) max = c; 
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("max3m(3, 2, 1) = " + max3m(3, 2, 1));
		System.out.println("max3m(3, 2, 2) = " + max3m(3, 2, 2));
		System.out.println("max3m(3, 1, 2) = " + max3m(3, 1, 2));
		System.out.println("max3m(3, 2, 3) = " + max3m(3, 2, 3));
		System.out.println("max3m(2, 1, 3) = " + max3m(2, 1, 3));
		System.out.println("max3m(3, 3, 2) = " + max3m(3, 3, 2));
		System.out.println("max3m(3, 3, 3) = " + max3m(3, 3, 3));
		System.out.println("max3m(2, 2, 3) = " + max3m(2, 2, 3));
		System.out.println("max3m(2, 3, 1) = " + max3m(2, 3, 1));
		System.out.println("max3m(2, 3, 2) = " + max3m(2, 3, 2));
		System.out.println("max3m(1, 3, 2) = " + max3m(1, 3, 2));
		System.out.println("max3m(2, 3, 3) = " + max3m(2, 3, 3));
		System.out.println("max3m(1, 2, 3) = " + max3m(1, 2, 3));
		
	}

}
