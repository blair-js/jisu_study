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
		
		//���ڸ� ��� �����ص� �ؽ��ڵ�� �Ȱ���. 
		
		StringBuilder sb = new StringBuilder("��"); //ũ�� 16 + 1 = 17
		sb.append("����ľƾƾƾ�").append("!!!!!!!!!!!!!!!!");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		
		sb.insert(1, "����ð� ���̶�");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.delete(0, 8);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse());
		System.out.println(sb.hashCode());
		
	}

	private static void method2() {

		String str = "�ݰ���";
		System.out.println("str ���� : "+ str +" �ּ� : "+ System.identityHashCode(str));
		str +="�� ��Ʈ���̶���� ";
		System.out.println("str ������ : "+ str +" �ּ� : "+ System.identityHashCode(str));
		
	}

	private static void method1() {

		StringBuilder sb = new StringBuilder("��鹹�ϴ�");
		
		System.out.println(sb.capacity()); //�̼����� 16 => "��鹹�ϴ�" �Է½� 21 => 16+5(��鹹�ϴ� ��ŭ ����) 
		System.out.println(sb.length()); //�̼����� 0 => "��鹹�ϴ�" �Է½� 5
		
		StringBuilder sb1 = new StringBuilder(20);
		System.out.println(sb1.capacity());
		
	}
	
	

}
