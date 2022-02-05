package com.api.practice.wrapper;

public class A_WrapperTest {

	public void method1() {
		
		int num1 = 10; 
		int num2 = 15;
		
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1); //10
		System.out.println(i2); //15
		
		System.out.println(i1 == i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); //비교하고자 하는 값(매개변수로 넣은 값)이 더 크면 -1 반환, 작으면 1 반환, 같으면 0 반환

		/*int num3 = 123;
		Integer i3 = num3; //가능
		System.out.println(i3);*/
		
		//예외
		Integer i4 = new Integer("123"); //가능 => 객체 생성을 통해 Boxing을 하게 되면 가능 ---> 단,문자열을 숫자화 시켜서...
		//Integer i4 = new Integer("123A"); //불가능 => 위의 예제에서 확장해서 확인해본 것으로 숫자화 시킬 수 없는 A가 들어있으므로 불가! 
		System.out.println(i4);
		
		

		//UnBoxing : 래퍼 클래스 -> 기본 자료형으로 바꾸는 방법 
		
		//1. 래퍼 클래스의 xxxValue() 를 통해 변환
		int num3 = i1.intValue(); //10
		int num4 = i2.intValue(); //15
		System.out.println(num3 + num4);
		
	
		//2. 메소드를 사용하지 않고 바로 변환(AutoUnBoxing)
		
		int num5 = /*(int)*/i1;
		System.out.println(num5);
		
		
		//결론은 오토박싱, 오토언박싱이 되기 때문에 위/아래 모두 2번의 방법으로 하면 됨. 
		
		test(i2); //i2는 현재 Integer 타입
		test1(i2); //i2는 현재 Integer 타입
		test2(i2); //i2는 현재 Integer 타입
		
	}

	private void test2(Object num) { //상속 관계인 오브젝트로 받을 수 있음
		System.out.println(num);
	}

	private void test1(int num) { //오토 언박싱
		System.out.println(num);
	}

	private void test(Integer num) {
		System.out.println(num);
	}
	
	
}
