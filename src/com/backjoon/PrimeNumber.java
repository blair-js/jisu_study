package com.backjoon;

public class PrimeNumber {

	//n�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �޼ҵ�
	public static boolean prime1(int n) {
		
		if(n < 2) { //2���� ������
			return false; //�Ҽ��� �ƴϴ�
		}
		
		for(int i=2; i<=n-1; i++) { //n�� 2���� n-1���� ��������
			if(n%i == 0) { //�ѹ��̶� ������ ��������
				return false; //�Ҽ��� �ƴϴ�
			}
		}//for
		
		return true; //���� ������ǿ� �ɸ��� �ʾ��� ��� n�� �Ҽ��̴�
	}
	
	public static boolean prime2(int n) {
		
		if(n < 2) { //2���� ������
			return false; //�Ҽ��� �ƴϴ�
		}
		
		for(int i=2; i<=n/2; i++) { //n�� 2���� 2/n���� ��������
			if(n%i == 0) { //�ѹ��̶� ������ ��������
				return false; //�Ҽ��� �ƴϴ�
			}
		}//for
		
		return true; //���� ������ǿ� �ɸ��� �ʾ��� ��� n�� �Ҽ��̴�
	}
	
	public static boolean prime3(int n) {
		
		if(n < 2) { //2���� ������
			return false; //�Ҽ��� �ƴϴ�
		}
		
		for(int i=2; i*i<=n; i++) { //n�� 2���� ��Ʈn���� ��������
			if(n%i == 0) { //�ѹ��̶� ������ ��������
				return false; //�Ҽ��� �ƴϴ�
			}
		}//for
		
		return true; //���� ������ǿ� �ɸ��� �ʾ��� ��� n�� �Ҽ��̴�
	}
	
	public static void main(String[] args) {

		System.out.println("3�� �Ҽ� �ΰ�? : " + prime1(3));
		System.out.println("12�� �Ҽ� �ΰ�? : " + prime2(12));
		System.out.println("24�� �Ҽ� �ΰ�? : " + prime3(24));
		System.out.println("7�� �Ҽ� �ΰ�? : " + prime3(7));
	}

}
