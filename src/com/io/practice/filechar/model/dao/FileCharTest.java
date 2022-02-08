package com.io.practice.filechar.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {

	//FileWriter : ���Ϸ� �����͸� 2byte ������ ����ϱ� (�ѱ��� �������ʴ´�)
    //1. FileWriter ��ü���� --> �ش� ������ ������ �ڵ����� ��������� ���� ��θ� ������ش�. �ش� ������ ������������ ������θ� ����.
	
	public void fileSave() {
		
		FileWriter fw = null; //��ü ����
		
		try {
			
			fw = new FileWriter("b_char.txt", false); //������ ���� 
			
			/*fw.write("�� ��մ�");
			fw.write('A');
			fw.write(' ');
			fw.write("\n");
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);*/
			
			fw.write("�ȳ�"); //����� �����̹Ƿ� 20����� 26������� �������� ���� 28���� ����� �ȴ�. => �� "�ȳ�"�� ����.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public void fileOpen() {
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				//System.out.println(value); //���ڰ� ���´�
				//System.out.println((char)value); //2byte�� ������ �б� ������ �ȳ� �̶�� ���ڰ� �� -> ���� -> �� �ϰ� ����. 
				System.out.print((char)value); //print�� ���־�� "�ȳ�" �̾ ����.
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		
	}
	
	
}
