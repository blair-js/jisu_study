package com.algorithm.chap04;

public class Deque {
	
	private int max; //용량(A+B의 총 합계) => 용량은 A와 B가 공유한다
	private int ptrA; //A의 포인터(앞에서부터 포인터 시작)
	private int ptrB; //B의 포인터(뒤에서부터 포인터 시작)
	private int[] stk; //스택 본체 배열 
	
	public enum AorB{
		StackA, StackB
	};
	
	//스택이 비어있을 때의 예외
	public class EmptyDequeException extends RuntimeException{
		public EmptyDequeException() {}
	}
	
	//스택이 가득찼을 때의 예외
	public class OverflowDequeException extends RuntimeException{
		public OverflowDequeException() {}
	}
	
	public Deque(int capacity) {
		ptrA = 0; //첫번째 인덱스
		ptrB = capacity-1; //마지막 인덱스
		max = capacity;
		
		try {
			stk = new int[max]; //배열 본체 생성 
		}catch(OutOfMemoryError e) {
			max = 0; //용량이 0이면 배열을 생성할 수 없음 
		}
	}
	
	public int push(AorB sw, int x) throws OverflowDequeException{
		if(ptrA >= ptrB+1) { //스택이 가득 찼다면 
			throw new OverflowDequeException();
		}
		//스택 A와 B중 어떤 것을 선택했는지에 따라 데이터 대입 부분이 다르다
		switch(sw) {
		case StackA : 
			stk[ptrA++] = x; //앞에서부터 넣는것이므로 ++
			break;
		case StackB : 
			stk[ptrB--] = x; //뒤에서부터 넣는것이므로 --
			break;
		}//switch
		return x;
	}
	
	public int pop(AorB sw) throws EmptyDequeException{
		
		int x = 0; //pop할 데이터를 담을 변수 
		
		switch(sw) {
		case StackA : 
			if(ptrA <= 0) { //스택 A가 비어있다면
				throw new EmptyDequeException(); //예외 발생
			}
			x = stk[--ptrA]; 
			break;
		case StackB : 
			if(ptrB >= max-1) { //스택 B가 비어있다면
				throw new EmptyDequeException(); //예외 발생
			}
			x = stk[++ptrB];
			break;
		}
		return x; 
	}
	
	public int peek(AorB sw) throws EmptyDequeException{
		
		int x = 0; //peek할 데이터를 담을 변수
		switch(sw) {
		case StackA : 
			if(ptrA <= 0) { //스택 A가 비어있다면 
				throw new EmptyDequeException(); //예외 발생
			}
			x = stk[ptrA - 1];
			break;
		case StackB : 
			if(ptrB >= max-1) { //스택 B가 비어있다면
				throw new EmptyDequeException(); //예외 발생
			}
			x = stk[ptrB + 1];
			break;
		}

		return x;
	}
	
	public int indexOf(AorB sw, int x) {
		switch(sw) {
		case StackA : 
			for(int i=ptrA-1; i>=0; i--) {
				if(stk[i] == x) {
					return i;
				}//if
			}//for
			break;
		case StackB : 
			for(int i=ptrB+1; i<max; i++) {
				if(stk[i] == x) {
					return i;
				}//if
			}//for
			break;
		}//switch
		return -1; //x가 없을 때(검색 실패) 
	}
	
	public void clear(AorB sw) {
		switch(sw) {
		case StackA : 
			ptrA = 0;
			break;
		case StackB :
			ptrB = max-1; 
			break;
		}
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(AorB sw) {
		switch(sw) {
		case StackA : 
			return ptrA; 
		case StackB : 
			return max - ptrB -1;
		}
		return 0;
	}
	
	public boolean isEmpty(AorB sw) {
		switch(sw) {
		case StackA : 
			return ptrA <= 0; 
		case StackB : 
			return ptrB >= max-1;
		}
		return true;
	}
	
	public boolean isFull(AorB sw) {
		return ptrA >= ptrB +1;
	}
	
	public void dump(AorB sw) {
		switch(sw) {
		case StackA : 
			if(ptrA <= 0) {
				System.out.println("스택이 비었습니다.");
			}else{
				for(int i=0; i<ptrA; i++) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}//if-else
			break;
		case StackB : 
			if(ptrB >= max) {
				System.out.println("스택이 비었습니다.");
			}else {
				for(int i=max-1; i>ptrB; i--) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}//if-else
			break;
		}//switch
	}
}
