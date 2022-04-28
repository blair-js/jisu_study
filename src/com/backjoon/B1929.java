package com.backjoon;

import java.util.Scanner;

public class B1929 {

	//�����佺�׳׽��� ü�� �̿��� �Ҽ����ϱ� ����
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//�Ҽ��� ���� ���� �Է¹ޱ�(m���� n���� �˻�)
		//���� : 1 �� M �� N �� 1,000,000 M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		int[] prime = new int[n+1]; //�Ҽ��� �����ϱ� ���� ����
		boolean[] check = new boolean[n+1]; //�ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��ϱ� ���� ����(�Ҽ��� false, �Ҽ��� �ƴϸ� true)
		
		int idx = 0; //�迭 prime�� �ε������� ������ ��Ÿ���� ����
		
		//0�� 1�� �Ҽ��� �ƴϹǷ� true�� �ʱ�ȭ(�������� �⺻������ false�� �����̴�.) 
		check[0] = check[1] = true;
		
		for(int i=2; i<=n; i++) { //�Ҽ��� �ƴ� 0�� 1�� ������ 2���� ���� 
			
			if(check[i] == false) { //i��°�� false��� 
				if(i >= m) { //�Է��� ���� m�� 2���� Ŭ ���� �����Ƿ�, i�� m���� Ŭ ����(m������ �Ҽ��� üũ�� �ʿ䰡 ����) 
					prime[idx++] = i; //�迭 prime�� i���� ������� �ִ´�. 
				}
				
				//�׸��� i�� �Ҽ����ٸ� �Ҽ��� ������� ��� �Ҽ��� �ƴϰ� �ǹǷ� check �迭���� �����־�� ��.
				for(int j=i+i; j<=n; j+=i) { //�ش� i�� �������� n���� �ݺ�(�������� i��ŭ�� Ŀ����)
					check[j] = true; //�ش� ���� true �ʱ�ȭ
				}
			}
			
		}//for
		
		//�Ҽ��� ����ִ� prime �迭�� ��Ҹ� ��� ������ش�.
		//�Ҽ��� ������ �ǹ��ϴ� �ε�����ŭ�� �ݺ��ϸ� ��
		for(int i=0; i<idx; i++) {
			System.out.println(prime[i]);
		}
	}

}
