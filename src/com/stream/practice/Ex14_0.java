package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); //list�� Stream���� ��ȯ
//		intStream.forEach(System.out::print); //�������� �� ��Ʈ���� ������
//		
//		//Stream�� ��ȸ��
//		//������ ��������Ƿ� ������ ������ ��Ʈ���� �ٽ� �������־�� ��.
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
