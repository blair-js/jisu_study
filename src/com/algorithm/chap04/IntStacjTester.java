package com.algorithm.chap04;

import java.util.Scanner;

public class IntStacjTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64); //�ִ� 64���� �����͸� push �� �� �ִ� ���� 
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity()); //�뷮 capacity �� ������ size ��
			
			System.out.println("(1)Ǫ��");
			System.out.println("(2)��");
			System.out.println("(3)��ũ");
			System.out.println("(4)����");
			System.out.println("(5)ã��");
			System.out.println("(6)����");
			System.out.println("(7)�뷮Ȯ��");
			System.out.println("(8)���� ������ �� Ȯ��");
			System.out.println("(9)����ִ��� Ȯ��");
			System.out.println("(10)����á���� Ȯ��");
			System.out.println("(0)����");
			System.out.print("�޴����� : ");
			int menu = sc.nextInt();
			
			if(menu == 0) {
				break; //while�� Ż��
			}
			
			int x; //�����͸� ���� ������
			
			switch(menu) {
			case 1: 
				System.out.print("Ǫ���� ������ : ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2: 
				try {
					x = s.pop();
					System.out.println("���� ������ : " + x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 3: 
				try {
					x = s.peek();
					System.out.println("��ũ�� ������ : " + x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("ã�� ���� :");
				x = sc.nextInt();
				int idx = s.indexOf(x);
				if(idx > 0) {
					System.out.println(x + "��/�� " + idx + "��°�� �ֽ��ϴ�.");
				}else {
					System.out.println("ã���� �ϴ� ���ڰ� �������� �ʽ��ϴ�.");
				}
				break;
			case 6:
				s.clear();
				System.out.println("���� �Ϸ�");
				break;
			case 7:
				System.out.println("������ �뷮 : " + s.capacity());
				break;
			case 8:
				System.out.println("���� ������ �� : " + s.size());
				break;
			case 9:
				if(s.isEmpty()) {
					System.out.println("��� �ֽ��ϴ�.");
				}else {
					System.out.println("������� �ʽ��ϴ�.");
				}
				break;
			case 10:
				if(s.isFull()) {
					System.out.println("���� á���ϴ�.");
				}else {
					System.out.println("���������� �ʽ��ϴ�.");
				}
				break;
			}//switch
		}//while
		
	}

}
