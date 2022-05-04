package com.programmers;

public class P0504_2 {
	//���� ������������ ��ġ�ϱ�

	public static void main(String[] args) {

		int n = 118372;
		int[] arr = new int[(n + "").length()]; //n�� ���̸� ���ϱ� ���� ���ڿ��� ��ȯ(+"") �� �̱�
		
		arr[0] = n/(int)Math.pow(10, (arr.length-1)); //�� ���ڸ� ���ڸ� 0��°�� ���� ��Ƶα�
		
		for(int i=1; i<arr.length; i++) { //0��°�� ������ 1��° ���� �ݺ�
			
			arr[i] = n%10; //n�� 10���� ���� �������� �迭 i��°�� �ϴ� ���� => ����ü
			
			for(int j=0; j<i; j++) { //�񱳴���
				if(arr[j] < arr[i]) { //j��°�� i��°���� ������ ü����(���������̹Ƿ�)
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			
			n/=10; //n�� 10���� ������. ex) n�� ��ȭ 118372 -> 11837 -> 1183....
			
		}//for
		
		String str = ""; //���������� ������������ ��� �迭�� ���ڿ��� �����ϱ� ���� ����
		for(int i : arr) {
			str += String.valueOf(i);
		}
		
		System.out.println(str); //873211
		
		
	}

}
