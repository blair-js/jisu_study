package com.programmers;

public class P0506_2 {
	//���� ��ȣ
	
	public static void main(String[] args) {
		
		//ex : ���� 'A'�� 1��ŭ �и� 'B'�� �Ǿ�� �Ѵ�. 
		//char ch = 'A';
		//int n = 1; 
		
		//1.���� 'A'�� int Ÿ������ ����ȯ�ϸ� 65�� �ȴ�.
		//2.65�� �а��� �ϴ� ��(n)��ŭ �����ش�. +1�� �����ָ� 66�� �ȴ�.
		//3.66�� char Ÿ������ ����ȯ ���ָ� 'B'�� �ȴ�. 
		//char newCh = (char)((int)ch+n);
		//System.out.println(newCh);
		
		//������ �������� �����ϰ� �ִ� ���� ��ȯ�ϰ��� �ϴ� ���� 
		//charŸ���� �ƴ� String Ÿ���� ���ڿ��� ���õǰ� �ֱ� ������
		//���ڿ��� �� �ڸ����� ���ڸ� ���� ���� �� �ٽ� �ϳ��� ���ڿ��� ���������Ѵ�. 
		
		String s = "a B Xy"; //��ȯ�� ���ڿ�
		char[] cArr = s.toCharArray(); //String Ŭ������ toCharArray �޼ҵ� ��� => ���ڿ��� �ϳ��� �迭�� ��´�.(ex. "ABCDE" => ['A', 'B', ...])
		int n = 4; //�а��� �ϴ� ��
		
		StringBuilder sb = new StringBuilder(); //���� ��ȯ�� ��� ���ڿ� 
		
		//�迭 ũ�⸸ŭ �ݺ� 
		for(int i=0; i<cArr.length; i++) {
			char newCh = ' '; //�Ʒ� if~else���� Ÿ�� ������ ���ĺ��� �ƴ� �����(��, ������ ��� ���� �״�� ���ڿ� sb�� �߰��� ����)
			
			if(cArr[i] >= 'a' && cArr[i] <= 'z') { //���� i��°�� �迭 ��Ұ� �ҹ��ڶ��
				newCh = (char)(cArr[i] + n); //n��ŭ �̷��(���ϱ�)
				
				//**�ٵ� newCh�� ���ĺ��� ������ �ʰ�(z�� �ʰ��ϸ�) 26��ŭ ���ش�.
				//ex)cArr[i]�� 'X', n�� 4��� �����ϸ� newCh�� '\'�� �ȴ�.  
				//���� ������� 'B'�� ���;��Ѵ�.(�������� Z+1�� A��� ��Ʈ�� �־���)
				//�׷��� '\'�� 'B'�� ���̸� Ȯ���ϸ� 92-66=26�̴�. �׷��� 26��ŭ ���־�� �ϴ� ����.
				if(newCh > 'z') newCh-=26; 
				
			}else if(cArr[i] >= 'A' && cArr[i] <= 'Z') { //���� i��°�� �迭 ��Ұ� �빮�ڶ��
				newCh = (char)(cArr[i] + n);
				if(newCh > 'Z') newCh-=26; 
			}
			sb.append(newCh); //��� ���ڿ��� ��ȯ�� ���� �߰�
		}
		
		System.out.println(sb);
		
	}

}
