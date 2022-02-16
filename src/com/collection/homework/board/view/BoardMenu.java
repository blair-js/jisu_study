package com.collection.homework.board.view;

import java.util.Scanner;

import com.collection.homework.board.controller.BoardManager;

public class BoardMenu {

	private Scanner sc = new Scanner(System.in);
	private BoardManager bm = new BoardManager();
	
	public BoardMenu() {}
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("******* �Խñ� ���� ���α׷� *******");
			System.out.println("1. �Խñ� ����");
			System.out.println("2. �Խñ� ��ü ����");
			System.out.println("3. �Խñ� �� �� ����");
			System.out.println("4. �Խñ� ���� ����");
			System.out.println("5. �Խñ� ���� ����");
			System.out.println("6. �Խñ� ����");
			System.out.println("7. �Խñ� �˻�");
			System.out.println("8. ���Ͽ� �����ϱ�");
			System.out.println("9. �����ϱ�");
			System.out.println("10. ������");
			System.out.print("�޴� ��ȣ ���� : >> ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: 
				bm.writeBoard();
				break;
			case 2: 
				bm.displayAllList();
				break;
			case 3: 
				bm.displayBoard();
				break;
			case 4: 
				bm.modifyTitle();
				break;
			case 5: 
				bm.modifyContent();
				break;
			case 6: 
				bm.deleteBoard();
				break;
			case 7: 
				bm.searchBoard();
				break;
			case 8: 
				bm.saveListFile();
				break;
			case 9: 
				sortSubMenu();
				break;
			case 10: 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				break;
			}//switch
		}//while
		
	}
	
	public void sortSubMenu() {
		
		while(true) {
			System.out.println("****** �Խñ� ���� �޴� ******");
			System.out.println("1. �۹�ȣ�� ������������");
			System.out.println("2. �۹�ȣ�� ������������");
			System.out.println("3. �ۼ���¥�� ������������");
			System.out.println("4. �ۼ���¥�� ������������");
			System.out.println("5. ������� ������������");
			System.out.println("6. ������� ������������");
			System.out.println("7. ���� �޴��� �̵�");
			System.out.print("�޴� ��ȣ ���� : >> ");
			int num = sc.nextInt();
			sc.nextLine();

			
			switch(num) {
			case 1: 
				bm.sortList(1, false);
				break;
			case 2: 
				bm.sortList(1, true);
				break;
			case 3: 
				bm.sortList(2, false);
				break;
			case 4: 
				bm.sortList(2, true);
				break;
			case 5: 
				bm.sortList(3, false);
				break;
			case 6: 
				bm.sortList(3, true);
				break;
			case 7: 
				System.out.println("�����޴��� �̵��մϴ�.");
				return;
			default:
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				break;
			}//switch
		}//while
		
	}

}
