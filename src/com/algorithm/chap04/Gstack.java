package com.algorithm.chap04;

public class Gstack<E> {

	private int max; //������ �ִ� �뷮
	private int ptr; //������ ������
	private E[] stk; //���� ��ü(E Ÿ���� �����͸� ���� �迭 stk)
	
	//������ ����������� ���� 
	public static class EmptyGstackException extends RuntimeException{
		public EmptyGstackException() {}
	}

	//������ ����á������ ����
	public static class OverflowGstackException extends RuntimeException{
		public OverflowGstackException() {}
	}
	
	//������
	public Gstack(int capacity) {
		ptr = 0; 
		max = capacity; 
		try {
			stk = (E[])new Object[max]; //�迭 ���� => Object ��ü�� ���� �� ���� ���ϴ� E Ÿ������ �ٿ�ĳ����!
		}catch(OutOfMemoryError e) {
			max = 0; 
		}
	}
	
	public E push(E e) throws OverflowGstackException{
		if(ptr >= max) { //������ ������ ���
			throw new OverflowGstackException(); //���� �߻�
		}
		return stk[ptr++] = e; //���ڷ� ���޹��� e�� �迭�� �߰� 
	}
	
	public E pop() throws EmptyGstackException{
		if(ptr <= 0) { //������ ����ִ� ���
			throw new EmptyGstackException(); //���� �߻�
		}
		return stk[--ptr]; //������ �ε����� �ִ� e�� ������ �� �����͵� ���ҵȴ� => peek�� �ٸ���
	}
	
	public E peek() throws EmptyGstackException{
		if(ptr <= 0) { //������ ����ִ� ���
			throw new EmptyGstackException(); //���� �߻�
		}
		return stk[ptr-1]; //������ �ε����� �ִ� e�� �������� �����ش�
	}
	
	public int indexOf(E e) throws EmptyGstackException{
		if(ptr <= 0) {//������ ����ִ� ���
			throw new EmptyGstackException(); //���� �߻�
		}
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i].equals(e)) { //E Ÿ���� ���ڳ� ���ڰ� �ƴ� �� �����Ƿ� equals�� ���ؾ��Ѵ�. 
				return i; //�˻� ����
			}
		}//for
		return -1; //�˻� ����
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr; 
	}
	
	public boolean isEmpty() {
		return ptr <= 0; 
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0) {//������ ����ִ� ���
			throw new EmptyGstackException(); //���� �߻�
		}
		for(int i=ptr; i>=0; i--) {
			System.out.print(stk[i] + " ");
		}
		System.out.println();
	}
}
