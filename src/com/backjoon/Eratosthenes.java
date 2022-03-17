package com.backjoon;

public class Eratosthenes {

	public static void main(String[] args) {
		
		int[] prime = new int[100]; //소수 저장 
		
		int pn = 0; //소수의 개수
		
		boolean[] check = new boolean[101]; //지워졌으면 true => 값을 초기화 하지 않았으므로 초기값은 false 이고 값이 지워지면 true
		
		int n = 100; //100까지 소수 구하기
		
		for(int i=2; i<=n; i++) {
			if(check[i] == false) { //지워지지 않았으면 
				prime[pn++] = i; //소수니까 소수 배열에 저장 
				for(int j=i*i; j<=n; j+=i) { //i의 배수 지우기(이 때, i*i는 i+i나 i*2로 적어주는 것이 더 좋다) => 왜냐 i가 백만인 경우 i*i는 1조이다. int의 범위를 넘어간다. 
					check[j] = true; //해당 i의 배수번째 값 지우기 
				}
 			}//if
		}
		
		
	}

}
