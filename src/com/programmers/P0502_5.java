package com.programmers;

public class P0502_5 {
	//�ڵ��� ��ȣ ������
	
	public static void main(String[] args) {
		
		String phone_number = "027778888";
		
		//���1.�� Ǯ�� ���
		//���� �Է¹��� ���̸� ������ ���
		/*int length = phone_number.length();
		
		//���� ��ȯ���� ��й�ȣ ���� ����
		StringBuilder sb = new StringBuilder();
		
		//�ڿ� 4�ڸ��� ������ ������ �ڸ��� ��� ��(*)�� ���᤺
		for(int i=0; i<length-4; i++) {
			sb.append("*");
		}

		//�ڿ� 4�ڸ��� ���� ��й�ȣ�� ����
		for(int i=length-4; i<length; i++) {
			sb.append(phone_number.charAt(i));
		}
		
		System.out.println(sb);*/
		
		//2.�ٸ� Ǯ�̹�� : char�� �迭 �̿��ϱ�
		//�Է¹��� ���ڿ��� toCharArray() �޼ҵ带 ���� �ϳ��� char �迭�� ��´�.
		/*char[] ch = phone_number.toCharArray();
		
		for(int i=0; i<ch.length-4; i++) { //�迭�� ���̿��� �� 4�ڸ��� �� ��ŭ�� �ݺ�
			ch[i] = '*'; //���� ������ ��� ��(*)�� ���� 
		}
		
		//char�� �迭�� �Ű������� �־� �ϳ��� ���ڿ��� ��ȯ���ִ� valueOf �޼ҵ� ���.
		System.out.println(String.valueOf(ch));*/
		
		
		//3.�ٸ� Ǯ�̹�� : substring �޼ҵ� �̿��ϱ� 
		String answer = ""; //��ȯ�Ͽ� ��ȯ�� �� ��й�ȣ ����
		
		for(int i=0; i<phone_number.length()-4; i++) {//�迭�� ���̿��� �� 4�ڸ��� �� ��ŭ�� �ݺ�
			answer += "*"; //��(*) ����
		}
		
		//�״��� substring �޼ҵ带 ����Ͽ�
		//���� ��й�ȣ�� �� 4�ڸ��� �̾Ƽ� answer�� ��������ֱ�
		answer += phone_number.substring(phone_number.length()-4);

		System.out.println(answer);
	}

}
