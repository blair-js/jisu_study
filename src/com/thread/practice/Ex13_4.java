package com.thread.practice;

import javax.swing.JOptionPane;

public class Ex13_4 {
	
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요"); // 이 입출력에서 blocking 발생
		System.out.println("입력하신 값은 : " + input + " 입니다.");
		
		//싱글 쓰레드
		//아래의 반복문은
		//위에서 사용자가 입력을 하기 전까지 절대절대 실행될 수 없다. 
		for(int i=10; i>0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1초간 잠재우기
		}//for
	}//main

}
