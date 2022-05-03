package com.programmers;

public class P0503_1 {
	//최대공약수와 최소공배수
	//유클리드 호제법 사용하기
	
	public static void main(String[] args) {

		int n = 4; 
		int m = 6; 
		
		System.out.println(gcd(n, m));
		
	}

	//최대공약수를 반환해줄 메소드 gcd
	//방법1 : 반복문 사용
	/*public static int gcd(int n, int m) {
		
		while(m != 0) { //m이 0이 아닐때까지 반복
			int r = n % m; //n을 m으로 나눈 나머지 대입 
			n = m; //n자리엔 m을 대입
			m = r; //m자리엔 위에서 얻은 나머지 r 대입 
		
			//ex)n=3, m=12일 때 -> n=12, m=3 -> n=3, m=0 -> 최대공약수는 3
			//ex)n=4, m=6일 때 -> n=6, m=2 -> n=2, m=0 -> 최대공약수는 2 
		}
		
		return n;
	}*/
	
	//방법2 : 재귀 사용
	public static int gcd(int n, int m) {
		
		if(m == 0) { //m이 0이 되면 
			return n; //n(최대공약수)을 반환하며 반복 종료
		}else {
			return gcd(m, n%m); //재귀 실행 => n자리에 m을 넣고, m 자리엔 n%m 나머지를 대입
		}
		
	}
}
