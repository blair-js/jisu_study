package com.objectmvc.practice.view;

import java.util.Scanner;

import com.objectmvc.practice.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberView() {	}
	
	public void mainMenu() {
		
		System.out.print("아이디를 입력하시오 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하시오 : ");
		String pwd = sc.nextLine();
		// 입력받은 아이디, 비밀번호 값을
		
		// MemberController 클래스의 login 메소드에 전달하고
		int result = mc.login(id, pwd);
		// 그 결과값을 result변수에 받는다.
		
		if(result == 1) {
			while(true) {
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1.내 정보 보기");
				System.out.println("2. 내 나이 조회하기 ");
				System.out.println("3. 키 수정하기  ");
				System.out.println("9. 프로그램 종료하기");
				System.out.print("메뉴 번호 선택 : ");
				int menu = sc.nextInt();
				
				switch(menu) {
				case 1: 
					System.out.println(mc.readInfo().information()); // MemberController의 readInfo() 호출
					break;
				case 2: 
					System.out.println(mc.readAge() + "세"); // MemberController의 readAge() 호출
					break;
				case 3: 
					updateHeight(); // "MemberView"의 updateHeight() 호출
					break;
				case 9: 
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}//while
		}else {
			return; // 로그인에 실패 했을 경우 => 즉, result 변수 값이 0일 경우 => 프로그램 종료
		}
		
	}
	
	public void updateHeight() {
		
		System.out.print("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble(); // 입력 받은 키 값을
		mc.updateHeight(height); // MemberController 클래스의 updateHeight() 메소드에 전달
 
	}
	
}
