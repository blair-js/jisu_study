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
			}//switch
		}//while
		
	}

}
