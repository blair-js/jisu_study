package com.programmers;

public class P0506_8 {
	//���ڿ� ������������ ��ġ�ϱ�
	
	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		//�� Ǯ��
		char[] sArr = s.toCharArray(); //���ڿ� s�� toCharArray �޼ҵ带 ����Ͽ� �ϳ��� char Ÿ���� ���ڷ� �迭�� ����
		
		for(int i=1; i<s.length(); i++) { //�� ��ü 1����
			for(int j=0; j<i; j++) { //�� ��� i������ �˻�
				if(sArr[i] > sArr[j]) { //i�� j���� �ڿ��ִ� ��Ȳ�̰�, i�� j���� ũ�� �������� �����־�� �ϹǷ� ���� ��ġ ��ȯ
					char tmp = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = tmp;
				}
			}
		}//for
		
		StringBuilder sb = new StringBuilder(); //��ȯ�� ���ڿ��� ��ȯ�� ��� ����
		for(char c : sArr) { //������ ������������ ��ġ�� �����ĵ� �迭 sArr�� ���� 
			sb.append(String.valueOf(c)); //sb�� �߰��Ѵ�. �ϳ���. �״�� ����ȯ ���־�� �߰� ����.
		}
		
		System.out.println(sb);
		
	}

}
