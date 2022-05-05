package com.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P0504_5 {
	//�̻��� ���� �����
	
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String str = br.readLine();
			
			//�Է¹��� ���ڿ� str�� ����(" ") ���� ��ū���� �з�
			//�� ��, �����ؾ������� ����(" ") ���� ��ū���� ����(true) �����־�� �Ѵٴ� ��!
			StringTokenizer st = new StringTokenizer(str, " ", true); 
		
			StringBuilder sb = new StringBuilder(); //���������� ��ȯ�� ��� ���ڿ� 
			while(st.hasMoreTokens()) { //��ū�� �ִٸ�
				
				//���� ��ū ������ ���� 
				//�� ��, ���� currStr�� ������� �ʰ� st.nextToken()�� ����Ϸ��� ������
				//���� �����ڿ��� st.nextToken()�� �ι� ���Ǳ� ������ ���� ��ū�� �ν��ع����� �ǰ� ������ �߻�����!
				String currStr = st.nextToken(); 

				for(int i=0; i<currStr.length(); i++) { //�ش� ��ū�� ���̸�ŭ �ݺ� 
					//i��° ���ڰ� ¦���̸� �빮�ڷ�, Ȧ���̸� �ҹ��ڷ� ����(���� i��° ���ڰ� ������ū�̸� �׳� ���� �״�� �����)
					String addStr = i%2 == 0 ? (currStr.charAt(i)+"").toUpperCase() : (currStr.charAt(i)+"").toLowerCase();
					sb.append(addStr); //��ȯ��(�ҹ���or�빮��) ��� ���ڿ��� ����
				}//for
				
			}//while
		
			System.out.println(sb); //Ȯ��

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	     /*String s = "jsi d fowjeork gnsjdfnlskdjf";
		 String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");
	        System.out.println(Arrays.toString(array));
	        
	        for(String ss : array) {
	        	System.out.println("ss : " + ss);
	            cnt = ss.contains(" ") ? 0 : cnt + 1;
	            System.out.println("cnt : " + cnt);
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	            System.out.println("answer : " + answer);
	        }
	      
	     System.out.println(answer);*/
	}

}
