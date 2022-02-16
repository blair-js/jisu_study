package com.stream.practice;

import java.util.stream.Stream;

public class Ex14_2 {

	public static void main(String[] args) {

		//iterate(T seed, UnaryOperator f) : UnaryOperator => 단항 연산자
		Stream<Integer> intStream = Stream.iterate(1, n->n+2);
		intStream.limit(10).forEach(System.out::println);
		
		//generate(Supplier s) : Supplier => 주기만 하는 것 입력x, 출력o
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);
		
	}

}
