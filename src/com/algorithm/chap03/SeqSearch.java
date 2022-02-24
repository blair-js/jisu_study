package com.algorithm.chap03;

import java.util.Scanner;

public class SeqSearch {

	//��Ұ� n���� �迭 a���� key ã��
	static int seqSearch(int[] a, int n, int key) {
		
		//�迭 a�� �ε��� 
		int i = 0; 
		while(true) {
			if(i==n) { //���ѹݺ��� �迭�� ���� n������ ���� ���� �迭�ȿ��� ���ϴ� key�� ã�� ���ߴٴ� ��. 
				return -1; 
			}
			
			if(a[i] == key) { //ã����
				return i; //�ش� �ε��� ��ȯ
			}
			i++; //�ε��� ����
		}//while
		
		//���� while���� for������
//		for(int i=0; i<n; i++) {
//			if(a[i] == key) {
//				return i;
//			}//if
//		}//for
//		return -1; 
	
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ҽ�: ");
		int num = sc.nextInt(); 
		
		int[] x = new int[num];
		
		//�迭�� �� �ʱ�ȭ
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt(); 
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt(); 
		
		int idx = seqSearch(x, num, key); 
		
		if(idx == -1) {
			System.out.println("ã���� �ϴ� " + key + "�� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("ã���� �ϴ� " + key + "�� �ε���" + idx + "��°�� �����մϴ�.");
		}
	}

}
