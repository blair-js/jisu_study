package com.programmers;

public class P0513_1 {
	//��� ���� ��������
	
	public static void main(String[] args) {
		
		String s = "abcde";
		String answer = "";
		
		//���� Ǯ��_1
		/*if(s.length()%2 == 0) { //���� ���̰� ¦���̸� ��� 2�� ���� 
			
			//ex. s�� "qwer"�� ��� -> 1��° w, 2��° e ���� -> we
			//	  s�� "abcdef"�� ��� -> 2��° c, 3��° d ���� -> cd
			//��, ����Ǵ� ���� 2���� ���ڿ��� ���̸� 2�� ���� ��ġ�� �� ���� ��ġ�� ��ȯ���ָ� �ȴ�.
			//���ڿ��� ���̰� 4�ΰ�� 4%2�� 2��° �ε���, 4%2-1�� 1��° �ε����� �����Ѵٴ� �ǹ��̴�.
			char ch1 = s.charAt(s.length()/2 -1);
			char ch2 = s.charAt(s.length()/2);
			answer = "" + ch1 + ch2;
		}else {//���� ���̰� Ȧ���̸� ����� 1�� ����
			answer = "" + s.charAt(s.length()/2);
		}
		
		System.out.println(answer);*/
		
		//���� Ǯ��_2 : substring() ���
		//*���� : �̰��� �ϴ� ��� ���ڿ��� �����ε����� �����ε����� �����Ͽ��µ�, 
		//subString�� ���� �ε����� ��ġ�� �������� �ʰ� �������ֱ� ������ +1�� ���־�� ���ϴ� ��ġ���� ���� �� �ִ�.
		int startIdx;
		int endIdx; 
		
		if(s.length()%2 == 0) {
			startIdx = (s.length()/2)-1;
			endIdx = s.length()/2;
			answer = s.substring(startIdx, endIdx+1);
		}else {
			startIdx = s.length()/2;
			answer = s.substring(startIdx, startIdx+1);
		}
		
		System.out.println(answer);
	}

}
