package com.programmers;

public class P0504_1 {
	//���� ������ �Ǻ�
	
	public static void main(String[] args) {

		int n = 121; 
		int x = -1; //��ȯ�� �����(�Ʒ��� if������ �ʱ�ȭ ���� ������ �������� -1 ���)
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) { //n�� i�� ���������ٸ� i�� n�� ����̰�,
				if(i*i == n) { //�ش� ���i�� ������ n�̶�� i�� n�� �������� �ǰ�,
					x = (i+1)*(i+1); //�ش� ���+1�� ������ x�� ����
					break;
				}
			}
		}//for
		
		System.out.println(x);
	}

}
