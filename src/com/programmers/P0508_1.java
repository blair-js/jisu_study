package com.programmers;

public class P0508_1 {
	//���ڿ� �� p�� y�� ����
	
	public static void main(String[] args) {

		String s = "pPoooyY";
		int[] sArr = new int[2]; //p�� y�� ������ üũ�� �迭 ����(�⺻�� 0) => 0��°�� p��, 1��°�� y�� ��´�. 
		
		for(int i=0; i<s.length(); i++) {
			String str = String.valueOf(s.charAt(i)); //���ڿ����� i��°�� ����(����Ǹ� char Ÿ���̹Ƿ� ����ȯ�ʼ�)
			if(str.equalsIgnoreCase("p")) { //��ҹ��� ���� ���� p���
				sArr[0]++;
			}else if(str.equalsIgnoreCase("y")) { //��ҹ��� ���� ���� y���
				sArr[1]++;
			}else {
				continue; //������ ���ܾ�� pass
			}
		}//for
		
		System.out.println(sArr[0] == sArr[1] ? true : false); //�� �迭�� ���� ������ true return
		
	}

}
