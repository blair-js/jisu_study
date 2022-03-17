package com.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}//for
		
		System.out.println(min + " " + max);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine()); 
		//처음에 입력하는 배열 원소의 수 N은 사용되지 않고 입력만 받는다. 
		//두번째에 입력하는 배열 원소 5개의 값은 StringTokenizer를 통해 공백을 기준으로 5개의 토큰으로 구분 될 것. 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		
		int max = -1000001; //주어진 범위 내의 가장 작은 값으로 설정 => 아래의 while문을 통해 값을 바뀌게 될 것
		int min = 1000001; //주어진 범위 내의 가장 큰 값으로 설정 => 아래의 while문을 통해 값을 바뀌게 될 것
		
		//토큰이 있다면 
		while(st.hasMoreTokens()) {
			
			int val = Integer.parseInt(st.nextToken()); //현재 토큰 
			
			if(val > max) {
				max = val;
			}
			if(val < min) {
				min = val;
			}
		}//while
		System.out.println(min + " " + max);
	}

}
