package com.api.practice.stringBuffer_stringBuilder;

public class Run {

	public static void main(String[] args) {

		//method1();
		//method2();
		//method3();
		method4();
		
	}

	private static void method4() {
		
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		
		new Thread(() -> {
			
			int a = 0; 
			
			for(int i=0; i<10000; i++) {
				
				a = i;
				
				stringBuffer.append(1);
				stringBuilder.append(1);
				
			}
			System.out.println(a+1);
		}).start();
		
		new Thread(() -> {
					
			int b = 0; 
			
			for(int i=0; i<10000; i++) {
				
				b = i;
				
				stringBuffer.append(1);
				stringBuilder.append(1);
				
			}
			System.out.println(b+1);
		}).start();
		
		new Thread(() -> {
			
			try {
				Thread.sleep(5000);
				
				System.out.println("StringBuffer.length: "+ stringBuffer.length());
				System.out.println("StringBuilder.length: "+ stringBuilder.length());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}).start();
	}

	private static void method3() {
		
		//문자를 계속 변경해도 해쉬코드는 똑같다. 
		
		StringBuilder sb = new StringBuilder("난"); //크기 16 + 1 = 17
		sb.append("배고파아아아아").append("!!!!!!!!!!!!!!!!");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		
		sb.insert(1, "저녁시간 전이라");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.delete(0, 8);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse());
		System.out.println(sb.hashCode());
		
	}

	private static void method2() {

		String str = "반가워";
		System.out.println("str 기존 : "+ str +" 주소 : "+ System.identityHashCode(str));
		str +="난 스트링이라고해 ";
		System.out.println("str 변경후 : "+ str +" 주소 : "+ System.identityHashCode(str));
		
	}

	private static void method1() {

		StringBuilder sb = new StringBuilder("놀면뭐하니");
		
		System.out.println(sb.capacity()); //미설정시 16 => "놀면뭐하니" 입력시 21 => 16+5(놀면뭐하니 만큼 증가) 
		System.out.println(sb.length()); //미설정시 0 => "놀면뭐하니" 입력시 5
		
		StringBuilder sb1 = new StringBuilder(20);
		System.out.println(sb1.capacity());
		
	}
	
	

}
