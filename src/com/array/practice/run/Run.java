package com.array.practice.run;

import java.util.Arrays;

import com.array.practice.example.ArrayPractice;

public class Run {

	public static void main(String[] args) {

		ArrayPractice ap = new ArrayPractice();
		//ap.practice1();
		//ap.practice2();
		//ap.practice3();
		//ap.practice4();
		//ap.practice5();
		//ap.practice6();
		//ap.practice7();
		//ap.practice8();
		//ap.practice9();
		//ap.practice10();
		//ap.practice11();
		//ap.practice12();
		//ap.practice13();
		//ap.practice14();
		
		/*
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// �迭 ballArr�� ������ ��� 2���� ��� ��ġ�� �ٲ۴�. 20�� �ݺ�
		for(int x=0; x<20; x++) {
			int i = (int)(Math.random() * ballArr.length); 
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j]; 
			ballArr[j] = tmp; 
		}
		
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		*/
		
		/*
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i=0;i<coinUnit.length;i++) {
		/*(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. */
		/*
			int coinCnt = money / coinUnit[i]; //��¥�� coinUnit �迭�� ���������� �Ǿ��־ ������ �����ʿ�� ����, ������� �����ָ� ��
			money %= coinUnit[i]; //������ �� �������� money�� �ʱ�ȭ => ������ ������ �� ���� ������ �� ������ ....
			System.out.println(coinUnit[i] + "�� : " + coinCnt); //�ش絿��, �������� ��(�̰� ���� ������ �Ǵ� ��) 
		}*/
		
		
		/*int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			/* (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. */
		/*}
		for(int i=0; i < counter.length;i++) {
			/*
			 (2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. */
			/*System.out.println();
		}*/
	
		//int[] arr = new int[9];
		/*for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random() *100 + 1); //1���� 100���� ���� �߻� 
			for(int j=0; j<i; j++) {
				if(ran == arr[j]) { //�񱳴���߿� ���� ran�� ������ �ȵǴϱ� 
					i--; 
					continue;
				}else {
					arr[i] = ran;
				}
			}//for
		}//for
		
		System.out.println("�迭�� ���");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		
		/*int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61}; 
		
		int max = arr[0]; //�ʱⰪ�� �迭 0��° �ε����� �����ϰ�, �� ���� �ִ밪���� �Ѵ�
		int idx = 0; //�迭 0��°�� ������ 1��°���� �˻��� ����  
		
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i]; 
				idx = i;
			}
		}//for
		
		System.out.println(max);
		System.out.println(idx+1);*/
		
	}

}
