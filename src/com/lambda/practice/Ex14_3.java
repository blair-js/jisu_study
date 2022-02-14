package com.lambda.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		//아래 두개의 함수는 위의 두개의 함수를 합치는 것이다. 
		Function<String, String> h = f.andThen(g); //andThen : f 적용하고 g 적용해라 //"FF" -> 255 -> "11111111"
		Function<Integer, Integer> h2 = f.compose(g); //compose : g 적용하고 f를 적용해라  //2 -> "10" -> 16
		
		System.out.println(h.apply("FF"));
		System.out.println(h2.apply(2));
		
		Function<String, String> f2 = x -> x; //항등 함수 
		System.out.println(f2.apply("AAA")); //AAA 그대로 출력
		
		Predicate<Integer> p = i -> i < 100; 
		Predicate<Integer> q = i -> i < 200; 
		Predicate<Integer> r = i -> i%2 == 0; 
		Predicate<Integer> notP = p.negate();
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); //true
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result); //true
		
	}

}
