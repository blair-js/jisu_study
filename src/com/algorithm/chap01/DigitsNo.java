package com.algorithm.chap01;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 입력 : ");
		int num = sc.nextInt();
		int count = 0; //몇 번 나눌 수 있는지 체크하는 변수 => 자리수가 될 것
		do {
			count++;
			num/=10; //10으로 나눈다
		}while(num > 0); //몫이 0보다 클때까지 => 나중에 숫자가 한 자리수가 되면 몫은 0이 된다.
		
		System.out.println("그 수는 " + count + "자리 입니다.");
		
	}

}
