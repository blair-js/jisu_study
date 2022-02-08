package com.io.practice.filechar.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

	//FileWriter : 파일로 데이터를 2byte 단위로 출력하기 (한글이 깨지지않는다)
    //1. FileWriter 객체생성 --> 해당 파일이 없으면 자동으로 만들어지고 연결 통로를 만들어준다. 해당 파일이 기존에있으면 연결통로만 연결.
	
	public void fileSave() {
		
		FileWriter fw = null; //객체 선언
		
		try {
			
			fw = new FileWriter("b_char.txt", false); //덮어쓰기로 진행 
			
			/*fw.write("와 재밌다");
			fw.write('A');
			fw.write(' ');
			fw.write("\n");
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);*/
			
			fw.write("안녕"); //덮어쓰는 형태이므로 20행부터 26행까지의 내용위에 현재 28행이 덮어쓰게 된다. => 즉 "안녕"만 남음.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public void fileOpen() {
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				//System.out.println(value); //숫자가 나온다
				//System.out.println((char)value); //2byte씩 나눠서 읽기 때문에 안녕 이라는 글자가 안 -> 개행 -> 녕 하고 나옴. 
				System.out.print((char)value); //print로 해주어야 "안녕" 이어서 나옴.
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		
	}
	
	
}
