package com.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10828 {
	
	public static int[] stack; //스택 본체 배열 
	public static int size = 0; //데이터 개수 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입출력을 위한 객체 스트림 생성 
		StringBuilder sb = new StringBuilder(); //문자열을 담을 변수 
		
		StringTokenizer st; 
		
		//br.readLine()이 값을 String으로 가져오기 때문에 int형으로 형변환
		int N = Integer.parseInt(br.readLine());
		
		//입력받은 명령의 수 N만큼 스택 용량(배열의 크기) 설정 => 모든 명령이 push라고 해도, 데이터는 14개일테니! 
		stack = new int[N]; 
		
		//모든 명령의 수행을 위한 반복문 
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " "); //읽어온 해당 행(줄)의 문자열을 공백을 기준으로 토큰 분류 
			
			//모든 토큰 검사 
			switch(st.nextToken()) {
			case "push" : //push라면 
				push(Integer.parseInt(st.nextToken())); //그 다음 토큰(넣을 데이터)을 push 메서드의 인자로 전달 
				break;
			case "pop" :
				sb.append(pop()).append("\n"); //결과(팝한 데이터)를 문자열 sb에 추가하고 개행 
				break;
			case "size" : 
				sb.append(size()).append("\n"); //결과(얻어온 사이즈)를 문자열 sb에 추가하고 개행 
				break;
			case "empty" : 
				sb.append(empty()).append("\n"); //결과(참/거짓)를 문자열 sb에 추가하고 개행
				break;
			case "top" : 
				sb.append(top()).append("\n"); //결과(확인한 맨 위의 데이터)를 문자열 sb에 추가하고 개행
				break;	
			}//switch
		}//while
		System.out.println(sb);
	}//main
	
	public static void push(int x) {
		stack[size] = x; //스택에 순서대로 푸쉬하고자 하는 데이터 삽입
		size++; //데이터 개수 증가
	}
	
	public static int pop() {
		if(size == 0) { //데이터가 없는 경우
			return -1;
		}else { //데이터가 있는 경우
			int res = stack[size-1]; //가장 마지막 데이터 
			stack[size-1] = 0; //가장 마지막에 있던 데이터 삭제
			size--; //데이터 개수 감소 
			return res; 
		}
	}
	
	public static int size() {
		return size; 
	}
	
	public static int empty() {
		if(size == 0) { //데이터가 없으면(스택이 비어있으면)
			return 1;
		}else { //데이터가 있으면(스택이 비어있지 않으면)
			return 0;
		}
	}
	
	public static int top() {
		if(size == 0) {
			return -1;
		}else {
			return stack[size-1]; //가장 마지막 데이터 반환
			//pop()과 다른점은 pop()은 마지막 데이터를 반환한 후, 그 데이터를 삭제하고, 전체 데이터의 개수 size를 감소시켰다. 
		}
	}
}

