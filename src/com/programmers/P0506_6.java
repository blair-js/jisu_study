package com.programmers;

public class P0506_6 {
	//서울에서 김서방 찾기
	
	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim", "Park", "Choi", "Hong", "Blair", "Mark", "Tom", "Lee"};
		
		int idx = 0; //Kim을 찾은 인덱스를 담을 변수 
		for(String s : seoul) { //seoul 배열에 있는 모든 요소를 확인
			if(s.equals("Kim")) { //Kim이 있으면
				break; //바로 반복 중지
			}
			idx++; //위의 if문을 통과했으면 인덱스 증가시키고 다음반복을 진행
		}//for
		
		System.out.println("김서방은 " + idx + "에 있다");
		
	}

}
