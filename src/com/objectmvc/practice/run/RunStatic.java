package com.objectmvc.practice.run;

import com.objectmvc.practice.controller.StaticSample;

public class RunStatic {

	public static void main(String[] args) {

		// StaticSample Ŭ���� ������ value�� ��Java���� �ʱ�ȭ �� ���
		// toUpper �޼ҵ� ������ ���� �빮�ڷ� ���� �� ���
		// valueLength �޼ҵ� ������ ���� ���� ���
		// valueConcat �޼ҵ� ������ ���� ��PROGRAMMING�� ���ڿ� ��ģ �� ���
		// setChar �޼ҵ� ������ ���� ��J���� ��C���� ���� �� ���

		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
		System.out.print("�빮�ڷ� : ");
		StaticSample.toUpper();
		System.out.println(StaticSample.getValue());
		
		System.out.println("���� : " + StaticSample.valueLength());
		
		System.out.println("PROGRAMMING �ٿ��� : " + StaticSample.valueConcat("PROGRAMMING"));
		
		System.out.print("J => C : ");
		StaticSample.setChar(0, 'C');
		System.out.println(StaticSample.getValue());

		
	}

}
