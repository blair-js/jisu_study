package com.api.homework.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	private Scanner sc = new Scanner(System.in);
	
	public SpaceUpper() {	}
	
	public void spaceToUpper() {
		
		// 영문을 입력 받는다.
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를구성
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			
			String s = st.nextToken(); //st.nextToken() 가 String으로 반환되므로 s에 담아주고 
			
			char oldC = s.charAt(0); //0번째 문자 뽑고 
			char newC = s.toUpperCase().charAt(0); //문자열을 대문자로 바꾼 상태에서 0번째 문자 뽑아서
			
			s = s.replace(oldC, newC); //문자 바꿔주기
			
			sb.append(s + " "); //추가 
			
		}
		
		System.out.println(sb);

	}
	
}
