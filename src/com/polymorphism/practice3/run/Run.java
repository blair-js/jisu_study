package com.polymorphism.practice3.run;

import com.polymorphism.practice3.model.vo.Animal;
import com.polymorphism.practice3.model.vo.Cat;
import com.polymorphism.practice3.model.vo.Dog;

public class Run {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] ani = new Animal[5];
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		ani[0] = new Cat("야옹1", "종1", "아프리카", "블랙");
		ani[1] = new Dog("멍멍1", "말티즈", 5);
		ani[2] = new Cat("야옹2", "종2", "한국", "화이트");
		ani[3] = new Dog("멍멍2", "비숑", 6);
		ani[4] = new Cat("야옹3", "종3", "캐나다", "옐로우");
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		
		for(Animal a : ani) {
			a.speak();
		}
	}

}
