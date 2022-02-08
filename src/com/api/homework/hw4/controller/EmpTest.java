package com.api.homework.hw4.controller;

import java.util.Scanner;

import com.api.homework.hw4.model.vo.Employee;

public class EmpTest {
	
	private Scanner sc = new Scanner(System.in);

	private Employee[] empArr = new Employee[6];
	
	{
		empArr[0] = new Employee("김문말", 24, 1500000, 1.245);
		empArr[1] = new Employee("이장소", 40, 2500000, 1.4);
		empArr[2] = new Employee("박금순", 22, 1780000, 1.3);
		empArr[3] = new Employee("최봉호", 31, 1950000, 1.365);
		empArr[4] = new Employee("홍달림", 34, 1650000, 1.212);
		
	}

	public EmpTest() {	}
	
	public void setEmp() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("세율 : ");
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
					//정렬과정 눈으로 확인해보기 
					System.out.println(empArr[i].getName()); //비교주체
					System.out.println(empArr[j].getName()); //비교대상
					System.out.println(empArr[i].getName().compareTo(empArr[j].getName())); //compareTo() 의 결과값은 int
					
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
				}//if
			}//for
		}//for
		
	}
	
}
