package com.backjoon;

import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //자연수 N 입력받기
		
		int count = 0; //한수의 개수
		
		if(n < 100) { //1부터 99까지는 한수이다.
			count = n; //해당 수를 count에 대입
		}else { //100이상의 수 일 경우
			
			count = 99; //1부터 99까지의 개수인 99로 초기화
			
			for(int i=100; i<=n; i++) { //100부터 n까지만 한수의 개수 검사
				//a,b,c에 각 자릿수 담기 
				//i가 456이라고 가정하면 
				int a = i/100; //백의자리 : 456/100 = 4
				int b = (i/10) % 10; //십의자리 : (456/10)%10 => 45%10 = 5
				int c = i % 10; //일의자리 : 456%10 = 6
				
				if(b-a == c-b) { //공차가 동일하다면
					count++; //한수 개수 증가
				}//if
			}//for
			
		}//if~else
		
		System.out.println(count);
		
	}

}
