package com.algorithm.chap03;

import java.util.Scanner;

public class SearchIndex {

	static int searchIdx(int[] a, int n, int key) {
		
		int[] idx = new int[n]; //��Ҽ��� ���� key���� ��� �ִ밳�� n���� �迭 ���� 
		int cnt = 0; //idx�� ��Ҽ� Ȯ��
		
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}//if
		}//for
		
		return cnt; //ã�� ��Ұ� ������ 0�� ��ȯ�� ��
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt(); 
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}//for
		
		System.out.print("ã�� �� : ");
		int key = sc.nextInt();
		
		int idx = searchIdx(x, num, key);
		
		if(idx == 0) {
			System.out.println("�������� �ʽ��ϴ�.");
		}else {
			System.out.println(idx + "�� �����մϴ�.");
		}
		
		
	}

}
