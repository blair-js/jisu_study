package com.objectmvc.practice.controller;

public class NonstaticSample {

	public void printLottoNumbers() {
		
		// 1~45������ ������ ���� 6���� �ߺ����� �ʰ� �߻����� ����ϴ� �޼ҵ�
		// ���� --> �������� ���ķ� ���
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					continue;
				}
			}//for
		}//for
		
		//�������� ����
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) { //�۴ٸ�
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.print("���� �� : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void outputChar(int num, char c) {
		
		// �Ű������� ���޹��� ���� c�� ���޹��� num ���� ��ŭ ����ϴ� �޼ҵ�
		
		System.out.print(c + "���� " + num + "�� ��� : ");
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
	}
	
	public char alphabette() {
		
		// ���ĺ� ������ ������ �����ڸ� �ϳ� �߻����� �����ϴ� �޼ҵ�
		// ����! �ҹ��� �빮�� ��� ����
		
		while(true) {
			char c = (char)((int)(Math.random()* 58 + 65));
			
			if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				return c;
			}else {
				continue;
			}
		}
		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		// �Ű������� ���ڿ��� ���� �ε���, �� �ε����� ���� �ް�
		// �ش� �ε��� ������ ���ڿ��� �����Ͽ� ����
		// ��, ���޹��� ���ڿ��� �ݵ�� ���� �־�� �Ѵ�. --> ������ null ����
		
		System.out.print(str + "�� " + index1 + "�� " + index2 + "�� ������ �� ��� : ");
		String result = "";
		if(str != null) {
			for(int i=index1; i<index2; i++) {
				result += str.charAt(i);
			}
			return result;
		}else {
			return null;
		}
		
	}
}
