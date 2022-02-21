package com.collection.homework.board.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Supplier;

import javax.swing.text.AbstractDocument.Content;

import com.collection.homework.board.model.dao.BoardDao;
import com.collection.homework.board.model.vo.Board;

public class BoardManager {

	private BoardDao bd = new BoardDao();
	//private Supplier<BoardDao> bd = BoardDao::new; //메서드 참조로 변경해서 해보기
	private Scanner sc = new Scanner(System.in);
	
	public BoardManager() { }
	
	public void writeBoard() {
		
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String author = sc.nextLine();
		
		Date boardDate = new Date();
		
		System.out.println("글 내용 : ");
		String content;
		do {
			content = sc.nextLine();
		}while(content.equals("exit"));
		
		int boardNo = bd.getLastBoardNo(); 
		
		bd.writeBoard(new Board(boardNo, title, author, boardDate, content));

		// 파일이 존재하지 않을 경우, 즉 첫 글 등록일 경우 예외 발생
		//어떤 예외처리가 발생하는지 알아보고 try catch문을 이용하여 오류 해결
		
	}
	
	public void displayAllList() {
		
		ArrayList<Board> list = bd.displayAllList();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it);
		}
		
	}
	
	public void displayBoard() {

		System.out.print("조회할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(boardNo);
		
		if(board != null) {
			System.out.println(board);
			bd.upReadCount(boardNo);
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
		
	}
	
	public void modifyTitle() {
		
		System.out.print("수정할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(boardNo);
		
		if(board != null) {
			System.out.println(board);
			System.out.println("변경할 글 제목 :");
			String content = sc.nextLine();
			bd.modifyTitle(boardNo, content);
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
		
	}
	
	public void modifyContent() {
		
		// 위의 modifyTitle() 메소드 구현 내용과 동일 >> title을 content로만 변경
	}
	
	public void deleteBoard() {
		
	}
	
	public void searchBoard() {
		
	}
	
	public void saveListFile() {
	
 	}
	
	public void sortList(int item, Boolean isDesc) {
		
	}
}
