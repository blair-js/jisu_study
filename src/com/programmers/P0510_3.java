package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class P0510_3 {
	//���� ���ڴ� �Ⱦ�
	
	public static void main(String[] args) {
	
		//�� Ǯ�� : ��ȯ���� ArrayList<Integer>�� ��
		int[] arr = {1, 1, 3, 3, 0, 1, 1}; 
		/*ArrayList<Integer> list = new ArrayList<Integer>(); //��ȯ�� ��� 
		
		list.add(arr[0]); //0��°�� ������ �߰�
		
		for(int i=1; i<arr.length; i++) { //1��°���� �˻�
			if(arr[i] == arr[i-1]) continue; //i��°�� i�� �ٷ� �չ�°�� ��ġ�� ��� pass
			list.add(arr[i]); //���� if���� �ɸ��� ������(�ٷ� �չ�°�� ��ġ���� ���� ���) list�� �߰�
		}//for
		
		//Ȯ��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		
		//�ٸ� Ǯ�� : ��ȯ���� int[]�� ��
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		//���ϰ��� �ϴ� ���� ���ڸ� preNum�� ����
		//�迭 arr�� 0��° ���� ����
		int preNum = arr[0]; 
		list.add(arr[0]); //0��°�� ������ �߰��ؾ� �ϹǷ� list�� �ٷ� �߰�
		for(int num : arr) {
			if(preNum != num) { //���� ���� ���� 
				list.add(num); //list�� �߰��ϱ�
			}
			preNum = num; //�� ���� ���� preNum�� �ݺ��� ���� ��� update �ϴ� ���
		}
		
		//list�� ����ִ� ũ�� ��ŭ �迭 ũ�� ����
		int[] answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++) {
			//intValue() : ���� int������ �ٲ��ִ� �����̴�. 
			//���� list�� ����ִ� ��ҵ��� Integer�̱� ������ ��Ȯ�ϰԴ� int�� �ٲ��־�� ��.
			answer[i] = list.get(i).intValue();
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
