package com.backjoon;

import java.util.Scanner;

public class Fibonacci {

	//n번째 피보나치 수를 구하는 함수이다. (기본)
	/*public static int fibonacci(int n) {
		if(n <= 1) { //0번째와 1번째는 항상 0과 1이다. 
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}*/
	
	
	//n번째 피보나치 수를 구하는 함수이다. (향상) => Top-Down 방식 
	/*static int fibonacci(int n) {
		int[] memo = new int[100]; //모든 원소에는 0이 들어있다. => 답을 구하지 않았다는 의미. 아래에서 답을 구할 때마다 원소의 값을 업데이트 할 것임. 
		
		if(n <= 1) { //0번째와 1번째는 항상 0과 1이다. 
			return n;
		}else {
			
			if(memo[n] > 0) { //해당 n번째에 대한 피보나치 수를 구했는지 확인하는 조건문 
				return memo[n]; //이 조건문을 탔다는 것은 밑에서 배열에 값이 들어가서 0이 아니라는 상태. (0과 1은 0으로 되어있음) 
			}
			
			memo[n] = fibonacci(n-1) + fibonacci(n-2); //n번째에 대한 피보나치 수를 구한 후 memo 배열에 대입
			return memo[n];
		}
	}*/
	
	//n번째 피보나치 수를 구하는 함수이다. (향상) => Bottom-Up 방식 
	static int fibonacci(int n) {
		
		int[] d = new int[100];
		
		//가장 작은 문제 0,1을 풀어두고 
		d[0] = 0; 
		d[1] = 1; 
		
		//그다음 큰문제 2부터 
		for(int i=2; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
		}//for
		
		return d[n];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
	}

}
