package com.backjoon;

public class Euclid {

	//재귀함수를 사용하여 구현한 유클리드 호제법 
	public static int gcd1(int a, int b) {
		
		if(b == 0) { //아래에서 호출한 인자 b,r 에서 r이 0이 되었을 때, b가 최대 공약수가 된다.
			return a; 
		}else {
			return gcd1(b, a%b); //a에서 b로 나눈 나머지가 r이라고 했을시, b의 자리에 r을 인자로 전달하여 재귀 호출 
		}
		
	}
	
	//재귀함수를 사용하지 않고 구현한 유클리드 호제법
	public static int gcd2(int a, int b) {
		while(b != 0) { //b가 0이 아닐 때까지 반복
			int r = a%b; //나머지는
			a = b; //a에 b
			b = r; //b에 나머지 r
		}
		
		//위의 while을 모두 돌고 나오면
		return a;
	}
	
	public static void main(String[] args) {

		//두 수의 최대 공약수 
		int x1 = gcd1(24, 16);
		int x2 = gcd2(16, 24);
		System.out.println("최대공약수 : " + x1);
		System.out.println("최대공약수 : " + x2);
	}

}
