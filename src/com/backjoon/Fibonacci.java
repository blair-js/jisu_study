package com.backjoon;

import java.util.Scanner;

public class Fibonacci {

	//n��° �Ǻ���ġ ���� ���ϴ� �Լ��̴�. (�⺻)
	/*public static int fibonacci(int n) {
		if(n <= 1) { //0��°�� 1��°�� �׻� 0�� 1�̴�. 
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}*/
	
	
	//n��° �Ǻ���ġ ���� ���ϴ� �Լ��̴�. (���) => Top-Down ��� 
	/*static int fibonacci(int n) {
		int[] memo = new int[100]; //��� ���ҿ��� 0�� ����ִ�. => ���� ������ �ʾҴٴ� �ǹ�. �Ʒ����� ���� ���� ������ ������ ���� ������Ʈ �� ����. 
		
		if(n <= 1) { //0��°�� 1��°�� �׻� 0�� 1�̴�. 
			return n;
		}else {
			
			if(memo[n] > 0) { //�ش� n��°�� ���� �Ǻ���ġ ���� ���ߴ��� Ȯ���ϴ� ���ǹ� 
				return memo[n]; //�� ���ǹ��� ���ٴ� ���� �ؿ��� �迭�� ���� ���� 0�� �ƴ϶�� ����. (0�� 1�� 0���� �Ǿ�����) 
			}
			
			memo[n] = fibonacci(n-1) + fibonacci(n-2); //n��°�� ���� �Ǻ���ġ ���� ���� �� memo �迭�� ����
			return memo[n];
		}
	}*/
	
	//n��° �Ǻ���ġ ���� ���ϴ� �Լ��̴�. (���) => Bottom-Up ��� 
	static int fibonacci(int n) {
		
		int[] d = new int[100];
		
		//���� ���� ���� 0,1�� Ǯ��ΰ� 
		d[0] = 0; 
		d[1] = 1; 
		
		//�״��� ū���� 2���� 
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
		}//for
		
		return d[n];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
	}

}
