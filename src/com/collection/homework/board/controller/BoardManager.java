package com.collection.homework.board.controller;

import java.util.Scanner;
import java.util.function.Supplier;

import com.collection.homework.board.model.dao.BoardDao;

public class BoardManager {

	//private BoardDao bd = new BoardDao();
	private Supplier<BoardDao> bd = BoardDao::new; //�޼��� ������ �����ؼ� �غ���
	private Scanner sc = new Scanner(System.in);
	
	public BoardManager() { }
	
	public void writeBoard() {
		
		System.out.println("�� �Խñ� ���� �Դϴ�.");
		System.out.println("�� ���� : ");
		// "" ���
		// "�� ���� : " >> �Է� ���� (���� ����)
		// "�ۼ��� : " >> �Է� ���� (���� ����)
		// �ۼ���¥�� ���� ��¥�� ó����
		// "�� ���� : " >> ���� �ٷ� �Է� ���� >>"exit" �Է��ϸ� �Է�����
		// BoardDao�� getLastBoardNo() �޼ҵ带 ���� �Խñ��� ������ ��ȣ�� �˾ƿ�
		// Board ��ü ������ �ʱⰪ���� �����
		// BoardDao�� writeBoard() �޼ҵ� ȣ�� �� �ش� Board ����
		// ������ �������� ���� ���, �� ù �� ����� ��� ���� �߻�
		//� ����ó���� �߻��ϴ��� �˾ƺ��� try catch���� �̿��Ͽ� ���� �ذ�
	}
	
	public void displayAllList() {
		
	}
	
	public void displayBoard() {
		
	}
	
	public void modifyTitle() {
		
	}
	
	public void modifyContent() {
		
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
