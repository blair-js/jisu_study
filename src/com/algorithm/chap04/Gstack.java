package com.algorithm.chap04;

public class Gstack<E> {

	private int max; //스택의 최대 용량
	private int ptr; //스택의 포인터
	private E[] stk; //스택 본체(E 타입의 데이터를 닮을 배열 stk)
	
	//스택이 비어있을때의 예외 
	public static class EmptyGstackException extends RuntimeException{
		public EmptyGstackException() {}
	}

	//스택이 가득찼을때의 예외
	public static class OverflowGstackException extends RuntimeException{
		public OverflowGstackException() {}
	}
	
	//생성자
	public Gstack(int capacity) {
		ptr = 0; 
		max = capacity; 
		try {
			stk = (E[])new Object[max]; //배열 생성 => Object 객체로 생성 후 내가 원하는 E 타입으로 다운캐스팅!
		}catch(OutOfMemoryError e) {
			max = 0; 
		}
	}
	
	public E push(E e) throws OverflowGstackException{
		if(ptr >= max) { //스택이 가득찬 경우
			throw new OverflowGstackException(); //예외 발생
		}
		return stk[ptr++] = e; //인자로 전달받은 e를 배열에 추가 
	}
	
	public E pop() throws EmptyGstackException{
		if(ptr <= 0) { //스택이 비어있는 경우
			throw new EmptyGstackException(); //예외 발생
		}
		return stk[--ptr]; //마지막 인덱스에 있는 e를 보여준 후 포인터도 감소된다 => peek와 다른점
	}
	
	public E peek() throws EmptyGstackException{
		if(ptr <= 0) { //스택이 비어있는 경우
			throw new EmptyGstackException(); //예외 발생
		}
		return stk[ptr-1]; //마지막 인덱스에 있는 e가 무엇인지 보여준다
	}
	
	public int indexOf(E e) throws EmptyGstackException{
		if(ptr <= 0) {//스택이 비어있는 경우
			throw new EmptyGstackException(); //예외 발생
		}
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i].equals(e)) { //E 타입이 숫자나 문자가 아닐 수 있으므로 equals로 비교해야한다. 
				return i; //검색 성공
			}
		}//for
		return -1; //검색 실패
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr; 
	}
	
	public boolean isEmpty() {
		return ptr <= 0; 
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0) {//스택이 비어있는 경우
			throw new EmptyGstackException(); //예외 발생
		}
		for(int i=ptr; i>=0; i--) {
			System.out.print(stk[i] + " ");
		}
		System.out.println();
	}
}
