package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		//�̸�(String), ����(char), ����(int), Ű(double)�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�.");
		
	}

	public void method2() {
		
		//Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.

		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2; 
		int sub = num1 > num2 ? (num1-num2) : (num2-num1); //�� ��° ������ �� ū���� �Է��� ��쵵 ���
		int mul = num1 * num2;
		int div = num1 > num2 ? (num1/num2) : (num2/num1); //�� ��° ������ �� ū���� �Է��� ��쵵 ���
		
		System.out.println("���ϱ� ��� :" + sum);
		System.out.println("���� ��� :" + sub);
		System.out.println("���ϱ� ��� :" + mul);
		System.out.println("������ ��� :" + div);
		
	}

	public void method3() {
		
		//Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		//����( ����=����*���� , �ѷ�=(����+����)*2 )

		System.out.print("���� : ");
		double wid = sc.nextDouble(); 
		System.out.print("���� : ");
		double vir = sc.nextDouble();
		
		double area = wid*vir; 
		double width = (wid + vir)*2;
		
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + width);
		
	}

	public void method4() {
		
		//���� ���ڿ� ���� Ű����� �Է� �޾� ���� ���� �� ���� ����ϼ���.
		//HINT > charAt(�ε���) �޼ҵ� Ȱ���غ���
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		char c3 = str.charAt(2);
		
		System.out.println("=== ���1 ===");
		System.out.println("ù ��° ���� : " + c1);
		System.out.println("�� ��° ���� : " + c2);
		System.out.println("�� ��° ���� : " + c3);
		
		//���2
		System.out.println("=== ���2 ===");
		for(int i=0; i<3; i++) {
			String s = "";
			if(i == 0) {
				s = "ù ��° ���� : ";
			}else if(i == 1) {
				s = "�� ��° ���� : ";
			}else { //2
				s = "�� ���� ���� : ";
			}
			System.out.println(s + str.charAt(i));
		}
		
	}
	
}
