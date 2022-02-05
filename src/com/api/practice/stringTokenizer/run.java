package com.api.practice.stringTokenizer;

import java.util.StringTokenizer;

public class run {

	public static void main(String[] args) {

		// StringTokenizer
		// : String(문자열)을 어떤 특수 기호를 기준으로 Token 단위로 나눠서 처리할때 쓰임
		// split 메소드와 유사하나 split 메소드를 쓰면 String 배열로 처리
		
		String str = "유산슬,유야호,로운,카놀라유,하하";
		StringTokenizer st = new StringTokenizer(str, ",");
		//System.out.println(st.countTokens());

		/*while(st.hasMoreTokens()) {
			System.out.println(st.countTokens());
			System.out.println(st.nextToken());
		}
		
		while(st.hasMoreElements()) {
			System.out.println(st.countTokens());
			System.out.println(st.nextToken());
		}*/
		
		String str1 = "유산슬,유야호,로운,카놀라유,하하";
		StringTokenizer st1 = new StringTokenizer(str1, ",", true);
		System.out.println(st1.countTokens());
		while(st1.hasMoreElements()) {
			System.out.println(st1.countTokens());
			System.out.println(st1.nextToken());
		}
		
		String str2 = "유산슬,,유야호,로운,카놀라유,하하";
		StringTokenizer st2 = new StringTokenizer(str2, ",");
		while(st2.hasMoreElements()) {
			System.out.println(st2.countTokens());
			System.out.println(st2.nextToken());
		}
		
		String[] arr = str2.split(",");
		System.out.println(arr.length);
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}
