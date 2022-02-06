package com.api.homework.hw6.run;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.api.homework.hw6.DateCalculator;

public class ShowDate {

	public static void main(String[] args) {

		DateCalculator dc = new DateCalculator();
		// Calendar클래스를 이용한다.
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date()); //현재 날짜 넣어서 set 
		
		int curYear = cal.get(GregorianCalendar.YEAR); //현재년도
		
		// 평년인지 윤년인지 isLeapYear()를 통해서 출력한다.
		boolean b = dc.isLeapYear(curYear);
		System.out.println(b ? "윤년입니다." : "평년입니다.");
		
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다.
		long days = dc.leapDate();
		System.out.println("총 날짜 수 : " + days); 
		
	}

}
