package com.programmers;

public class P0502_7 {
	//콜라츠 추측
	
	public static void main(String[] args) {
		
		long num = 6; //입력 숫자

		//1.내 풀이 방법
		/*int count = 0; //몇 번 반복하는지에 대한 변수
		
		while(num != 1) { //num이 1이 아닐 때까지 반복
			
			count++; //반복 횟수 증가
			
			if(num%2 == 0) { //짝수인 경우
				num/=2;
			}else { //홀수인 경우
				num = num*3+1;
			}
			
			//반복횟수가 500을 넘어가면 -1을 리턴하라고 명시되어있다.
			if(count > 500) {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);*/
		
		//2.다른 풀이 방법 : 삼항연산자 사용 
		int count = -1; //아래의 if문에서 반복 종료를 만나지 못한다면 -1을 출력하고, 만나면 해당 반복횟수를 출력할 것
		
		for(int i=0; i<500; i++) { //기본적으로 500번 반복하기
			if(num == 1) {
				count = i; //현재까지의 반복 횟수 저장
				break; //num이 1이 되면 즉시 반복종료
			}
			num = (num%2 == 0) ? num/2 : num*3+1; //삼항연산자를 사용하여 짝/홀수 구분하기
		}
		
		System.out.println(count);
		
	}

}
