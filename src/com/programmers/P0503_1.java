package com.programmers;

public class P0503_1 {
	//�ִ������� �ּҰ����
	//��Ŭ���� ȣ���� ����ϱ�
	
	public static void main(String[] args) {

		int n = 4; 
		int m = 6; 
		
		System.out.println(gcd(n, m));
		
	}

	//�ִ������� ��ȯ���� �޼ҵ� gcd
	//���1 : �ݺ��� ���
	/*public static int gcd(int n, int m) {
		
		while(m != 0) { //m�� 0�� �ƴҶ����� �ݺ�
			int r = n % m; //n�� m���� ���� ������ ���� 
			n = m; //n�ڸ��� m�� ����
			m = r; //m�ڸ��� ������ ���� ������ r ���� 
		
			//ex)n=3, m=12�� �� -> n=12, m=3 -> n=3, m=0 -> �ִ������� 3
			//ex)n=4, m=6�� �� -> n=6, m=2 -> n=2, m=0 -> �ִ������� 2 
		}
		
		return n;
	}*/
	
	//���2 : ��� ���
	public static int gcd(int n, int m) {
		
		if(m == 0) { //m�� 0�� �Ǹ� 
			return n; //n(�ִ�����)�� ��ȯ�ϸ� �ݺ� ����
		}else {
			return gcd(m, n%m); //��� ���� => n�ڸ��� m�� �ְ�, m �ڸ��� n%m �������� ����
		}
		
	}
}
