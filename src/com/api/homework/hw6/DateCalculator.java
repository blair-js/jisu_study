package com.api.homework.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {

	public DateCalculator() {	}
	
	public long leapDate() {
		
		//1년 1월 1일부터 오늘까지의 총 날 수를 계산
		//1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을, 평년이면 365일을 더함
		//해당 현재 연도가 윤년이면 2월을 29일로 평년이면 28일로 더함
		//월의 날짜 수를 더함
		//(31일: 1, 3, 5, 7, 8, 10, 12월/
		//30일: 4, 6, 9, 11월)
		
		//Calendar 클래스 이용 
		//기준(1년1월1일)
		//GregorianCalendar 클래스는 Calendar 클래스를 상속받았으므로, GregorianCalendar 로 생성된 객체를 부모 클래스인 Calendar 클래스가 받아줌. 
		//그래서 Calendar의 메소드 getTimeInMillis 도 사용가능 => 밑에서 사용할 예정 
		Calendar base = new GregorianCalendar(1, 1, 1); 
		
		//현재날짜
 		Calendar today = new GregorianCalendar(); //GregorianCalendar 클래스는 매개변수 없이 생성시 현재의 날짜가 자동으로 들어감!
		
 		//getTimeInMillis 메소드는 Calender 클래스에 있으며 1000분의 1초 까지 체크해줌 => 반환형은 long 타입
 		long diffSec = (today.getTimeInMillis() - base.getTimeInMillis())/1000; 
 		//두 날짜의 차이를 1000으로 나눔 => 왜냐면 초로 나오니까(난 일 수가 궁금)
 		
 		long diffDay = diffSec/86400; //86400은 하루의 총 초 임 (24시간*60분*60초 = 86400초) => 일수를 구하고 싶으니 나눔! (22행에서 1000으로 나눈것처럼)
 		
		return diffDay;
		
	}
	
	public boolean isLeapYear(int year) {
		
		//연도가 윤년이면 true, 평년이면 false 리턴
		//(윤년: 연도가 4의 배수이면서,100의 배수가 아니거나 400의 배수가 되는 해)
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
