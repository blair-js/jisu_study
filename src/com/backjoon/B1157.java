package com.backjoon;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //���ڿ� �Է¹ޱ�
		
		//���ڿ��� �����ϴ� ������ ������ �־��� �迭 ����
		//26���� ������? �������� ���ĺ��� ��/�ҹ��� ���о��� �����شٰ� �߱� ����. ���ĺ��� �� 26���̴�.
		//arr[0]���� ���ʴ�� a,b,c....z �� ���� �����̶�� �����ϸ� �ȴ�.
		int[] arr = new int[26];
		
		//�Է¹��� ���ڿ��� ���̸�ŭ �ݺ��� ���� �ѱ��� �ѱ��� Ȯ���Ѵ�.
		for(int i=0; i<str.length(); i++) {
			
			//str�� i��° ���ڿ� ���� ������ ������ �迭 arr�� ���� ���� �������Ѿ� �Ѵ�. 
			//������� i��° ���ڰ� a��A��� arr[0]�� ���� ������Ű��, d��D��� arr[3]�� ���� ������Ų��. 
			//�� ��, �ش� ���ڿ� ���� ��� �迭 arr�� �ε��� ��ġ�� ã�ư���? 
			//�����غ��� a��A�� arr[0]�� �ִ´ٴ°� �츮�� �����������̴�.
			//����� �ش� ���ڿ� �츮�� ������ �ε����� ��ġ�� ��Ģ�� ã���� �ȴ�. 
			//�ƽ�Ű �ڵ�� �������� �����غ��� �Ʒ��� ��Ģ�� �߰��� �� �ִ�. 
			//�ҹ��� => a�� �ƽ�Ű �ڵ�� 97�̴�. �׷� 97�� ���ָ� 0�̵ȴ�. b�� �ƽ�Ű�ڵ�� 98�̴�. �׷� 97�� ���� 1�� �ȴ�. 
			//�빮�� => A�� �ƽ�Ű �ڵ�� 65�̴�. �׷� 65�� ���ָ� 0�̵ȴ�. B�� �ƽ�Ű�ڵ�� 66�̴�. �׷� 65�� ���� 1�� �ȴ�. 
			
			//���ڿ��� ���ں� ������ Ȯ���Ͽ� �迭�� ��� ����
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) { //���ڿ� str�� i��° ���ڰ� �빮�ڶ��(65�̻� 90����)
				arr[str.charAt(i)-65]++;
			}else { //���ڿ� str�� i��° ���ڰ� �빮�ڰ� �ƴ϶��(�ҹ��ڶ��)
				arr[str.charAt(i)-97]++;
			}
		}//for
			
		//���ڿ��� ������ ���� ���� ������ �����ִ� ���ڸ� ã�� ���� 
		int max = -1; //�ִ밪�� ���ϱ� ���� ���� ����
		char ch = '?'; //����� ���� ����
		
		//�迭 arr�� ��� ���� �ݺ��� ���� �ִ밪 ã�� 
		for(int i=0; i<26; i++) {
			//i��° ���Ұ� max���� ũ�� �ش� i��° ���Ұ��� max�� �����ϰ�
			//�ش� i��° ���ڸ� ch�� �������ش�.
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65); //�빮�ڷ� ����� ���־�� �ϹǷ� 65�� �����ش�. (�ҹ��ڷ� ����϶�� �ߴٸ� 97�� �����ָ� ��)
			}else if(arr[i] == max) { //�ٵ� ���� �ִ밪�� ���� i��°�� ���� ���ٸ� ch�� ����ǥ(?)�� ����
				ch = '?';
			}
		}//for
		
		System.out.println(ch); //���������� ch ���
		
	}

}