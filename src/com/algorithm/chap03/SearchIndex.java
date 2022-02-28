package com.algorithm.chap03;

import java.util.Scanner;

public class SearchIndex {

	static int searchIdx(int[] a, int n, int key) {
		
		int[] idx = new int[n]; //요소수가 전부 key값일 경우 최대개수 n개로 배열 생성 
		int cnt = 0; //idx의 요소수 확인
		
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}//if
		}//for
		
		return cnt; //찾는 요소가 없으면 0이 반환될 것
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt(); 
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}//for
		
		System.out.print("찾을 값 : ");
		int key = sc.nextInt();
		
		int idx = searchIdx(x, num, key);
		
		if(idx == 0) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println(idx + "개 존재합니다.");
		}
		
		
	}

}
