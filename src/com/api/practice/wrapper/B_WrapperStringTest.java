package com.api.practice.wrapper;

public class B_WrapperStringTest {

	public void method1() {
			
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1+ str2);// ���ڿ��� �۾��̵ȴ�. ���ڿ� -> ���ڷ� �ٲٴ� �۾��� �ʿ�
		
		//1.String --> �⺻ �ڷ��� : �ش�WrapperŬ������.parseXXX() ���
		
		int i = Integer.parseInt(str1); //10
		double d = Double.parseDouble(str2); //15.3
		
		System.out.println(i+d);
		
		
		//2. �⺻�ڷ��� --> String ���� �ٲٱ� ���� 
		// �⺻�ڷ��� --> Wrapper -->String
		// �ش�Wrapper Ŭ����.valueOf().toString()
		
		
		String strI1 = Integer.valueOf(i).toString();
		String strD1 = Double.valueOf(d).toString();
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		
		System.out.println(strI1); //10
		System.out.println(strI); //10
		System.out.println(strD1); //15.3
		System.out.println(strD); //15.3
	}
}
