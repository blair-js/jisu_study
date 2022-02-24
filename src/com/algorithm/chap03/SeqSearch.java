package com.algorithm.chap03;

import java.util.Scanner;

public class SeqSearch {

	//요소가 n개인 배열 a에서 key 찾기
	static int seqSearch(int[] a, int n, int key) {
		
		//배열 a의 인덱스 
		int i = 0; 
		while(true) {
			if(i==n) { //무한반복이 배열의 개수 n개까지 갔을 때는 배열안에서 원하는 key를 찾지 못했다는 것. 
				return -1; 
			}
			
			if(a[i] == key) { //찾으면
				return i; //해당 인덱스 반환
			}
			i++; //인덱스 증가
		}//while
		
		//위의 while문을 for문으로
//		for(int i=0; i<n; i++) {
//			if(a[i] == key) {
//				return i;
//			}//if
//		}//for
//		return -1; 
	
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt(); 
		
		int[] x = new int[num];
		
		//배열에 값 초기화
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt(); 
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt(); 
		
		int idx = seqSearch(x, num, key); 
		
		if(idx == -1) {
			System.out.println("찾고자 하는 " + key + "는 존재하지 않습니다.");
		}else {
			System.out.println("찾고자 하는 " + key + "는 인덱스" + idx + "번째에 존재합니다.");
		}
	}

}
