package com.objectmvc.practice.controller;

public class StaticSample {

	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value; //this 필요없이 클래스명으로 접근 가능^^
	}
	
	public static void toUpper() {
	
		char[] cArr = new char[value.length()];
		
		for(int i=0; i<cArr.length; i++) { //value 값을 쪼개서 char 배열에 담기
			if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				cArr[i] = (char)(value.charAt(i) - 32); //소문자와 대문자 차이만큼 
			}else {
				cArr[i] = value.charAt(i);
			}
		}//for
		
		value = ""; //초기화(안해주면 JavaJAVA 로 됨)
		//쪼개진 문자를 문자열로 합체
		for(int i=0; i<cArr.length; i++) {
			value += cArr[i];
		}
		
	}
	
	public static void setChar(int index, char c) {
		
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		
		char[] cArr = new char[value.length()];
		
		for(int i=0; i<cArr.length; i++) {
			if(i == index) {
				cArr[i] = c;
			}else {
				cArr[i] = value.charAt(i);
			}
		}//
		
		value = ""; //초기화
		for(int i=0; i<cArr.length; i++) {
			value += cArr[i];
		}
		
	}
	
	public static int valueLength() {
		
		return value.length();
	}
	
	public static String valueConcat(String str) {
		
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		return value + str;
	}
	
	
}
