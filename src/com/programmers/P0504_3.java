package com.programmers;

import java.util.Arrays;

public class P0504_3 {
	//�ڿ��� ������ �迭�� �����
	
	public static void main(String[] args) {

		long n = 12345;
		int[] arr = new int[(n+"").length()]; //n�� ���� ���ڿ�("") ������ ���� String���� ��ȯ �� ���� �̾Ƽ� �迭 ũ�� ����
		
		int idx = 0;
		while(n>0) {
			arr[idx++] = (int)(n%10); //������ ���� (int)n%10 ���� �ϰԵǸ� ��� tc������ fail��. => ������ ���� int�� ����ȯ �ϱ� ���� ��ȣ �ʼ�
			n/=10; //n�� 10���� ��� ������(0�� �ɶ�����)
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
