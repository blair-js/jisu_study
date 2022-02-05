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
		
		System.out.println("===그냥값출력");
		System.out.println("str:" + str);
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println("str3:" + str3);
		System.out.println("str4:" + str4);
		
		System.out.println("===hashCode==="); 
		//=> 이미 String 클래스에서 hashcode() 메소드를 오버라이드 해놓아서 값이 같으면 주소값이 같다고 나옴! str2 만 제외하고 모두 같은 해시코드 값.
		System.out.println("str:" + str.hashCode());
		System.out.println("str1:" + str1.hashCode());
		System.out.println("str2:" + str2.hashCode());
		System.out.println("str3:" + str3.hashCode());
		System.out.println("str4:" + str4.hashCode());
		
		System.out.println("===System.identityHashCode==="); 
		//=> 주소값이 모두 다름. (리터럴로 정의한 str, str1 만 같음)
		System.out.println("str:" + System.identityHashCode(str));
		System.out.println("str1:" + System.identityHashCode(str1));
		System.out.println("str2:" + System.identityHashCode(str2));
		System.out.println("str3:" + System.identityHashCode(str3));
		System.out.println("str4:" + System.identityHashCode(str4));
		
		System.out.println("===변경해보기===");
		str3 += "z"; //문자열 값 수정이 불가능 (새로운 주소값으로 생성) 
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
	}

}
