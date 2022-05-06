package com.programmers;

public class P0506_4 {
	//수박수박수박수박수박수?
	
	public static void main(String[] args) {
		
		//규칙을 먼저 찾아보면 아래와 같다.
		//n = 1 이면? "수"
		//n = 2 이면? "수박"
		//n = 3 이면? "수박수"
		//n = 4 이면? "수박수박"
		//규칙1 : 문자열의 홀수번째 인덱스에는 "수"가 오고, 짝수번째 인덱스에는 "박"이 온다.
		
		int n = 4;
		StringBuilder sb = new StringBuilder();
		
		//방법1 : for문 사용 => n의 길이만큼 반복을 해서 자리수 마다 글자 추가
		for(int i=0; i<n; i++) {
			
			/*if(i%2 == 0) { //짝수번째라면 
				sb.append("수"); //"수" 추가
			}else { //홀수번째라면
				sb.append("박"); //"박" 추가
			}*/
			
			//삼항연산자로도 가능 
			sb.append(i%2 == 0 ? "수" : "박");
			
		}

		System.out.println(sb);
		
		//방법2 : while문 사용 => n의 길이만큼 반복을 해서 자리수 마다 글자 추가
		int idx = 0;
		while(idx<n) {
			sb.append(idx%2 == 0 ? "수" : "박");
			idx++;
		}
		
	}

}
