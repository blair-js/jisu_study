package com.programmers;

public class P0506_8 {
	//문자열 내림차순으로 배치하기
	
	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		//내 풀이
		char[] sArr = s.toCharArray(); //문자열 s를 toCharArray 메소드를 사용하여 하나씩 char 타입의 문자로 배열에 저장
		
		for(int i=1; i<s.length(); i++) { //비교 주체 1부터
			for(int j=0; j<i; j++) { //비교 대상 i전까지 검사
				if(sArr[i] > sArr[j]) { //i가 j보다 뒤에있는 상황이고, i가 j보다 크면 앞쪽으로 보내주어야 하므로 서로 위치 교환
					char tmp = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = tmp;
				}
			}
		}//for
		
		StringBuilder sb = new StringBuilder(); //변환된 문자열을 반환할 결과 변수
		for(char c : sArr) { //위에서 내림차순으로 위치가 재정렬된 배열 sArr을 갖고 
			sb.append(String.valueOf(c)); //sb에 추가한다. 하나씩. 그대신 형변환 해주어야 추가 가능.
		}
		
		System.out.println(sb);
		
	}

}
