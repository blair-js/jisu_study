package com.backjoon;

import java.util.Scanner;

public class B17087 {

	//유클리드 호제법을 이용한 최대공약수를 구하는 메소드
	public static int gcd(int n1, int n2) {
		
		if(n2 == 0) {
			return n1;
		}else {
			return gcd(n2, n1%n2);
		}

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //동생의 수
		int s = sc.nextInt(); //수빈이의 위치
		
		int[] arr = new int[n]; //동생의 수만큼 배열 생성 => 동생들의 위치를 원소로 넣을 것이다
		
		for(int i=0; i<n; i++) { //동생의 수만큼 반복하여, 동생의 위치 입력받기
			int a = sc.nextInt(); //동생의 위치
			arr[i] = Math.abs(s-a); //수빈이의 위치에서 동생의 위치 뺀 후 배열에 넣기
		}//for
		
		int gcd = arr[0]; //동생중 0번째 입력한 동생의 위치를 변수에 저장
		
		if(arr.length >= 1) { //동생이 1명이상 존재한다면 
			for(int i=1; i<arr.length; i++) { //1부터 동생 끝까지 반복(0번째는 제외 => 위에서 gcd 변수에 대입했다)
				gcd = gcd(gcd, arr[i]); //0번째 vs i번째 반복 비교하여 최대공약수를 뽑는다. 
			}//for
		}//if
		
		System.out.println(gcd);
	}

}
