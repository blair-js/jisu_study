package com.backjoon;

import java.util.Scanner;

public class B11052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //�����ϰ��� �ϴ� ī�� ����
		
		int[] dp = new int[num+1];
		int[] p = new int[num+1];
		
		dp[0] = 0;
		p[0] = 0;
		
		for(int i=1; i<=num; i++) {
			
			p[i] = sc.nextInt(); //ī�尡 i�� ����ִ� ī������ ���� p[i]
			dp[i] = p[i]; //i���� ����ִ� ī������ ���ϴ� ����� �迭 dp�� ����. 
			
 			for(int j=1; j<=i/2; j++) {
 				//������ ������ dp[i]�� dp[i-j]+dp[j]�� ���� ���ؼ� �� ū ���� �����Ͽ� �ٽ� dp[i]�� ���� �ʱ�ȭ
				dp[i] = Math.max(dp[i], dp[i-j]+dp[j]); 
			}
 			
		}//for
	
		System.out.println(dp[num]);
	}

}
