package com.api.homework.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {

	public SetDate() {	}
	
	public String todayPrint() {
		
		//오늘의 년, 월, 일, 시, 분, 초를 각 변수에 담은 후 오늘을 String으로 리턴
		
		Date d = new Date();
		//SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); //HH => 21시 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //hh => 09시
		String today = sd.format(d);
		
		return today; 
		
	}

	public String setDay() {
		
		//“2011년 3월 21일 월요일”을 세팅하여 출력
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

		Date d = new Date(2011-1900, 3-1, 21);
		String today = sd.format(d);

		//Calendar cal = Calendar.getInstance();
		//cal.set(2011, 3-1, 21);
		//String today = String.valueOf(cal.YEAR); => 실패^^^^^^^^^^^^
		
		return today; 
		
	}
	
}
