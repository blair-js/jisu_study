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
		
	}
	
}
