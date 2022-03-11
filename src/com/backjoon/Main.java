package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //배열생성을 위한 수
		int x = sc.nextInt(); //찾고자하는 값
		
		int[] a = new int[n];
		
		//배열에 값 담기
		for(int i=0; i<n; i++) { //비교 주체
			a[i] = (int)(Math.random()*n +1); //입력한 n보다 같거나 작은 정수
			for(int j=0; j<i; j++) { //비교 대상
				if(a[i] == a[j]) { //같다면
					i--; //비교주체 줄이고
					break; //현재 안쪽 for문 끝내기
				}
			}//for
		}//for
		
		//System.out.println("배열에 담긴 값: " + Arrays.toString(a));
		
		//입력한 숫자보다 작은 값 찾기
		for(int i=0; i<n; i++) {
			if(a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		
		
	}

}
