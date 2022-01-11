package com.kh.practice2.run;

import com.kh.practice2.example.CastingPractice;

public class Run {

	public static void main(String[] args) {

		CastingPractice c = new CastingPractice();
		//.method1();
		c.method2();
		c.method3();
		
		int i = 91234567; // 8자리의 10진수
	
		float f = (float)i; //int를 float형으로 형변환
		int ftoi = (int)f; //float를 다시 int형으로 형변환
		
		double d = (double)i; //int를 double형으로 형변환
		int dtoi = (int)d; //double을 다시 int형으로 형변환
		
		//float형 대신 double형을 권장하는 이유 
		//float형은 정밀도가 7자리이고, double형은 정밀도가 15자리이다. 
		//그래서 큰 정수를 실수형으로 형변환할 때
		//float형은 오차가 발생할 확률이 높고, double형은 오차 발생 확률이 적다. 
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f ftoi=%d\n", f, ftoi); 
		System.out.printf("d=%f dtoi=%d\n", d, dtoi); 
		
		
	}

}
