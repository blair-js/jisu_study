package com.exception.controller;

import com.exception.model.vo.Guests;
import com.exception.model.vo.RollerCoaster;

public class RideController {

	// 매개변수 생성자를 이용하여 4명의 객체 초기화
	Guests[] gs = {
					new Guests("홍길동", 17, 'M', 120.2),
					new Guests("유관순", 20, 'F', 102.3),
					new Guests("김유신", 23, 'M', 110.4),
					new Guests("김흥부", 21, 'M', 112.5)
	};
	
	// 놀이기구 허용 인원수 크기의 객체 배열 생성
	Guests[] onboard = new Guests[RollerCoaster.PERMITNUMBER];
	
	public RideController() {	}
	
	public void cutGuests() {
	
		// 4명의 탑승 대기자를 생성자를 통한 Guest객체 배열 초기화 (Guests[] gs) => 위에서 함 
		// RollerCoaster 클래스의 허용인원 상수값 크기의 또 다른 객체 배열 생성 => 위에서 함 
		
		
		
		int onIdx = 0; //onBoard 배열의 인덱스로 사용할 변수임
		
		try {
			for(int i=0; i<gs.length; i++) {
				// for문과 if문을 통해 RollerCoaster 클래스의 허용키 상수값 크기
				// 이상인 사람을 Guests객체 배열 onBoard에 담는다.
				if(gs[i].getHeight() >= RollerCoaster.CUTHEIGHT) {
					onboard[onIdx++] = gs[i]; 
				}//if
			}//for
		}catch(ArrayIndexOutOfBoundsException e) {
			// 배열 크기를 넘어가면 발생되는 예외클래스 참조형 변수 e
			//onboard 배열의 크기는 2 인데 두명 이상 넣으려고 하면 에러가 발생함
			
			// 문제가 발생한 해당 배열의 인덱스 번호가 몇번에서 발생하는지
			// Throwable클래스의 getMessage()메소드를 통해 출력
			String msg = e.getMessage(); //오류 메시지를 얻어옴 
			//System.out.println(msg); //찍어보면 Index 2 out of bounds for length 2 라고 나옴(문제되는 인덱스가 메시지의 마지막에 나옴)
			char last = msg.charAt(msg.length()-1); //문자 길이의 마지막 번째를 뽑겠음
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " + last);
			
		}finally {
			// "인원이 가득 찼습니다. 다음 차례를 기다리세요"
			// "이번 차례 탑승 명단"
			// 탑승자 각각의 이름, 키를 출력하고 두 탑승자의 요금합계를 출력 하시오
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요"); 
			System.out.println("이번 차례 탑승 명단");
			for(Guests g : onboard) {
					System.out.println(g.toString());
			}
			System.out.println("탑승자 요금 : " + RollerCoaster.PRICE * onboard.length);
		}
		
	}
	
}
