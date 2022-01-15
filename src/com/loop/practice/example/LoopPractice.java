package com.loop.practice.example;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		//(for문 이용)
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt(); 
		
		if(num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
		
	}

	public void practice2() {
		
		//practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		//“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		int num; 
		do {
			
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt(); 
			
			if(num > 0) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break; //반복문 끝나면 while문 나가기
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}while(num < 1);
		
	}

	public void practice3() {
		
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//(for문 이용)
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
		
		for(int i=num; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice4() {
		
		//practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		//“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		
		int num;
		do {

			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num > 0) {
				for(int i=num; i>=1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}while(num < 1);
		
		
	}

	public void practice5() {
		
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		//(for문 이용)
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0; 
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i == num) {
				System.out.print(i + " = " + sum);
			}else {
				System.out.print(i + " + ");
			}
		}
		
	}

	public void practice6() {
		
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
		//(for문 이용)

		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { 
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}else {
			int min = num1; 
			int max = num2;
			
			if(num1 > num2) { 
				min = num2;
				max = num1;
			}
			
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
	
	public void practice7() {
		
		//위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		int num1, num2;
		do {
			
			System.out.print("정수 1 : ");
			num1 = sc.nextInt();
			System.out.print("정수 2 : ");
			num2 = sc.nextInt();
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자만을 입력해주세요.");
			}else {
				int min = num1; 
				int max = num2;
				
				if(num1 > num2) { 
					min = num2;
					max = num1;
				}
				
				for(int i=min; i<=max; i++) {
					System.out.print(i + " ");
				}
			}
			
		}while(num1 < 1 || num2 < 1);
		
	}

	public void practice8() {
		
		//사용자로부터 입력 받은 숫자의 단을 출력하세요.
		//(for문 이용)
	
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		for(int su=1; su<=9; su++) {
			int res = num * su;
			System.out.printf("%d * %d = %d\n", num, su, res);
		}
	}

	public void practice9() { //틀림 -> 다시 풀기 완료
		
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt(); 
		
		if(dan >= 2 && dan <= 9) {
			for(int i=dan; i<=9; i++) {
				System.out.println("===== " + i + "단 =====");
				for(int j=1; j<=9; j++) {
					int res = dan * j; 
					System.out.printf("%d * %d = %d\n", i, j, res);
				}//for
			}//for	
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
		
		
		/*
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(!(dan >= 2 && dan <= 9)) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
		
		for(int i=dan; i<=9; i++) {
			System.out.println("===== " + i + "단 =====");
			for(int su=1; su<=9; su++) {
				int res = dan * su; 
				System.out.printf("%d * %d = %d\n", i, su, res);
			}
			System.out.println();
		}
		*/
		
	}

	public void practice10() {
		
		//Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		//“2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		int dan;
		do {
			System.out.print("숫자 : ");
			dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) {
				for(int i=dan; i<=9; i++) {
					System.out.println("===== " + i + "단 =====");
					for(int su=1; su<=9; su++) {
						int res = dan * su; 
						System.out.printf("%d * %d = %d\n", i, su, res);
					}
					System.out.println();
				}
			}else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
			
		}while(!(dan >= 2 && dan <= 9));
		
	}

	public void practice11() {
		
		//사용자로부터 시작 숫자와 공차를 입력 받아
		//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		//단, 출력되는 숫자는 총 10개입니다.
		//* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		//ex) 2, 7, 12, 17, 22 …
		//		5  5   5   5 => 여기서 공차는 5
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.print(num + " ");
			num += gong;
		}
	}

	public void practice12() { //틀림
		
		/*
		정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.)
		
		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		
		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String op = ""; //연산자 받을 변수 
		
		for (; !op.equals("exit") ;) {//exit가 아닐경우 무한반복 -> exit일 경우 해당 for문에 진입할 수 없으며 330행의 코드 실행

			System.out.print("연산자(+,-,*,/,%) : ");
			op = sc.nextLine();
			
			if (!op.equals("exit")) {
				
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
	
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				
				sc.nextLine(); //무한반복시 위의 nextInt()에서 남은 엔터 제거 

			
			int res = 0; //결과 담는 변수 
			switch (op) {
			case "+":
				res = num1 + num2; 
				break;
			case "-":
				res = num1 - num2; 
				break;
			case "*":
				res = num1 * num2; 
				break;
			case "%":
				res = num1 % num2; 
				break;
			case "/":
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue; //예전과제 때 누락. 그럼 밑의 326행이 실행되기 때문에 잘못된 코드. continue 추가해 줬다. 
				}else {
					res = num1 / num2; 
				}
				break;	
			default:
				System.out.println("없는 연산자 입니다.");
				continue; //예전과제 때 break으로 사용 했었음 -> 그럼 밑의 326행이 실행되기 때문에 잘못된 코드. continue로 바꾸어 줬다. 
			}//switch

			System.out.printf("%d %s %d = %d\n" , num1, op, num2, res);
			
			}//if
		}//for
		
		System.out.println("프로그램을 종료합니다.");*/
		
	
	}

}

