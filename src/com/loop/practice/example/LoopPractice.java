package com.loop.practice.example;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		//���� 1 �̸��� ���ڰ� �Էµƴٸ� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		//(for�� �̿�)
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt(); 
		
		if(num < 1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
		
	}

	public void practice2() {
		
		//practice1() ������ �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		//���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.���� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		int num; 
		do {
			
			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt(); 
			
			if(num > 0) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break; //�ݺ��� ������ while�� ������
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}while(num < 1);
		
	}

	public void practice3() {
		
		//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		//(for�� �̿�)
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���.");
		}
		
		for(int i=num; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice4() {
		
		//practice3() ������ �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		//���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.���� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
		
		int num;
		do {

			System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if(num > 0) {
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}while(num < 1);
		
		
	}

	public void practice5() {
		
		//1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		//(for�� �̿�)
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0; 
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i == num) {
				System.out.print(i + " = " + sum);
			}else {
				System.out.print(i + " + ");
			}
		}
		
	}

	public void practice6() {
		
		//����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		//���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1�̻��� ���ڸ��� �Է����ּ��䡰�� ����ϼ���.
		//(for�� �̿�)

		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { 
			System.out.println("1 �̻��� ���ڸ��� �Է����ּ���.");
		}else {
			int min = num1; 
			int max = num2;
			
			if(num1 > num2) { 
				min = num2;
				max = num1;
			}
			
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
	
	public void practice7() {
		
		//�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		//��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		
		int num1, num2;
		do {
			
			System.out.print("���� 1 : ");
			num1 = sc.nextInt();
			System.out.print("���� 2 : ");
			num2 = sc.nextInt();
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 �̻��� ���ڸ��� �Է����ּ���.");
			}else {
				int min = num1; 
				int max = num2;
				
				if(num1 > num2) { 
					min = num2;
					max = num1;
				}
				
				for(int i=min; i<=max; i++) {
					System.out.print(i + " ");
				}
			}
			
		}while(num1 < 1 || num2 < 1);
		
	}

	public void practice8() {
		
		//����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		//(for�� �̿�)
	
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "�� =====");
		for(int su=1; su<=9; su++) {
			int res = num * su;
			System.out.printf("%d * %d = %d\n", num, su, res);
		}
	}

	public void practice9() { //Ʋ�� -> �ٽ� Ǯ�� �Ϸ�
		
		//����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		//��, 2~9 ������ ���ڰ� �ƴ� ��� ��2~9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		
		System.out.print("���� : ");
		int dan = sc.nextInt(); 
		
		if(dan >= 2 && dan <= 9) {
			for(int i=dan; i<=9; i++) {
				System.out.println("===== " + i + "�� =====");
				for(int j=1; j<=9; j++) {
					int res = dan * j; 
					System.out.printf("%d * %d = %d\n", i, j, res);
				}//for
			}//for	
		}else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
		
		
		/*
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(!(dan >= 2 && dan <= 9)) {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
		
		for(int i=dan; i<=9; i++) {
			System.out.println("===== " + i + "�� =====");
			for(int su=1; su<=9; su++) {
				int res = dan * su; 
				System.out.printf("%d * %d = %d\n", i, su, res);
			}
			System.out.println();
		}
		*/
		
	}

	public void practice10() {
		
		//Practice9() ������ �����ϳ�, 2~9 ������ ���ڰ� �ƴ� ���� �Էµƴٸ�
		//��2~9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.

		int dan;
		do {
			System.out.print("���� : ");
			dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) {
				for(int i=dan; i<=9; i++) {
					System.out.println("===== " + i + "�� =====");
					for(int su=1; su<=9; su++) {
						int res = dan * su; 
						System.out.printf("%d * %d = %d\n", i, su, res);
					}
					System.out.println();
				}
			}else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
			
		}while(!(dan >= 2 && dan <= 9));
		
	}

	public void practice11() {
		
		//����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
		//������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
		//��, ��µǴ� ���ڴ� �� 10���Դϴ�.
		//* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
		//ex) 2, 7, 12, 17, 22 ��
		//		5  5   5   5 => ���⼭ ������ 5
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		System.out.print("���� : ");
		int gong = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.print(num + " ");
			num += gong;
		}
	}

	public void practice12() { //Ʋ��
		
		/*
		���� �� ���� ������(���ڿ��� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.)
		
		��, �ش� ���α׷��� ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ�
		exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�.
		
		���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
		��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�,
		���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ�
		�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String op = ""; //������ ���� ���� 
		
		for (; !op.equals("exit") ;) {//exit�� �ƴҰ�� ���ѹݺ� -> exit�� ��� �ش� for���� ������ �� ������ 330���� �ڵ� ����

			System.out.print("������(+,-,*,/,%) : ");
			op = sc.nextLine();
			
			if (!op.equals("exit")) {
				
				System.out.print("����1 : ");
				int num1 = sc.nextInt();
	
				System.out.print("����2 : ");
				int num2 = sc.nextInt();
				
				sc.nextLine(); //���ѹݺ��� ���� nextInt()���� ���� ���� ���� 

			
			int res = 0; //��� ��� ���� 
			switch (op) {
			case "+":
				res = num1 + num2; 
				break;
			case "-":
				res = num1 - num2; 
				break;
			case "*":
				res = num1 * num2; 
				break;
			case "%":
				res = num1 % num2; 
				break;
			case "/":
				if(num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					continue; //�������� �� ����. �׷� ���� 326���� ����Ǳ� ������ �߸��� �ڵ�. continue �߰��� ���. 
				}else {
					res = num1 / num2; 
				}
				break;	
			default:
				System.out.println("���� ������ �Դϴ�.");
				continue; //�������� �� break���� ��� �߾��� -> �׷� ���� 326���� ����Ǳ� ������ �߸��� �ڵ�. continue�� �ٲپ� ���. 
			}//switch

			System.out.printf("%d %s %d = %d\n" , num1, op, num2, res);
			
			}//if
		}//for
		
		System.out.println("���α׷��� �����մϴ�.");*/
		
	
	}

}

