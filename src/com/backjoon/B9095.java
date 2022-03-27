package com.backjoon;

import java.util.Scanner;

public class B9095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); //테스트 케이스 수 
		
		int[] dp = new int[11]; //정수 n은 11보다 작다고 했으므로 크기 11의 배열 생성
		
		dp[0] = 0; // => 0가지
		dp[1] = 1; //1 => 1가지
		dp[2] = 2; //1+1, 2 => 2가지
		dp[3] = 4; //1+1+1, 1+2, 2+1, 3 => 4가지

		for(int i=0; i<testCase; i++) { //입력한 테스트케이스 수 만큼 반복
			
			int num = sc.nextInt(); //1,2,3의 합으로 몇 가지의 경우의 수가 도출되는지 궁금한 수 num을 입력받는다.
			
			for(int n=4; n<=num; n++) { //위에서 0,1,2,3에 대한 경우의 수는 이미 도출되었으므로 반복은 4부터 num까지 한다.
				dp[n] = dp[n-1] + dp[n-2] + dp[n-3]; //메모이제이션 부분
			}//for
			
			System.out.println(dp[num]);
			
		}//for
		
	}

}
