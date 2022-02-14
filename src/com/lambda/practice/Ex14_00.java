package com.lambda.practice;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_00 {

	public static void main(String[] args) {
		
		//���ٽ�
		//Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		//System.out.println(f.apply("100") +200); //300
		
		//�޼ҵ� ������
		//Function<String, Integer> f = Integer::parseInt;
		//System.out.println(f.apply("100") +200); //300
		
		//���ٽ�
		//Supplier<MyClass> s = () -> new MyClass();
	
		
		//�޼ҵ� ������ ����
		//Supplier<MyClass> s = MyClass::new;
		
		//Function<Integer ,MyClass> s = (i) -> new MyClass(i);
		Function<Integer ,MyClass> s = MyClass::new;
		
		//MyClass mc = s.get();
		MyClass mc = s.apply(100);
		System.out.println(mc.iv); //���� �ٸ� ��ü
		//System.out.println(s.get()); //���� �ٸ� ��ü
	
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
