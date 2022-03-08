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
		
		if(hour == 0) { //�Է��� �ð��� �ð� ����(0)�� ��
			if(minute < 45) {
				tmp = 45 - minute; 
				newHour = 23;
				newMinute = 60-tmp;
			}else {
				newHour = hour; 
				newMinute = minute-45;
			}
		}else { //�Է��� �ð��� �ð� ����(0)�� �ƴ� �� 
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
