package com.algorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTesterEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i-1] > x[i]);
		}//for
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt(); 
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) {
			int insPoint = -idx-1;
			System.out.println("검색 실패");
			//System.out.println("삽입 포인트 : " + -(idx+1));
			System.out.println("삽입 포인트 : " + insPoint);
		}else {
			System.out.println("그 값은 " + idx + "번쨰에 있습니다.");
		}//if~else

	}

}
