package com.exception.run;

import java.util.Scanner;

import com.exception.controller.MyException;

public class Run2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		try {
			checkNum(num);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void checkNum(int num) throws MyException {
		
		if(num < 10) {
			throw new MyException(num + "은(는) 10보다 작은 수 입니다.");
		}else {
			System.out.println("10보다 크거나 같은 수 입니다.");
		}
		
	}

}
