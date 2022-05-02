package com.programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P0502_1 {
	//���簢�� ����� : ���ٽ��� �̿��� ��� 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(); //���ڿ��� �����ϱ� ���� ��ü sb ����
		
		IntStream.range(0, a).forEach(s -> sb.append("*")); 
		//���ٽ� �ؼ�
		//1. range(0, a) 0���� a������ ������ ����(ex.a�� 5��� 0,1,2,3,4 �� 5���� �ݺ��� �ϰ� �ȴ�.)
		//2. forEach : �ݺ��� ���� �Լ� 
		//3. s -> sb.append("*") : forEach �Լ� ���� s��� �Ű������� �ʿ�� �ϰ� �Լ� ���� ���� ������ sb.append("*") �̴�. 
		//�����ϸ� => sb��� ���ڿ� ��ü�� "*"�� �߰��ϴ� �۾��� 5�� �ݺ��Ѵ�.
		
		IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
		//�߰��� sb�� b��ŭ �ݺ��Ͽ� ����Ѵ�. 
		
	}

}
