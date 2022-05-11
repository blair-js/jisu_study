package com.programmers;

public class P0511_1 {
	//[1차] 다트 게임
	
	public static void main(String[] args) {
		
		String dartResult =  "1S*2T*3S";
		
		//3개의 점수를 반환할 결과 변수
		int result = 0; 
		
		String str = ""; //문자열에서 숫자를 저장할 변수
		int[] arr = new int[3]; //3개의 점수를 저장할 배열
		int idx = 0; //배열 인덱스
		
		//문자열을 구성하는 문자들 확인
		for(int i=0; i<dartResult.length(); i++) {
			//문자열의 각 i번째 문자에 따라 처리 
			switch(dartResult.charAt(i)) {
			//해당 문자가 '*'인 경우는 자신과 이전의 점수 *2 해주기. 
			//(단, 해당 문자가 1번째면 이전의 점수는 없기 때문에, 1번째인 경우와 아닌 경우를 조건 걸어주기)
			//arr 0번째부터 차례로 값을 넣어줄것. 
			//ex.문자열이 1S*2T*3S 인 경우 2번째 문자에서 *가 나왔으니 1의1승 *2를 해주고
			//5번째 문자에서도 *가 나왔으니 위의 (1의1승*2)에 *2를 해주고 + 2의3승에 *2를 해준다. 
			case '*' : 
				arr[idx-1]*=2;
				if(idx>1) arr[idx-2]*=2;
				break;
			//해당 문자가 '#'인 경우 자신의 점수를 음수로 만든다.
			case '#' : 
				arr[idx-1]*=-1;
				break;
			//S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 str를 초기화
			case 'S' : 
				arr[idx] = (int)Math.pow(Integer.parseInt(str), 1);
				str = "";
				idx++;
				break;
			//D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 str를 초기화
			case 'D' : 
				arr[idx] = (int)Math.pow(Integer.parseInt(str), 2);
				str = "";
				idx++;
				break;
			//T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 str를 초기화
			case 'T' : 
				arr[idx] = (int)Math.pow(Integer.parseInt(str), 3);
				str = "";
				idx++;
				break;
			//위 case문에 속하지 않는 정수들은 str 변수에 저장
			//ex.2S 에서 2가 str에 담기는 셈이다.
			default : 
				str += String.valueOf(dartResult.charAt(i));
				break;
			}//switch
		}//for
		
		//위 과정을 통해 구한 3개의 점수를 모두 더하기
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		
		System.out.println(result);
	}

}
