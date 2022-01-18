package com.algorithm;

import java.util.Scanner;

public class BFmatch {

	static int bfMatch(String txt, String pat) {
		int pt = 0; // txt Ŀ��
		int pp = 0; // pat Ŀ�� 
		
		while(pt != txt.length() && pp != pat.length()) { //�ؽ�Ʈ Ŀ���� �ؽ�Ʈ�� ���̰� �ƴϰ�, ������ Ŀ���� ������ ���̰� �ƴҶ� 
			if(txt.charAt(pt) == pat.charAt(pp)) { //�ؽ�Ʈ pt ��° ���ڿ� ���� pp��° ���ڰ� ���ٸ�
				pt++; //�ؽ�Ʈ ���� Ŀ��
				pp++; //�ؽ�Ʈ ���� Ŀ��
			}else { //�ٸ��ٸ� 
				pt = pt - pp + 1 ; //�ؽ�Ʈ�� ���� ���ڷ� �Ѿ�� ������! 
				pp = 0; //�ؽ�Ʈ�� �ٽ� 0��°���� 
			}
		}//while
		
		if(pp == pat.length()) { //������ Ŀ���� ������ ���̱��� ���ٸ� �˻��� ������ ����.
			return pt - pp;
		}
		
		return -1; //�˻� ����
		
	}//bfMatch
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ؽ�Ʈ : ");
		String txt = sc.nextLine();
		System.out.print("���� : ");
		String pat = sc.nextLine();
		
		int idx = bfMatch(txt, pat);
		
		if(idx == -1) { //�˻� ������ ���
			System.out.println("�ؽ�Ʈ�� ������ �����ϴ�.");
		}else {
			//��ġ�ϴ� ���� �ٷ� �ձ����� ���̸� ���Ѵ�. 
			int len = 0; 
			for(int i=0; i<idx; i++) {
				len += txt.substring(i, i+1).getBytes().length;
			}
			len += pat.length(); 
			
			System.out.println((idx+1) + "��° ���ں��� ��ġ�մϴ�.");
			System.out.println("�ؽ�Ʈ : " + txt);
			System.out.printf(String.format("���� : %%%ds\n", len), pat);
		}
		
	}

}
