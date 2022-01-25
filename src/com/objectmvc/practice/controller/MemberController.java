package com.objectmvc.practice.controller;

import com.objectmvc.practice.vo.Member;

public class MemberController {

	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	
	public MemberController() {	}

	public int login(String id, String pwd) {
		
		// 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때
		if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1; // 모두 같으면 1을 리턴
		}
		
		return 0; // 아니면 0을 리턴

	}
	
	public Member readInfo() {
	
		return mem; 
		
	}
	
	public int readAge() {
		
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		//HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴
		
		int year = Integer.parseInt(mem.getCitizenNo().substring(0, 2)) + 1900;
		int age = 2022 - year + 1;
		
		return age;
		
	}
	
	public void updateHeight(double height) {
		
		mem.setHeight(height);
		
	}

}
