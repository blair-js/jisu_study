package com.programmers;

public class P0511_1 {
	//[1��] ��Ʈ ����
	
	public static void main(String[] args) {
		
		String dartResult =  "1S*2T*3S";
		
		//3���� ������ ��ȯ�� ��� ����
		int result = 0; 
		
		String str = ""; //���ڿ����� ���ڸ� ������ ����
		int[] arr = new int[3]; //3���� ������ ������ �迭
		int idx = 0; //�迭 �ε���
		
		//���ڿ��� �����ϴ� ���ڵ� Ȯ��
		for(int i=0; i<dartResult.length(); i++) {
			//���ڿ��� �� i��° ���ڿ� ���� ó�� 
			switch(dartResult.charAt(i)) {
			//�ش� ���ڰ� '*'�� ���� �ڽŰ� ������ ���� *2 ���ֱ�. 
			//(��, �ش� ���ڰ� 1��°�� ������ ������ ���� ������, 1��°�� ���� �ƴ� ��츦 ���� �ɾ��ֱ�)
			//arr 0��°���� ���ʷ� ���� �־��ٰ�. 
			//ex.���ڿ��� 1S*2T*3S �� ��� 2��° ���ڿ��� *�� �������� 1��1�� *2�� ���ְ�
			//5��° ���ڿ����� *�� �������� ���� (1��1��*2)�� *2�� ���ְ� + 2��3�¿� *2�� ���ش�. 
			case '*' : 
				arr[idx-1]*=2;
				if(idx>1) arr[idx-2]*=2;
				break;
			//�ش� ���ڰ� '#'�� ��� �ڽ��� ������ ������ �����.
			case '#' : 
				arr[idx-1]*=-1;
				break;
			//S�� 1����, ���� ������ ���� idx�� ������Ű�� ������ �����ϴ� str�� �ʱ�ȭ
			case 'S' : 
				arr[idx] = (int)Math.pow(Integer.parseInt(str), 1);
				str = "";
				idx++;
				break;
			//D�� 2����, ���� ������ ���� idx�� ������Ű�� ������ �����ϴ� str�� �ʱ�ȭ
			case 'D' : 
				arr[idx] = (int)Math.pow(Integer.parseInt(str), 2);
				str = "";
				idx++;
				break;
			//T�� 3����, ���� ������ ���� idx�� ������Ű�� ������ �����ϴ� str�� �ʱ�ȭ
			case 'T' : 
				arr[idx] = (int)Math.pow(Integer.parseInt(str), 3);
				str = "";
				idx++;
				break;
			//�� case���� ������ �ʴ� �������� str ������ ����
			//ex.2S ���� 2�� str�� ���� ���̴�.
			default : 
				str += String.valueOf(dartResult.charAt(i));
				break;
			}//switch
		}//for
		
		//�� ������ ���� ���� 3���� ������ ��� ���ϱ�
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		
		System.out.println(result);
	}

}
