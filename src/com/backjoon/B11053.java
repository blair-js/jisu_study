package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //수열 A의 크기 입력받기
		
		int[] A = new int[n]; //입력받은 크기로 배열 생성
		int[] dp = new int[n]; //부분 수열의 길이를 넣을 배열 생성(메모이제이션 용)
		
		for(int i=0; i<n; i++) {
			//원소 입력받기 
			A[i] = sc.nextInt();
		}//for
		
		for(int i=0; i<n; i++) { //i를 기준으로 i의 앞부분 j들을 검사할 것 => 비교 주체
			
			dp[i] = 1; 
			
			for(int j=0; j<i; j++) { //j는 i전까지만 검사하면 된다. => 비교 대상
				
				//j번째 원소가 i번째 원소보다 작고
				//i번째 dp가 j번째 dp[j]+1보다 작다면 
				if(A[j] < A[i] && dp[i] < dp[j]+1) {
					dp[i] = dp[j]+1; //dp[j]의 길이에 1을 더해준 것이 D[i]이 된다.
				}//if
				
			}//for
		}//for
		
		//i번째 별로 부분 수열의 길이가 담긴 배열 dp에서 최대 값 도출 
		Arrays.sort(dp); //오름차순 정렬 후
		//System.out.println(Arrays.toString(dp)); //[1, 1, 2, 2, 3, 4]
		System.out.println(dp[n-1]); //가장 마지막 인덱스 출력 
		
	}
}
