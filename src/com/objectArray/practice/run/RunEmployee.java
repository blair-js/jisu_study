package com.objectArray.practice.run;

import com.objectArray.practice.model.vo.Employee;

public class RunEmployee {

	public static void main(String[] args) {

		// ��ü�迭�� ũ�� 3���� �Ҵ� �� ��
		Employee[] emp = new Employee[3];
		
		// 0�� �ε������� �⺻�����ڸ� ���ؼ� ��ü ����
		emp[0] = new Employee();
		
		// 1�� �ε������� �Ű����� 6��¥�� �����ڸ� �̿��Ͽ� ��ü ����
		emp[1] = new Employee(1, "ȫ�浿", 19, 'M', "01022223333", "���� ���");
	
		// 2�� �ε������� �Ű����� 10��¥�� �����ڸ� �̿��Ͽ� ��ü ���� �� ���
		emp[2] = new Employee(2, "������", "������", "����", 20, 'F', 1000000, 0.01, "01011112222", "���� ����");
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		System.out.println("emp[2] : " + emp[2].information());
		
		System.out.println("========================================================================");
		
		// 3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� �ٽ� ���
		emp[0].setEmpNo(0);
		emp[0].setEmpName("�踻��");
		emp[0].setDept("������");
		emp[0].setJob("����");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("���� ����");
		
		emp[1].setDept("��ȹ��");
		emp[1].setJob("����");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		
		System.out.println("========================================================================");
		
		// ���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
		// ���ʽ��� ����� ���� = (�޿� + (�޿� * ���ʽ�����Ʈ)) * 12
		System.out.println(emp[0].getEmpName() + "�� ���� : " + (int)(emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonusPoint()))*12 + "��");
		System.out.println(emp[1].getEmpName() + "�� ���� : " + (int)(emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonusPoint()))*12 + "��");
		System.out.println(emp[2].getEmpName() + "�� ���� : " + (int)(emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonusPoint()))*12 + "��");
		
		System.out.println("========================================================================");
		
		// 3�� ������ ���� ����� ���Ͽ� ��� 
		//int emp0 = (int)(emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonusPoint())) * 12;
		//int emp1 = (int)(emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonusPoint())) * 12;
		//int emp2 = (int)(emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonusPoint())) * 12;
		
		//�ݺ����� ���� ��
		int sum = 0;
		for(int i=0; i<emp.length; i++) {
			sum += (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
		}
		
		System.out.println("�������� ������ ��� : " + sum/emp.length + "��");
		
	}

}
