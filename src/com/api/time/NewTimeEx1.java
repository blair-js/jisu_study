package com.api.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class NewTimeEx1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now(); //오늘의 날짜 2022-02-08
		LocalTime now = LocalTime.now(); //현재 시간 10:43:27.381763300 =
		System.out.println(today);
		System.out.println(now);
		System.out.println("======================================");

		//내가 원하는 값으로 셋팅하기
		LocalDate birthDate = LocalDate.of(1992, 9, 3); //1992-09-03
		LocalTime birthTime1 = LocalTime.of(8, 30); //08:30
		LocalTime birthTime2 = LocalTime.of(23, 59, 59); //23:59:59
		System.out.println(birthDate);
		System.out.println(birthTime1);
		System.out.println(birthTime2);
		System.out.println("======================================");

		//값 바꿔보기
		System.out.println(birthDate.withYear(2000)); //년도만 2000으로 바꿈
		System.out.println(birthDate.plusDays(1)); //일 1 더함
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS)); //일 1 더하는 다른 방법 (더할 수, 단위)
		System.out.println(birthTime2.truncatedTo(ChronoUnit.HOURS)); //시(hour)보다 작은 단위를 0 으로 23:59:59 => 23:00 으로 변경됨
		System.out.println(birthTime2.truncatedTo(ChronoUnit.MINUTES)); //분(minute)보다 작은 단위를 0 으로 23:59:59 => 23:59 으로 변경됨
		System.out.println("======================================");
		
		//ChronoField 의 범위 알아보기
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range()); //하루의 시간 범위 => 1 - 24 (자정을 24시로 표현)
		System.out.println(ChronoField.CLOCK_HOUR_OF_AMPM.range()); //AM/PM의 시간 범위 => 1 - 12
		System.out.println(ChronoField.HOUR_OF_DAY.range()); //하루의 시간 범위 => 0 - 23 (자정을 0시로 표현)
		System.out.println(ChronoField.HOUR_OF_AMPM.range());  //AM/PM의 시간 범위 => 0 - 11
		
	}

}
