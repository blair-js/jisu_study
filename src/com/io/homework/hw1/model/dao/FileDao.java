package com.io.homework.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);
	
	public FileDao() {	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = null;
		
		System.out.println("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");

		while(true) {
			
			String answer = sc.nextLine();
			
			if(!answer.equals("exit")) { //exit�� �ƴϸ�
				sb.append(answer); //�Է¹��� ���ڿ� �߰�
			}else { //exit��
				break; //while�� Ż�� 
			}
			
		}
		
		System.out.println("�����Ͻðڽ��ϱ�? (y/n)");
		String save = sc.nextLine();
		
		if(save.equalsIgnoreCase("y")) { // �Է� ���� ���� �빮���̵� �ҹ����̵� ������� ��y���̸�,
			
			System.out.println("������ ���ϸ� �Է� : "); // ������ ���ϸ��� �Է� ����
			String fileName = sc.nextLine();
			
			try { 
				
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				
				bw.write(sb.toString());
				//write �޼ҵ��� �Ű������� sb�� �����ϱ� �ڲ� ���� �� 
				//Stringbuilder�� ��������?�̶� ���ڷ� ���� ���ϴ� ���̶�� ��.
				//�ᱹ �������� stringbuilder.toString()�� ����� �Ѵٰ� ��. => ��? ��? ��? 
				
				System.out.println(fileName + ".txt" + "���Ͽ� ���������� �����Ͽ����ϴ�.");
				
			}catch(IOException e ) {
				e.printStackTrace();
			}finally {
				if(bw != null) {
					try {
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}//if
			}//try~catch
		}else { // �Է� ���� ���� y�� �ƴϸ� (���忩�ο� ����)
			
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
			return;
		}
		
	}
	
	public void fileOpen() {

		BufferedReader br = null;
		
		// ������ �� ���ϸ� : ��
		// ���ϸ��� Scanner�� �Է� �޾�, BufferedReader�� FileReader ��Ʈ�� ���
		System.out.print("���� �� ���ϸ� : ");
		String fileName = sc.nextLine(); 
		
		try {
			
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			
			String str = null;
			
			if((str = br.readLine()) != null) { //EOF���� null ��ȯ�ϹǷ� ���ϳ��� �������� ���
				System.out.println(str);
			}
			
		}catch( FileNotFoundException e ) { // �������� ���� ���� �� �Է����� �� �ش� ����ó�������� �����
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}catch( IOException e ) {
		e.printStackTrace();
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
		
	}
	
	public void fileEdit() {
		
		StringBuilder sb = new StringBuilder(); 
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		System.out.print("���� �� ���ϸ� : ");
		String fileName = sc.nextLine();

		try {
			
			bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
			br = new BufferedReader(new FileReader(fileName + ".txt"));

			String str = null;
			
			while((str = br.readLine()) != null) { //EOF���� null ��ȯ�ϹǷ� ���ϳ��� �������� ���
				System.out.println(str);
			}
			
			System.out.println("���Ͽ� �߰��� ������ �Է��Ͻÿ� :");

			while(true) {
				String answer = sc.nextLine();
				
				if(!answer.equals("exit")) { //exit�� �ƴϸ�
					sb.append(answer); //�Է¹��� ���ڿ� �߰�
				}else { //exit��
					break; //while�� Ż�� 
				}//if
			}//while
			
			System.out.println("�����Ͻðڽ��ϱ�? (y/n)");
			String save = sc.nextLine();
			
			if(save.equalsIgnoreCase("y")) { 
				bw.write(sb.toString()); //���Ͽ� �߰�~~~~~~~~ => �� �ȵ�? ��????????????????? ��!!!!!!!!
				System.out.println(fileName + ".txt" + " ������ ������ ����Ǿ����ϴ�.");
			}else { // �Է� ���� ���� y�� �ƴϸ� (���忩�ο� ����)
				System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
			}
			
		}catch( FileNotFoundException e ) {
			e.printStackTrace();
		}catch( IOException e ) {
			e.printStackTrace();
		}finally {
			if(br != null ) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bw != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}//try~catch

	}
	
}
