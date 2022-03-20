package com.backjoon;

import java.util.Scanner;

public class B17087 {

	//��Ŭ���� ȣ������ �̿��� �ִ������� ���ϴ� �޼ҵ�
	public static int gcd(int n1, int n2) {
		
		if(n2 == 0) {
			return n1;
		}else {
			return gcd(n2, n1%n2);
		}

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //������ ��
		int s = sc.nextInt(); //�������� ��ġ
		
		int[] arr = new int[n]; //������ ����ŭ �迭 ���� => �������� ��ġ�� ���ҷ� ���� ���̴�
		
		for(int i=0; i<n; i++) { //������ ����ŭ �ݺ��Ͽ�, ������ ��ġ �Է¹ޱ�
			int a = sc.nextInt(); //������ ��ġ
			arr[i] = Math.abs(s-a); //�������� ��ġ���� ������ ��ġ �� �� �迭�� �ֱ�
		}//for
		
		int gcd = arr[0]; //������ 0��° �Է��� ������ ��ġ�� ������ ����
		
		if(arr.length >= 1) { //������ 1���̻� �����Ѵٸ� 
			for(int i=1; i<arr.length; i++) { //1���� ���� ������ �ݺ�(0��°�� ���� => ������ gcd ������ �����ߴ�)
				gcd = gcd(gcd, arr[i]); //0��° vs i��° �ݺ� ���Ͽ� �ִ������� �̴´�. 
			}//for
		}//if
		
		System.out.println(gcd);
	}

}
