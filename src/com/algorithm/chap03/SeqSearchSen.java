package com.algorithm.chap03;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		
		int i = 0; 
		a[n] = key; //보초 초기화 => 찾고하자는 key 값을 배열 a의 마지막요소로 넣는다. 
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		
		return i==n ? -1 : i; //해당 인덱스 i가 보초의 위치(n)일 때 -1 반환, 아니면 해당 인덱스 반환
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num+1]; //마지막에 보초를 넣어주어야 해서 기존 요소수보다 1개 더 크게 배열 생성
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt(); 
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt(); 
		
		int idx = seqSearchSen(x, num, key);

		if(idx == -1) {
			System.out.println("찾는 값이 존재하지 않습니다.");
		}else {
			System.out.println("찾는 값의 인덱스는 " + idx + "번째 입니다.");
		}
	}

}
