package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //�迭������ ���� ��
		int x = sc.nextInt(); //ã�����ϴ� ��
		
		int[] a = new int[n];
		
		//�迭�� �� ���
		for(int i=0; i<n; i++) { //�� ��ü
			a[i] = (int)(Math.random()*n +1); //�Է��� n���� ���ų� ���� ����
			for(int j=0; j<i; j++) { //�� ���
				if(a[i] == a[j]) { //���ٸ�
					i--; //����ü ���̰�
					break; //���� ���� for�� ������
				}
			}//for
		}//for
		
		//System.out.println("�迭�� ��� ��: " + Arrays.toString(a));
		
		//�Է��� ���ں��� ���� �� ã��
		for(int i=0; i<n; i++) {
			if(a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		
		
	}

}
