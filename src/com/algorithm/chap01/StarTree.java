package com.algorithm.chap01;

import java.util.Scanner;

public class StarTree {

	static void spira(int n) {
		/* ��Ģ�� ���� ���� ������ "�ش���*2-1" �̴�. 
		 * ���� ������ ������ "��ü��-�ش���" �̴�. (���� ������ �Ű澲�� �ʾƵ� ��)
		    * 
		   ***
		  *****
		 ******* 
		 */
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { //���� ���
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) { //�� ���
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int n = sc.nextInt();
		
		spira(n);
	}

}
