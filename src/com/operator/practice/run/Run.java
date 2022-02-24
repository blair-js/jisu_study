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
		
		//아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 
		//변수 num의 값을 뺸 나머지를 구하는 코드이다. 
		//예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 
		//19의 경우 20이고, 81의 경우 90이 된다. 
		//30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
		
		//int num = 48;
		//System.out.println(10-(num % 10));
		
		//다음은 문자형 변수 ch가 영문자 이거나 숫자일때만 변수의 값이 true가 되도록 하는 코드이다. 
		
		/*
		char ch = 'z';
		boolean b = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? true : false; 
		System.out.println(b);*/
		
		char ch = 'B';
		char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch+32) : ch ; 
		System.out.println(lowerCase);
		
	}

}