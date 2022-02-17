package com.stream.practice;

import java.util.Optional;

public class EX14_9 {

	public static void main(String[] args) {

		//int[] arr = {};
		//int[] arr = null;
		int[] arr = new int[0];
		System.out.println("arr.length=" + arr.length);
		
		//Optional<String> opt = null; //바람직하지 않은 방법
		Optional<String> opt = Optional.empty(); 
		//Optional<String> opt = Optional.of("abc"); 
		System.out.println("opt=" + opt);
		//System.out.println("opt=" + opt.get()); //NoSuchElementException 발생
		
		String str = "";
//		try {
//			str = opt.get();//예외발생
//		} catch (Exception e) {
//			str = ""; //예외가 발생하며녀 빈문자열("")로 초기화
// 		} 
		
		//str = opt.orElse("EMPTY"); //optional에 저장된 값이 null이면 ""반환
		str = opt.orElseGet(()->new String());
		System.out.println("str=" + str);
	}

}
