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
		
	}
	
}
