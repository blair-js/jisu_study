package com.operator.practice.example;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0  ? "�����" : (num < 0 ? "������" : "0�̴�");
		System.out.println(result);
		
	}
	
	public void practice2() {
		
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
		//����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
		
	}


	public void practice3() {
		
		//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num%2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);
		
	}

	
	public void practice4() {
		
		//��� ����� ������ ���� ������������ �Ѵ�. 
		//�ο� ���� ���� ������ Ű����� �Է� �ް�
		//1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		int div = candy/people;
		int remain = candy%people;
		
		System.out.printf("1�δ� ���� ���� : %d\n", div);
		System.out.printf("���� ���� ���� : %d\n", remain);
		

		
	}


	public void practice5() {
		
		//Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		//�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.

		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int ban = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		String gender = sc.nextLine().charAt(0) == 'M' ? "���л�" : "���л�"; 
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.\n", grade, ban, num, name, gender, score);
		
	}

	
	public void practice6() {
		
		//���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, 
		//����(19�� �ʰ�)���� ����ϼ���.
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = age > 19 ? "����" : (age > 13 ? "û�ҳ�" : "���");
		System.out.println(result);
	}
	

	public void practice7() {
		
		//����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
		//�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
		//�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
		//�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		double count = 3.0; 
		
		int sum = kor + eng + math; 
		double avg = sum / count;
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�";
		System.out.printf("�հ� : %d\n��� : %.1f\n%s\n", sum, avg, result);
		
		
	}

	
	public void practice8() {
	
		//�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char gender = sc.nextLine().charAt(7);
		String result = (gender == 1 || gender == 3) ? "����" : "����";
		System.out.println(result);
		

		
	}

	
	public void practice9() {
		
		//Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
		//�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
		//�ƴϸ� false�� ����ϼ���.
		//(��, �Է��� �� num1�� num2���� �۾ƾ� ��)
		
		System.out.print("����1 :");
		int num1 = sc.nextInt();
		System.out.print("����2 :");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		boolean result = (num3 <= num1 || num3 > num2) ? true : false;
		System.out.println(result);
		
	}

	
	public void practice10() {
		
		//3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num1 == num3) ? true : false;
		System.out.println(result);
		
	}

	
	public void practice11() {
		
		//A, B, C ����� ������ �Է� �ް� �� ����� �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
		//�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
		//(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		
		
		System.out.print("A ����� ���� : ");
		double aSal = sc.nextInt() * 1.4;
		
		System.out.print("B ����� ���� : ");
		double bSal = sc.nextInt() * 1.0;
		
		System.out.print("C ����� ���� : ");
		double cSal = sc.nextInt() * 1.15;
		
		String s1 = "3000���� �̻�";
		String s2 = "3000���� �̸�";
		
		System.out.println("A����� �μ�Ƽ������ ���� : " + aSal);
		System.out.println(aSal >= 3000 ? s1 : s2);
		
		System.out.println("B����� �μ�Ƽ������ ���� : " + bSal);
		System.out.println(bSal >= 3000 ? s1 : s2);
		
		System.out.println("C����� �μ�Ƽ������ ���� : " + cSal);
		System.out.println(cSal >= 3000 ? s1 : s2);

		
		
	}
	
}