package com.algorithm.chap03;

public class IdTester {

	public static void main(String[] args) {

		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a�� ���̵� : " + a.getId());
		System.out.println("b�� ���̵� : " + b.getId());
		
		System.out.println("�ο��� ���̵��� ���� : " + Id.getCounter());
		
	}

}

class Id{
	private static int counter = 0; 
	private int id; 
	
	public Id() {
		id = counter++; //�����Ǵ� �ν��Ͻ����� �ٸ� ���ڸ� ���� �ȴ�. 
	}
	
	public int getId() {
		return id; //id ���� ��ȯ���ش�.
	}
	
	public static int getCounter() {
		return counter; //count ���� ��ȯ���ش�.
	}
}