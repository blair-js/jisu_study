package com.io.homework.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);
	
	public FileDao() {	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = null;
		
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");

		while(true) {
			
			String answer = sc.nextLine();
			
			if(!answer.equals("exit")) { //exit가 아니면
				sb.append(answer); //입력받은 문자열 추가
			}else { //exit면
				break; //while문 탈출 
			}
			
		}
		
		System.out.println("저장하시겠습니까? (y/n)");
		String save = sc.nextLine();
		
		if(save.equalsIgnoreCase("y")) { // 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			
			System.out.println("저장할 파일명 입력 : "); // 저장할 파일명을 입력 받음
			String fileName = sc.nextLine();
			
			try { 
				
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				
				bw.write(sb.toString());
				//write 메소드의 매개변수로 sb를 넣으니까 자꾸 오류 뜸 
				//Stringbuilder가 시퀀스형?이라서 인자로 받지 못하는 것이라고 함.
				//결국 넣으려면 stringbuilder.toString()을 해줘야 한다고 함. => 왜? 왜? 왜? 
				
				System.out.println(fileName + ".txt" + "파일에 성공적으로 저장하였습니다.");
				
			}catch(IOException e ) {
				e.printStackTrace();
			}finally {
				if(bw != null) {
					try {
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}//if
			}//try~catch
		}else { // 입력 받은 값이 y가 아니면 (저장여부에 대해)
			
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}
		
	}
	
	public void fileOpen() {

		BufferedReader br = null;
		
		// “열기 할 파일명 : “
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		System.out.print("열기 할 파일명 : ");
		String fileName = sc.nextLine(); 
		
		try {
			
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			
			String str = null;
			
			if((str = br.readLine()) != null) { //EOF에서 null 반환하므로 파일끝의 전까지만 출력
				System.out.println(str);
			}
			
		}catch( FileNotFoundException e ) { // 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			System.out.println("존재하는 파일이 없습니다.");
		}catch( IOException e ) {
		e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
		
	}
	
	public void fileEdit() {
		
		StringBuilder sb = new StringBuilder(); 
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		System.out.print("수정 할 파일명 : ");
		String fileName = sc.nextLine();

		try {
			
			bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
			br = new BufferedReader(new FileReader(fileName + ".txt"));

			String str = null;
			
			while((str = br.readLine()) != null) { //EOF에서 null 반환하므로 파일끝의 전까지만 출력
				System.out.println(str);
			}
			
			System.out.println("파일에 추가할 내용을 입력하시오 :");

			while(true) {
				String answer = sc.nextLine();
				
				if(!answer.equals("exit")) { //exit가 아니면
					sb.append(answer); //입력받은 문자열 추가
				}else { //exit면
					break; //while문 탈출 
				}//if
			}//while
			
			System.out.println("저장하시겠습니까? (y/n)");
			String save = sc.nextLine();
			
			if(save.equalsIgnoreCase("y")) { 
				bw.write(sb.toString()); //파일에 추가~~~~~~~~ => 왜 안돼? 왜????????????????? 왜!!!!!!!!
				System.out.println(fileName + ".txt" + " 파일의 내용이 변경되었습니다.");
			}else { // 입력 받은 값이 y가 아니면 (저장여부에 대해)
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
			
		}catch( FileNotFoundException e ) {
			e.printStackTrace();
		}catch( IOException e ) {
			e.printStackTrace();
		}finally {
			if(br != null ) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bw != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}//try~catch

	}
	
}
