package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		//Ű����� ���� �ϳ��� �Է� �޾� �� ���ڿ� �� ������ �����ڵ� ���� ����ϼ���.

		System.out.print("���� : ");
		char c = sc.nextLine().charAt(0);
		
		System.out.println(c + " Unicode : " + (int)c);
		
	}

	public void method2() {
		
		//�Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
		//�� �� ������ ����� ���������� ó���ϼ���.
		
		/*
		System.out.print("���� : "); //80.5
		double kor = sc.nextDouble();
		System.out.print("���� : "); //75.5
		double eng = sc.nextDouble();
		System.out.print("���� : "); //90.0
		double math = sc.nextDouble();
		
		int count = 3; //�����
		
		int sum = (int)(kor+eng+math);
		int avg = (int)(kor+eng+math)/count;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		*/
		
		double kor = 85.5;
		double eng = 75.5;
		double math = 90;
		double avg = (kor+eng+math) / 3;
		
		int avg2 = (int)(avg*100+0.5);
		double d = avg2 / (double)100;
		
		System.out.println(avg2);
		System.out.println(d);
		
	}

	public void method3() {
		
		//���� �� �ʱ�ȭ�� 5���� ������ ������ �˸��� ��Ģ����(+, -, *, /)�� ����ȯ�� �̿��Ͽ�
		//�ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��ϼ���.
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2 
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( iNum1 / (double)iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		System.out.println( (float)iNum1 / fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'
		
	}
	
}
