package com.api.homework.hw4.controller;

import java.util.Scanner;

import com.api.homework.hw4.model.vo.Employee;

public class EmpTest {
	
	private Scanner sc = new Scanner(System.in);

	private Employee[] empArr = new Employee[6];
	
	{
		empArr[0] = new Employee("�蹮��", 24, 1500000, 1.245);
		empArr[1] = new Employee("�����", 40, 2500000, 1.4);
		empArr[2] = new Employee("�ڱݼ�", 22, 1780000, 1.3);
		empArr[3] = new Employee("�ֺ�ȣ", 31, 1950000, 1.365);
		empArr[4] = new Employee("ȫ�޸�", 34, 1650000, 1.212);
		
	}

	public EmpTest() {	}
	
	public void setEmp() {
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("�޿� : ");
		int salary = sc.nextInt();
		System.out.print("���� : ");
		double taxRate = sc.nextDouble();
		
		empArr[empArr.length-1] = new Employee(name, age, salary, taxRate);
		
	}
	
	public void printEmp() {
		
		for(Employee e : empArr) {
			if(e != null) {
				System.out.println(e);
			}
		}
		
	}
	
	public void nameSortPrint() {
	
		for(int i=0; i<empArr.length; i++) {
			for(int j=0; j<i; j++) {
				if(empArr[i].getName().compareTo(empArr[j].getName()) < 0) { 
					//���İ��� ������ Ȯ���غ��� 
					System.out.println(empArr[i].getName()); //����ü
					System.out.println(empArr[j].getName()); //�񱳴��
					System.out.println(empArr[i].getName().compareTo(empArr[j].getName())); //compareTo() �� ������� int
					
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
				}//if
			}//for
		}//for
		
	}
	
}
