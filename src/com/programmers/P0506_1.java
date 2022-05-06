package com.programmers;

import java.util.Scanner;

public class P0506_1 {
	//약수의 합
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//num의 제곱근 사용 => 반복의 횟수를 줄일 수 있음. (Math 클래스의 sqrt 메소드 사용)
		//ex) num = 100인 경우 100번 반복을 10번만해도 약수를 구할 수 있음
		int sRoot = (int)Math.sqrt(num);
		
		int sum = 0; 
		
		//1부터 n의 제곱근인 sRoot까지만 반복
		for(int i=1; i<=sRoot; i++) {
			
			if(num%i == 0) { //i로 나누어 떨어지면
				//삼항연산자를 이용하여
				//i가 num의 제곱근이면 i만 더하고, 제곱근이 아닌 경우는 i와 num을 i로 나눈 몫까지 더해준다.
				//ex) num = 16 인경우 1+16, 2+8, 4 => sum = 31 (4는 두번 더해지면 안되기때문에 삼항연산자 사용)
				sum += i*i==num ? i : num/i+i;
				
				//위에서 i가 num의 제곱근인지 확인하기 위해 i*i==num를 사용하였는데, 왜 sRoot 변수를 사용하지 않았냐면
				//num이 16일 때는 sRoot가 4로 나누어 떨어지지만, num이 12인 경우는 sRoot가 3.xxxx 라 3으로 처리되기 때문이다. 
				//sum += i==sRoot ? i : num/i+i;
			}
			
		}//for
		
		System.out.println(sum);
		
	}

}
