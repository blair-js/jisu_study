package com.programmers;

public class P0506_2 {
	//시저 암호
	
	public static void main(String[] args) {
		
		//ex : 문자 'A'를 1만큼 밀면 'B'가 되어야 한다. 
		//char ch = 'A';
		//int n = 1; 
		
		//1.문자 'A'를 int 타입으로 형변환하면 65가 된다.
		//2.65에 밀고자 하는 값(n)만큼 더해준다. +1을 더해주면 66이 된다.
		//3.66을 char 타입으로 형변환 해주면 'B'가 된다. 
		//char newCh = (char)((int)ch+n);
		//System.out.println(newCh);
		
		//하지만 문제에서 제시하고 있는 것은 변환하고자 하는 것이 
		//char타입이 아닌 String 타입의 문자열로 제시되고 있기 때문에
		//문자열의 각 자릿수별 문자를 연산 수행 후 다시 하나의 문자열로 만들어줘야한다. 
		
		String s = "a B Xy"; //변환할 문자열
		char[] cArr = s.toCharArray(); //String 클래스의 toCharArray 메소드 사용 => 문자열을 하나씩 배열에 담는다.(ex. "ABCDE" => ['A', 'B', ...])
		int n = 4; //밀고자 하는 값
		
		StringBuilder sb = new StringBuilder(); //새로 반환할 결과 문자열 
		
		//배열 크기만큼 반복 
		for(int i=0; i<cArr.length; i++) {
			char newCh = ' '; //아래 if~else문을 타지 않으면 알파벳이 아닌 경우임(즉, 공백인 경우 공백 그대로 문자열 sb에 추가할 예정)
			
			if(cArr[i] >= 'a' && cArr[i] <= 'z') { //현재 i번째의 배열 요소가 소문자라면
				newCh = (char)(cArr[i] + n); //n만큼 미루기(더하기)
				
				//**근데 newCh가 알파벳의 범위를 초과(z를 초과하면) 26만큼 빼준다.
				//ex)cArr[i]가 'X', n이 4라고 가정하면 newCh가 '\'이 된다.  
				//정상 결과값은 'B'가 나와야한다.(문제에서 Z+1은 A라는 힌트를 주었음)
				//그래서 '\'와 'B'의 차이를 확인하면 92-66=26이다. 그래서 26만큼 빼주어야 하는 것임.
				if(newCh > 'z') newCh-=26; 
				
			}else if(cArr[i] >= 'A' && cArr[i] <= 'Z') { //현재 i번째의 배열 요소가 대문자라면
				newCh = (char)(cArr[i] + n);
				if(newCh > 'Z') newCh-=26; 
			}
			sb.append(newCh); //결과 문자열에 변환한 문자 추가
		}
		
		System.out.println(sb);
		
	}

}
