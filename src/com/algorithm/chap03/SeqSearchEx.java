package com.algorithm.chap03;

import java.util.Scanner;

public class SeqSearchEx {

	static int seqSearch(int[] a, int n, int key) {
		
		boolean bool = false; //해당 key 값을 찾았을 경우 true로 바꿔줄 예정
		
		System.out.print("  |");
		for(int i=0; i<n; i++) { //맨 위의 인덱스 출력
			System.out.printf("%3d", i);
		}
		System.out.print("\n--+-------------");
		
		int idx = -1; 
		
		int i = 0; 
		while(i < n) {
			System.out.print("\n  |");
			System.out.printf(String.format("%%%ds*", i*3+2), "");
			System.out.printf("\n%2d|", i); //해당 인덱스 뽑고
			
			for(int j=0; j<n; j++) {
				System.out.printf("%3d", a[j]); //배열 요소 뽑고
			}//안쪽for
			System.out.print("\n  |");
			
			if(a[i] == key) {
				bool = true; //true로 바꾸고
				idx = i; 
			}
			
			//반복문 끝나고 나왔을 때 배열 요소들 중 일치하는게 있었다면 
			if(bool == true) {
				return idx; //현 메소드 종료 
			}//if
			
			i++;
		}//while
	
		return idx; 
		
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
		
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("존재하지 않습니다.");
		}else {
			System.out.println("\n" + key + "은 x[" + idx + "]에 있습니다.");
		}//if-else
		
	}

}
