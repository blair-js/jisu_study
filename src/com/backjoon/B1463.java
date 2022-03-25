package com.backjoon;

import java.util.Scanner;

public class B1463 {

	//n을 1로 만드는 메소드 (최소 연산횟수를 반환)
	public static int go(int n) {
		
		int[] d = new int[n+1]; //메모이제이션에 필요한 배열 생성
		
		if(n == 1) { //n이 1이면 연산할 필요 없이(1이 1이 되려면 0번의 과정이 필요)
			return 0; //0 반환
		}
		
		for(int i=2; i<=n; i++) {//2부터(1이면 0 반환하도록 위에 조건 걸어줌)
			
			d[i] = d[i-1] + 1; //3개의 식중 하나의 식(N-1)을 먼저 기본으로 잡고
			
			//즉 밑의 두 조건문은 위에서 이미 d[i]에 담긴 최소연산횟수와 비교하여
			//더 작은 연산횟수일경우 해당 값으로 d[i]가 대체되는 과정이다. 
			//즉, 먼저 d[i-1]로 했을 경우 연산횟수를 담아놓고, 2로 나눠지거나 3으로 나눠질 때 더 적은 연산횟수가 나오면 그 값으로 대체한다는 의미이다. 
			if(i%2 == 0) d[i] = Math.min(d[i], d[i/2] + 1); //2로 나누어 떨어지면 다른 식(N/2)으로
			if(i%3 == 0) d[i] = Math.min(d[i], d[i/3] + 1); //3으로 나누어 떨어지면 다른 식(N/3)으로
			
		}//for
		
		return d[n];
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(go(n));
		
	}

}
