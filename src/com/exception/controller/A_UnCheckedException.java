package com.exception.controller;

import java.util.Scanner;

public class A_UnCheckedException {

	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
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
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
	}

	public void method2() {
		
		System.out.print("�迭�� ���� : ");
		int num = sc.nextInt();
		
		/*if(num > 0) {
			int[] arr = new int[num];
		}else {
			System.out.println("��� �Է� ���");
		}*/
		
		try {
			int[] arr = new int[num];
		}catch(NegativeArraySizeException e) {
			System.out.println("��� �Է� ���");
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
			arr[2] = 3; //������ ���� X, ��Ÿ�� �� �߻�*/
			
			String str1 = null; 
			int length = str1.length();
			
		/*}catch(ClassCastException e) {
			System.out.println("�� ��ȯ ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� �ʰ�");
		}catch(NullPointerException e) {
			System.out.println("�������� ����");
		}*/
			
		}catch(ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			return;
			//System.exit(0);
		}finally {
			System.out.println("������ ����");
		}
		System.out.println("���α׷� ����");
		
	}
}
