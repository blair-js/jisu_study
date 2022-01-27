package com.inherit.practice.run;

import java.util.Scanner;

import com.inherit.practice.model.vo.Employee;
import com.inherit.practice.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 3���� �л� ������ ����� �� �ְ� ��ü �迭 �Ҵ� (Student[])
		// ���� ��뵥���� �����Ͽ� 3���� �л� ���� �ʱ�ȭ
		Student[] stuArr = {
							new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�"), 
							new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�"),
							new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�")
		};
		
		// ���� �л� ���� ��� ���
		for(Student s : stuArr) {
			System.out.println(s.information());
		}
		
		// �ִ� 10���� ��� ������ ����� �� �ְ� �迭�� �Ҵ� (Employee[])
		Employee[] empArr = new Employee[10];
		
		int index = 0;
		
		// ������� ������ Ű����� ��� �Է� �ް� --> while(true) ���� �ݺ����� ����
		while(true) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			double height = sc.nextDouble();
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			
			// �Է¹��� �������� ������ �Ű����� �����ڸ� �̿��Ͽ� ��ü�迭�� ��ü ����
			// �� �� �߰� �� ������ ī��Ʈ��
			empArr[index++] = new Employee(name, age, height, weight, salary, dept);

			System.out.print("��� �߰��Ͻðڽ��ϱ�?(y/n) : ");
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'n') {
				break;
			}
			
		}//while
		
		// �迭�� ��� ������� ������ ��� ���
		for(int i=0; i<index; i++) {
			System.out.println(empArr[i].information());
		}
		
	}

}
