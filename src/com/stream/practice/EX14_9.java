package com.stream.practice;

import java.util.Optional;

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
	}

}
