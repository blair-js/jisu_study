package com.programmers;

import java.util.Scanner;

public class P0506_1 {
	//����� ��
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//num�� ������ ��� => �ݺ��� Ƚ���� ���� �� ����. (Math Ŭ������ sqrt �޼ҵ� ���)
		//ex) num = 100�� ��� 100�� �ݺ��� 10�����ص� ����� ���� �� ����
		int sRoot = (int)Math.sqrt(num);
		
		int sum = 0; 
		
		//1���� n�� �������� sRoot������ �ݺ�
		for(int i=1; i<=sRoot; i++) {
			
			if(num%i == 0) { //i�� ������ ��������
				//���׿����ڸ� �̿��Ͽ�
				//i�� num�� �������̸� i�� ���ϰ�, �������� �ƴ� ���� i�� num�� i�� ���� ����� �����ش�.
				//ex) num = 16 �ΰ�� 1+16, 2+8, 4 => sum = 31 (4�� �ι� �������� �ȵǱ⶧���� ���׿����� ���)
				sum += i*i==num ? i : num/i+i;
				
				//������ i�� num�� ���������� Ȯ���ϱ� ���� i*i==num�� ����Ͽ��µ�, �� sRoot ������ ������� �ʾҳĸ�
				//num�� 16�� ���� sRoot�� 4�� ������ ����������, num�� 12�� ���� sRoot�� 3.xxxx �� 3���� ó���Ǳ� �����̴�. 
				//sum += i==sRoot ? i : num/i+i;
			}
			
		}//for
		
		System.out.println(sum);
		
	}

}
