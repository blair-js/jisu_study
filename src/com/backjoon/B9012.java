package com.backjoon;

import java.util.Scanner;

public class B9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //테스트 케이스 개수
		sc.nextLine(); //엔터제거 
		
		while(t-->0) { //테스트 케이스 개수만큼 반복 
			String str = sc.nextLine(); //문자열 
			System.out.println(valid(str)); //메서드 호출 
		}
		
	}//main()
	
	public static String valid(String s) {
		
		int cnt = 0; //스택의 크기를 의미하는 변수 
		
		for(int i=0; i<s.length(); i++) { //문자열의 길이만큼 반복 
			if(s.charAt(i) == '(') { //문자열에서 해당 i번째 문자가 여는괄호라면
				cnt += 1; //1더하기
			}else {
				cnt -= 1; //1빼기
			}//if-else
			
			if(cnt < 0) { //여는 괄호 부족(더 이상 이후 문자열의 문자를 살펴볼 필요 없이 종료)
				return "NO";
			}//if
		}//for
		
		//위의 for 반복문을 모두 돌고 나왔을 때
		if(cnt == 0) { //여는 괄호로 시작했고, 엳는 괄호와 닫는 괄호의 짝이 모두 맞는 상태 
			return "YES";
		}else { //스택의 개수가 0이 아니라는 말은, 여는 괄호는 남아있지만 닫는 괄호가 부족한 상태 
			return "NO";
		}
	}//valid
}
