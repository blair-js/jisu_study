package com.programmers;

public class P0504_1 {
	//정수 제곱근 판별
	
	public static void main(String[] args) {

		int n = 121; 
		int x = -1; //반환할 결과값(아래의 if문에서 초기화 되지 않으면 마지막에 -1 출력)
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) { //n이 i로 나누어진다면 i는 n의 약수이고,
				if(i*i == n) { //해당 약수i의 제곱이 n이라면 i가 n의 제곱근이 되고,
					x = (i+1)*(i+1); //해당 약수+1의 제곱을 x에 대입
					break;
				}
			}
		}//for
		
		System.out.println(x);
	}

}
