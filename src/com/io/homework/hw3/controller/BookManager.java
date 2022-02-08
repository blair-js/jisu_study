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
		
		Book[] bk = new Book[5]; // Book��ü�� ���� ��ü �迭
		// ��ü �迭�� 3���� ��뵥���ͷ� �ʱ�ȭ
		bk[0] = new Book("C���", "�达", 10000, setCalendar(2012, 2, 2), 0.1);
		bk[1] = new Book("�ڹ�", "�̾�", 20000, setCalendar(2013, 3, 3), 0.2);
		bk[2] = new Book("C++", "�ھ�", 30000, setCalendar(2014, 4, 4), 0.3);
		bk[3] = new Book("����", "����", 40000, setCalendar(2015, 5, 5), 0.4);
		bk[4] = new Book("����", "�־�", 50000, setCalendar(2016, 6, 6), 0.5);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			
			for(int i=0; i<bk.length; i++) {
				oos.writeObject(bk[i]); //bk�� i��° ����
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public Calendar setCalendar(int year, int month, int day) {

		// �Ű������� ���� ��, ��, �Ϸ� ������ Calendar�� ��ȯ
		Calendar cal = Calendar.getInstance(); //��ü ��� 
		cal.set(year, month-1, day); //�Ű������� ���� �ֵ�� �������ֵ� ���� 1 ���ֱ�
		
		return cal;
		
	}

	public void fileRead() {
		
		Book[] readBook = new Book[10];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			
			int i = 0; //readBook �ε���
			while(true) {
				readBook[i] = (Book)ois.readObject(); //ois.readObject() �� ��ȯ���� Object�� ����ȯ
				System.out.println(readBook[i].toString());
				i++;
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("books.dat �б� �Ϸ�!");			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
