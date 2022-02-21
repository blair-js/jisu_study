package com.algorithm.chap01;

public class Max4m {

	//3개의 정수 중 최댓값을 구하는 메서드
	static int max4m(int a, int b, int c, int d) {
		
		int max = a; 
		
		if(b > max) max = b;
		if(c > max) max = c; 
		if(d > max) max = d; 
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("max3m(3, 2, 1, 4) = " + max4m(3, 2, 1, 4));
		System.out.println("max3m(3, 2, 2, 4) = " + max4m(3, 2, 2, 4));
		System.out.println("max3m(3, 1, 2, 4) = " + max4m(3, 1, 2, 4));
		System.out.println("max3m(3, 2, 3, 4) = " + max4m(3, 2, 3, 4));
		System.out.println("max3m(2, 1, 3, 4) = " + max4m(2, 1, 3, 4));
	}

}
