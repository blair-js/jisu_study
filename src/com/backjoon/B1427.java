package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1427 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //입력받은 수 
		
		String str = String.valueOf(n); //입력받은 수의 자릿수를 알아보기 위해 문자열로 변환
		int length = str.length(); //자리수가 확인되었으면
		
		int[] arr = new int[length]; //그 자릿수 크기의 배열 생성
		
		int idx = 0; //배열의 인덱스
		while(n > 0) {
			arr[idx] = n%10; //n을 10으로 나눈 나머지를 저장(n이 2143인 경우 3->4->1->2) 
			n/=10; //n을 10으로 나눈 몫으로 초기화(n이 2143인 경우 2143->214->21->2)
			idx++; //인덱스 증가
		}
		
		Arrays.sort(arr); //오름차순 정렬
		for(int i=length; i>0; i--) {
			System.out.print(arr[i-1]);
		}
	}

}
