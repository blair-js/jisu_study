package com.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11659 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //ex) 5 3 입력시
		int n = Integer.parseInt(st.nextToken()); //수의 개수 => ex) 5
		int m = Integer.parseInt(st.nextToken()); //합을 구할 횟수 => ex) 3
		
		int[] arr = new int[n+1]; //*누적합을 저장할 공간*
		
		st = new StringTokenizer(br.readLine()); //5개의 숫자를 토큰으로 구분해서 저장
		
		//해당 숫자만큼까지의 합을 누적하는 반복문(위에서 st에 담겨있는 숫자를 차례대로 넣는 것이 아님에 주의!)
		for(int i=1; i<n+1; i++) { 
			//해당 숫자 i 번째를 기준으로 i번째의 앞 배열 요소의 값(arr[i-1]) 해당 i의 숫자(nextToken)의 합계를 넣을 것이다.
			//만약 위에서 5 4 3 2 1 입력시 
			//arr[1] = 0 + 5 = 5, arr[2] = 5 + 4 = 9 ... 이런식으로 누적합을 배열에 넣는 것이다.
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken()); 
		}//for
	
		//해당 구간의 누적합을 구하는 반복문 => 위에서 입력한 반복횟수(m)만큼만 반복하면 된다.
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); //합 시작 인덱스
			int b = Integer.parseInt(st.nextToken()); //합 종료 인덱스
			
			//b까지 누적된 합계에서 a앞의 합계를 빼면 되는 것
			System.out.println(arr[b] - arr[a-1]);
		}
		
	}

}
