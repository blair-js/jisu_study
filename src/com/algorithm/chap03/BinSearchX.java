package com.algorithm.chap03;

import java.util.Scanner;

public class BinSearchX {

	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0; 
		int pr = n-1; 
		
		int result; //맨 앞의 key 값을 담을 인덱스 
		
		do {
			int pc = (pl+pr)/2;
			
			if(a[pc] == key) { //현재 중간 값이 key 값과 일치한다면 
				
				result = pc; //현재 중간 값으로 초기화하고
				
				for(int i=pc; i>=pl; i--) { //배열 요소에서 key 값이 또 존재하는지 찾는다 => 현재 중간 값부터 앞쪽으로 1씩 감소시키며 검사 
					if(a[i] == key) {
						result = i; //key 값이 나올 때마다 계속 초기화 
					}//if
				}//for
				
				return result; //최종 결과(가장 앞의 인덱스) 반환
				
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
			
		}while(pl <= pr);
	
		return -1; //찾는 key 값이 없을 경우 -1 반환
		
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
		
		int idx = binSearchX(x, num, key);
		
		if(idx == -1) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println("x[" + idx + "]에 존재합니다.");
		}
		
	}

}
