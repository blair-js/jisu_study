package com.thread.practice;

public class Ex13_1 {

	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread{ //Thread 클래스를 상속하여 쓰레드 구현

	@Override
	public void run() { //쓰레드 수행할 작업을 작성 
		for(int i=0; i<5; i++) {
			System.out.println(this.getName()); //조상인 Thread의 getName() 호출, this는 생략가능
		}
	}
	
}

class ThreadEx1_2 implements Runnable{ //Runnable 인터페이스를 구현해서 쓰레드 구현

	@Override
	public void run() { //쓰레드 수행할 작업을 작성 
		for(int i=0; i<5; i++) {
			Thread.currentThread(); //현재 실행중인 Thread를 반환한다. 
			System.out.println(Thread.currentThread().getName());
			//Thread.currentThread() 를 통해 쓰레드를 참조해야한다. 그 이유는 해당 클래스는 Thread를 상속받지 않았기 때문이다. 
		}
	}
	
}