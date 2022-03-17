package com.backjoon;

public class Eratosthenes {

	public static void main(String[] args) {
		
		int[] prime = new int[100]; //�Ҽ� ���� 
		
		int pn = 0; //�Ҽ��� ����
		
		boolean[] check = new boolean[101]; //���������� true => ���� �ʱ�ȭ ���� �ʾ����Ƿ� �ʱⰪ�� false �̰� ���� �������� true
		
		int n = 100; //100���� �Ҽ� ���ϱ�
		
		for(int i=2; i<=n; i++) {
			if(check[i] == false) { //�������� �ʾ����� 
				prime[pn++] = i; //�Ҽ��ϱ� �Ҽ� �迭�� ���� 
				for(int j=i*i; j<=n; j+=i) { //i�� ��� �����(�� ��, i*i�� i+i�� i*2�� �����ִ� ���� �� ����) => �ֳ� i�� �鸸�� ��� i*i�� 1���̴�. int�� ������ �Ѿ��. 
					check[j] = true; //�ش� i�� �����° �� ����� 
				}
 			}//if
		}
		
		
	}

}
