package com.thread.practice;

public class Ex13_6 {

	public static void main(String[] args) {

		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		//우선순위는 1-10까지 지정할 수 있으나 
		//실질적으로 윈도우의 우선순위는 32단계로 나누어져 있기때문에
		//우리가 예상하는(th2가 더많은 시간을 갖고 더 먼저 끝나는)결과가 정확하게 나오지 않을 수도 있다. 
		//즉 우리가 set 하는 우선순위는 희망사항일뿐임. 
		//윈도우는 마우스 포인터의 우선순위가 가장 높다~~~오호?
		
		//setPriority() 해당 쓰레드의 우선순위를 지정하는 메소드
		//th1.setPriority(5); //기본 값 5로 지정 
		th2.setPriority(7);
		
		//getPriority() 현재 쓰레드의 우선수위를 얻어오는 메소드 
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
		
	}//main

}

class ThreadEx6_1 extends Thread{

	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
			for(int x=0; x<100000000; x++); //시간 지연용 for문 => 아무것도 안하고 헛바퀴만 돈다.
		}//for
	}
	
	
}

class ThreadEx6_2 extends Thread{
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|")); //시간 지연용 for문 => 아무것도 안하고 헛바퀴만 돈다.
		}//for
	}
}