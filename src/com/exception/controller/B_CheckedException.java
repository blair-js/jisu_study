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
			System.out.println("프로그램 종료");
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
		//실제 발생한 예외는 IOException 이지만 더 상위 개념으로 예외를 던짐
		//InputStreamReader: 바이트 스트림을 문자 스트림으로 연결시켜주는 역할을 하는 보조스트림
		//system 클래스의 inputStream System.in --> byte단위 표준 인풋스트림 키보드입력
		//			   outputStream System.out --> 표준 아웃풋 스트림 화면출력  
		//BufferedReader는 문자 입력 스트림에 연결되어 버퍼를 제공해 주는 보조 스트림이다.
		//BufferedReader는 입력 소스로부터 자신의 내부 버퍼 크기만큼 데이터를 미리 읽고 버퍼에 저장해 둔다. 
		//프로그램은 외부의 입력 소스로부터 직접 읽는 대신 버퍼로부터 읽음으로써 읽기 성능이 향상된다
		//readLine(); 한줄씩 읽은 만큼 반환
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("아무 문자열이나 입력");
		
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
			System.out.println("에러 발생");
		}
	}
	
	public void method4() {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("a.txt"));
			String str = br.readLine();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일없음");
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
