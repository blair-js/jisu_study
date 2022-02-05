package com.api.practice.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Run {

	public static void main(String[] args) {

		/*
		 * 1. Date (java.util 패키지)
		 * - Date는 날짜를 다루기 위해 제공되는 클래스
		 * - 자바개발 초기에 급하게 만들어서 완성도도 낮고, 다국적으로 쓰기도 적합하지 않음
		 * - 1970년 1월 1일 0시 0분 0초를 기준으로 milliseconds 단위로 계산함
		 * - Date는 내부적으로 년도는 +1900, 월은 +1을 자동으로 해줌. => 아래 예시 볼것, 근데 값을 얻어올때는 또 자동으로 되지 않음...이상하군^^
		 */
		
		// 현재 시각(Date 기본 생성) : 컴퓨터의 시간
		Date today = new Date();
		System.out.println(today);
		
		// 내가 원하는 날짜(Date의 매개변수 있는 생성자)
		Date today1 = new Date(120, 0, 28);	// 2020.01.28 -> (120+1900, 0+1, 28)
		System.out.println(today1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(sdf.format(today1));
		
		// 시각에 대해 원하는 값 뽑아 보기
		System.out.println("시간 : " + today.getTime());
		System.out.println("날짜 : " + today.getDate());
		System.out.println("요일 : " + today.getDay());
		System.out.println("시 : " + today.getHours());
		System.out.println("분 : " + today.getMinutes());
		System.out.println("달 : " + (today.getMonth() + 1));	// 주의
		System.out.println("초 : " + today.getSeconds());
		System.out.println("년 : " + (today.getYear() + 1900));	// 주의
		
		String curTime = new SimpleDateFormat("yyyy MM dd HH mm ss").format(new Date());
		System.out.println(curTime);
		
		
		System.out.println("------------ 캘린더 -------------");
		// 2. Calendar
		// - 내부적으로 월만 +1 자동 (년도는 직접입력)
		//   ex) 20라고 적으면 그냥 20년도로 인식, 2020로 입력해야 될 때는 2020을 입력
		// - TimeZone 기능 제공
		// - filed number 개념 도입(메소드 명을 같이 쓰기 위함)
		
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(2020, 1, 28);
		System.out.println(calendar.get(GregorianCalendar.DATE));
		System.out.println(calendar.getTime());
		
		
		System.out.println("------------ 그레고리안 캘린더 -------------");
		// 윤년이란? 년도가(4의 배수이면서, 100의 배수가 아니거나)
		//              (400의 배수가)가 되는 해가 윤년(1년을 366일로 계산(=2월이 29일인 해))
		
		// 율리우스력의 근소한 오차 값을 수정한 그레고리력
		// (1년을 365 1/4일(365.2422일))
		// 1) 그 해의 연도가 4의 배수가 아니면 평년으로 2월은 28일만 있다.
		// 2) 만약 연도가 4의 배수면서 100의 배수가 아니면 윤일(2월 29일)을 도입한다.
		// 3) 만약 연도가 100의 배수이면서 400의 배수가 아닐 때 이 해는 평년으로 생각한다.
		// 4) 만약 연도가 400의 배수면 윤일(2월 29일)을 도입한다.
		
		// 2)의 예
		// 2008년 (윤년, 366일)
		
		// 3)의 예
		// 2300년 (평년, 365일)
		
		// 4)의 예
		// 2400년 (윤년, 366일)
		
		
	}

}
