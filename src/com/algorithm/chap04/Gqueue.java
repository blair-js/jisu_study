package com.algorithm.chap04;

public class Gqueue<E> {
	
	//큐가 비어있을 때
	public static class EmptyGqueueException extends RuntimeException{
		public EmptyGqueueException() {}
	}
	
	//큐가 가득찼을 때
	public static class OverflowGqueueException extends RuntimeException{
		public OverflowGqueueException() {}
	}
	
	private int max; //큐의 용량
	private int num; //현재 데이터 수
	private int rear; //맨 뒤 커서
	private int front; //맨 앞 커서
	private E[] que; //큐의 본체 배열 
	
	public Gqueue(int capacity) {
		num = front = rear = 0; //시작은 모두 0
		max = capacity;
		
		try {
			que = (E[])new Object[max]; //배열 생성
		}catch(OutOfMemoryError e) {
			max = 0; 
		}
	}
	
	//데이터 인큐
	public E enque(E x) throws OverflowGqueueException{
		if(num >= max) {
			throw new OverflowGqueueException();
		}
		
		que[rear++] = x; //맨 뒤에 데이터 추가
		num++; //데이터 개수 증가
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	//데이터 디큐
	public E deque() throws EmptyGqueueException{
		if(num <= 0) {
			throw new EmptyGqueueException();
		}
		E x = que[front++]; //맨 앞의 데이터 추출
		num--; //데이터 개수 감소
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	//데이터 피크(엿보기만 하기)
	public E peek() throws EmptyGqueueException{
		if(num <= 0) {
			throw new EmptyGqueueException();
		}
		return que[front]; //맨 앞의 데이터 반환
	}
	
	//검색
	public int indexOf(E x) throws EmptyGqueueException{
		if(num <= 0) {
			throw new EmptyGqueueException();
		}
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max].equals(x)) {
				return i+front; //검색 성공
			}//if
		}//for
		return -1; //검색 실페
	}
	
	//몇 번째인가
	public int search(E x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max].equals(x)) {
				return i+1; //검색 성공(번 째이기 때문에 반복의 몇번째인지를 반환해주면 됨)
			}//if
		}//for
		return -1; //검색 실페
	}
	
	//비우기
	public void clear() {
		num = front = rear = 0; 
	}
	
	//용량 확인
	public int capacity() {
		return max;
	}
	
	//데이터 수 확인
	public int size() {
		return num;
	}
	
	//비어있는지?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//가득찼는지?
	public boolean isFull() {
		return num >= max;
	}
	
	//데이터 머리->꼬리로 보여주기
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비었습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.println(que[(i+front)%max].toString() + " ");
			}//for
			System.out.println();
		}//if-else
	}
	
}
