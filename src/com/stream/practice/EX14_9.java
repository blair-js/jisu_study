package com.stream.practice;

import java.util.Optional;
import java.util.stream.IntStream;

public class EX14_9 {

	public static void main(String[] args) {

		//int[] arr = {};
		//int[] arr = null;
		int[] arr = new int[0];
		System.out.println("arr.length=" + arr.length);
		
		//Optional<String> opt = null; //�ٶ������� ���� ���
		Optional<String> opt = Optional.empty(); 
		//Optional<String> opt = Optional.of("abc"); 
		System.out.println("opt=" + opt);
		//System.out.println("opt=" + opt.get()); //NoSuchElementException �߻�
		
		String str = "";
//		try {
//			str = opt.get();//���ܹ߻�
//		} catch (Exception e) {
//			str = ""; //���ܰ� �߻��ϸ�� ���ڿ�("")�� �ʱ�ȭ
// 		} 
		
		//str = opt.orElse("EMPTY"); //optional�� ����� ���� null�̸� ""��ȯ
		str = opt.orElseGet(()->new String());
		System.out.println("str=" + str);
		
		IntStream intstream1 = IntStream.range(1, 11);
	    System.out.println(intstream1.sum());
	    
	    int intstream2 = IntStream.range(1, 11).reduce(0, (a,b)-> a+b);
	    System.out.println(intstream2);
	}

}
