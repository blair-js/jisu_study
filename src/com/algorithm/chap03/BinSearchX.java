package com.algorithm.chap03;

import java.util.Scanner;

public class BinSearchX {

	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0; 
		int pr = n-1; 
		
		int result; //�� ���� key ���� ���� �ε��� 
		
		do {
			int pc = (pl+pr)/2;
			
			if(a[pc] == key) { //���� �߰� ���� key ���� ��ġ�Ѵٸ� 
				
				result = pc; //���� �߰� ������ �ʱ�ȭ�ϰ�
				
				for(int i=pc; i>=pl; i--) { //�迭 ��ҿ��� key ���� �� �����ϴ��� ã�´� => ���� �߰� ������ �������� 1�� ���ҽ�Ű�� �˻� 
					if(a[i] == key) {
						result = i; //key ���� ���� ������ ��� �ʱ�ȭ 
					}//if
				}//for
				
				return result; //���� ���(���� ���� �ε���) ��ȯ
				
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
			
		}while(pl <= pr);
	
		return -1; //ã�� key ���� ���� ��� -1 ��ȯ
		
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
		
		int idx = binSearchX(x, num, key);
		
		if(idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}else {
			System.out.println("x[" + idx + "]�� �����մϴ�.");
		}
		
	}

}
