package com.algorithm.chap04;

public class IntStack {

	private int max; //스택 용량
	private int ptr; //스택 포인터(개수)
	private int[] stk; //스탤 본체(데이터를 담을 배열)
	
	//스택이 비어있어서 데이터를 뽑을 수 없는 경우 
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//스택이 가득차서 데이터를 넣을 수 없는 경우 
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0; 
		max = capacity; //객체 생성시 인자로 전달받은 값 기준으로 스택 용량 설정 
		
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) { //위의 23행 배열 생성에 실패할 경우
			max = 0; //스택 용량을 0으로 초기화 => 이렇게 해주어야만 다른메서드가 존재하지 않는 배열에 접근하는 것을 막을 수 있다. 
		}
		
	}//IntStack
	
	//push()
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= max) { //푸쉬하고자 하는 데이터의 위치가 최대 용량(max)랑 같거나 크다면 
			throw new OverflowIntStackException(); //예외 발생 
		}//if
		
		//위의 if문에 걸리지 않았다면 데이터 push(배열 stk에 x 추가)
		return stk[ptr++] = x; 
	}
	
	//pop() 
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) { //스택이 비어있다면 
			throw new EmptyIntStackException(); //예외 발생
		}//if
		return stk[--ptr];
	}
	
	//스택의 꼭대기(top)에 있는 데이터를 엿보는 메소드 peek()
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) { //스택이 비어있다면 
			throw new EmptyIntStackException(); //예외 발생
		}
		return stk[ptr-1]; //개수의 -1 이 마지막 인덱스를 가리킨다. 
	}

	//스택에서 x를 찾아 인덱스를 반환하는 메소드 indexOf() => x가 없다면 -1 반환
	
	public int indexOf(int x) {
		
		for(int i=ptr-1; i>=0; i--) { //위에서 아래로 선형검색
			if(stk[i] == x) {
				return i;
			}//if
		}//for
		
		//위에서 x를 찾지 못했을 경우
		return -1;
	}
	
	//clear() : 스택을 비우는 메소드
	public void clear() {
		ptr = 0; //배열의 개수를 0으로 만들어버리면 됨
	}
	
	//스택의 용량을 반환하는 메소드 capacity()
	public int capacity() {
		return max; //설정해놓았던 용량을 반환하면 됨
	}
	
	//스택에 쌓여있는 데이터 수를 반환하는 size()
	public int size() {
		return ptr; 
	}
	
	//스택이 비어있는가?
	public boolean isEmpty() {
		//return ptr==0 ? true : false;
		return ptr <= 0;
	}
	
	//스택이 가득찼는가? 
	public boolean isFull() {
		return ptr >= max; 
	}
	
	//스택안의 모든 데이터를 바닥->꼭대기 순서로 출력 (0부터 max-1(ptr)까지) 
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		}else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i] + " ");
			}//for
			System.out.println();
		}//if-else
	}
}
