package com.algorithm.chap04;

public class IntQueue {
	
	private int max; //ť�� �뷮
	private int front; //ù ��° ��� Ŀ�� 
	private int rear; //������ ��� Ŀ��
	private int num; //������ ����
	private int[] que; //ť ��ü �迭 
	
	//ť�� �������
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}

	//ť�� ����á����
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0; //0���� ����
		max = capacity; //�뷮 ����
		
		try {
			que = new int[max]; //�迭 ũ�� ����
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//��ť
	public int enque(int x) throws OverflowIntQueueException{
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		
		que[rear++] = x; //�� �ڿ� ������ �߰� �� Ŀ�� �̵� 
		num++; //������ ���� ����
		if(rear == max) { //rear�� �ִ�뷮�� ��(������ �ε���)�� �����ٸ�
			rear = 0; //que[0]���� �ٽ� ����
		}
		return x;
	}
	
	//��ť
	public int deque() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int x = que[front++]; //�� ���� ������ ���� �� Ŀ�� �̵�
		num--; //������ ���� ����
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
		return -1; //�˻� ����
	}
	
	//����
	public void clear() {
		num = front = rear = 0;
	}
	
	//�뷮 ��ȯ
	public int capacity() {
		return max;
	}
	
	//������ �� ��ȯ
	public int size() {
		return num;
	}
	
	//����ִ���
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//����á����
	public boolean isFull() {
		return num >= max;
	}
	
	//��� ������ ���: front���� rear�� ���
	public void dump() {
		if(num <= 0) {
			System.out.println("ť�� ����ֽ��ϴ�.");
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
		return -1; //�˻�����
	}
}
