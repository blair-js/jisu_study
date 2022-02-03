package com.exception.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	public void method1() {
	
		try {
			method2();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println();
			System.out.println("���α׷� ����");
		}
		
	}

	public void method2() throws IOException {
		
		byte[] aa = {'a', 'b', 'c'}; 
		
		System.out.write(aa);
		
		/*try {
			System.out.write(aa);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}
	
	public void method3() throws Exception {
		//���� �߻��� ���ܴ� IOException ������ �� ���� �������� ���ܸ� ����
		//InputStreamReader: ����Ʈ ��Ʈ���� ���� ��Ʈ������ ��������ִ� ������ �ϴ� ������Ʈ��
		//system Ŭ������ inputStream System.in --> byte���� ǥ�� ��ǲ��Ʈ�� Ű�����Է�
		//			   outputStream System.out --> ǥ�� �ƿ�ǲ ��Ʈ�� ȭ�����  
		//BufferedReader�� ���� �Է� ��Ʈ���� ����Ǿ� ���۸� ������ �ִ� ���� ��Ʈ���̴�.
		//BufferedReader�� �Է� �ҽ��κ��� �ڽ��� ���� ���� ũ�⸸ŭ �����͸� �̸� �а� ���ۿ� ������ �д�. 
		//���α׷��� �ܺ��� �Է� �ҽ��κ��� ���� �д� ��� ���۷κ��� �������ν� �б� ������ ���ȴ�
		//readLine(); ���پ� ���� ��ŭ ��ȯ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�ƹ� ���ڿ��̳� �Է�");
		
		/*try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		String str = br.readLine();
		System.out.println(str);
		if(str.equals("a")) {
			System.out.println("���� �߻�");
		}
	}
	
	public void method4() {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("a.txt"));
			String str = br.readLine();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("���Ͼ���");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void method5() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("a.txt"))){
			
		}catch(FileNotFoundException e) {
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
	
}
