package com.algorithm.chap01;

public class Add99Table {

	public static void main(String[] args) {

		System.out.print("   |");
		for(int i=1; i<=9; i++) {
			System.out.printf("%3d", i); //맨 위의 숫자 나열
		}
		System.out.println("\n---+---------------------------");
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d |", i); //세로 숫자 뽑기(현재 행 출력)
			for(int j=1; j<=9; j++) {
				System.out.printf("%3d", i+j);
			}//for
			System.out.println();
		}//for
		
	}

}
