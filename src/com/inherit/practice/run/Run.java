package com.inherit.practice.run;

import java.util.Scanner;

import com.inherit.practice.model.vo.Employee;
import com.inherit.practice.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		Student[] stuArr = {
							new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"), 
							new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
							new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
		};
		
		// 위의 학생 정보 모두 출력
		for(Student s : stuArr) {
			System.out.println(s.information());
		}
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] empArr = new Employee[10];
		
		int index = 0;
		
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			// 한 명씩 추가 될 때마다 카운트함
			empArr[index++] = new Employee(name, age, height, weight, salary, dept);

			System.out.print("계속 추가하시겠습니까?(y/n) : ");
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'n') {
				break;
			}
			
		}//while
		
		// 배열에 담긴 사원들의 정보를 모두 출력
		for(int i=0; i<index; i++) {
			System.out.println(empArr[i].information());
		}
		
	}

}
