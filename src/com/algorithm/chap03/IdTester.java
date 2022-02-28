package com.algorithm.chap03;

public class IdTester {

	public static void main(String[] args) {

		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());
		
		System.out.println("부여한 아이디의 갯수 : " + Id.getCounter());
		
	}

}

class Id{
	private static int counter = 0; 
	private int id; 
	
	public Id() {
		id = counter++; //생성되는 인스턴스마다 다른 숫자를 갖게 된다. 
	}
	
	public int getId() {
		return id; //id 값을 반환해준다.
	}
	
	public static int getCounter() {
		return counter; //count 값을 반환해준다.
	}
}