package com.programmers;

public class P0506_6 {
	//���￡�� �輭�� ã��
	
	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim", "Park", "Choi", "Hong", "Blair", "Mark", "Tom", "Lee"};
		
		int idx = 0; //Kim�� ã�� �ε����� ���� ���� 
		for(String s : seoul) { //seoul �迭�� �ִ� ��� ��Ҹ� Ȯ��
			if(s.equals("Kim")) { //Kim�� ������
				break; //�ٷ� �ݺ� ����
			}
			idx++; //���� if���� ��������� �ε��� ������Ű�� �����ݺ��� ����
		}//for
		
		System.out.println("�輭���� " + idx + "�� �ִ�");
		
	}

}
