package com.algorithm.chap03;

import java.util.Scanner;

public class BinSearchEx {

	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0; //시작 인덱스
		int pr = n-1; //끝 인덱스
		
		System.out.print("  |");
		for(int i=0; i<n; i++) { //인덱스 출력
			System.out.printf("%3d", i);
		}//for
		System.out.println("\n--+--------------------");
		
		//int row = 0;
		do {
			
			int pc = (pl+pr)/2; //중간 인덱스
		
			System.out.print("  |");
			System.out.printf(String.format("%%%ds<-", pl*2+1), "");
			System.out.printf(String.format("%%%ds+", (pc-pl)*2), "");
			System.out.printf(String.format("%%%ds->", (pr-pc)*2), "");
			System.out.printf("\n %d|", pc);
			for(int i=0; i<n; i++) { //배열 요소 출력
				System.out.printf("%3d", a[i]);
			}//for
			System.out.println("\n  |");
			
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) { //중간 인덱스보다 key 값이 크다면 => 검색범위 뒤쪽
				pl = pc + 1;
			}else { //key 값이 작다면 => 검색범위 앞쪽
				pr = pc - 1;
			}

			pc = (pl+pr)/2; //중간 인덱스 초기화
			
		}while(pl <= pr);
			
		
		return -1;
		
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
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println("x[" + idx + "]에 존재합니다.");
		}
	}

}
