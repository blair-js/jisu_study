package com.exception.run;

import java.util.Scanner;

import com.exception.controller.MyException;

public class Run2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		try {
			checkNum(num);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void checkNum(int num) throws MyException {
		
		if(num < 10) {
			throw new MyException(num + "��(��) 10���� ���� �� �Դϴ�.");
		}else {
			System.out.println("10���� ũ�ų� ���� �� �Դϴ�.");
		}
		
	}

}
