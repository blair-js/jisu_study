package com.condition.practice.run;

import java.util.Scanner;

import com.condition.practice.example.ConditionPractice;

public class Run {

	public static void main(String[] args) {

		ConditionPractice c = new ConditionPractice();
		//c.practice1();
		//c.practice2();
		//c.practice3();
		//c.practice4();
		//c.practice5();
		//c.practice6();
		//c.practice7();
		//c.practice8();
		//c.practice9();
		//c.practice10();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt(); 
		System.out.print("정수2 : ");
		int num2 = sc.nextInt(); 
		System.out.print("정수3 : ");
		int num3 = sc.nextInt(); 
		
		/*
		int max = num1; 
		
		if(max <= num2 || max <= num3) {
			if(num2 >= max && num2 >= num3) {
				max = num2;
			}else {
				max = num3;
			}
		}

		System.out.println("최대값 : " + max);
		*/
		
		int max = num1;
		int min = num1; 
		int mid;
		
		//최대값
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		
		//최소값
		if(num2 < min) min = num2;
		if(num3 < min) min = num3;
		
		if(num1 > min && num1 < max) {
			mid = num1;
		}else if(num2 > min && num2 < max) {
			mid = num2;
		}else {
			mid = num3;
		}
		
		System.out.println("===결과===");
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("중간값 : " + mid);
		
	}

}
