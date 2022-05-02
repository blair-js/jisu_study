package com.programmers;

import java.util.Scanner;

public class P0502_4 {
	//하샤드 수 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//방법1.문자열로 받아서 하기
		/*String str = sc.nextLine();
		int n = 0;
		
		for(int i=0; i<str.length(); i++) {
			n += Character.getNumericValue(str.charAt(i));
			System.out.println(n);
		}
		
		System.out.println(Integer.parseInt(str)%n == 0 ? true : false);*/
		
		//방법2.int형으로 받아서 하기
		//초기에 입력받는 값
		int harsa = sc.nextInt();
		
		int n = harsa; //초기값을 변수 n에 저장하고 반복을 통해 자릿수의 합을 구할예정
		int c = 0; //자릿수를 더할 변수 c
		
		while(n>0) {
			c += n%10; //n을 10으로 나눈 나머지를 더한다
			n/=10;
		}
		
		//초기에 입력받은 값을 기준으로 자릿수의 합으로 나눈 나머지가 0이면 하샤드의 수 이다.
		System.out.println(harsa%c == 0? true : false);
	}

}
