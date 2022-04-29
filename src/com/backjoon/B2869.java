package com.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class B2869 {

	public static void main(String[] args) throws IOException {
		
		//Scanner를 사용하면 시간초과..
		/*Scanner sc = new Scanner(System.in);
		double a = sc.nextInt(); //낮에 올라가는 높이
		double b = sc.nextInt(); //밤에 미끄러지는 높이
		double v = sc.nextInt(); //나무막대기의 총 높이
		
		System.out.println((int)Math.ceil((v-b)/(a-b)));*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //문자열로 가져와서 토큰으로 저장
				
		//토큰 하나씩 뽑아서 변수 a, b, v에 저장
		double a = Double.valueOf(st.nextToken());
		double b = Double.valueOf(st.nextToken());
		double v = Double.valueOf(st.nextToken());
		
		System.out.println((int)Math.ceil((v-b)/(a-b)));
		
	}

}
