package com.polymorphism.practice2.run;

import com.polymorphism.practice2.model.vo.GalaxyNote9;
import com.polymorphism.practice2.model.vo.SmartPhone;
import com.polymorphism.practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		// 2개의 객체를 저장할 수 있는 객체배열 생성 (SmartPhone타입)
		SmartPhone[] phone = new SmartPhone[2];
		
		// 각각의 인덱스에 GalaxyNote9, V40 객체 생성 (기본생성자 이용) --> 다형성
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// for문을 이용하여 phone 객체배열에 모든 인덱스를 참조.
		for(SmartPhone s : phone) {
			// printMaker() 호출
			s.printMaker();
			// makeaCall() 호출
			s.makeaCall();
			// takeaCall() 호출
			s.takeaCall();
			// touch() 호출
			s.touch();
			// charge() 호출
			s.charge();
			// picture() 호출
			s.picture();
			System.out.println(); //개행
		}
	}

}
