package com.lambda.practice;

public class Ex14_0 {

	
	public static void main(String[] args) {

		//Object obj = (a, b) -> a > b ? a : b; //���ٽ� => �͸�ü
		
		//�ڵ�1
		/*MyFunction2 f = new MyFunction2() { //�������̵� - ���������ڴ� ���� ���ٲ۴�. 
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};*/
		
		//int value = obj.max(3,5); //Object Ŭ������ max()�� ���� ������ �����߻�. 
		//int value = f.max(3,5); 
		//System.out.println("value = " + value);

		//�ڵ�1�� �ʹ� �� ���ٽ� ��� 
		//���ٽ�(�͸� ��ü)�� �ٷ�� ���� �������� Ÿ���� �Լ��� �������̽��� �Ѵ�. 
		MyFunction2 f2 = (a, b) -> a > b ? a : b;
		
		int value = f2.max(3,5); 
		System.out.println("value = " + value);
		
	}

}

@FunctionalInterface //�Լ��� �������̽� => �� �ϳ��� �߻�޼ҵ常 ������ �Ѵ�. 
interface MyFunction2{
	//public abstract int max(int a, int b); //������� ������ֱ�
	int max(int a, int b); //public abstract ���� ����
}

