package com.stream.practice;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_1 {

	public static void main(String[] args) {
		
		//limit�� ���� ������ ���� ��Ʈ������ �߻�
		//IntStream intStream = new Random().ints(); //int���� ���� ��Ʈ���� ��ȯ
		//intStream.limit(5).forEach(System.out::println); 

		//limit ��� ints�� �Ű������� �̰��� �ϴ� ���� ����
		//IntStream intStream = new Random().ints(5); 
		//intStream.forEach(System.out::println); 
		
		//������ ������ ����_���1
		//IntStream intStream = new Random().ints(5, 10); 
		//intStream.limit(10).forEach(System.out::println); 
		
		//������ ������ ����_���2
		IntStream intStream = new Random().ints(10, 5, 10); 
		intStream.forEach(System.out::println); 
	}

}
