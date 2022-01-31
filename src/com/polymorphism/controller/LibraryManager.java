package com.polymorphism.controller;

import com.polymorphism.model.vo.AniBook;
import com.polymorphism.model.vo.Book;
import com.polymorphism.model.vo.CookBook;
import com.polymorphism.model.vo.Member;

public class LibraryManager{

	private Member mem = null;
	private Book[] bList = new Book[5];
	
	public LibraryManager() {	}	
	
	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {

		// 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		this.mem = mem;
	}
	
	public Member myInfo() {

		// 회원 레퍼런스(mem) 주소 값 리턴
		return mem;
		
	}
	
	public Book[] selectAll() {
	
		// 도서 목록 레퍼런스(bList) 주소 값 리턴
		return bList;
		
	}
	
	public Book[] searchBook(String keyword) {
		
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
		// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
		Book[] newList = new Book[5];
		int count = 0; //검색 결과 도서목록 인덱스 
		
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		for(Book b : bList) {
			if(b.getTitle().contains(keyword)) {
				// 전달받은 keyword를 포함하고 있으면 (HINT : String 클래스의 contains() 참고)
				// 검색결과의 도서목록에 담기 (HINT : count 이용) 
				newList[count++] = b;
			}
		}//for
		
		// 해당 검색결과의 도서목록 주소 값 리턴
		return newList;
		
	}
	
	public int rentBook(int index) {
		
		int result = 0;
		
		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		if(bList[index] instanceof AniBook) {
			// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) { //getAccessAge 는 AniBook에만 있는 메소드이므로 형변환 필요 (부모 접근 불가)
				// result를 1로 초기화  나이 제한으로 대여 불가하다는 의미
				result = 1;
			}
			// 전달 받은 index의 bList 객체가 실제 CookBook 객체를 참조하고 있고
		}else if(bList[index] instanceof CookBook) {
			// 해당 요리책의 쿠폰유무가 “true”일 경우
			if(((CookBook)bList[index]).isCoupon() == true) {
				// 회원의 couponCount 1 증가 처리 후
				mem.setCouponCount(mem.getCouponCount() + 1); //현재 보유한 쿠폰갯수에서 +
				// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰이 발급됐다는 의미
				return 2; 
			}
		}//if-else
		
		// result 값 리턴
		return result;
		
	}

}
