package com.collection.homework.controller;

import java.util.ArrayList;

import com.collection.homework.model.vo.Book;

public class BookManager {

	private ArrayList<Book> bookList = new ArrayList<>();
	
	public BookManager() {	}

	public void insertBook(Book book) {
		
		// 전달 받은 book은 현재 도서 번호가 0인 채로 들어오는데
		// 새로운 도서가 추가될 때마다 추가되는 도서의 도서 번호는 리스트 마지막 도서 번호의 다음 번호로 부여해야 됨
		int lastNo = 0; // 우선 변수 생성 및 초기화(들어오는 객체 book에 넣을 도서번호임)
		
		try {

			lastNo = bookList.get(bookList.size()-1).getbNo() + 1; // 마지막 도서객체를 얻어와 그 객체의 도서번호를 얻은 후 + 1 더해주기
			
			// 하지만 리스트에 도서가 없는 경우, 즉 첫 도서 등록일 경우 위의 문장에서 예외 발생
			//어떤 예외처리가 발생하는지 알아보고 try catch문을 이용하여 오류 해결
		
		}catch (IndexOutOfBoundsException e) {
			//e.printStackTrace(); //IndexOutOfBoundsException 발생
			// 해당 예외 발생 시 lastNo = 1; 로 초기화
			lastNo = 1;
		}
		
		// setter를 이용하여 book 도서 번호를 lastNo로 적용
		book.setbNo(lastNo);

		// bookList의 book 추가
		bookList.add(book);
		
	}

	public int deleteBook(int bNo) {
		
		// for문을 이용하여 전달받은 도서 번호가 존재하는 도서 삭제
		// 성공적으로 삭제 할 경우 1 리턴
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == bNo) { //bookList의 i번째 객체를 얻어와 그 객체의 bNo를 뽑고 비교. 일치한다면
				bookList.remove(i); //해당 인덱스 i번째 삭제
				return 1;
			} 
		}//for
		// 삭제 되지 않은 경우 즉, 존재하는 도서 번호가 없는 경우 0 리턴 => 반복을 다 돌았는데 반복문 안의 return을 만나지 못했으므로 여기까지 옴
		return 0;
	}
	
	public ArrayList<Book> searchBook(String title){
		
		ArrayList<Book> searchList = new ArrayList<Book>(); // 검색 결과값들을 보관할 리스트
		
		// for문을 이용하여 전달받은 제목을 포함한 도서를 searchList에 추가
		for(Book b : bookList) {
			if(b.getTitle().contains(title)) { //객체 b의 타이틀을 얻어온 후 매개변수로 들어온 title을 포함하고 있는지 확인. 있다면
				searchList.add(b); //담기
			}
		}
		
		// searchList 리턴
		return searchList;
	}
	
	public ArrayList<Book> selectList(){
		
		// bookList 리턴
		return bookList;
	}
	
}
