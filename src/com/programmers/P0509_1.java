package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P0509_1 {
	//���ڿ� �� ������� �����ϱ�
	
	public static void main(String[] args) {

		//���� Ǯ��
		int n = 1;
		String[] strings = {"abce", "abcd", "cdx"};
		/*String[] newStrings = new String[strings.length]; //�������� �� ��ȯ�� �迭
		
		for(int i=0; i<strings.length; i++) {
			//n��° �ε����� ���ڸ� ������ �� �ڿ� ������ ���ڿ��� �����Ѵ�.
			//ex. n�� 1�� ��� abce => babce �� ���ڿ��� ����� ����  
			newStrings[i] = strings[i].charAt(n) + strings[i];  
		}
		
		//���� �ݺ��� ��� ������ �ٲ� ���ڿ��� �����ִ� �迭 newStrings�� ������������ �������Ѵ�. 
		//ex. ["babce", "babcd", "dcdx"] => ["babcd", "babce", "dcdx"]
		Arrays.sort(newStrings);
		
		//������������ ���ĵ� �迭�� �ݺ��Ѵ�. => n��° �������� �����ϱ� ���� �� �տ� �ٿ����Ҵ� ���ڸ� �����ؾ� �ϱ� ����
		for(int i=0; i<newStrings.length; i++) {
			newStrings[i] = newStrings[i].substring(1); //0��° �ε��� ���ڸ� ������ ���� 1~�������� ���ڿ��� ����(������ ���ڿ�)
		}
		
		System.out.println(Arrays.toString(newStrings));*/
		
		
		//�ٸ� Ǯ�� : ����� �����ϳ� ArrayList ���
		String[] newStrings = {};
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0; i<strings.length; i++) {
			arr.add(""+strings[i].charAt(i)+strings[i]);
		}
		Collections.sort(arr);
		newStrings = new String[arr.size()]; //String�� ����ִ� list �����ŭ �迭 ����
		for(int i=0; i<arr.size(); i++) {
			newStrings[i] = arr.get(i).substring(1); //arr�� ����ִ� i��°�� get�ؼ� �ش� ���ڿ��� 1��°���� �������� ����
		}
		
		System.out.println(Arrays.toString(newStrings));
		
	}
	

}
