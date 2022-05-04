package com.programmers;

import java.util.Arrays;

public class P0504_3 {
	//자연수 뒤집어 배열로 만들기
	
	public static void main(String[] args) {

		long n = 12345;
		int[] arr = new int[(n+"").length()]; //n의 값을 빈문자열("") 연결을 통해 String으로 벼환 후 길이 뽑아서 배열 크기 지정
		
		int idx = 0;
		while(n>0) {
			arr[idx++] = (int)(n%10); //주의할 점은 (int)n%10 으로 하게되면 몇개의 tc에서는 fail됨. => 나머지 값을 int로 형변환 하기 위해 괄호 필수
			n/=10; //n을 10으로 계속 나누기(0이 될때까지)
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
