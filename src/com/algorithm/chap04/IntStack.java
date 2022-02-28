package com.algorithm.chap04;

public class IntStack {

	private int max; //���� �뷮
	private int ptr; //���� ������(����)
	private int[] stk; //���� ��ü(�����͸� ���� �迭)
	
	//������ ����־ �����͸� ���� �� ���� ��� 
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//������ �������� �����͸� ���� �� ���� ��� 
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//������
	public IntStack(int capacity) {
		ptr = 0; 
		max = capacity; //��ü ������ ���ڷ� ���޹��� �� �������� ���� �뷮 ���� 
		
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) { //���� 23�� �迭 ������ ������ ���
			max = 0; //���� �뷮�� 0���� �ʱ�ȭ => �̷��� ���־�߸� �ٸ��޼��尡 �������� �ʴ� �迭�� �����ϴ� ���� ���� �� �ִ�. 
		}
		
	}//IntStack
	
	//push()
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= max) { //Ǫ���ϰ��� �ϴ� �������� ��ġ�� �ִ� �뷮(max)�� ���ų� ũ�ٸ� 
			throw new OverflowIntStackException(); //���� �߻� 
		}//if
		
		//���� if���� �ɸ��� �ʾҴٸ� ������ push(�迭 stk�� x �߰�)
		return stk[ptr++] = x; 
	}
	
	//pop() 
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0) { //������ ����ִٸ� 
			throw new EmptyIntStackException(); //���� �߻�
		}//if
		return stk[--ptr];
	}
	
	//������ �����(top)�� �ִ� �����͸� ������ �޼ҵ� peek()
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0) { //������ ����ִٸ� 
			throw new EmptyIntStackException(); //���� �߻�
		}
		return stk[ptr-1]; //������ -1 �� ������ �ε����� ����Ų��. 
	}

	//���ÿ��� x�� ã�� �ε����� ��ȯ�ϴ� �޼ҵ� indexOf() => x�� ���ٸ� -1 ��ȯ
	
	public int indexOf(int x) {
		
		for(int i=ptr-1; i>=0; i--) { //������ �Ʒ��� �����˻�
			if(stk[i] == x) {
				return i;
			}//if
		}//for
		
		//������ x�� ã�� ������ ���
		return -1;
	}
	
	//clear() : ������ ���� �޼ҵ�
	public void clear() {
		ptr = 0; //�迭�� ������ 0���� ���������� ��
	}
	
	//������ �뷮�� ��ȯ�ϴ� �޼ҵ� capacity()
	public int capacity() {
		return max; //�����س��Ҵ� �뷮�� ��ȯ�ϸ� ��
	}
	
	//���ÿ� �׿��ִ� ������ ���� ��ȯ�ϴ� size()
	public int size() {
		return ptr; 
	}
	
	//������ ����ִ°�?
	public boolean isEmpty() {
		//return ptr==0 ? true : false;
		return ptr <= 0;
	}
	
	//������ ����á�°�? 
	public boolean isFull() {
		return ptr >= max; 
	}
	
	//���þ��� ��� �����͸� �ٴ�->����� ������ ��� (0���� max-1(ptr)����) 
	public void dump() {
		if(ptr <= 0) {
			System.out.println("������ ��� �ֽ��ϴ�.");
		}else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i] + " ");
			}//for
			System.out.println();
		}//if-else
	}
}
