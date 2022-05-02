package com.programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P0502_1 {
	//직사각형 별찍기 : 람다식을 이용한 방법 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(); //문자열을 저장하기 위한 객체 sb 생성
		
		IntStream.range(0, a).forEach(s -> sb.append("*")); 
		//람다식 해석
		//1. range(0, a) 0부터 a까지의 범위를 설정(ex.a가 5라면 0,1,2,3,4 로 5번의 반복을 하게 된다.)
		//2. forEach : 반복을 위한 함수 
		//3. s -> sb.append("*") : forEach 함수 사용시 s라는 매개변수를 필요로 하고 함수 안의 실행 로직은 sb.append("*") 이다. 
		//정리하면 => sb라는 문자열 객체에 "*"을 추가하는 작업을 5번 반복한다.
		
		IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
		//추가된 sb를 b만큼 반복하여 출력한다. 
		
	}

}
