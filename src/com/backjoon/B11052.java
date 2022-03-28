package com.backjoon;

import java.util.Scanner;

public class B11052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //구매하고자 하는 카드 개수
		
		int[] dp = new int[num+1];
		int[] p = new int[num+1];
		
		dp[0] = 0;
		p[0] = 0;
		
		for(int i=1; i<=num; i++) {
			
			p[i] = sc.nextInt(); //카드가 i개 들어있는 카드팩의 가격 p[i]
			dp[i] = p[i]; //i개가 들어있는 카드팩을 구하는 방법을 배열 dp에 대입. 
			
 			for(int j=1; j<=i/2; j++) {
 				//위에서 대입한 dp[i]와 dp[i-j]+dp[j]의 값을 비교해서 더 큰 값을 도출하여 다시 dp[i]의 값에 초기화
				dp[i] = Math.max(dp[i], dp[i-j]+dp[j]); 
			}
 			
		}//for
	
		System.out.println(dp[num]);
	}

}
