package com.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class B2869 {

	public static void main(String[] args) throws IOException {
		
		//Scanner�� ����ϸ� �ð��ʰ�..
		/*Scanner sc = new Scanner(System.in);
		double a = sc.nextInt(); //���� �ö󰡴� ����
		double b = sc.nextInt(); //�㿡 �̲������� ����
		double v = sc.nextInt(); //����������� �� ����
		
		System.out.println((int)Math.ceil((v-b)/(a-b)));*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //���ڿ��� �����ͼ� ��ū���� ����
				
		//��ū �ϳ��� �̾Ƽ� ���� a, b, v�� ����
		double a = Double.valueOf(st.nextToken());
		double b = Double.valueOf(st.nextToken());
		double v = Double.valueOf(st.nextToken());
		
		System.out.println((int)Math.ceil((v-b)/(a-b)));
		
	}

}
