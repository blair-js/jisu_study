package com.stream.practice;

import java.util.stream.IntStream;

public class Ex14_3 {

	public static void main(String[] args) {

		IntStream intStream = IntStream.rangeClosed(1,10);
		intStream.filter(i->i%2!=0 && i%3!=0).forEach(System.out::print);
		
	}

}
