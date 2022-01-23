package com.objectmvc.practice.controller;

public class NonstaticSample {

	public void printLottoNumbers() {
		
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--; 
					continue;
				}
			}//for
		}//for
		
		//오름차순 정렬
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) { //작다면
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.print("랜덤 값 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void outputChar(int num, char c) {
		
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		
		System.out.print(c + "문자 " + num + "개 출력 : ");
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
	}
	
	public char alphabette() {
		
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		
		while(true) {
			char c = (char)((int)(Math.random()* 58 + 65));
			
			if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				return c;
			}else {
				continue;
			}
		}
		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		System.out.print(str + "의 " + index1 + "번 " + index2 + "번 사이의 값 출력 : ");
		String result = "";
		if(str != null) {
			for(int i=index1; i<index2; i++) {
				result += str.charAt(i);
			}
			return result;
		}else {
			return null;
		}
		
	}
}
