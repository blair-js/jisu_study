package com.thread.practice;

public class Ex13_7 implements Runnable{

	static boolean autoSave = false;
	
	public static void main(String[] args) {

		Thread t = new Thread(new Ex13_7());  
		t.setDaemon(true); //t�� ���󾲷���� ���� => �� �κ��� ������ ������� �ʴ´�.
		t.start(); //�� �� �� start() �޼ҵ尡 ���� ���󾲷��� �����ϴ°ͺ��� ���� �ö󰡸�, ���� t�����带 ���󾲷���� ������ �� ������ �����ؾ��Ѵ�.
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==5) {
				autoSave = true; //5�� �Ǹ� ����ǵ��� false�� ���� 
			}
		}//for

		System.out.println("���α׷��� �����մϴ�.");
	}//main
	
	//Runnable �� �����Ͽ��� ������ run() �޼ҵ� �ۼ� 
	//�ٷ� �̰� run() �޼ҵ尡 ���󾲷��� t�� �ϴ����̴�.
	public void run() {
		while(true) { //���ѷ��� => ������main�����尡 ����Ǹ� �� ���󾲷����� ��ɵ� ����ȴ�.
			try {
				Thread.sleep(3*1000); //3�ʸ��� 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//autoSave�� ���� true �̸� autoSave() �޼ҵ带 ȣ���Ѵ�.
			if(autoSave) {
				autoSave();
			}//if
			
		}//while
	}//run
	
	public void autoSave() {
		System.out.println("������ �ڵ�����Ǿ����ϴ�.");
	}

}

