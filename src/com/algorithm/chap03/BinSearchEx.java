package com.algorithm.chap03;

import java.util.Scanner;

public class BinSearchEx {

	static int binSearch(int[] a, int n, int key) {
		
		int pl = 0; //���� �ε���
		int pr = n-1; //�� �ε���
		
		System.out.print("  |");
		for(int i=0; i<n; i++) { //�ε��� ���
			System.out.printf("%3d", i);
		}//for
		System.out.println("\n--+--------------------");
		
		//int row = 0;
		do {
			
			int pc = (pl+pr)/2; //�߰� �ε���
		
			System.out.print("  |");
			System.out.printf(String.format("%%%ds<-", pl*2+1), "");
			System.out.printf(String.format("%%%ds+", (pc-pl)*2), "");
			System.out.printf(String.format("%%%ds->", (pr-pc)*2), "");
			System.out.printf("\n %d|", pc);
			for(int i=0; i<n; i++) { //�迭 ��� ���
				System.out.printf("%3d", a[i]);
			}//for
			System.out.println("\n  |");
			
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] < key) { //�߰� �ε������� key ���� ũ�ٸ� => �˻����� ����
				pl = pc + 1;
			}else { //key ���� �۴ٸ� => �˻����� ����
				pr = pc - 1;
			}

			pc = (pl+pr)/2; //�߰� �ε��� �ʱ�ȭ
			
		}while(pl <= pr);
			
		
		return -1;
		
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
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}else {
			System.out.println("x[" + idx + "]�� �����մϴ�.");
		}
	}

}
