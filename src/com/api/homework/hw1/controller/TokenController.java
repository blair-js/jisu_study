package com.api.homework.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		
		//������ ��ū���� ó�� �� ���� ��ȯ
		StringTokenizer st = new StringTokenizer(str, " ");  
		
		String result = "";
		while(st.hasMoreTokens()) {
			result += st.nextToken(); 
		}
		
		return result;
		
	}
	
	public String firstCap(String input) {
		
		StringBuilder st = new StringBuilder(input);
		
		st.delete(0, 1); //st�� 0��°���� 1��° ������ ����(��, 0��°�� ������)
		st.insert(0, input.toUpperCase().charAt(0)); //input �빮�� ��ȯ ���ڿ��� 0��° ���ڸ� st�� 0��°�� ���� 
		
		String result = ""; //��ȯ���� String�̰� StringBuilder �� ���? ����ȯ�ؾ����� ��. �׷��� �� ���ڿ��� �����
		result += st; //�̾� ����
		
		return result; 
		
	}

	public int findChar(String input, char one) {
		
		//input�� ������ ���ڴ� ������ ���� �����̱� ������ ��ū�������� �����ֳ�?�𸣰���
		String[] inputArr = input.split(""); //split�� ��� ���� 
		//StringTokenizer st = new StringTokenizer(input, ""); //��� �ȸ���. �������� ��ū���� �ɰ������� ����.
		
		int count = 0; 
		
		for(String s : inputArr) {
			if(s.equals(String.valueOf(one))) { //s�� String Ÿ���̶� ���Ϸ��� char���� one�� String Ÿ������ �ٲ���� ��.
				count++;
			}
		}
		
		return count;

	}
	
}
