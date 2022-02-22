package com.algorithm.chap01;

import java.util.Scanner;

public class Triangle {
	
	//왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}
	}
	
	//왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		/* 규칙을 보면 해당 행의 별의 갯수가 "전체행-해당행+1" 이다.
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	//오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		/* 규칙을 보면 해당 행의 별의 갯수가 "전체행-해당행+1" 이다.
		 * 하지만 앞에 공백이 필요하다. 공백은 "해당행-1"
		 *****
		  ****
		   ***
		    **
		     *
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) { //공백출력
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) { //별 출력
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	//오른쪽 아래가 직각인 이등변 삼각형 
	static void triangleRB(int n) {
		/* 규칙을 보면 해당 행의 별의 갯수가 "해당행" 이다.
		 * 하지만 앞에 공백이 필요하다. 공백은 "전체행-해당행"이다
		    *
		   **
		  ***
		 ****
		*****
		*/
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { //공백출력
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) { //별 출력
				System.out.print("*");
			}//for
			System.out.println();
		}//for
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 : ");
		int n = sc.nextInt();
		
		//triangleLB(n);
		//triangleLU(n);
		//triangleRU(n);
		triangleRB(n);
	}

}
