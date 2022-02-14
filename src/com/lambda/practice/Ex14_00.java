package com.lambda.practice;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_00 {

	public static void main(String[] args) {
		
		//람다식
		//Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		//System.out.println(f.apply("100") +200); //300
		
		//메소드 참조형
		//Function<String, Integer> f = Integer::parseInt;
		//System.out.println(f.apply("100") +200); //300
		
		//람다식
		//Supplier<MyClass> s = () -> new MyClass();
	
		
		//메소드 참조로 변경
		//Supplier<MyClass> s = MyClass::new;
		
		//Function<Integer ,MyClass> s = (i) -> new MyClass(i);
		Function<Integer ,MyClass> s = MyClass::new;
		
		//MyClass mc = s.get();
		MyClass mc = s.apply(100);
		System.out.println(mc.iv); //서로 다른 객체
		//System.out.println(s.get()); //서로 다른 객체
	
		//Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;
		int[] arr = f2.apply(100);
		
		System.out.println("arr.length : " + arr.length);
		
	}
	
}

class MyClass{
	
	int iv;
	
	public MyClass(int iv) {
		this.iv = iv;
	}
	
}
