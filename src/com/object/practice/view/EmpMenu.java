package com.object.practice.view;

import java.util.Scanner;

import com.object.practice.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);
	Employee emp = null;
	
	public EmpMenu() {	}

	public void mainMenu() {

		while(true) {
			System.out.println("===== ��� ���� ���� ���α׷� ====");
			System.out.println("1.�� ��� ���� �Է�");
			System.out.println("2.��� ���� ����");
			System.out.println("3.��� ���� ����");
			System.out.println("4.��� ���� ���");
			System.out.println("9.���α׷� ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				inputEmployee();
				break;
			case 2:
				modifyEmployee(emp);
				break;
			case 3:
				emp = null;
				break;
			case 4:
				emp.information();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}//while
		
	}
	
	
	public Employee inputEmployee() {
		
		System.out.print("����� : ");
		String name = sc.nextLine();
		System.out.print("�μ��� : ");
		String dept = sc.nextLine();
		System.out.print("���� : ");
		String job = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("���ʽ�����Ʈ : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = sc.nextLine();
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		emp = new Employee(name, dept, job, age, gender, gender, bonusPoint, phone, address);
		
		return emp;
		
	}
	
	public void modifyEmployee(Employee employee) {
		
		while(true) {
			
			System.out.println("===== ��� ���� ���� �޴� =====");
			System.out.println("1.�̸� ����");
			System.out.println("2.�޿� ����");
			System.out.println("3.�μ� ����");
			System.out.println("4.���� ����");
			System.out.println("9.���� �޴���");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println("===== ���� �� ���� =====");
			System.out.println(emp.information());

			switch(menu) {
			case 1: 
				System.out.print("������ �̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				emp.setEmpName(name);
				break;
			case 2: 
				System.out.print("������ �޿��� �Է��ϼ��� : ");
				int salary = sc.nextInt();
				emp.setSalary(salary);
				break;
			case 3: 
				System.out.print("������ �μ��� �Է��ϼ��� : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4: 
				System.out.print("������ ������ �Է��ϼ��� : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			}
			System.out.println("===== ���� �� ���� =====");
			System.out.println(emp.information());
		}//while
	}
	
}
