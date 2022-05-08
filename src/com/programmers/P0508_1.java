package com.programmers;

public class P0508_1 {
	//문자열 내 p와 y의 개수
	
	public static void main(String[] args) {

		String s = "pPoooyY";
		int[] sArr = new int[2]; //p와 y의 개수를 체크할 배열 생성(기본값 0) => 0번째를 p로, 1번째를 y로 잡는다. 
		
		for(int i=0; i<s.length(); i++) {
			String str = String.valueOf(s.charAt(i)); //문자열에서 i번째를 추출(추출되면 char 타입이므로 형변환필수)
			if(str.equalsIgnoreCase("p")) { //대소문자 구분 없이 p라면
				sArr[0]++;
			}else if(str.equalsIgnoreCase("y")) { //대소문자 구분 없이 y라면
				sArr[1]++;
			}else {
				continue; //나머지 영단어는 pass
			}
		}//for
		
		System.out.println(sArr[0] == sArr[1] ? true : false); //두 배열의 값이 같으면 true return
		
	}

}
