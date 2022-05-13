package com.programmers;

public class P0513_1 {
	//가운데 글자 가져오기
	
	public static void main(String[] args) {
		
		String s = "abcde";
		String answer = "";
		
		//나의 풀이_1
		/*if(s.length()%2 == 0) { //문자 길이가 짝수이면 가운데 2개 추출 
			
			//ex. s가 "qwer"인 경우 -> 1번째 w, 2번째 e 추출 -> we
			//	  s가 "abcdef"인 경우 -> 2번째 c, 3번째 d 추출 -> cd
			//즉, 추출되는 문자 2개는 문자열의 길이를 2로 나눈 위치와 그 앞의 위치를 반환해주면 된다.
			//문자열의 길이가 4인경우 4%2인 2번째 인덱스, 4%2-1인 1번째 인덱스를 추출한다는 의미이다.
			char ch1 = s.charAt(s.length()/2 -1);
			char ch2 = s.charAt(s.length()/2);
			answer = "" + ch1 + ch2;
		}else {//문자 길이가 홀수이면 정가운데 1개 추출
			answer = "" + s.charAt(s.length()/2);
		}
		
		System.out.println(answer);*/
		
		//나의 풀이_2 : substring() 사용
		//*주의 : 뽑고자 하는 결과 문자열의 시작인덱스와 종료인덱스를 추출하였는데, 
		//subString은 종료 인덱스의 위치를 포함하지 않고 추출해주기 때문에 +1을 해주어야 원하는 위치까지 뽑을 수 있다.
		int startIdx;
		int endIdx; 
		
		if(s.length()%2 == 0) {
			startIdx = (s.length()/2)-1;
			endIdx = s.length()/2;
			answer = s.substring(startIdx, endIdx+1);
		}else {
			startIdx = s.length()/2;
			answer = s.substring(startIdx, startIdx+1);
		}
		
		System.out.println(answer);
	}

}
