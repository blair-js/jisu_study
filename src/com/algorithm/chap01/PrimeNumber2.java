package com.algorithm.chap01;

public class PrimeNumber2 {

	public static void main(String[] args) {

		int counter = 0; //�� �� �����ߴ���
		int ptr = 0; //ã�� �Ҽ��� �������� �ε���
		int[] prime = new int[500]; //�Ҽ��� ������ �迭
	
		prime[ptr++] = 2; //2�� �Ҽ��ϱ� �̸� �־���� 
		
		for(int n=3; n<=1000; n+=2) { //¦���� ��¥�� �Ҽ��� �ƴϹǷ� Ȧ���鸸 �˻��ϸ� �ȴ�
			
			int i;
			for(i=1; i<ptr; i++) {
				counter++;
				if(n % prime[i] == 0) { //���� ���ڸ� prime�� i��°�� ������������ �˻�
					break;
				}//if
			}//for
			
			if(ptr == i) { //prime�� ������ �ݺ��� �ߴٸ� 
				prime[ptr++] = n; //�� ���ڴ� �Ҽ��̴�
			}//if
		}//for
		
		for(int i=0; i<ptr; i++) { //�Ҽ� ���
			System.out.println(prime[i]);
		}
		
		System.out.println("�������� ������ Ƚ�� : " + counter);
	
	}

}
