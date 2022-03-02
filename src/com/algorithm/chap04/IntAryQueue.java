package com.algorithm.chap04;

public class IntAryQueue {
	
	private int max; //ť �뷮
	private int num; //���� ������ ��
	private int[] que; //ť ��ü �迭
	
	//ť�� ������� ��
	public class EmptyIntArtQueueException extends RuntimeException{
		public EmptyIntArtQueueException() {}
	}
	
	//ť�� ����á�� ��
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
	
	//������ ��ť
	public int enque(int x) throws OverflowIntArtQueueException{
		if(num >= max) {
			throw new OverflowIntArtQueueException();
		}
		que[num++] = x;
		return x;
	}
	
	//������ ��ť
	public int deque() throws EmptyIntArtQueueException{
		
		if(num <= 0) {
			throw new EmptyIntArtQueueException();
		}
		
		int x = que[0]; //�� ���� �����͸� �����´�.
		for(int i=0; i<num-1; i++) {
			que[i] = que[i+1]; //�����͵��� �� ĭ�� ������ �����;���
		}
		num--; //num ���� ��Ű��(�����Ͱ� �ϳ� ������, �迭���� �����͵��� ������ ��ĭ�� ��� �̵�������)
		return x; //������ ������ ��ȯ 
	}
	
	//������ ������(���� �������� ������)
	public int peek() throws EmptyIntArtQueueException{
		
		if(num <= 0) {
			throw new EmptyIntArtQueueException();
		}
		
		return que[num-1]; //����-1�� �ε����� ���� ������ ������
	}
	
	//ť���� x �˻�
	public int indexOf(int x) throws EmptyIntArtQueueException{
		
		if(num <= 0) {
			throw new EmptyIntArtQueueException();
		}
		
		for(int i=0; i<num; i++) {
			if(que[i] == x) {
				return i; //�ε��� ��ȯ
			}//if
		}//for
		
		return -1; //ã�� ������ ���
	}
	
	//ť�� ���
	public void clear() {
		num = 0;
	}
	
	//ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	//ť�� ���� ������ �� ��ȯ
	public int size() {
		return num;
	}
	
	//ť�� ����ִ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//ť�� ����á����?
	public boolean isFull() {
		return num >= max;
	}
	
	//ť���� ������ ��� 
	public void dump() {
		if(num <= 0) {
			System.out.println("ť�� ������ϴ�.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[i] + " ");
			}//for
			System.out.println();
		}//if-else
	}
}
