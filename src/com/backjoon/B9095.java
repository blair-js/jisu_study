package com.backjoon;

import java.util.Scanner;

public class B9095 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); //�׽�Ʈ ���̽� �� 
		
		int[] dp = new int[11]; //���� n�� 11���� �۴ٰ� �����Ƿ� ũ�� 11�� �迭 ����
		
		dp[0] = 0; // => 0����
		dp[1] = 1; //1 => 1����
		dp[2] = 2; //1+1, 2 => 2����
		dp[3] = 4; //1+1+1, 1+2, 2+1, 3 => 4����

		for(int i=0; i<testCase; i++) { //�Է��� �׽�Ʈ���̽� �� ��ŭ �ݺ�
			
			int num = sc.nextInt(); //1,2,3�� ������ �� ������ ����� ���� ����Ǵ��� �ñ��� �� num�� �Է¹޴´�.
			
			for(int n=4; n<=num; n++) { //������ 0,1,2,3�� ���� ����� ���� �̹� ����Ǿ����Ƿ� �ݺ��� 4���� num���� �Ѵ�.
				dp[n] = dp[n-1] + dp[n-2] + dp[n-3]; //�޸������̼� �κ�
			}//for
			
			System.out.println(dp[num]);
			
		}//for
		
	}

}
