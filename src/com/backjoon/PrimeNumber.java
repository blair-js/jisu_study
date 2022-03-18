package com.backjoon;

public class PrimeNumber {

	//n이 소수인지 아닌지 판별하는 메소드
	public static boolean prime1(int n) {
		
		if(n < 2) { //2보다 작으면
			return false; //소수가 아니다
		}
		
		for(int i=2; i<=n-1; i++) { //n을 2부터 n-1까지 나눠보기
			if(n%i == 0) { //한번이라도 나누어 떨어지면
				return false; //소수가 아니다
			}
		}//for
		
		return true; //위의 모든조건에 걸리지 않았을 경우 n은 소수이다
	}
	
	public static boolean prime2(int n) {
		
		if(n < 2) { //2보다 작으면
			return false; //소수가 아니다
		}
		
		for(int i=2; i<=n/2; i++) { //n을 2부터 2/n까지 나눠보기
			if(n%i == 0) { //한번이라도 나누어 떨어지면
				return false; //소수가 아니다
			}
		}//for
		
		return true; //위의 모든조건에 걸리지 않았을 경우 n은 소수이다
	}
	
	public static boolean prime3(int n) {
		
		if(n < 2) { //2보다 작으면
			return false; //소수가 아니다
		}
		
		for(int i=2; i*i<=n; i++) { //n을 2부터 루트n까지 나눠보기
			if(n%i == 0) { //한번이라도 나누어 떨어지면
				return false; //소수가 아니다
			}
		}//for
		
		return true; //위의 모든조건에 걸리지 않았을 경우 n은 소수이다
	}
	
	public static void main(String[] args) {

		System.out.println("3은 소수 인가? : " + prime1(3));
		System.out.println("12는 소수 인가? : " + prime2(12));
		System.out.println("24는 소수 인가? : " + prime3(24));
		System.out.println("7은 소수 인가? : " + prime3(7));
	}

}
