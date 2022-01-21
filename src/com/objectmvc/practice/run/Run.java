package com.objectmvc.practice.run;

import com.objectmvc.practice.controller.NonstaticSample;

public class Run {

	public static void main(String[] args) {

		NonstaticSample n = new NonstaticSample();
		
		n.printLottoNumbers();
		System.out.println();
		
		n.outputChar(5, 'a');
		System.out.println();
		
		System.out.println("랜덤 영문자 출력 : " + n.alphabette());
		
		System.out.println(n.mySubstring("apple", 2, 4));
		
	}

}
