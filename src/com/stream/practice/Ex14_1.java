package com.stream.practice;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_1 {

	public static void main(String[] args) {
		
		//limit을 주지 않으며 무한 스트림으로 발생
		//IntStream intStream = new Random().ints(); //int형의 난수 스트림을 반환
		//intStream.limit(5).forEach(System.out::println); 

		//limit 대신 ints의 매개변수로 뽑고자 하는 갯수 지정
		//IntStream intStream = new Random().ints(5); 
		//intStream.forEach(System.out::println); 
		
		//지정된 범위의 난수_방법1
		//IntStream intStream = new Random().ints(5, 10); 
		//intStream.limit(10).forEach(System.out::println); 
		
		//지정된 범위의 난수_방법2
		IntStream intStream = new Random().ints(10, 5, 10); 
		intStream.forEach(System.out::println); 
	}

}
