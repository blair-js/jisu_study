package com.lambda.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {

	public static void main(String[] args) {

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		//�Ʒ� �ΰ��� �Լ��� ���� �ΰ��� �Լ��� ��ġ�� ���̴�. 
		Function<String, String> h = f.andThen(g); //andThen : f �����ϰ� g �����ض� //"FF" -> 255 -> "11111111"
		Function<Integer, Integer> h2 = f.compose(g); //compose : g �����ϰ� f�� �����ض�  //2 -> "10" -> 16
		
		System.out.println(h.apply("FF"));
		System.out.println(h2.apply(2));
		
		Function<String, String> f2 = x -> x; //�׵� �Լ� 
		System.out.println(f2.apply("AAA")); //AAA �״�� ���
		
		Predicate<Integer> p = i -> i < 100; 
		Predicate<Integer> q = i -> i < 200; 
		Predicate<Integer> r = i -> i%2 == 0; 
		Predicate<Integer> notP = p.negate();
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150)); //true
		
		String str1 = "abc";
		String str2 = "abc";
		
		//str1�� str2�� ������ ���� ����� ��ȯ
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result); //true
		
	}

}
