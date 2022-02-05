package com.api.practice.stringTokenizer;

import java.util.StringTokenizer;

public class run {

	public static void main(String[] args) {

		// StringTokenizer
		// : String(���ڿ�)�� � Ư�� ��ȣ�� �������� Token ������ ������ ó���Ҷ� ����
		// split �޼ҵ�� �����ϳ� split �޼ҵ带 ���� String �迭�� ó��
		
		String str = "���꽽,����ȣ,�ο�,ī�����,����";
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
		
		String str1 = "���꽽,����ȣ,�ο�,ī�����,����";
		StringTokenizer st1 = new StringTokenizer(str1, ",", true);
		System.out.println(st1.countTokens());
		while(st1.hasMoreElements()) {
			System.out.println(st1.countTokens());
			System.out.println(st1.nextToken());
		}
		
		String str2 = "���꽽,,����ȣ,�ο�,ī�����,����";
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
