package com.programmers;

public class P0502_7 {
	//�ݶ��� ����
	
	public static void main(String[] args) {
		
		long num = 6; //�Է� ����

		//1.�� Ǯ�� ���
		/*int count = 0; //�� �� �ݺ��ϴ����� ���� ����
		
		while(num != 1) { //num�� 1�� �ƴ� ������ �ݺ�
			
			count++; //�ݺ� Ƚ�� ����
			
			if(num%2 == 0) { //¦���� ���
				num/=2;
			}else { //Ȧ���� ���
				num = num*3+1;
			}
			
			//�ݺ�Ƚ���� 500�� �Ѿ�� -1�� �����϶�� ��õǾ��ִ�.
			if(count > 500) {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);*/
		
		//2.�ٸ� Ǯ�� ��� : ���׿����� ��� 
		int count = -1; //�Ʒ��� if������ �ݺ� ���Ḧ ������ ���Ѵٸ� -1�� ����ϰ�, ������ �ش� �ݺ�Ƚ���� ����� ��
		
		for(int i=0; i<500; i++) { //�⺻������ 500�� �ݺ��ϱ�
			if(num == 1) {
				count = i; //��������� �ݺ� Ƚ�� ����
				break; //num�� 1�� �Ǹ� ��� �ݺ�����
			}
			num = (num%2 == 0) ? num/2 : num*3+1; //���׿����ڸ� ����Ͽ� ¦/Ȧ�� �����ϱ�
		}
		
		System.out.println(count);
		
	}

}
