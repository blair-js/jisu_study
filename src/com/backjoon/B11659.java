package com.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11659 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //ex) 5 3 �Է½�
		int n = Integer.parseInt(st.nextToken()); //���� ���� => ex) 5
		int m = Integer.parseInt(st.nextToken()); //���� ���� Ƚ�� => ex) 3
		
		int[] arr = new int[n+1]; //*�������� ������ ����*
		
		st = new StringTokenizer(br.readLine()); //5���� ���ڸ� ��ū���� �����ؼ� ����
		
		//�ش� ���ڸ�ŭ������ ���� �����ϴ� �ݺ���(������ st�� ����ִ� ���ڸ� ���ʴ�� �ִ� ���� �ƴԿ� ����!)
		for(int i=1; i<n+1; i++) { 
			//�ش� ���� i ��°�� �������� i��°�� �� �迭 ����� ��(arr[i-1]) �ش� i�� ����(nextToken)�� �հ踦 ���� ���̴�.
			//���� ������ 5 4 3 2 1 �Է½� 
			//arr[1] = 0 + 5 = 5, arr[2] = 5 + 4 = 9 ... �̷������� �������� �迭�� �ִ� ���̴�.
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken()); 
		}//for
	
		//�ش� ������ �������� ���ϴ� �ݺ��� => ������ �Է��� �ݺ�Ƚ��(m)��ŭ�� �ݺ��ϸ� �ȴ�.
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); //�� ���� �ε���
			int b = Integer.parseInt(st.nextToken()); //�� ���� �ε���
			
			//b���� ������ �հ迡�� a���� �հ踦 ���� �Ǵ� ��
			System.out.println(arr[b] - arr[a-1]);
		}
		
	}

}
