package com.api.practice.string.run;

public class Run {

	public static void main(String[] args) {

		//new Run().method2();
		method1();
	}

	private void method2() {
		
		String str = "abc";
		
		System.out.println(str.charAt(2));
		System.out.println(str.concat("def"));
		System.out.println(str.contains("a"));
		System.out.println(str.equals("abc"));
		System.out.println(str.length());
		
		String str1 = "a,bc,de";
		String[] strArr = str1.split(",");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		String strCase1 = "Abc";
		String strCase2 = "aBc";
		
		System.out.println(strCase1.toUpperCase());
		System.out.println(strCase2.toLowerCase());
		System.out.println(strCase1.equalsIgnoreCase(strCase2));
		System.out.println(strCase1.equals(strCase2));
		
		String str2 = "        ab  c               ";
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2.replace(" ", ""));
	}
	
	private static void method1() {
		
		String str = "abc";
		String str1 = "abc";
		String str2 = "def";
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println("===�׳ɰ����");
		System.out.println("str:" + str);
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println("str3:" + str3);
		System.out.println("str4:" + str4);
		
		System.out.println("===hashCode==="); 
		//=> �̹� String Ŭ�������� hashcode() �޼ҵ带 �������̵� �س��Ƽ� ���� ������ �ּҰ��� ���ٰ� ����! str2 �� �����ϰ� ��� ���� �ؽ��ڵ� ��.
		System.out.println("str:" + str.hashCode());
		System.out.println("str1:" + str1.hashCode());
		System.out.println("str2:" + str2.hashCode());
		System.out.println("str3:" + str3.hashCode());
		System.out.println("str4:" + str4.hashCode());
		
		System.out.println("===System.identityHashCode==="); 
		//=> �ּҰ��� ��� �ٸ�. (���ͷ��� ������ str, str1 �� ����)
		System.out.println("str:" + System.identityHashCode(str));
		System.out.println("str1:" + System.identityHashCode(str1));
		System.out.println("str2:" + System.identityHashCode(str2));
		System.out.println("str3:" + System.identityHashCode(str3));
		System.out.println("str4:" + System.identityHashCode(str4));
		
		System.out.println("===�����غ���===");
		str3 += "z"; //���ڿ� �� ������ �Ұ��� (���ο� �ּҰ����� ����) 
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
	}

}
