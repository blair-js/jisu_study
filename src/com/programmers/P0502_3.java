package com.programmers;

import java.util.Arrays;

public class P0502_3 {
	//����� ���� 
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};

		//Ǯ��1.�� ���
		/*int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}*/
		
		//Ǯ��2.�ٸ� ���
		//�� 14�� ó�� �Ű������� ���� �迭�� ���� answer�� ũ�⸦ �����ص� ������
		//�̹� �������� ũ�Ⱑ ������ �迭�̶�� �������־��� ������ �Ʒ�ó�� ���� �迭 �ϳ��� ��� �迭�� ���� �� 
		//���� �迭�� ������ ������Ű�� ����� ���� ����̴�.
		int[][] answer = arr1; 
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i].length; j++) {
				answer[i][j] += arr2[i][j];
			}
		}
		
		System.out.println(Arrays.toString(answer[0]));
		System.out.println(Arrays.toString(answer[1]));
		
	}

}
