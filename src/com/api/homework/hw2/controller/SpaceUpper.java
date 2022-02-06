package com.api.homework.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	private Scanner sc = new Scanner(System.in);
	
	public SpaceUpper() {	}
	
	public void spaceToUpper() {
		
		// ������ �Է� �޴´�.
		// StringTokenizer�� ���� ���⸦ �������� ��ū ������ ���� ���� �����ϴ� �޼ҵ带����
		System.out.println("��� �Է��Ͻÿ�(���� ����) : ");
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		// ���� ���� ù ���ڴ� �빮�ڷ� �ǰ� �ϰ� �� �ܿ� ������ �ҹ��ڷ� �ؼ� StringBuilder�� ��� ���
		
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			
			String s = st.nextToken(); //st.nextToken() �� String���� ��ȯ�ǹǷ� s�� ����ְ� 
			
			char oldC = s.charAt(0); //0��° ���� �̰� 
			char newC = s.toUpperCase().charAt(0); //���ڿ��� �빮�ڷ� �ٲ� ���¿��� 0��° ���� �̾Ƽ�
			
			s = s.replace(oldC, newC); //���� �ٲ��ֱ�
			
			sb.append(s + " "); //�߰� 
			
		}
		
		System.out.println(sb);

	}
	
}
