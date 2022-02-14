package com.lambda.practice;

@FunctionalInterface
interface MyFunction{
	void run(); //���� ����
}


public class Ex14_1 {

	static void execute(MyFunction f) { //�Ű������� Ÿ���� MyFunction �̴�.
		f.run(); //MyFunction�� �����ϴ� run() ȣ��
	}
	
	static MyFunction getMyFunction() { //��ȯ Ÿ���� MyFunction �� �޼ҵ� getMyFunction()
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {

		//���ٽ����� MyFunction �� run() ���� 
		
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() { //�͸�Ŭ������ run()�� ���� 
			
			public void run() { //public �ݤ��� �ٿ����� => �ֳ�? MyFunction�� run()�� public �̱� ������ �ٿ����� ������ default�� �ȴ�. 
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
