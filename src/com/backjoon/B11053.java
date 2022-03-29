package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //���� A�� ũ�� �Է¹ޱ�
		
		int[] A = new int[n]; //�Է¹��� ũ��� �迭 ����
		int[] dp = new int[n]; //�κ� ������ ���̸� ���� �迭 ����(�޸������̼� ��)
		
		for(int i=0; i<n; i++) {
			//���� �Է¹ޱ� 
			A[i] = sc.nextInt();
		}//for
		
		for(int i=0; i<n; i++) { //i�� �������� i�� �պκ� j���� �˻��� �� => �� ��ü
			
			dp[i] = 1; 
			
			for(int j=0; j<i; j++) { //j�� i�������� �˻��ϸ� �ȴ�. => �� ���
				
				//j��° ���Ұ� i��° ���Һ��� �۰�
				//i��° dp�� j��° dp[j]+1���� �۴ٸ� 
				if(A[j] < A[i] && dp[i] < dp[j]+1) {
					dp[i] = dp[j]+1; //dp[j]�� ���̿� 1�� ������ ���� D[i]�� �ȴ�.
				}//if
				
			}//for
		}//for
		
		//i��° ���� �κ� ������ ���̰� ��� �迭 dp���� �ִ� �� ���� 
		Arrays.sort(dp); //�������� ���� ��
		//System.out.println(Arrays.toString(dp)); //[1, 1, 2, 2, 3, 4]
		System.out.println(dp[n-1]); //���� ������ �ε��� ��� 
		
	}
}
