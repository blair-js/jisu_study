package com.objectmvc.practice.view;

import java.util.Scanner;

import com.objectmvc.practice.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberView() {	}
	
	public void mainMenu() {
		
		System.out.print("���̵� �Է��Ͻÿ� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		String pwd = sc.nextLine();
		// �Է¹��� ���̵�, ��й�ȣ ����
		
		// MemberController Ŭ������ login �޼ҵ忡 �����ϰ�
		int result = mc.login(id, pwd);
		// �� ������� result������ �޴´�.
		
		if(result == 1) {
			while(true) {
				System.out.println("=== ȸ�� ���α׷� ===");
				System.out.println("1.�� ���� ����");
				System.out.println("2. �� ���� ��ȸ�ϱ� ");
				System.out.println("3. Ű �����ϱ�  ");
				System.out.println("9. ���α׷� �����ϱ�");
				System.out.print("�޴� ��ȣ ���� : ");
				int menu = sc.nextInt();
				
				switch(menu) {
				case 1: 
					System.out.println(mc.readInfo().information()); // MemberController�� readInfo() ȣ��
					break;
				case 2: 
					System.out.println(mc.readAge() + "��"); // MemberController�� readAge() ȣ��
					break;
				case 3: 
					updateHeight(); // "MemberView"�� updateHeight() ȣ��
					break;
				case 9: 
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}//while
		}else {
			return; // �α��ο� ���� ���� ��� => ��, result ���� ���� 0�� ��� => ���α׷� ����
		}
		
	}
	
	public void updateHeight() {
		
		System.out.print("������ Ű�� �Է��Ͻÿ� : ");
		double height = sc.nextDouble(); // �Է� ���� Ű ����
		mc.updateHeight(height); // MemberController Ŭ������ updateHeight() �޼ҵ忡 ����
 
	}
	
}
