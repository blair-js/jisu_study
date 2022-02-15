package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); //list를 Stream으로 변환
//		intStream.forEach(System.out::print); //최종연산 후 스트림이 닫힌다
//		
//		//Stream은 일회용
//		//위에서 사용했으므로 닫혔기 때문에 스트림을 다시 생성해주어야 함.
//		intStream = list.stream();
//		intStream.forEach(System.out::print);
		
//		//Stream<String> strStream = Stream.of("a","b","c");
//		//Stream<String> strStream = Stream.of(new String[]{"a","b","c"});
//		String[] strArr = {"a","b","c"};
//		Stream<String> strStream = Arrays.stream(strArr);
//		strStream.forEach(System.out::print);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		//intStream.forEach(System.out::print);
		//System.out.println("count = " + intStream.count());
		System.out.println("sum = " + intStream.sum());
		
		
	}

}
