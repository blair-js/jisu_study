package com.backjoon;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt(); 
	
		int newHour;
		int newMinute;
		int tmp; 
		
		if(hour == 0) { //입력한 시간의 시가 자정(0)일 때
			if(minute < 45) {
				tmp = 45 - minute; 
				newHour = 23;
				newMinute = 60-tmp;
			}else {
				newHour = hour; 
				newMinute = minute-45;
			}
		}else { //입력한 시간의 시가 자정(0)이 아닐 때 
			if(minute < 45) {
				tmp = 45 - minute; 
				newHour = hour-1; 
				newMinute = 60-tmp;
			}else{
				newHour = hour; 
				newMinute = minute-45;
			}
		}
		System.out.print(newHour + " ");
		System.out.print(newMinute);
	}

}
