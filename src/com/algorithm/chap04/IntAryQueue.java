package com.algorithm.chap04;

public class IntAryQueue {
	
	private int max; //큐 용량
	private int num; //현재 데이터 수
	private int[] que; //큐 본체 배열
	
	//큐가 비어있을 때
	public class EmptyIntArtQueueException extends RuntimeException{
		public EmptyIntArtQueueException() {}
	}
	
	//큐가 가득찼을 때
	public class OverflowIntArtQueueException extends RuntimeException{
		public OverflowIntArtQueueException() {}
	}
	
	public IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//데이터 인큐
	public int enque(int x) throws OverflowIntArtQueueException{
		if(num >= max) {
			throw new OverflowIntArtQueueException();
		}
		que[num++] = x;
		return x;
	}
	
	//데이터 디큐
	public int deque() throws EmptyIntArtQueueException{
		
		if(num <= 0) {
			throw new EmptyIntArtQueueException();
		}
		
		int x = que[0]; //맨 앞의 데이터를 꺼내온다.
		for(int i=0; i<num-1; i++) {
			que[i] = que[i+1]; //데이터들을 한 칸씩 앞으로 가져와야함
		}
		num--; //num 감소 시키기(데이터가 하나 빠졌고, 배열안의 데이터들을 앞으로 한칸씩 모두 이동했으니)
		return x; //꺼내온 데이터 반환 
	}
	
	//데이터 엿보기(가장 마지막의 데이터)
	public int peek() throws EmptyIntArtQueueException{
		
		if(num <= 0) {
			throw new EmptyIntArtQueueException();
		}
		
		return que[num-1]; //개수-1인 인덱스가 가장 마지막 데이터
	}
	
	//큐에서 x 검색
	public int indexOf(int x) throws EmptyIntArtQueueException{
		
		if(num <= 0) {
			throw new EmptyIntArtQueueException();
		}
		
		for(int i=0; i<num; i++) {
			if(que[i] == x) {
				return i; //인덱스 반환
			}//if
		}//for
		
		return -1; //찾지 못했을 경우
	}
	
	//큐를 비움
	public void clear() {
		num = 0;
	}
	
	//큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//큐에 쌓인 데이터 수 반환
	public int size() {
		return num;
	}
	
	//큐가 비어있는지?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//큐가 가득찼는지?
	public boolean isFull() {
		return num >= max;
	}
	
	//큐안의 데이터 출력 
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비었습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[i] + " ");
			}//for
			System.out.println();
		}//if-else
	}
}
