package com.object.practice.view;

import java.util.Scanner;

import com.object.practice.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);
	Employee emp = null;
	
	public EmpMenu() {	}

	public void mainMenu() {

		while(true) {
			System.out.println("===== 사원 정보 관리 프로그램 ====");
			System.out.println("1.새 사원 정보 입력");
			System.out.println("2.사원 정보 수정");
			System.out.println("3.사원 정보 삭제");
			System.out.println("4.사원 정보 출력");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}//while
		
	}
	
	
	public Employee inputEmployee() {
		
		System.out.print("사원명 : ");
		String name = sc.nextLine();
		System.out.print("부서명 : ");
		String dept = sc.nextLine();
		System.out.print("직급 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		emp = new Employee(name, dept, job, age, gender, gender, bonusPoint, phone, address);
		
		return emp;
		
	}
	
	public void modifyEmployee(Employee employee) {
		
		while(true) {
			
			System.out.println("===== 사원 정보 수정 메뉴 =====");
			System.out.println("1.이름 변경");
			System.out.println("2.급여 변경");
			System.out.println("3.부서 변경");
			System.out.println("4.직급 변경");
			System.out.println("9.이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			System.out.println("===== 수정 전 정보 =====");
			System.out.println(emp.information());

			switch(menu) {
			case 1: 
				System.out.print("변경할 이름을 입력하세요 : ");
				String name = sc.nextLine();
				emp.setEmpName(name);
				break;
			case 2: 
				System.out.print("변경할 급여를 입력하세요 : ");
				int salary = sc.nextInt();
				emp.setSalary(salary);
				break;
			case 3: 
				System.out.print("변경할 부서를 입력하세요 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				break;
			case 4: 
				System.out.print("변경할 직급을 입력하세요 : ");
				String job = sc.nextLine();
				emp.setJob(job);
				break;
			case 9:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
			System.out.println("===== 수정 후 정보 =====");
			System.out.println(emp.information());
		}//while
	}
	
}
