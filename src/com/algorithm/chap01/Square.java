package com.algorithm.chap01;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� :");
		int dan = sc.nextInt();
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
