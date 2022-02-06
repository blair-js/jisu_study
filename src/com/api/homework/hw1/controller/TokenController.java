package com.api.homework.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		
		//공백을 토큰으로 처리 한 글자 반환
		StringTokenizer st = new StringTokenizer(str, " ");  
		
		String result = "";
		while(st.hasMoreTokens()) {
			result += st.nextToken(); 
		}
		
		return result;
		
	}
	
	public String firstCap(String input) {
		
		StringBuilder st = new StringBuilder(input);
		
		st.delete(0, 1); //st의 0번째부터 1번째 전까지 삭제(즉, 0번째만 삭제됨)
		st.insert(0, input.toUpperCase().charAt(0)); //input 대문자 변환 문자열의 0번째 문자를 st의 0번째에 삽입 
		
		String result = ""; //반환형이 String이고 StringBuilder 를 어떻게? 형변환해야할지 모름. 그래서 빈 문자열을 만들고
		result += st; //이어 붙임
		
		return result; 
		
	}

	public int findChar(String input, char one) {
		
		//input에 들어오는 글자는 공백이 없는 글자이기 때문에 토큰나이저를 쓸수있나?모르겠음
		String[] inputArr = input.split(""); //split은 사용 가능 
		//StringTokenizer st = new StringTokenizer(input, ""); //얘는 안먹힘. 여러개의 토큰으로 쪼개지지가 않음.
		
		int count = 0; 
		
		for(String s : inputArr) {
			if(s.equals(String.valueOf(one))) { //s가 String 타입이라 비교하려면 char형인 one을 String 타입으로 바꿔줘야 함.
				count++;
			}
		}
		
		return count;

	}
	
}
