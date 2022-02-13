package com.thread.practice;

import javax.swing.JOptionPane;

public class Ex13_5 {

	public static void main(String[] args) {
		
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
			
		//멀티 쓰레드
		//아래의 반복문은
		//th1 쓰레드가 실행됨가 동시에 같이 작업을 한다. => 사용자에게 입력을 받는 작업과 카운트다운하는 작업을 분리되었기 때문이다.
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요"); // 이 입출력에서 blocking 발생
		System.out.println("입력하신 값은 : " + input + " 입니다.");
		
	}//main
}

class ThreadEx5_1 extends Thread{
	
	public void run() {
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1초간 잠재우기
		}//for
	}
}