package com.algorithm.chap04;

import java.util.Scanner;

public class IntStacjTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64); //최대 64개의 데이터를 push 할 수 있는 스택 
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity()); //용량 capacity 중 데이터 size 개
			
			System.out.println("(1)푸시");
			System.out.println("(2)팝");
			System.out.println("(3)피크");
			System.out.println("(4)덤프");
			System.out.println("(5)찾기");
			System.out.println("(6)비우기");
			System.out.println("(7)용량확인");
			System.out.println("(8)현재 데이터 수 확인");
			System.out.println("(9)비어있는지 확인");
			System.out.println("(10)가득찼는지 확인");
			System.out.println("(0)종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			
			if(menu == 0) {
				break; //while문 탈출
			}
			
			int x; //데이터를 담을 변수명
			
			switch(menu) {
			case 1: 
				System.out.print("푸시할 데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2: 
				try {
					x = s.pop();
					System.out.println("팝한 데이터 : " + x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3: 
				try {
					x = s.peek();
					System.out.println("피크한 데이터 : " + x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("찾을 숫자 :");
				x = sc.nextInt();
				int idx = s.indexOf(x);
				if(idx > 0) {
					System.out.println(x + "는/은 " + idx + "번째에 있습니다.");
				}else {
					System.out.println("찾고자 하는 숫자가 존재하지 않습니다.");
				}
				break;
			case 6:
				s.clear();
				System.out.println("비우기 완료");
				break;
			case 7:
				System.out.println("스택의 용량 : " + s.capacity());
				break;
			case 8:
				System.out.println("현재 데이터 수 : " + s.size());
				break;
			case 9:
				if(s.isEmpty()) {
					System.out.println("비어 있습니다.");
				}else {
					System.out.println("비어있지 않습니다.");
				}
				break;
			case 10:
				if(s.isFull()) {
					System.out.println("가득 찼습니다.");
				}else {
					System.out.println("가득차있지 않습니다.");
				}
				break;
			}//switch
		}//while
		
	}

}
