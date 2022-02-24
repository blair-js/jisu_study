package com.algorithm.chap03;

import java.util.Scanner;

public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		
		int i = 0; 
		a[n] = key; //���� �ʱ�ȭ => ã�����ڴ� key ���� �迭 a�� ��������ҷ� �ִ´�. 
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		
		return i==n ? -1 : i; //�ش� �ε��� i�� ������ ��ġ(n)�� �� -1 ��ȯ, �ƴϸ� �ش� �ε��� ��ȯ
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num+1]; //�������� ���ʸ� �־��־�� �ؼ� ���� ��Ҽ����� 1�� �� ũ�� �迭 ����
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt(); 
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt(); 
		
		int idx = seqSearchSen(x, num, key);

		if(idx == -1) {
			System.out.println("ã�� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("ã�� ���� �ε����� " + idx + "��° �Դϴ�.");
		}
	}

}
