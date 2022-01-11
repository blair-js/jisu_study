package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {

	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		//이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다.");
		
	}

	public void method2() {
		
		//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2; 
		int sub = num1 > num2 ? (num1-num2) : (num2-num1); //두 번째 정수를 더 큰수로 입력할 경우도 고려
		int mul = num1 * num2;
		int div = num1 > num2 ? (num1/num2) : (num2/num1); //두 번째 정수를 더 큰수로 입력할 경우도 고려
		
		System.out.println("더하기 결과 :" + sum);
		System.out.println("빼기 결과 :" + sub);
		System.out.println("곱하기 결과 :" + mul);
		System.out.println("나누기 결과 :" + div);
		
	}

	public void method3() {
		
		//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		//참고( 면적=가로*세로 , 둘레=(가로+세로)*2 )

		System.out.print("가로 : ");
		double wid = sc.nextDouble(); 
		System.out.print("세로 : ");
		double vir = sc.nextDouble();
		
		double area = wid*vir; 
		double width = (wid + vir)*2;
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + width);
		
	}

	public void method4() {
		
		//영어 문자열 값을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요.
		//HINT > charAt(인덱스) 메소드 활용해보기
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		char c3 = str.charAt(2);
		
		System.out.println("=== 방법1 ===");
		System.out.println("첫 번째 문자 : " + c1);
		System.out.println("두 번째 문자 : " + c2);
		System.out.println("세 번째 문자 : " + c3);
		
		//방법2
		System.out.println("=== 방법2 ===");
		for(int i=0; i<3; i++) {
			String s = "";
			if(i == 0) {
				s = "첫 번째 문자 : ";
			}else if(i == 1) {
				s = "두 번째 문자 : ";
			}else { //2
				s = "세 번쨰 문자 : ";
			}
			System.out.println(s + str.charAt(i));
		}
		
	}
	
}
