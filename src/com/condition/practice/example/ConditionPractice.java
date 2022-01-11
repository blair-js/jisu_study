package com.condition.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		//�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		//���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���
	
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("9.����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		String str = "";
		
		switch(menu) {
		case 1:
			str = "�Է� ";
			break;
		case 2:
			str = "���� ";
			break;
		case 3:
			str = "��ȸ ";
			break;
		case 4:
			str = "���� ";
			break;
		case 9:
			System.out.println("���� �մϴ�.");
			return;
		default :
			System.out.println("��ȣ�� �ٽ� �Է��ϼ���.");
			return;
		}
		
		System.out.println(str + "�޴� �Դϴ�.");
		
	}
	
	public void practice2() {
		
		//Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
		//¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		//����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("¦����");
			}else {
				System.out.println("Ȧ����");
			}
		}else {
			System.out.println("����� �Է����ּ���.");
		}
	}

	public void practice3() {
		
		//����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
		//�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
		//(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
		//�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
		//���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		double cnt = 3.0;
		int sum = kor + math + eng;
		double avg = sum / cnt;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
				System.out.printf("���� : %d\n���� : %d\n���� : %d\n", kor, math, eng);
				System.out.printf("�հ� : %d\n��� : %.1f\n", sum, avg);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ� �Դϴ�.");
		}
		
	}

	public void practice4() {
		
		//���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
		/*
		 * if(month == 1 || month == 2 || month == 12) {
			season = "�ܿ�";
			} else if(month >= 3 && month <= 5) {
			season = "��";
			} else if(month >= 6 && month <= 8) {
			season = "����";
			} else if(month >= 9 && month <= 11) {
			season = "����";
			} else {
			season = "�ش��ϴ� ������ �����ϴ�.";
			}
		 */
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		String season = "";
		switch(month) {
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		default :
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
			return;
		}
		
		System.out.println(month + "���� " + season + " �Դϴ�.");
	}

	public void practice5() {
		
		//���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		//�α��� ���� �� ���α��� ������,
		//���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
		//��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���
		
		String id = "user1";
		String pw = "1234";
		
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String userPw = sc.nextLine();
		
		if(userId.equals(id) && userPw.equals(pw)) {
			System.out.println("�α��� ����");
		}else { //�α��� ���� ����� �� 3�� 
			if(userId.equals(id)) {
				System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
			}else if(userPw.equals(pw)){
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			}else {
				System.out.println("���̵�� ��й�ȣ ��� Ʋ�Ƚ��ϴ�.");
			}
		}
		
		
	}
	
	public void practice6() {
	
		//����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
		//��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		//ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		//��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
		//(��, �߸� �Է��Ͽ��� ��� ���߸� �Է��߽��ϴ�.�� ��� ��¹��� ��µǵ���)
		
		String admin = "ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
		String user = "�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
		String noUser = "�Խñ� ��ȸ";
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String grade = sc.nextLine();
		
		String aut = "";
		switch(grade) {
		case "������":
			aut = admin;
			break;
		case "ȸ��":
			aut = user;
			break;
		case "��ȸ��":
			aut = noUser;
			break;
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			return;
		}
		
		System.out.println(aut);
		
	}

	public void practice7() {
		
		//Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
		//��ü�� / ����ü�� / ��ü�� / ���� ����ϼ���.
		//BMI = ������ / (Ű(m) * Ű(m))
		//BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
		//BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
		//BMI�� 30�̻��� ��� �� ��
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);

		String result = "";
		
		if(bmi < 18.5) {
			result = "��ü��";
		}else if(bmi < 23) {
			result = "����ü��";
		}else if(bmi < 25) {
			result = "��ü��";
		}else if(bmi < 30) {
			result = "��";
		}else {
			result = "����";
		}
		
		System.out.println("BMI ���� : " + bmi + "\n" + result);
		
	}
	
	public void practice8() {
		
		//Ű����� �� ���� ����� ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
		//(��, ����� �ƴ� ���� �Է��ϰų� ���õǾ� ���� ���� ���� ��ȣ�� �Է� ���� ��
		//���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
		//(printf()���� �̿��Ͽ� ������ ��¹��� �ۼ��غ��ÿ�.)
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String op = sc.nextLine();
		
		int result = 0;
		if(num1 > 0 && num2 > 0) {
			switch(op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return; 
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
		
		System.out.printf("%d %s %d = %d", num1, op, num2, result);
	}

	public void practice9() {
		
		//�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
		//�� �� 100�� �� �������δ� ������ ����.
		//�߰���� (20%), �⸻��� (30%), ���� (30%), �⼮ (20%)
		//�� ��, �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� �Է�
		//�� ���� 70�� �̻��̸鼭 ��ü ������ 70%�̻� �⼮�� ���� ��� Pass,
		//�ƴϸ� Fail�� ����ϼ���.
	
		System.out.print("�߰� ��� ���� : ");
		double midScore = sc.nextDouble() * 0.2;
		System.out.print("�⸻ ��� ���� : ");
		double finScore = sc.nextDouble() * 0.3;
		System.out.print("���� ���� : ");
		double work = sc.nextDouble() * 0.3;
		System.out.print("�⼮ Ƚ�� : ");
		double attn = sc.nextDouble();
		
		double totalScore = midScore + finScore + work + attn; 
		
		int stdScore = 70; //���� ĿƮ����

		int perAttn = 20; //�⼮�� 100%
		int stdAttn = (int)(perAttn * 0.7); //�⼮ ĿƮ����
		
		System.out.println("========= ��� =========");
		if(totalScore >= stdScore && attn >= stdAttn) { //�հ�
			System.out.printf("�߰� ��� ����(20) : %.1f\n", midScore);
			System.out.printf("�⸻ ��� ����(30) : %.1f\n", finScore);
			System.out.printf("���� ����    (30) : %.1f\n", work);
			System.out.printf("�⼮ ����    (20) : %.1f\n", attn);
			System.out.printf("���� : %.1f\n", totalScore);
			System.out.println("PASS");
		}else { //���հ� 
			if(totalScore >= stdScore) {
				System.out.printf("FAIL [�⼮ Ƚ�� ����] (%.0f/%d)\n", attn, perAttn);
			}else if(attn >= stdAttn){
				System.out.printf("FAIL [�����̴�] (���� %.1f)\n", totalScore);
			}else {
				System.out.printf("FAIL [�⼮ Ƚ�� ����] (%.0f/%d)\n", attn, perAttn);
				System.out.printf("FAIL [�����̴�] (���� %.1f)\n", totalScore);
			}
		}
		
	}

	public void practice10() {
		
		//�տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���.
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1.�޴� ���");
		System.out.println("2.¦��/Ȧ��");
		System.out.println("3.�հ�/���հ�");
		System.out.println("4.����");
		System.out.println("5.�α���");
		System.out.println("6.���� Ȯ��");
		System.out.println("7.BMI");
		System.out.println("8.����");
		System.out.println("9.Pass/Fail");
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: 
			practice1();
			break;
		case 2: 
			practice2();
			break;
		case 3: 
			practice3();
			break;
		case 4: 
			practice4();
			break;
		case 5: 
			practice5();
			break;
		case 6: 
			practice6();
			break;
		case 7: 
			practice7();
			break;
		case 8: 
			practice8();
			break;
		case 9: 
			practice9();
			break;
		default :
			System.out.println("��ȣ�� �ٽ� �Է��ϼ���.");
			return;
		}
		
	}
	
}
