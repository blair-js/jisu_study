package com.api.practice.wrapper;

public class A_WrapperTest {

	public void method1() {
		
		int num1 = 10; 
		int num2 = 15;
		
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1); //10
		System.out.println(i2); //15
		
		System.out.println(i1 == i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); //���ϰ��� �ϴ� ��(�Ű������� ���� ��)�� �� ũ�� -1 ��ȯ, ������ 1 ��ȯ, ������ 0 ��ȯ

		/*int num3 = 123;
		Integer i3 = num3; //����
		System.out.println(i3);*/
		
		//����
		Integer i4 = new Integer("123"); //���� => ��ü ������ ���� Boxing�� �ϰ� �Ǹ� ���� ---> ��,���ڿ��� ����ȭ ���Ѽ�...
		//Integer i4 = new Integer("123A"); //�Ұ��� => ���� �������� Ȯ���ؼ� Ȯ���غ� ������ ����ȭ ��ų �� ���� A�� ��������Ƿ� �Ұ�! 
		System.out.println(i4);
		
		

		//UnBoxing : ���� Ŭ���� -> �⺻ �ڷ������� �ٲٴ� ��� 
		
		//1. ���� Ŭ������ xxxValue() �� ���� ��ȯ
		int num3 = i1.intValue(); //10
		int num4 = i2.intValue(); //15
		System.out.println(num3 + num4);
		
	
		//2. �޼ҵ带 ������� �ʰ� �ٷ� ��ȯ(AutoUnBoxing)
		
		int num5 = /*(int)*/i1;
		System.out.println(num5);
		
		
		//����� ����ڽ�, �����ڽ��� �Ǳ� ������ ��/�Ʒ� ��� 2���� ������� �ϸ� ��. 
		
		test(i2); //i2�� ���� Integer Ÿ��
		test1(i2); //i2�� ���� Integer Ÿ��
		test2(i2); //i2�� ���� Integer Ÿ��
		
	}

	private void test2(Object num) { //��� ������ ������Ʈ�� ���� �� ����
		System.out.println(num);
	}

	private void test1(int num) { //���� ��ڽ�
		System.out.println(num);
	}

	private void test(Integer num) {
		System.out.println(num);
	}
	
	
}
