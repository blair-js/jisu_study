package com.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}//for
		
		System.out.println(min + " " + max);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine()); 
		//ó���� �Է��ϴ� �迭 ������ �� N�� ������ �ʰ� �Է¸� �޴´�. 
		//�ι�°�� �Է��ϴ� �迭 ���� 5���� ���� StringTokenizer�� ���� ������ �������� 5���� ��ū���� ���� �� ��. 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		
		int max = -1000001; //�־��� ���� ���� ���� ���� ������ ���� => �Ʒ��� while���� ���� ���� �ٲ�� �� ��
		int min = 1000001; //�־��� ���� ���� ���� ū ������ ���� => �Ʒ��� while���� ���� ���� �ٲ�� �� ��
		
		//��ū�� �ִٸ� 
		while(st.hasMoreTokens()) {
			
			int val = Integer.parseInt(st.nextToken()); //���� ��ū 
			
			if(val > max) {
				max = val;
			}
			if(val < min) {
				min = val;
			}
		}//while
		System.out.println(min + " " + max);
	}

}
