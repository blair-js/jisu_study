package com.thread.practice;

import javax.swing.JOptionPane;

public class Ex13_9 {

	public static void main(String[] args) {

		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //현재 interrupted 의 상태 => false
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); //어떠한 값을 입력하게 되면 interrupted 상태가 true로 바뀌면서 
																		//th1 쓰레드의 카운트 다운이 멈추고 종료되었다는 출력문 출력
		System.out.println("입력하신 값은 " + input + " 입니다.");
		th1.interrupt(); //interrupt()를 호출하면, interrupted 상태가 true로 된다. 
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //현재 interrupted 의 상태 => true 
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //현재 interrupted 의 상태 => true
		
		System.out.println("isInterrupted() : " + th1.isInterrupted()); //현재 interrupted 의 상태 => true
		//main 쓰레드가 인터럽트 되었는지 확인(th1 쓰레드를 확인하는 것이 아니다!!!!!!!!!!)
		//System.out.println("interrupted() : " + th1.interrupted()); //현재 interrupted 의 상태 => false
		//th1가리키는 것처럼 보이지만 실질적으로는 main 쓰레드를 가리키고 있다는 것 주의. static 메소드이다.!!!
		System.out.println("interrupted() : " + Thread.interrupted()); //현재 interrupted 의 상태 => false
		System.out.println("===");
	}

}

class ThreadEx9_1 extends Thread{
	public void run() {
		int i = 10; 
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++); //시간지연 반복문
		}//while
		System.out.println("카운트가 종료되었습니다.");
		
		System.out.println("isInterrupted() : " + this.isInterrupted()); //true
		System.out.println("isInterrupted() : " + this.isInterrupted()); //true
		//isInterrupted()와 달리 interrupted()는 interrupted라는 상태 변수를 false로 초기화 한다. 
		System.out.println("interrupted() : " + Thread.interrupted()); //true
		System.out.println("interrupted() : " + Thread.interrupted()); //false
	}
}