package com.programmers;

public class P0506_7 {
	//���ڿ� �ٷ�� �⺻
	
	public static void main(String[] args) {
		
		String s = "a858d";
		
		boolean result = true; //���ڿ� s�� ���̰� 4 or 6�̰�, ���ڷθ� ������ �Ǿ��ִٸ� true ��ȯ
		
		//1.�� Ǯ��
		//���� true�� ������ �������� ���ϴ� false�� ������ �����غ���.
		//1)�׷� ���̰� 4�ų� 6�� �ƴϸ� �ٷ� false�� ��ȯ���ָ� �ǰ�
		//2)���ڿ� �ȿ� ���ڰ� �ƴ� �ٸ����� �ϳ��� ����ִٸ� false�� ��ȯ���ָ� �ȴ�. 
		if(s.length() != 4 && s.length() != 6) { //���ڿ� s�� ���̰� 4�� 6�� �ƴ϶�� 
			result = false; 
		}else { //���ڿ� s�� ���̰� 4�� 6�� ��쿣 ���ڿ��� ������ҵ��� Ȯ��
			for(int i=0; i<s.length(); i++) {
				if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) { //���ڿ��� �ش� i��° ���ڰ� 0 �̻� 9���� �̴� ���� false
					result = false;
					break; //�ݺ� ����
				}
			}
		}
		
		System.out.println(result);

		//2.�ٸ� Ǯ�� : "����ǥ����" ��� - 1
		result = false; //�⺻ ������� false�� �ϰ� 
		
		if(s.length() == 4 || s.length() == 6) { //���ڿ��� ���̰� 4�̰ų� 6�̸� �ش� ���ǹ��� �����ؼ�
			result = s.matches("(^[0-9]*$)"); //�ش� ���ڿ��� ���ڷθ� �����Ǿ��ִ��� Ȯ�� => matches �޼ҵ��� ����� boolean Ÿ������ ��ȯ
		}
		
		System.out.println(result);
		
		//3.�ٸ� Ǯ�� : "����ǥ����" ��� - 2 
		//���� üũ���� ����ǥ�������� �ϸ� ���ڿ� s�� ���� ��� �˻簡 �Ʒ� �ڵ� ���ٷ� ������.....wow....
		System.out.println(s.matches("^[0-9]{4}|{6}$")); //�ؼ� : ����(0~9)�θ� �̷���� 4 ���� or 6���� 
		
	}

}
