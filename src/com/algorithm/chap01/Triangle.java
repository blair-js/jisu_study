package com.algorithm.chap01;

import java.util.Scanner;

public class Triangle {
	
	//���� �Ʒ��� ������ �̵ �ﰢ��
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}
	}
	
	//���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int n) {
		/* ��Ģ�� ���� �ش� ���� ���� ������ "��ü��-�ش���+1" �̴�.
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	//������ ���� ������ �̵ �ﰢ��
	static void triangleRU(int n) {
		/* ��Ģ�� ���� �ش� ���� ���� ������ "��ü��-�ش���+1" �̴�.
		 * ������ �տ� ������ �ʿ��ϴ�. ������ "�ش���-1"
		 *****
		  ****
		   ***
		    **
		     *
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) { //�������
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) { //�� ���
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	//������ �Ʒ��� ������ �̵ �ﰢ�� 
	static void triangleRB(int n) {
		/* ��Ģ�� ���� �ش� ���� ���� ������ "�ش���" �̴�.
		 * ������ �տ� ������ �ʿ��ϴ�. ������ "��ü��-�ش���"�̴�
		    *
		   **
		  ***
		 ****
		*****
		*/
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { //�������
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) { //�� ���
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� : ");
		int n = sc.nextInt();
		
		//triangleLB(n);
		//triangleLU(n);
		//triangleRU(n);
		triangleRB(n);
	}

}
