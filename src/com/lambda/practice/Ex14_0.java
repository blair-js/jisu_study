package com.lambda.practice;

public class Ex14_0 {

	
	public static void main(String[] args) {

		//Object obj = (a, b) -> a > b ? a : b; //람다식 => 익명객체
		
		//코드1
		/*MyFunction2 f = new MyFunction2() { //오버라이딩 - 접근제어자는 좁게 못바꾼다. 
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};*/
		
		//int value = obj.max(3,5); //Object 클래스엔 max()가 없기 떄문에 에러발생. 
		//int value = f.max(3,5); 
		//System.out.println("value = " + value);

		//코드1이 너무 길어서 람다식 사용 
		//람다식(익명 객체)을 다루기 위한 참조변수 타입은 함수형 인터페이스로 한다. 
		MyFunction2 f2 = (a, b) -> a > b ? a : b;
		
		int value = f2.max(3,5); 
		System.out.println("value = " + value);
		
	}

}

@FunctionalInterface //함수형 인터페이스 => 단 하나의 추상메소드만 가져야 한다. 
interface MyFunction2{
	//public abstract int max(int a, int b); //몸통없이 만들어주기
	int max(int a, int b); //public abstract 생략 가능
}

