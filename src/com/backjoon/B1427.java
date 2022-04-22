package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1427 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�Է¹��� �� 
		
		String str = String.valueOf(n); //�Է¹��� ���� �ڸ����� �˾ƺ��� ���� ���ڿ��� ��ȯ
		int length = str.length(); //�ڸ����� Ȯ�εǾ�����
		
		int[] arr = new int[length]; //�� �ڸ��� ũ���� �迭 ����
		
		int idx = 0; //�迭�� �ε���
		while(n > 0) {
			arr[idx] = n%10; //n�� 10���� ���� �������� ����(n�� 2143�� ��� 3->4->1->2) 
			n/=10; //n�� 10���� ���� ������ �ʱ�ȭ(n�� 2143�� ��� 2143->214->21->2)
			idx++; //�ε��� ����
		}
		
		Arrays.sort(arr); //�������� ����
		for(int i=length; i>0; i--) {
			System.out.print(arr[i-1]);
		}
	}

}
