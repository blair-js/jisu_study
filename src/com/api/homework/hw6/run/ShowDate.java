package com.api.homework.hw6.run;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.api.homework.hw6.DateCalculator;

public class ShowDate {

	public static void main(String[] args) {

		DateCalculator dc = new DateCalculator();
		// CalendarŬ������ �̿��Ѵ�.
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date()); //���� ��¥ �־ set 
		
		int curYear = cal.get(GregorianCalendar.YEAR); //����⵵
		
		// ������� �������� isLeapYear()�� ���ؼ� ����Ѵ�.
		boolean b = dc.isLeapYear(curYear);
		System.out.println(b ? "�����Դϴ�." : "����Դϴ�.");
		
		// ���� ������ ����� leapDate()�� �� ��¥ ���� ����Ѵ�.
		long days = dc.leapDate();
		System.out.println("�� ��¥ �� : " + days); 
		
	}

}
