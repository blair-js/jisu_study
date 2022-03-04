package com.algorithm.chap04;

public class IntQueue {
	
	private int max; //큐의 용량
	private int front; //첫 번째 요소 커서 
	private int rear; //마지막 요소 커서
	private int num; //데이터 개수
	private int[] que; //큐 본체 배열 
	
	//큐가 비었을때
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}

	//큐가 가득찼을때
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0; //0으로 시작
		max = capacity; //용량 설정
		
		try {
			que = new int[max]; //배열 크기 설정
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//인큐
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		
		que[rear++] = x; //맨 뒤에 데이터 추가 후 커서 이동 
		num++; //데이터 개수 증가
		if(rear == max) { //rear가 최대용량의 값(마지막 인덱스)와 만났다면
			rear = 0; //que[0]부터 다시 시작
		}
		return x;
	}
	
	//디큐
	public int deque() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int x = que[front++]; //맨 앞의 데이터 추출 후 커서 이동
		num--; //데이터 개수 감소
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	public int peek() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	public int indexOf(int x) throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		for(int i=0; i<num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}//for
		return -1; //검색 실패
	}
	
	//비우기
	public void clear() {
		num = front = rear = 0;
	}
	
	//용량 반환
	public int capacity() {
		return max;
	}
	
	//데이터 수 반환
	public int size() {
		return num;
	}
	
	//비어있는지
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//가득찼는지
	public boolean isFull() {
		return num >= max;
	}
	
	//모든 데이터 출력: front에서 rear로 출력
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[(i+front) % max] + " ");
			}//for
			System.out.println();
		}//if-else
	}
	
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max] == x) {
				return i+1;
			}//if
		}//for
		return -1; //검색실패
	}
}
