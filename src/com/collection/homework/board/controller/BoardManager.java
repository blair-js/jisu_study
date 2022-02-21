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
	//private Supplier<BoardDao> bd = BoardDao::new; //�޼��� ������ �����ؼ� �غ���
	private Scanner sc = new Scanner(System.in);
	
	public BoardManager() { }
	
	public void writeBoard() {
		
		System.out.println("�� �Խñ� ���� �Դϴ�.");
		System.out.print("�� ���� : ");
		String title = sc.nextLine();
		System.out.print("�ۼ��� : ");
		String author = sc.nextLine();
		
		Date boardDate = new Date();
		
		System.out.println("�� ���� : ");
		String content;
		do {
			content = sc.nextLine();
		}while(content.equals("exit"));
		
		int boardNo = bd.getLastBoardNo(); 
		
		bd.writeBoard(new Board(boardNo, title, author, boardDate, content));

		// ������ �������� ���� ���, �� ù �� ����� ��� ���� �߻�
		//� ����ó���� �߻��ϴ��� �˾ƺ��� try catch���� �̿��Ͽ� ���� �ذ�
		
	}
	
	public void displayAllList() {
		
		ArrayList<Board> list = bd.displayAllList();
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it);
		}
		
	}
	
	public void displayBoard() {

		System.out.print("��ȸ�� �� ��ȣ : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(boardNo);
		
		if(board != null) {
			System.out.println(board);
			bd.upReadCount(boardNo);
		}else {
			System.out.println("��ȸ�� ���� �����ϴ�.");
		}
		
	}
	
	public void modifyTitle() {
		
		System.out.print("������ �� ��ȣ : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(boardNo);
		
		if(board != null) {
			System.out.println(board);
			System.out.println("������ �� ���� :");
			String content = sc.nextLine();
			bd.modifyTitle(boardNo, content);
		}else {
			System.out.println("��ȸ�� ���� �����ϴ�.");
		}
		
	}
	
	public void modifyContent() {
		
		// ���� modifyTitle() �޼ҵ� ���� ����� ���� >> title�� content�θ� ����
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
