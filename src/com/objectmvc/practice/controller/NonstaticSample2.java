package com.objectmvc.practice.controller;

public class NonstaticSample2 {

	public int[] intArrayAllocation(int length) {
		
		// ���޹��� ���� (length) ��ŭ int �迭�� �Ҵ�
		// ������ 1���� 100������ ������ ���� ����ϰ� �迭 �ּ� ����
		
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 +1);
		}
		
		return arr;
		
	}
	
	public void display(int[] arr) {
		
		// ���޹��� �迭 ���
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		
		// ���޹��� �迭�� ������ �ε��� ���� ��ȯ
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
		
	}
	
	public void sortDescending(int[] arr) {
		
		// ���� swap �޼ҵ带 �̿��Ͽ� ���޹��� �迭�� �������� ����
		// ���� display �޼ҵ带 �̿��Ͽ� ���
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}//for
		}//for
		
		display(arr);
		
	}
	
	public void sortAscending(int[] arr) {
		
		// ���� swqp �޼ҵ带 �̿��Ͽ� ���޹��� �迭�� �������� ����
		// ���� display �޼ҵ带 �̿��Ͽ� ���
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}//for
		}//for
		
		display(arr);
		
	}
	
	public int countChar(String str, char c) {
		
		// ���ڿ��� ���� �ϳ��� ���޹޾� ���ڿ��� ���Ե� ������ ���� ����
		int count = 0; 
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}//for
		
		return count;
		
	}
	
	public int totalValue(int num1, int num2) {
	
		// ���� �� ���� ���޹޾� �� �� �� ���� ������ ū �� ������ �������� �հ踦 ����
		// (��, ���޹��� �� ������ ���Ե��� �ʾƾߵȴ�.)

		int sum = 0; 
		int min = num1;
		int max = num2;
		
		if(min > max) {
			min = num2; 
			max = num1;
		}
		
		for(int i=min+1; i<max; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public char pCharAt(String str, int index) {
		
		// ���޹��� ���ڿ��� �ε����� ���� �ش� �ε����� ���� ����
		
		return str.charAt(index);
		
	}
	
	public String pConcat(String str1, String str2) {
		
		return str1 + str2;
		
	}
	
}
