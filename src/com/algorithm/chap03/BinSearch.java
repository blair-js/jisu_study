package com.algorithm.chap03;

import java.util.Scanner;

public class BinSearch {

	//��Ұ� n���� �迭 a���� key�� ã�� 
	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0; //����� ù��° �ε���
		int pr = n-1; //����� ������ �ε��� 
		
		do {
			int pc = (pl + pr) / 2; //����� �߰� �� = ù��° �ε��� + ������ �ε��� / 2
			if(a[pc] == key) { //�߰� ���� ã���� �ϴ� key�� ���ٸ�
				return pc;  //�ش� �ε��� ��ȯ
			}else if(a[pc] < key) { //�߰� ���� ã���� �ϴ� key������ �۴ٸ� => �˻� ������ ���� �������� ������.
				pl = pc + 1; //����� ù��° �ε����� �߰� ���� �������� �ʱ�ȭ
			}else { //�߰� ���� ã���� �ϴ� key������ ũ�ٸ� => �˻� ������ ���� �������� ������. 
				pr = pc - 1; //����� ������ �ε����� �߰� ���� �������� �ʱ�ȭ
			}
		}while(pl <= pr); 
		 //�˻� ������ ���۰� ���� ���ų�, ������ ������ �������� �ݺ�! => ������ ������ Ŀ���� ������ ã�����ϴ� key�� �迭�� ���ٴ� �ǹ�
		
		return -1; //�˻� ����
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt(); 
		
		int[] x = new int[num];
		
		
		System.out.println("������������ �Է��ϼ���."); //���ĵ� �����͸� �������� �˻��ؾ� �ϹǷ�!
		System.out.print("x[0] : ");
		x[0] = sc.nextInt(); 
		
		for(int i=1; i<num; i++) { //0��°�� ������ �������, 1��°���� �� �Է¹ޱ�
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt(); 
			}while(x[i] < x[i-1]); //���� �Է��� ����, ���� �ε��� �ٷ� ���� ������ ������ �ٽ� �Է¹޵��� �ϱ�
		}//for
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("�ش��ϴ� ���� �����ϴ�.");
		}else {
			System.out.println(key + "�� �迭�� " + idx + "��°�� �ֽ��ϴ�.");
		}//if-else
		
	}

}
