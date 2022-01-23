package com.objectmvc.practice.run;

import com.objectmvc.practice.controller.NonstaticSample2;

public class Run2 {

	public static void main(String[] args) {

		NonstaticSample2 n = new NonstaticSample2();
		
		System.out.print("-크기가 5인 배열의 랜덤값 : ");
		int[] arr = n.intArrayAllocation(5); 
		n.display(arr); //배열 요소 출력
		
		System.out.print("\n-내림차순 출력 : ");
		n.sortDescending(arr);
		
		System.out.print("\n-오름차순 출력 : ");
		n.sortAscending(arr);
		
		System.out.print("\n-apple 문자열에서 p의 개수 : ");
		System.out.println(n.countChar("apple", 'p'));
		
		System.out.print("-13과 7사이 정수들의 합계 : ");
		System.out.println(n.totalValue(13, 7));
		
		System.out.print("-programming 문자열의 3번 인덱스 문자 : ");
		System.out.println(n.pCharAt("programming", 3));
		
		System.out.print("-JAVA와 programming을 합친 문자열 : ");
		System.out.println(n.pConcat("JAVA", "programming"));
		
	}

}
