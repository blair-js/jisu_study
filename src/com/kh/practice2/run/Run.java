package com.kh.practice2.run;

import com.kh.practice2.example.CastingPractice;

public class Run {

	public static void main(String[] args) {

		CastingPractice c = new CastingPractice();
		//.method1();
		c.method2();
		c.method3();
		
		int i = 91234567; // 8�ڸ��� 10����
	
		float f = (float)i; //int�� float������ ����ȯ
		int ftoi = (int)f; //float�� �ٽ� int������ ����ȯ
		
		double d = (double)i; //int�� double������ ����ȯ
		int dtoi = (int)d; //double�� �ٽ� int������ ����ȯ
		
		//float�� ��� double���� �����ϴ� ���� 
		//float���� ���е��� 7�ڸ��̰�, double���� ���е��� 15�ڸ��̴�. 
		//�׷��� ū ������ �Ǽ������� ����ȯ�� ��
		//float���� ������ �߻��� Ȯ���� ����, double���� ���� �߻� Ȯ���� ����. 
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f ftoi=%d\n", f, ftoi); 
		System.out.printf("d=%f dtoi=%d\n", d, dtoi); 
		
		
	}

}
