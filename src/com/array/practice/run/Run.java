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
		
		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		for(int x=0; x<20; x++) {
			int i = (int)(Math.random() * ballArr.length); 
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j]; 
			ballArr[j] = tmp; 
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		*/
		
		/*
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money=" + money);
		
		for(int i=0;i<coinUnit.length;i++) {
		/*(1) 알맞은 코드를 넣어 완성하시오. */
		/*
			int coinCnt = money / coinUnit[i]; //어짜피 coinUnit 배열이 내림차순이 되어있어서 정렬을 해줄필요는 없고, 순서대로 나눠주면 됨
			money %= coinUnit[i]; //나누고 난 나머지를 money에 초기화 => 나머지 값으로 그 다음 동전을 또 나누고 ....
			System.out.println(coinUnit[i] + "원 : " + coinCnt); //해당동전, 나눴을때 몫(이게 사용된 갯수가 되는 것) 
		}*/
		
		
		/*int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			/* (1) 알맞은 코드를 넣어 완성하시오. */
		/*}
		for(int i=0; i < counter.length;i++) {
			/*
			 (2) 알맞은 코드를 넣어 완성하시오. */
			/*System.out.println();
		}*/
	
		//int[] arr = new int[9];
		/*for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random() *100 + 1); //1부터 100까지 난수 발생 
			for(int j=0; j<i; j++) {
				if(ran == arr[j]) { //비교대상중에 현재 ran과 같으면 안되니까 
					i--; 
					continue;
				}else {
					arr[i] = ran;
				}
			}//for
		}//for
		
		System.out.println("배열의 요소");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}*/
		
		/*int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61}; 
		
		int max = arr[0]; //초기값을 배열 0번째 인덱스로 설정하고, 그 수를 최대값으로 한다
		int idx = 0; //배열 0번째를 제외한 1번째부터 검사할 것임  
		
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
