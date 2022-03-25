package com.backjoon;

import java.util.Scanner;

public class B1463 {

	//n�� 1�� ����� �޼ҵ� (�ּ� ����Ƚ���� ��ȯ)
	public static int go(int n) {
		
		int[] d = new int[n+1]; //�޸������̼ǿ� �ʿ��� �迭 ����
		
		if(n == 1) { //n�� 1�̸� ������ �ʿ� ����(1�� 1�� �Ƿ��� 0���� ������ �ʿ�)
			return 0; //0 ��ȯ
		}
		
		for(int i=2; i<=n; i++) {//2����(1�̸� 0 ��ȯ�ϵ��� ���� ���� �ɾ���)
			
			d[i] = d[i-1] + 1; //3���� ���� �ϳ��� ��(N-1)�� ���� �⺻���� ���
			
			//�� ���� �� ���ǹ��� ������ �̹� d[i]�� ��� �ּҿ���Ƚ���� ���Ͽ�
			//�� ���� ����Ƚ���ϰ�� �ش� ������ d[i]�� ��ü�Ǵ� �����̴�. 
			//��, ���� d[i-1]�� ���� ��� ����Ƚ���� ��Ƴ���, 2�� �������ų� 3���� ������ �� �� ���� ����Ƚ���� ������ �� ������ ��ü�Ѵٴ� �ǹ��̴�. 
			if(i%2 == 0) d[i] = Math.min(d[i], d[i/2] + 1); //2�� ������ �������� �ٸ� ��(N/2)����
			if(i%3 == 0) d[i] = Math.min(d[i], d[i/3] + 1); //3���� ������ �������� �ٸ� ��(N/3)����
			
		}//for
		
		return d[n];
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(go(n));
		
	}

}
