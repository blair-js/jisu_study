package com.api.homework.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;
	private Scanner sc = new Scanner(System.in);
	
	public NumberOk() {	}
	
	public void numGame() {
		
		//사용자에게 숫자를 입력 받고 입력 받은 숫자가 임의의 난수와 비교 했을 때 작은지 큰지, 몇 번 만에 맞추는지, 맞추면 계속 할지 끝낼지 묻는 메소드
		//풀긴 풀었는데 조금 이상..
		//view와 controller가 나눠지지 않아서 더 이상한듯?
		//가이드 봤는데 더이상함
		
		int count = 1; //문제 횟수 카운트
		ran = (int)(Math.random() * 100 + 1);
		//System.out.println("첫게임" + ran);

		while(true) {
			
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == ran) {
				System.out.println(count + "번 만에 맞췄습니다.");
				
				while(true) {
					System.out.print("계속 하시겠습니까?(y/n)");
					String play = sc.nextLine();
					
					if(play.equalsIgnoreCase("y")) {
						break; //안쪽 while 탈출해서 47행으로 가서 
					}else if(play.equalsIgnoreCase("n")) {
						System.out.println("게임을 종료합니다.");
						return;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						continue; //안쪽 while 반복 => 27행으로 감 
					}
				}//while
				
				System.out.println("새로운 게임을 시작합니다!"); //위의 36행 if문을 탄 후 여기로 오게되면
				count = 1; //새로운 게임을 시작하기 때문에 카운트 다시 1로 변경
				ran = (int)(Math.random() * 100 + 1); //새로운 게임이니 랜덤값 새로 생성
				//System.out.println("재게임" + ran);
				continue; //바깥 while 반복하게 되므로 23행으로 감 
				
			}else if(answer > ran) {
				System.out.println(answer + "보다 작습니다." + count + "번째 실패!");
				count++;
			}else{
				System.out.println(answer + "보다 큽니다." + count + "번째 실패!");
				count++;
			}
			
		}//while
		
	}
	
		//이건 가이드 정답인데..뭔가 이상하다..
		//2번째 문제 이후로는...계속 새로운게임임...몽미?
		/*public void numGame() {
			Scanner sc = new Scanner(System.in);
			String str = "";
			while(true) {
				int ranNum = (int)(Math.random()*100+1);
				System.out.println(ranNum);	// 정답 체크용으로 미리 확인하기
				int i=0;
			
				while(true) {
					i++;
					System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
					int num = sc.nextInt();
					sc.nextLine();
					
					if(ranNum < num) {
						System.out.println(num+"보다 작습니다."+i+"번째 실패!! ");
					}	
					else if(ranNum > num) {
						System.out.println(num+"보다 큽니다."+i+"번째 실패!! ");
					}
					else {
						System.out.println(i+"번 만에 맞췄습니다!");
						while(true) {
							System.out.print("계속  하시겠습니까?(y/n) : ");
							str = sc.nextLine();
							if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
								break;
							else
								System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
								continue;
						}
					}
					if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
						break;
				}
				if(str.equalsIgnoreCase("y")) {
					System.out.println("\n새로운 게임을 시작합니다!!");
					continue;
				}
				else if(str.equalsIgnoreCase("n")) {
					System.out.println("게임을 종료합니다.");
					return;
				}
			}
		}*/
}
