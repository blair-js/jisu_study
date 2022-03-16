package com.backjoon;

import java.util.Scanner;

public class B9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //�׽�Ʈ ���̽� ����
		sc.nextLine(); //�������� 
		
		while(t-->0) { //�׽�Ʈ ���̽� ������ŭ �ݺ� 
			String str = sc.nextLine(); //���ڿ� 
			System.out.println(valid(str)); //�޼��� ȣ�� 
		}
		
	}//main()
	
	public static String valid(String s) {
		
		int cnt = 0; //������ ũ�⸦ �ǹ��ϴ� ���� 
		
		for(int i=0; i<s.length(); i++) { //���ڿ��� ���̸�ŭ �ݺ� 
			if(s.charAt(i) == '(') { //���ڿ����� �ش� i��° ���ڰ� ���°�ȣ���
				cnt += 1; //1���ϱ�
			}else {
				cnt -= 1; //1����
			}//if-else
			
			if(cnt < 0) { //���� ��ȣ ����(�� �̻� ���� ���ڿ��� ���ڸ� ���캼 �ʿ� ���� ����)
				return "NO";
			}//if
		}//for
		
		//���� for �ݺ����� ��� ���� ������ ��
		if(cnt == 0) { //���� ��ȣ�� �����߰�, ���� ��ȣ�� �ݴ� ��ȣ�� ¦�� ��� �´� ���� 
			return "YES";
		}else { //������ ������ 0�� �ƴ϶�� ����, ���� ��ȣ�� ���������� �ݴ� ��ȣ�� ������ ���� 
			return "NO";
		}
	}//valid
}
