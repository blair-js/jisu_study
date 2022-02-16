package com.stream.practice;

import java.util.stream.Stream;

public class Ex14_8 {

	public static void main(String[] args) {
		
		Stream<String> strStream = Stream.of("aaa", "bb", "c", "dddd");
		int sum = strStream.mapToInt(s->s.length()).sum();
		System.out.println("sum = " + sum);
		
	}

}
