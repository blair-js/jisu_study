package com.algorithm;

import java.util.Scanner;

public class BFmatch {

	static int bfMatch(String txt, String pat) {
		int pt = 0; // txt 커서
		int pp = 0; // pat 커서 
		
		while(pt != txt.length() && pp != pat.length()) { //텍스트 커서가 텍스트의 길이가 아니고, 패턴의 커서가 패턴의 길이가 아닐때 
			if(txt.charAt(pt) == pat.charAt(pp)) { //텍스트 pt 번째 문자와 패턴 pp번째 문자가 같다면
				pt++; //텍스트 다음 커서
				pp++; //텍스트 다음 커서
			}else { //다르다면 
				pt = pt - pp + 1 ; //텍스트의 다음 문자로 넘어가는 공식임! 
				pp = 0; //텍스트는 다시 0번째부터 
			}
		}//while
		
		if(pp == pat.length()) { //패턴의 커서가 패턴의 길이까지 갔다면 검색에 성공한 것임.
			return pt - pp;
		}
		
		return -1; //검색 실패
		
	}//bfMatch
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("텍스트 : ");
		String txt = sc.nextLine();
		System.out.print("패턴 : ");
		String pat = sc.nextLine();
		
		int idx = bfMatch(txt, pat);
		
		if(idx == -1) { //검색 실패한 경우
			System.out.println("텍스트에 패턴이 없습니다.");
		}else {
			//일치하는 문자 바로 앞까지의 길이를 구한다. 
			int len = 0; 
			for(int i=0; i<idx; i++) {
				len += txt.substring(i, i+1).getBytes().length;
			}
			len += pat.length(); 
			
			System.out.println((idx+1) + "번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " + txt);
			System.out.printf(String.format("패턴 : %%%ds\n", len), pat);
		}
		
	}

}
