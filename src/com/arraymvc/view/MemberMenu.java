package com.arraymvc.view;

import java.util.Scanner;

import com.arraymvc.controller.MemberController;
import com.arraymvc.model.vo.Member;


public class MemberMenu {

	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		
		// �޴� ��� >> �ݺ� ���� ó����
		while(true) {
			System.out.println("====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ��� >>");
			System.out.println("2. ȸ�� ���� �˻� >>");
			System.out.println("3. ȸ�� ���� ���� >>");
			System.out.println("4. ȸ�� ���� ���� >>");
			System.out.println("5. ȸ�� ���� ��� >>");
			System.out.println("6. ȸ�� ���� ���� >>");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				insertMember();
				break;
			case 2: 
				searchMember();
				break;
			case 3: 
				updateMember();
				break;
			case 4: 
				deleteMember();
				break;
			case 5: 
				printAllMember();
				break;
			case 6: 
				sortMember();
				break;
			case 9: 
				System.out.println("���α׷��� �����մϴ�.");
				return; 
			}//switch
		}//while
		
	}
	
	public void insertMember() {
		
		// 1. ���� ȸ�� ��(memberCount)�� �ִ� ȸ�� ��(SIZE)�� �Ѿ ��� return ó��
		// MemberController�� getMemberCount() �޼ҵ带 ���� ���� ȸ�� �� �˾ƿ���
		//�ִ� ȸ�� ���� ����ʵ忩�� Ŭ������. ���� ���� ���� ����
		if(mc.getMemberCount() > MemberController.SIZE) {
			return; 
		}
		
		// 2. ���̵� �Է� �޾� MemberController�� checkId() �޼ҵ�� ���� >> ��� �� �ޱ�
		// (���̵� �ߺ� üũ�ϴ� ����)
		System.out.print("���̵� �Է� : ");
		String userId = sc.nextLine();
		Member result = mc.checkId(userId);
		
		// 2_1. ��� ���� null�� �ƴ� ��� ��, ������ ���̵� �����ϴ� ���
		// �������� ���̵� �����մϴ�. ȸ����� ���С� ���
		if(result != null) {
			System.out.println("������ ���̵� �����մϴ�. ȸ����� ����.");
		}else {
			// 2_2. ��� ���� null�� ��� ��, ������ ���̵� �������� �ʴ� ���
			// ������ ȸ�� ���� �Է� �޵��� (��й�ȣ, �̸�, ����, ����, �̸���)
			System.out.print("��й�ȣ : ");
			String userPwd = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("���� : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			
			// �Է� ���� ������ Member�� �Ű����� �����ڸ� �̿��Ͽ� ��ü ���� ��
			Member mem = new Member(userId, userPwd, name, age, gender, email);
			// MemberController�� insertMember() �޼ҵ�� ����
			mc.insertMember(mem);
			// ������������ ȸ�� ����� �Ǿ����ϴ�.�� ���
			System.out.println("���������� ȸ�� ����� �Ǿ����ϴ�.");
		}
		
	}
	
	public void searchMember() {
		
		// �޴� ��� >> �ݺ� ���� ó����
		while(true) {
			System.out.println("====== ȸ�� ���� �˻� ======");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���� �޴���");
			System.out.print("�޴� ���� : >>");
			int menu = sc.nextInt();
			if(menu == 9) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			}
			sc.nextLine();
			System.out.print("�˻� ���� : >>");
			String search = sc.nextLine();
			
			// 1. MemberController�� searchMember() �޼ҵ�� menu�� search ���ڿ� ���� >> ��� ��
			Member result = mc.searchMember(menu, search);
			if(result == null) {
				// 1_1. ��� ���� null�� ��� ��, �˻� ����� ���� ��� >> ���˻��� ����� �����ϴ�.�� ���
				System.out.println("�˻��� ����� �����ϴ�.");
			}else {
				// 1_2. ��� ���� null�� �ƴ� ��� ��, �˻� ����� �����ϴ� ��� >> ȸ�� ���� ���4
				System.out.println(result.information());
			}
		}//while

	}
	
	public void updateMember() {
		
		// �޴� ��� >> �ݺ� ���� ó����
		while(true) {
			System.out.println("====== ȸ�� ���� ���� ======");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("9. ���� �޴���");
			System.out.print("�޴� ���� : >>");
			int menu = sc.nextInt();
			if(menu == 9) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			}
			sc.nextLine();
			System.out.print("������ ȸ�� ���̵� : >>");
			String userId = sc.nextLine();
			
			// 1. MemberController�� checkId()�� userId ���� >> ��� �� (m : Member)
			Member m = mc.checkId(userId);
			if(m == null) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}else {
				// 1_2. ��� ���� null�� �ƴ� ��� ���� ���� ��� ��
				System.out.println(m.information());
				// ���泻��(update : String) �Է� �ް�
				System.out.print("���� ���� �Է� : ");
				String update = sc.nextLine();
				// MemberController�� updateMember()�� m, menu, update ����
				mc.updateMember(m, menu, update);
				// ��ȸ���� ������ ����Ǿ����ϴ�.�� ���
				System.out.println("ȸ���� ������ ����Ǿ����ϴ�.");
			}
		}//while
		
	}
	
	public void deleteMember() {
		
		System.out.print("������ ȸ�� ���̵� : >>");
		String userId = sc.nextLine();
		// 1. MemberController�� checkId()�� userId ���� >> ��� �� (m : Member)
		Member m = mc.checkId(userId);
		// 1_1. ��� ���� null�� ��� �������� ȸ���� �������� �ʽ��ϴ�.�� ���
		if(m == null) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		}else {
			// 1_2. ��� ���� null�� �ƴ� ��� ���� ���� ���
			System.out.println(m.information());
			// ������ �����Ͻðڽ��ϱ�? (y/n) : �� >> Ű����� �Է� �ޱ�
			System.out.println("���� �����Ͻðڽ��ϱ�? (y/n) :");
			char answer = sc.nextLine().toUpperCase().charAt(0);
				if(answer == 'Y') {
					// ��ҹ��� ���� ���� ��Y���� ��� MemberController�� deleteMember()�� userId ����
					mc.deleteMember(userId);
					// ��ȸ���� ������ �����Ǿ����ϴ�.�� ���
					System.out.println("ȸ���� ������ �����Ǿ����ϴ�.");
				}
		}//if-else
	}
	
	public void printAllMember() {
		
		// MemberController�� getMem() �޼ҵ� ȣ�� >> ��� �� (mem : Member[])
		Member[] mem = mc.getMem();
		// �ݺ����� ���� ��� �� ���� �����ϴ� ȸ���� ���� ���
		for(Member m : mem) {
			if(m != null) {
				System.out.println(m.information());
			}
		}//for
	}
	
	public void sortMember() {
		
		// ���� ����� �޾� �� ��ü�迭 �ʱ�ȭ
		Member[] sortMem = null; 
		
		// �޴� ��� >> �ݺ� ���� ó����
		while(true) {
			System.out.println("====== ȸ�� ���� ���� ======");
			System.out.println("1. ���̵� �������� ����");
			System.out.println("2. ���̵� �������� ����");
			System.out.println("3. ���� �������� ����");
			System.out.println("4. ���� �������� ����");
			System.out.println("5. ���� �������� ����(������)");
			System.out.println("9. ���� �޴���");
			System.out.print("�޴� ���� : >> "); 
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: 
				sortMem = mc.sortIdAsc();
				break;
			case 2: 
				sortMem = mc.sortIdDesc();
				break;
			case 3: 
				sortMem = mc.sortAgeAsc();
				break;
			case 4: 
				sortMem = mc.sortAgeDesc();
				break;
			case 5: 
				sortMem = mc.sortGenderDesc();
				break;
			case 9: 
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			}//switch

			// �ݺ����� ���� sortMem ��ü �迭 ���
			for(Member m : sortMem) {
				if(m != null) {
					System.out.println(m.information());
				}
			}
		}//while
	}
	
}
