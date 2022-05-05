package com.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P0504_5 {
	//이상한 문자 만들기
	
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			
			//입력받은 문자열 str을 공백(" ") 기준 토큰으로 분류
			//이 때, 주의해야할점은 공백(" ") 또한 토큰으로 포함(true) 시켜주어야 한다는 것!
			StringTokenizer st = new StringTokenizer(str, " ", true); 
		
			StringBuilder sb = new StringBuilder(); //최종적으로 반환할 결과 문자열 
			while(st.hasMoreTokens()) { //토큰이 있다면
				
				//현재 토큰 변수에 저장 
				//이 때, 변수 currStr을 사용하지 않고 st.nextToken()로 사용하려고 했으나
				//삼항 연산자에서 st.nextToken()가 두번 사용되기 때문에 다음 토큰을 인식해버리게 되고 에러가 발생했음!
				String currStr = st.nextToken(); 

				for(int i=0; i<currStr.length(); i++) { //해당 토큰의 길이만큼 반복 
					//i번째 문자가 짝수이면 대문자로, 홀수이면 소문자로 변경(현재 i번째 문자가 공백토큰이면 그냥 공백 그대로 저장됨)
					String addStr = i%2 == 0 ? (currStr.charAt(i)+"").toUpperCase() : (currStr.charAt(i)+"").toLowerCase();
					sb.append(addStr); //변환된(소문자or대문자) 결과 문자열에 누적
				}//for
				
			}//while
		
			System.out.println(sb); //확인

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	     /*String s = "jsi d fowjeork gnsjdfnlskdjf";
		 String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");
	        System.out.println(Arrays.toString(array));
	        
	        for(String ss : array) {
	        	System.out.println("ss : " + ss);
	            cnt = ss.contains(" ") ? 0 : cnt + 1;
	            System.out.println("cnt : " + cnt);
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	            System.out.println("answer : " + answer);
	        }
	      
	     System.out.println(answer);*/
	}

}
