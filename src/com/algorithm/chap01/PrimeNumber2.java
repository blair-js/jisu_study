package com.algorithm.chap01;

public class PrimeNumber2 {

	public static void main(String[] args) {

		int counter = 0; //몇 번 수행했는지
		int ptr = 0; //찾은 소수의 갯수이자 인덱스
		int[] prime = new int[500]; //소수를 저장할 배열
	
		prime[ptr++] = 2; //2는 소수니까 미리 넣어놓음 
		
		for(int n=3; n<=1000; n+=2) { //짝수는 어짜피 소수가 아니므로 홀수들만 검사하면 된다
			
			int i;
			for(i=1; i<ptr; i++) {
				counter++;
				if(n % prime[i] == 0) { //현재 숫자를 prime의 i번째로 나누어지는지 검사
					break;
				}//if
			}//for
			
			if(ptr == i) { //prime의 끝까지 반복을 했다면 
				prime[ptr++] = n; //그 숫자는 소수이다
			}//if
		}//for
		
		for(int i=0; i<ptr; i++) { //소수 출력
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	
	}

}
