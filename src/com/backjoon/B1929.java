package com.backjoon;

import java.util.Scanner;

public class B1929 {

	//에라토스테네스의 체를 이용한 소수구하기 문제
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//소수를 구할 범위 입력받기(m부터 n까지 검사)
		//조건 : 1 ≤ M ≤ N ≤ 1,000,000 M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		int[] prime = new int[n+1]; //소수를 저장하기 위한 공간
		boolean[] check = new boolean[n+1]; //해당 숫자가 소수인지 아닌지 판별하기 위한 공간(소수면 false, 소수가 아니면 true)
		
		int idx = 0; //배열 prime의 인덱스이자 개수를 나타내는 변수
		
		//0과 1은 소수가 아니므로 true로 초기화(나머지는 기본값으로 false인 상태이다.) 
		check[0] = check[1] = true;
		
		for(int i=2; i<=n; i++) { //소수가 아닌 0과 1을 제외한 2부터 시작 
			
			if(check[i] == false) { //i번째가 false라면 
				if(i >= m) { //입력한 숫자 m이 2보다 클 수도 있으므로, i가 m보다 클 때만(m이하의 소수는 체크할 필요가 없음) 
					prime[idx++] = i; //배열 prime에 i값을 순서대로 넣는다. 
				}
				
				//그리고 i가 소수였다면 소수의 배수들은 모두 소수가 아니게 되므로 check 배열에서 지워주어야 함.
				for(int j=i+i; j<=n; j+=i) { //해당 i의 제곱부터 n까지 반복(증감식은 i만큼씩 커지게)
					check[j] = true; //해당 값은 true 초기화
				}
			}
			
		}//for
		
		//소수가 담겨있는 prime 배열의 요소를 모두 출력해준다.
		//소수의 개수를 의미하는 인덱스만큼만 반복하면 됨
		for(int i=0; i<idx; i++) {
			System.out.println(prime[i]);
		}
	}

}
