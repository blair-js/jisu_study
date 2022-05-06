package com.programmers;

import java.util.Scanner;

public class P0506_5 {
	//소수 찾기(개수)
	//에라토스테네스의 체 이용
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0; //소수의 개수를 카운팅할 변수
		
		boolean[] iArr = new boolean[n+1]; //배열의 각 요소가 소수인지 아닌지를 판별하기 위한 boolean 타입의 배열 생성(boolean의 기본값은 false) 
		iArr[0] = iArr[1] = true; //0과 1은 소수가 아니므로 true로 초기화(나머진 false 유지)
		
		for(int i=2; i<=n; i++) { //0과 1을 제외한 2부터 n까지만 소수 검사
			
			if(iArr[i] == false) { //일단 배열의 요소 i번째가 false라면(**2가 반복의 첫 시작이므로 2부터 확인하는데 2는 false이며 소수인 상태!) 
				cnt++; //소수 개수 증가
				for(int j=i+i; j<=n; j+=i) { //소수의 배수는 모두 소수가 아님(**위에서 i가 2인 경우 2가 소수였으므로 2의 배수들번째(4,6,...100)의 값은 모두 true로 초기화)
					iArr[j] = true; //값을 true로 바꿔줘서 바깥쪽 for문 진행시 해당 i번째 배열 요소들을 pass할 수 있도록 해준다.
				}
			}//if
		}//for
		
		System.out.println(cnt);
		
	}

}
