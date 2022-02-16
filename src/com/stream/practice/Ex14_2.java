package com.stream.practice;

import java.util.stream.Stream;

public class Ex14_2 {

	public static void main(String[] args) {

		//iterate(T seed, UnaryOperator f) : UnaryOperator => ���� ������
		Stream<Integer> intStream = Stream.iterate(1, n->n+2);
		intStream.limit(10).forEach(System.out::println);
		
		//generate(Supplier s) : Supplier => �ֱ⸸ �ϴ� �� �Է�x, ���o
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(10).forEach(System.out::println);
		
	}

}
