package com.programmers;

public class P0502_5 {
	//핸드폰 번호 가리기
	
	public static void main(String[] args) {
		
		String phone_number = "027778888";
		
		//방법1.내 풀이 방법
		//먼저 입력받은 길이를 변수에 담고
		/*int length = phone_number.length();
		
		//새로 반환해줄 비밀번호 변수 생성
		StringBuilder sb = new StringBuilder();
		
		//뒤에 4자리를 제외한 나머지 자리는 모두 별(*)로 연결ㅊ
		for(int i=0; i<length-4; i++) {
			sb.append("*");
		}

		//뒤에 4자리는 기존 비밀번호로 연결
		for(int i=length-4; i<length; i++) {
			sb.append(phone_number.charAt(i));
		}
		
		System.out.println(sb);*/
		
		//2.다른 풀이방법 : char형 배열 이용하기
		//입력받은 문자열을 toCharArray() 메소드를 통해 하나씩 char 배열에 담는다.
		/*char[] ch = phone_number.toCharArray();
		
		for(int i=0; i<ch.length-4; i++) { //배열의 길이에서 뒤 4자리를 뺀 만큼만 반복
			ch[i] = '*'; //기존 값들을 모두 별(*)로 변경 
		}
		
		//char형 배열을 매개변수로 넣어 하나의 문자열로 변환해주는 valueOf 메소드 사용.
		System.out.println(String.valueOf(ch));*/
		
		
		//3.다른 풀이방법 : substring 메소드 이용하기 
		String answer = ""; //변환하여 반환할 새 비밀번호 변수
		
		for(int i=0; i<phone_number.length()-4; i++) {//배열의 길이에서 뒤 4자리를 뺀 만큼만 반복
			answer += "*"; //별(*) 누적
		}
		
		//그다음 substring 메소드를 사용하여
		//기존 비밀번호의 뒤 4자리를 뽑아서 answer에 연결시켜주기
		answer += phone_number.substring(phone_number.length()-4);

		System.out.println(answer);
	}

}
