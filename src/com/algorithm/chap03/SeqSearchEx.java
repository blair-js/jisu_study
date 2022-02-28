package com.algorithm.chap03;

import java.util.Scanner;

public class SeqSearchEx {

	static int seqSearch(int[] a, int n, int key) {
		
		boolean bool = false; //�ش� key ���� ã���� ��� true�� �ٲ��� ����
		
		System.out.print("  |");
		for(int i=0; i<n; i++) { //�� ���� �ε��� ���
			System.out.printf("%3d", i);
		}
		System.out.print("\n--+-------------");
		
		int idx = -1; 
		
		int i = 0; 
		while(i < n) {
			System.out.print("\n  |");
			System.out.printf(String.format("%%%ds*", i*3+2), "");
			System.out.printf("\n%2d|", i); //�ش� �ε��� �̰�
			
			for(int j=0; j<n; j++) {
				System.out.printf("%3d", a[j]); //�迭 ��� �̰�
			}//����for
			System.out.print("\n  |");
			
			if(a[i] == key) {
				bool = true; //true�� �ٲٰ�
				idx = i; 
			}
			
			//�ݺ��� ������ ������ �� �迭 ��ҵ� �� ��ġ�ϴ°� �־��ٸ� 
			if(bool == true) {
				return idx; //�� �޼ҵ� ���� 
			}//if
			
			i++;
		}//while
	
		return idx; 
		
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
		
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}else {
			System.out.println("\n" + key + "�� x[" + idx + "]�� �ֽ��ϴ�.");
		}//if-else
		
	}

}
