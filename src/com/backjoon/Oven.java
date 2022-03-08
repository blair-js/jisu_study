package com.backjoon;

import java.util.Scanner;

public class Oven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt(); 
		int cook = sc.nextInt();
		
		int totalMinute = (hour * 60) + minute; 
		int afterCook = totalMinute + cook; 
		
		int newHour = afterCook/60; 
		int newMinute = afterCook%60; 
		
		int tmp; 
		if(newHour > 23) {
			tmp = newHour-24; 
			newHour = tmp; 
		}
		System.out.print(newHour + " ");
		System.out.print(newMinute);
	}

}
