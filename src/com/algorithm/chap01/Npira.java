package com.algorithm.chap01;

import java.util.Scanner;

public class Npira {

	static void npira(int n) {
		
		//������ Ʈ����纰���� ����
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { //���� ���
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) { //���� ���
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int n = sc.nextInt();
		
		npira(n);
	}

}
