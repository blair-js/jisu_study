package com.collection.homework.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.homework.controller.BookManager;
import com.collection.homework.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {	}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가"); //insertBook()
			System.out.println("2. 도서 삭제"); //deleteBook()
			System.out.println("3. 도서 검색 출력"); //searchBook()
			System.out.println("4. 전체 출력"); //selectList()
			System.out.println("0. 끝내기");
			System.out.print("메뉴 번호 선택 : >> ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				insertBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				selectList();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}//switch
		}//while
	}
	
	public void insertBook() {
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		// 위에서 입력 받은 title, category, author를 매개변수로 한 Book 객체 생성 (book)
		Book book = new Book(title, category, author);
		
		// BookManager의 insertBook 메소드로 book 전달
		bm.insertBook(book);
	}
	
	public void deleteBook() {
		
		System.out.print("도서 번호 : ");
		// BookManager의 deleteBook 메소드로 bNo 전달
		//  리턴 값 전달 받음 (result)
		int result = bm.deleteBook(sc.nextInt());
		sc.nextLine();
		
		if(result == 1) {
			System.out.println("성공적으로 삭제");
		}else {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
	}
	
	public void searchBook() {

		// BookManager의 searchBook 메소드로 title 전달
		// 리턴 값 전달 받음 (searchList)
		System.out.print("도서 제목 : ");
		ArrayList<Book> searchList = bm.searchBook(sc.nextLine());
		
		// searchList가 비어 있을 경우 >> “검색 결과가 존재하지 않습니다.”출력
		// searchList가 비어있지 않을 경우 >> for문을 이용하여 searchList 출력
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}//for
		}//if-else
	}
	
	public void selectList() {
		
		// BookManager의 selectList() 메소드 호출
		// 리턴 값 전달 받음 (bookList)
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("도서 목록이 존재하지 않습니다.");
		}else {
			for(Book b : bookList) {
				System.out.println(b);
			}//for
		}//if-else
		
	}
	
}
