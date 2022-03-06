package com.algorithm.chap04;

public class Gqueue<E> {
	
	//ť�� ������� ��
	public static class EmptyGqueueException extends RuntimeException{
		public EmptyGqueueException() {}
	}
	
	//ť�� ����á�� ��
	public static class OverflowGqueueException extends RuntimeException{
		public OverflowGqueueException() {}
	}
	
	private int max; //ť�� �뷮
	private int num; //���� ������ ��
	private int rear; //�� �� Ŀ��
	private int front; //�� �� Ŀ��
	private E[] que; //ť�� ��ü �迭 
	
	public Gqueue(int capacity) {
		num = front = rear = 0; //������ ��� 0
		max = capacity;
		
		try {
			que = (E[])new Object[max]; //�迭 ����
		}catch(OutOfMemoryError e) {
			max = 0; 
		}
	}
	
	//������ ��ť
	public E enque(E x) throws OverflowGqueueException{
		if(num >= max) {
			throw new OverflowGqueueException();
		}
		
		que[rear++] = x; //�� �ڿ� ������ �߰�
		num++; //������ ���� ����
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	//������ ��ť
	public E deque() throws EmptyGqueueException{
		if(num <= 0) {
			throw new EmptyGqueueException();
		}
		E x = que[front++]; //�� ���� ������ ����
		num--; //������ ���� ����
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	//������ ��ũ(�����⸸ �ϱ�)
	public E peek() throws EmptyGqueueException{
		if(num <= 0) {
			throw new EmptyGqueueException();
		}
		return que[front]; //�� ���� ������ ��ȯ
	}
	
	//�˻�
	public int indexOf(E x) throws EmptyGqueueException{
		if(num <= 0) {
			throw new EmptyGqueueException();
		}
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max].equals(x)) {
				return i+front; //�˻� ����
			}//if
		}//for
		return -1; //�˻� ����
	}
	
	//�� ��°�ΰ�
	public int search(E x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max].equals(x)) {
				return i+1; //�˻� ����(�� °�̱� ������ �ݺ��� ���°������ ��ȯ���ָ� ��)
			}//if
		}//for
		return -1; //�˻� ����
	}
	
	//����
	public void clear() {
		num = front = rear = 0; 
	}
	
	//�뷮 Ȯ��
	public int capacity() {
		return max;
	}
	
	//������ �� Ȯ��
	public int size() {
		return num;
	}
	
	//����ִ���?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//����á����?
	public boolean isFull() {
		return num >= max;
	}
	
	//������ �Ӹ�->������ �����ֱ�
	public void dump() {
		if(num <= 0) {
			System.out.println("ť�� ������ϴ�.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.println(que[(i+front)%max].toString() + " ");
			}//for
			System.out.println();
		}//if-else
	}
	
}
