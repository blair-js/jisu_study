package com.backjoon;

public class Euclid {

	//����Լ��� ����Ͽ� ������ ��Ŭ���� ȣ���� 
	public static int gcd1(int a, int b) {
		
		if(b == 0) { //�Ʒ����� ȣ���� ���� b,r ���� r�� 0�� �Ǿ��� ��, b�� �ִ� ������� �ȴ�.
			return a; 
		}else {
			return gcd1(b, a%b); //a���� b�� ���� �������� r�̶�� ������, b�� �ڸ��� r�� ���ڷ� �����Ͽ� ��� ȣ�� 
		}
		
	}
	
	//����Լ��� ������� �ʰ� ������ ��Ŭ���� ȣ����
	public static int gcd2(int a, int b) {
		while(b != 0) { //b�� 0�� �ƴ� ������ �ݺ�
			int r = a%b; //��������
			a = b; //a�� b
			b = r; //b�� ������ r
		}
		
		//���� while�� ��� ���� ������
		return a;
	}
	
	public static void main(String[] args) {

		//�� ���� �ִ� ����� 
		int x1 = gcd1(24, 16);
		int x2 = gcd2(16, 24);
		System.out.println("�ִ����� : " + x1);
		System.out.println("�ִ����� : " + x2);
	}

}
