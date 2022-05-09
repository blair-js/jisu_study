package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P0509_1 {
	//문자열 내 마음대로 정렬하기
	
	public static void main(String[] args) {

		//나의 풀이
		int n = 1;
		String[] strings = {"abce", "abcd", "cdx"};
		/*String[] newStrings = new String[strings.length]; //재정렬한 후 반환할 배열
		
		for(int i=0; i<strings.length; i++) {
			//n번째 인덱스의 문자를 추출한 후 뒤에 기존의 문자열을 연결한다.
			//ex. n이 1인 경우 abce => babce 로 문자열이 변경된 상태  
			newStrings[i] = strings[i].charAt(n) + strings[i];  
		}
		
		//위의 반복이 모두 끝나면 바뀐 문자열을 갖고있는 배열 newStrings을 오름차순으로 재정렬한다. 
		//ex. ["babce", "babcd", "dcdx"] => ["babcd", "babce", "dcdx"]
		Arrays.sort(newStrings);
		
		//오름차순으로 정렬된 배열을 반복한다. => n번째 기준으로 정렬하기 위해 맨 앞에 붙여놓았던 문자를 제거해야 하기 때문
		for(int i=0; i<newStrings.length; i++) {
			newStrings[i] = newStrings[i].substring(1); //0번째 인덱스 문자를 제외한 뒤의 1~끝까지의 문자열만 추출(원래의 문자열)
		}
		
		System.out.println(Arrays.toString(newStrings));*/
		
		
		//다른 풀이 : 방법은 동일하나 ArrayList 사용
		String[] newStrings = {};
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0; i<strings.length; i++) {
			arr.add(""+strings[i].charAt(i)+strings[i]);
		}
		Collections.sort(arr);
		newStrings = new String[arr.size()]; //String이 담겨있는 list 사이즈만큼 배열 생성
		for(int i=0; i<arr.size(); i++) {
			newStrings[i] = arr.get(i).substring(1); //arr에 담겨있는 i번째를 get해서 해당 문자열의 1번째부터 끝까지만 저장
		}
		
		System.out.println(Arrays.toString(newStrings));
		
	}
	

}
