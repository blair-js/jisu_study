package com.operator.practice.run;


import com.operator.practice.example.OperatorPractice;

public class Run {

	public static void main(String[] args) {

		OperatorPractice op = new OperatorPractice();
		//op.practice1();
		//op.practice3();
		//op.practice4();
		//op.practice5();
		//op.practice6();
		//op.practice7();
		//op.practice8();
		//op.practice9();
		//op.practice10();
		//op.practice11();
		
		//�Ʒ��� ���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� 
		//���� num�� ���� �A �������� ���ϴ� �ڵ��̴�. 
		//���� ���, 24�� ũ�鼭�� ���� ����� 10�� ����� 30�̴�. 
		//19�� ��� 20�̰�, 81�� ��� 90�� �ȴ�. 
		//30���� 24�� �� �������� 6�̱� ������ ���� num�� ���� 24��� 6�� ����� ���� �Ѵ�.
		
		//int num = 48;
		//System.out.println(10-(num % 10));
		
		//������ ������ ���� ch�� ������ �̰ų� �����϶��� ������ ���� true�� �ǵ��� �ϴ� �ڵ��̴�. 
		
		/*
		char ch = 'z';
		boolean b = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? true : false; 
		System.out.println(b);*/
		
		char ch = 'B';
		char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch+32) : ch ; 
		System.out.println(lowerCase);
		
	}

}