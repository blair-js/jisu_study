package com.loop_hard.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practic15(){
		
		//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		//(for문 이용)
		//* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		//ex) 2, 3, 5, 7, 11 …


			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			boolean bool = true; //소수 판별 변수. 일단 기본 값을 true로 설정함. 
			
			if(num < 2) { //2 미만 입력시
				System.out.println("잘못 입력하셨습니다.");
			}else { //2 이상일 경우 
				
				for(int i=2; i<num; i++) { //num을 2부터 num-1까지 나눌 것임
					if(num % i == 0) { //i중에 하나라도 나누어지면 그 숫자는 소수가 아닌 것  
						bool = false; //소수가 아니라고 값 바꿔주기
						break; //for 탈출
					}//if
				}//for
				System.out.println(bool ? "소수입니다." : "소수가 아닙니다."); //결과를 보여주는 창 	
			}//if-else
			
		
	}

	public void practic16() {
		
		//위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		//“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		//* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		//ex) 2, 3, 5, 7, 11 …

		while(true) {

			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			boolean bool = true; //소수 판별 변수. 일단 기본 값을 true로 설정함. 
			
			if(num < 2) { //2 미만 입력시
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}else { //2 이상일 경우 
				
				for(int i=2; i<num; i++) {//num을 2부터 num-1까지 나눌 것임
					if(num % i == 0) { //i중에 하나라도 나누어지면 그 숫자는 소수가 아닌 것  
						bool = false; //소수가 아니라고 값 바꿔주기
						break; //for 탈출
					}//if
				}//for
				System.out.println(bool ? "소수입니다." : "소수가 아닙니다."); //결과를 보여주는 창 
				break; //while 탈출
			}//if-else
			
			
		}
		
	}
	
	public void practic17() {
		
		//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		//(for문 이용)

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		int cnt = 0; //소수 개수 체크
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}else { 
			for(int i=2; i<=num; i++) { //2부터 num까지 소수인지 검사하겠다.
				boolean bool = true; //소수 판별 
				for(int j=2; j<i; j++) { //해당 i가 소수인지 판별하기 위해 2부터 i-1까지 나눠보기  
					if(i%j == 0) {
						bool = false; //소수 아님 
						break; //안쪽 for문 탈출 
					}//if
				}//안쪽 for
				
				if(bool == true) { //안쪽 for문을 다 돌고 나왔는데 true 이면 소수이므로 
					System.out.print(i + " "); //현재 i를 출력해주고
					cnt++; //개수 증가
				}//if
			}//바깥 for
			System.out.println("\n2부터 " + num + "까지 소수의 개수는 " + cnt + "개 입니다.");
		}//if-else		
	}

	public void practic18() {
		
		//1부터 사용자에게 입력 받은 수까지 중에서
		//1) 2와 3의 배수를 모두 출력하고
		//2) 2와 3의 공배수의 개수를 출력하세요.
		//(for문 이용)
		//* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
		//모두 나머지가 0이 나오는 수
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int cnt = 0; //공배수 개수 체크
		
		for(int i=1; i<=num; i++) {
			
			if(i%6 == 0) { //최소 공배수로 나누기(2로도 나누어지고 3으로도 나누어질때 = 즉 6의 배수일 때)
				System.out.print(i + " ");
				cnt++; //개수 증가 
			}else if(i%2 == 0 && i%3 != 0) { //2로만 나누어질 때 
				System.out.print(i + " ");
			}else if(i%2 != 0 && i%3 == 0) { //3으로만 나누어질 때 
				System.out.print(i + " ");
			}
			
		}//for
		System.out.println("\ncount : " + cnt);
		
	}

	public void practic19() {
		
		//일단 입력한 정수가 4 라고 가정하고 규칙 확인
		//총 4행, 최대열 4
		// 	   * //공백3+별1
		// 	  ** //공백2+별2
		// 	 *** //공백1+별3
		//	**** //공백0+별4 
		//공백은 3 -> 2-> 1-> 0 
		//별은 1 -> 2-> 3-> 4 => i랑 맞추기 
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) { //행(1~4행) 
			
			for(int j=1; j<=num-i; j++) { //공백 출력
				System.out.print(" ");
			}
			
			for(int s=1; s<=i; s++) { //별 출력 => 현재 행 i 수만큼 나오면 됨) 
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	
	public void practic20() {
		
		//일단 입력한 정수가 3이라고 가정하고 규칙 확인
		//총 5행, 최대열 3 
		//행은 입력한 수의 *2-1 임 => 짝수나 홀수나 다 똑같은 규칙 => 해당 정수의 행만 정수만큼 별이 출력되고 위/아래는 별이 1개씩 작아지는 규칙 
		//입력한 수 3 -> 3행을 기준으로 위/아래 1행과 5행이 같고 2행과 4행이 같음 
		//  *
		//  **
		//  ***
		//  **
		//  *
		// 별 1 -> 2 -> 3 -> 2 -> 1
		
		//그럼 가장 가운데 행(입력한 정수 행)을 기준으로 삼고
		//위와 아래를 나눠서 해본다
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num*2-1; i++) { //행 
			if(i<num) { //가운데 행 기준으로 위
				for(int j=1; j<=i; j++) { //해당 행 i만큼 별 찍기 1행은 1개, 2행은 2개 
					System.out.print("*");
				}
				System.out.println(); //개행
			}else if(i>num) { //가운데 행 기준으로 아래
				for(int k=1; k<= num-(i-num); k++) { //이 부분 어려웠음 => 4행은 기준행3-(현재행4-기준행3)=별2개, 5행은 기준행3-(현재행5-기준행3)=별1개
					System.out.print("*");
				}
				System.out.println();
			}else { //가운데 행
				for(int s=1; s<=num; s++) {
					System.out.print("*");
				}//for
				System.out.println(); //개행
			}
			
			
		}
		
		
	}

	public void practic21() {
		
		//트리 만들기
		//		* 		//공백3+별1+공백3 => 별은 행*2-1개로 찍히는것을 확인할 수 있다. 공백은 최대행(입력한 정수)-현재행을 확인할 수 있다
		//	   ***		//공백2+별3+공백2
		//	  *****		//공백1+별5+공백1
		//	 *******	//공백0+별7+공백0
		// 총 4행, 최대 7열(행*2-1)
		// 별은 1 -> 3 -> 5 -> 7 (모두 홀수, 행마다 공차 2) 

		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) { //공백 출력
				System.out.print(" ");
			}

			for(int s=1; s<=i*2-1; s++) { //별 출력
				System.out.print("*");
			}
			
			System.out.println(); //개행
		}
		
	}

	public void practic22() {
		
		// 일단 5행이라고 기준 잡고 
		// 첫행과 끝행만 별 5개 출력 
		// 나머진 첫열과 끝열만 별 출력, 나머진 공백 처리
		// *****
		// *   *
		// *   *
		// *   *
		// *****
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num; i++) { //행
			for(int s=1; s<=num; s++) { //열 출력
				
				if(i == 1 || i == num) { //1행이거나 입력한정수행이면 
					System.out.print("*"); //별 출력
				}else { //나머지 행 
					if(s == 1 || s == num) { //1열과 입력한정수열에만
						System.out.print("*"); //별 출력
					}else { //나머지 열
						System.out.print(" "); //공백 출력
					}//안쪽if-else
				}//바깥if-else
			}//안쪽for
			System.out.println(); //개행
		}//바깥for
		
	}

}
