package com.api.homework.hw4.run;

import com.api.homework.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {

		EmpTest et = new EmpTest();
	
		// setEmp()�� ���� �� ���� ����� ��� �� �Է��� ���� ��� �Ѹ� ���� ���
		et.setEmp();
		
		System.out.println("------------------------���� ����------------------------");
		// printEmp()�� ���� �� ����� ���
		et.printEmp();
		
		// nameSortPrint()�� ���� ������� �̸��� ������������ ���
		System.out.println("------------------------���� ����------------------------");
		et.nameSortPrint();
		
		// printEmp()�� ���� �� ����� ���
		et.printEmp();

		
		
	}

}
