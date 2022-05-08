package com.programmers;

public class P0506_7 {
	//문자열 다루기 기본
	
	public static void main(String[] args) {
		
		String s = "a858d";
		
		boolean result = true; //문자열 s의 길이가 4 or 6이고, 숫자로만 구성이 되어있다면 true 반환
		
		//1.내 풀이
		//먼저 true의 조건을 충족하지 못하는 false의 조건을 생각해보자.
		//1)그럼 길이가 4거나 6이 아니면 바로 false를 반환해주면 되고
		//2)문자열 안에 숫자가 아닌 다른것이 하나라도 들어있다면 false를 반환해주면 된다. 
		if(s.length() != 4 && s.length() != 6) { //문자열 s의 길이가 4나 6이 아니라면 
			result = false; 
		}else { //문자열 s의 길이가 4나 6인 경우엔 문자열의 구성요소들을 확인
			for(int i=0; i<s.length(); i++) {
				if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) { //문자열의 해당 i번째 문자가 0 이상 9이하 이닌 경우는 false
					result = false;
					break; //반복 종료
				}
			}
		}
		
		System.out.println(result);

		//2.다른 풀이 : "정규표현식" 사용 - 1
		result = false; //기본 결과값을 false로 하고 
		
		if(s.length() == 4 || s.length() == 6) { //문자열의 길이가 4이거나 6이면 해당 조건문에 진입해서
			result = s.matches("(^[0-9]*$)"); //해당 문자열이 숫자로만 구성되어있는지 확인 => matches 메소드의 결과가 boolean 타입으로 반환
		}
		
		System.out.println(result);
		
		//3.다른 풀이 : "정규표현식" 사용 - 2 
		//길이 체크까지 정규표현식으로 하면 문자열 s에 대한 모든 검사가 아래 코드 한줄로 끝난다.....wow....
		System.out.println(s.matches("^[0-9]{4}|{6}$")); //해석 : 숫자(0~9)로만 이루어진 4 글자 or 6글자 
		
	}

}
