package com.io.practice.assist.buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdTest {

	
	public void fileSave() {
		
		//1. 기반스트림 생성 (어떤 외부매체와 데이터를 주고받을 것이냐를 선택해주는 메인(기반) 스트림이 반드시 필요.
		
		//BufferedWriter bw = null; //객체 선언
		
		/*try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			//보조 스트림의 매개변수로 기반 스트림을 넣어주기~
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); //개행의 역할 \n 대신 사용 
			bw.write("감사합니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}*/
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			//이렇게 try 구문안에 넣어주면 자원반납 (bw 객체 반납)을 해주지 않아도 된다~ 굿~
			
			bw.write("안녕\n");
			bw.write("방가방가");
			bw.newLine(); //개행의 역할 \n 대신 사용 
			bw.write("감사");
			//39~42행의 내용으로 덮어씌워진다. 위에서 true로 해주지 않아서 append 되지 않음~기본값 false
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void fileOpen() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){

			String value = null; 
			
			while((value = br.readLine()) != null) { //EoF를 만나면 null이 던져짐!
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
