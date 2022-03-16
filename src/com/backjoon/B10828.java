package com.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10828 {
	
	public static int[] stack; //���� ��ü �迭 
	public static int size = 0; //������ ���� 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //������� ���� ��ü ��Ʈ�� ���� 
		StringBuilder sb = new StringBuilder(); //���ڿ��� ���� ���� 
		
		StringTokenizer st; 
		
		//br.readLine()�� ���� String���� �������� ������ int������ ����ȯ
		int N = Integer.parseInt(br.readLine());
		
		//�Է¹��� ����� �� N��ŭ ���� �뷮(�迭�� ũ��) ���� => ��� ����� push��� �ص�, �����ʹ� 14�����״�! 
		stack = new int[N]; 
		
		//��� ����� ������ ���� �ݺ��� 
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " "); //�о�� �ش� ��(��)�� ���ڿ��� ������ �������� ��ū �з� 
			
			//��� ��ū �˻� 
			switch(st.nextToken()) {
			case "push" : //push��� 
				push(Integer.parseInt(st.nextToken())); //�� ���� ��ū(���� ������)�� push �޼����� ���ڷ� ���� 
				break;
			case "pop" :
				sb.append(pop()).append("\n"); //���(���� ������)�� ���ڿ� sb�� �߰��ϰ� ���� 
				break;
			case "size" : 
				sb.append(size()).append("\n"); //���(���� ������)�� ���ڿ� sb�� �߰��ϰ� ���� 
				break;
			case "empty" : 
				sb.append(empty()).append("\n"); //���(��/����)�� ���ڿ� sb�� �߰��ϰ� ����
				break;
			case "top" : 
				sb.append(top()).append("\n"); //���(Ȯ���� �� ���� ������)�� ���ڿ� sb�� �߰��ϰ� ����
				break;	
			}//switch
		}//while
		System.out.println(sb);
	}//main
	
	public static void push(int x) {
		stack[size] = x; //���ÿ� ������� Ǫ���ϰ��� �ϴ� ������ ����
		size++; //������ ���� ����
	}
	
	public static int pop() {
		if(size == 0) { //�����Ͱ� ���� ���
			return -1;
		}else { //�����Ͱ� �ִ� ���
			int res = stack[size-1]; //���� ������ ������ 
			stack[size-1] = 0; //���� �������� �ִ� ������ ����
			size--; //������ ���� ���� 
			return res; 
		}
	}
	
	public static int size() {
		return size; 
	}
	
	public static int empty() {
		if(size == 0) { //�����Ͱ� ������(������ ���������)
			return 1;
		}else { //�����Ͱ� ������(������ ������� ������)
			return 0;
		}
	}
	
	public static int top() {
		if(size == 0) {
			return -1;
		}else {
			return stack[size-1]; //���� ������ ������ ��ȯ
			//pop()�� �ٸ����� pop()�� ������ �����͸� ��ȯ�� ��, �� �����͸� �����ϰ�, ��ü �������� ���� size�� ���ҽ��״�. 
		}
	}
}

