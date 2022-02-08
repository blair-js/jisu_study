package com.io.homework.hw1.run;

import java.util.Scanner;

import com.io.homework.hw1.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		while(true) {
			
			System.out.println("****** MyNote ******");
			System.out.println("1. ��Ʈ ���� �����"); // fd.fileSave() ����
			System.out.println("2. ��Ʈ ����"); // fd.fileOpen() ����
			System.out.println("3. ��Ʈ ��� �����ϱ�"); // fd.fileEdit() ����
			System.out.println("4. ������");
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: 
				fd.fileSave();
				break;
			case 2: 
				fd.fileOpen();
				break;
			case 3: 
				fd.fileEdit();
				break;
			case 4: 
				return;
			default:
				System.out.println("��ȣ�� �ٽ� �Է��ϼ���.");
				break;
			}//switch
			
		}//while

	}

}
