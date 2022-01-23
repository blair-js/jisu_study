package com.objectmvc.practice.controller;

public class StaticSample {

	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value; //this �ʿ���� Ŭ���������� ���� ����^^
	}
	
	public static void toUpper() {
	
		char[] cArr = new char[value.length()];
		
		for(int i=0; i<cArr.length; i++) { //value ���� �ɰ��� char �迭�� ���
			if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z') {
				cArr[i] = (char)(value.charAt(i) - 32); //�ҹ��ڿ� �빮�� ���̸�ŭ 
			}else {
				cArr[i] = value.charAt(i);
			}
		}//for
		
		value = ""; //�ʱ�ȭ(�����ָ� JavaJAVA �� ��)
		//�ɰ��� ���ڸ� ���ڿ��� ��ü
		for(int i=0; i<cArr.length; i++) {
			value += cArr[i];
		}
		
	}
	
	public static void setChar(int index, char c) {
		
		// ���޹��� �ε��� ��ġ�� value ���� ���޹��� ���ڷ� �����ϴ� static �޼ҵ�
		
		char[] cArr = new char[value.length()];
		
		for(int i=0; i<cArr.length; i++) {
			if(i == index) {
				cArr[i] = c;
			}else {
				cArr[i] = value.charAt(i);
			}
		}//
		
		value = ""; //�ʱ�ȭ
		for(int i=0; i<cArr.length; i++) {
			value += cArr[i];
		}
		
	}
	
	public static int valueLength() {
		
		return value.length();
	}
	
	public static String valueConcat(String str) {
		
		// ���ڿ� ���� ���޹޾� value �ʵ� ���� �ϳ��� ���ļ� ����
		return value + str;
	}
	
	
}
