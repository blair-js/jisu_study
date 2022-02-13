package com.thread.practice;

public class Ex13_11 {

	static long startTime = 0; 
	
	public static void main(String[] args) {

		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		th1.start();
		th2.start();

		startTime = System.currentTimeMillis();

		//join()의 기능
		//여기의 코드가 없다면, main 쓰레드는 th1, th2의 작업을 기다리지 않기 때문에, 
		//중간에 바로 소요시간이 찍힌다. 
		//하지만 이 코드가 있으면 소요시간은 가장 마지막에 찍히게 된다. 
		try {
			th1.join(); //main 쓰레드가 th1의 작업이 끝날때까지 기다린다
			th2.join(); //main 쓰레드가 th2의 작업이 끝날때까지 기다린다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime)); //현재 시간에서 쓰레드 시작 전 시간을 빼주면 소요시간 계산 가능
	}//main
}

class ThreadEx11_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}//run
}

class ThreadEx11_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}//run
}