package com.lambda.practice;

@FunctionalInterface
interface MyFunction{
	void run(); //몸통 없음
}


public class Ex14_1 {

	static void execute(MyFunction f) { //매개변수의 타입이 MyFunction 이다.
		f.run(); //MyFunction에 존재하는 run() 호출
	}
	
	static MyFunction getMyFunction() { //반환 타입이 MyFunction 인 메소드 getMyFunction()
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {

		//람다식으로 MyFunction 의 run() 구현 
		
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() { //익명클래스로 run()을 구현 
			
			public void run() { //public 반ㄷ시 붙여야함 => 왜냐? MyFunction의 run()이 public 이기 때문에 붙여주지 않으면 default로 된다. 
				System.out.println("f1.run()");
			}
		};//f2
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("f1.run()") );
		
	}//main()
	
}
