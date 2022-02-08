package com.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class NewTimeEx2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2015, 12, 31);
		LocalTime time = LocalTime.of(12, 34, 56);
		System.out.println(date); //2015-12-31
		System.out.println(time); //12:34:56
		
		//위에서 생성한 객체 date, time을 매개변수로 넣어
		//dt 객체 생성
		LocalDateTime dt = LocalDateTime.of(date, time);
		System.out.println(dt); //12:34:56
		System.out.println("======================================");
		
		ZoneId zid = ZoneId.of("Asia/Seoul"); //구역을 표현하는 ZoneId
		System.out.println(zid); //Asia/Seoul
		ZonedDateTime zdt = ZonedDateTime.of(dt, zid); //위에서 생성한 객체 dt, zid을 매개변수로 넣어
		System.out.println(zdt); //2015-12-31T12:34:56+09:00[Asia/Seoul]
		String strZid = zdt.getZone().getId(); //zdt.getZone() => ZoneId 타입으로 반환 => getId를 이용해서 값 얻기 
		System.out.println(strZid); //Asia/Seoul
		System.out.println("======================================");

		ZonedDateTime seoulTime = ZonedDateTime.now(); 
		System.out.println(seoulTime); //서울의 현재 시간 => 2022-02-08T11:39:11.545431600+09:00[Asia/Seoul]
		ZoneId nyId = ZoneId.of("America/New_York"); //아이디는 America/New_York
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(nyTime); //뉴욕의 현재 시간 => 2022-02-07T21:43:31.876764-05:00[America/New_York]
		System.out.println("======================================");

		//ZonedDateTime -> OffsetDateTime
		OffsetDateTime odt = zdt.toOffsetDateTime();
		System.out.println(odt); //2015-12-31T12:34:56+09:00
		
		LocalDate date1 = LocalDate.of(1,1,1);
		LocalDate date2 = LocalDate.of(2022,2,7);
		Period pe = Period.between(date1, date2);
		long days = pe.get(ChronoUnit.DAYS);
		System.out.println(days);
	
		
	}

}
