package com.backjoon;

import java.util.Scanner;

public class B4153 {
	
	//과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
	//주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
	
	//피타고라스 정리 : 세 변의 길이가 있을 때, 두 변의 제곱을 더한것이 한 변의 제곱과 동일하다면 직각삼각형 이다. 
	//ex : 세 변의 길이가 a, b, c 라는 가정 => a의제곱+b의제곱=c의제곱 or b의제곱+c의제곱=a의제곱 or a의제곱+c의제곱=b의제곱 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			//세 변의 길이를 입력받는다.
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//a,b,c 모두 0이면 반복 종료 
			if(a == 0 && a == 0 && a == 0) {
				break;
			}
			
			if((a*a + b*b) == c*c) {
				System.out.println("right");
			}else if((a*a + c*c) == b*b){
				System.out.println("right");
			}else if((b*b + c*c) == a*a){
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		
		}//while
			
		
	}

}
