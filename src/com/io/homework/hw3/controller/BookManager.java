package com.io.homework.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;
import com.io.homework.hw3.vo.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);
	
	public BookManager() {	}
	
	public void fileSave() {
		
		Book[] bk = new Book[5]; // Book객체를 받을 객체 배열
		// 객체 배열을 3번의 사용데이터로 초기화
		bk[0] = new Book("C언어", "김씨", 10000, setCalendar(2012, 2, 2), 0.1);
		bk[1] = new Book("자바", "이씨", 20000, setCalendar(2013, 3, 3), 0.2);
		bk[2] = new Book("C++", "박씨", 30000, setCalendar(2014, 4, 4), 0.3);
		bk[3] = new Book("넛지", "서씨", 40000, setCalendar(2015, 5, 5), 0.4);
		bk[4] = new Book("개미", "최씨", 50000, setCalendar(2016, 6, 6), 0.5);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			
			for(int i=0; i<bk.length; i++) {
				oos.writeObject(bk[i]); //bk의 i번째 저장
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public Calendar setCalendar(int year, int month, int day) {

		// 매개변수로 들어온 년, 월, 일로 설정된 Calendar형 반환
		Calendar cal = Calendar.getInstance(); //객체 얻고 
		cal.set(year, month-1, day); //매개변수로 들어온 애들로 셋팅해주되 월은 1 빼주기
		
		return cal;
		
	}

	public void fileRead() {
		
		Book[] readBook = new Book[10];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			
			int i = 0; //readBook 인덱스
			while(true) {
				readBook[i] = (Book)ois.readObject(); //ois.readObject() 의 반환형이 Object라 형변환
				System.out.println(readBook[i].toString());
				i++;
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("books.dat 읽기 완료!");			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
