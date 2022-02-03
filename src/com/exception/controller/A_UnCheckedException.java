package com.exception.controller;

import java.util.Scanner;

public class A_UnCheckedException {

	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		//int result = num1 / num2;
		
		/*int result = 0;
		if(num2 != 0) {
			result = num1/num2;
		}
		System.out.println(result);*/
		
		int result1 = 0; 
		try {
			result1 = num1/num2;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}

	public void method2() {
		
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		
		/*if(num > 0) {
			int[] arr = new int[num];
		}else {
			System.out.println("양수 입력 요망");
		}*/
		
		try {
			int[] arr = new int[num];
		}catch(NegativeArraySizeException e) {
			System.out.println("양수 입력 요망");
		}
		
	}

	public void method3() {
		
		try {
			Object obj = 'a';
			//String str = (String)obj;
			
			//String str = String.valueOf(obj);
			
			/*int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3; //컴파일 에러 X, 런타임 시 발생*/
			
			String str1 = null; 
			int length = str1.length();
			
		/*}catch(ClassCastException e) {
			System.out.println("형 변환 오류");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		}catch(NullPointerException e) {
			System.out.println("널포인터 에러");
		}*/
			
		}catch(ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			return;
			//System.exit(0);
		}finally {
			System.out.println("여전히 실행");
		}
		System.out.println("프로그램 종료");
		
	}
}
