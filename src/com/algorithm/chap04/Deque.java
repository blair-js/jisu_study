package com.algorithm.chap04;

public class Deque {
	
	private int max; //�뷮(A+B�� �� �հ�) => �뷮�� A�� B�� �����Ѵ�
	private int ptrA; //A�� ������(�տ������� ������ ����)
	private int ptrB; //B�� ������(�ڿ������� ������ ����)
	private int[] stk; //���� ��ü �迭 
	
	public enum AorB{
		StackA, StackB
	};
	
	//������ ������� ���� ����
	public class EmptyDequeException extends RuntimeException{
		public EmptyDequeException() {}
	}
	
	//������ ����á�� ���� ����
	public class OverflowDequeException extends RuntimeException{
		public OverflowDequeException() {}
	}
	
	public Deque(int capacity) {
		ptrA = 0; //ù��° �ε���
		ptrB = capacity-1; //������ �ε���
		max = capacity;
		
		try {
			stk = new int[max]; //�迭 ��ü ���� 
		}catch(OutOfMemoryError e) {
			max = 0; //�뷮�� 0�̸� �迭�� ������ �� ���� 
		}
	}
	
	public int push(AorB sw, int x) throws OverflowDequeException{
		if(ptrA >= ptrB+1) { //������ ���� á�ٸ� 
			throw new OverflowDequeException();
		}
		//���� A�� B�� � ���� �����ߴ����� ���� ������ ���� �κ��� �ٸ���
		switch(sw) {
		case StackA : 
			stk[ptrA++] = x; //�տ������� �ִ°��̹Ƿ� ++
			break;
		case StackB : 
			stk[ptrB--] = x; //�ڿ������� �ִ°��̹Ƿ� --
			break;
		}//switch
		return x;
	}
	
	public int pop(AorB sw) throws EmptyDequeException{
		
		int x = 0; //pop�� �����͸� ���� ���� 
		
		switch(sw) {
		case StackA : 
			if(ptrA <= 0) { //���� A�� ����ִٸ�
				throw new EmptyDequeException(); //���� �߻�
			}
			x = stk[--ptrA]; 
			break;
		case StackB : 
			if(ptrB >= max-1) { //���� B�� ����ִٸ�
				throw new EmptyDequeException(); //���� �߻�
			}
			x = stk[++ptrB];
			break;
		}
		return x; 
	}
	
	public int peek(AorB sw) throws EmptyDequeException{
		
		int x = 0; //peek�� �����͸� ���� ����
		switch(sw) {
		case StackA : 
			if(ptrA <= 0) { //���� A�� ����ִٸ� 
				throw new EmptyDequeException(); //���� �߻�
			}
			x = stk[ptrA - 1];
			break;
		case StackB : 
			if(ptrB >= max-1) { //���� B�� ����ִٸ�
				throw new EmptyDequeException(); //���� �߻�
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
		return -1; //x�� ���� ��(�˻� ����) 
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
				System.out.println("������ ������ϴ�.");
			}else{
				for(int i=0; i<ptrA; i++) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}//if-else
			break;
		case StackB : 
			if(ptrB >= max) {
				System.out.println("������ ������ϴ�.");
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
