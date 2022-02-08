package com.io.practice.filebyte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// "����Ʈ ��� ��Ʈ��" ������ ������ ����� �غ���!
	// "����Ʈ ��Ʈ��" : �����͸� 1����Ʈ ������ �����ϴ� ��δ�! (���� �����.. 1����Ʈ�� �ѱ��� ����..)
	// "��� ��Ʈ��" : �ܺθ�ü�� ���������� ����Ǵ� ��δ�!
	
	// "����Ʈ ��� ��Ʈ��"   --> �ܺθ�ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����� ��ο� �����͸� 1����Ʈ ������ �����ϰڴ�!! (�Է� �� ���)
	
	// XXXInputStream	: XXX��ü�κ��� �����͸� �Է¹޴� ��� (�ܺθ�ü�� ����  ������ �о���ڴ�. �������ڴ�.)
	// XXXOutputStream	: XXX��ü�� �����͸� ����ϴ� ��� (�ܺθ�ü�� ������ ���ڴ�. �����ڴ�.)
	
	// File Input/Output Stream 		--> �ܺ� ��ü�� ���Ϸ� ����!
	// Audio Input/Output Stream		--> �ܺ� ��ü�� �������ġ�� ����!
	// Piped Input/Output Stream		--> �ܺ� ��ü�� �Ǵٸ� ���μ����� ����! (���μ����� ���)
	
	
	//���α׷� --> �ܺθ�ü(����)  ( ��� : ���α׷� ���� �����͸� ���Ϸ� �������� , �� ���Ϸ� ����)
	public void fileSave() {
		
		//FileOutputStream : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ�� 
		//1. FileOutputStream ��ü ������ ������ΰ� ������� (�ش� ������ ������ �ڵ����� ���� ��������� ����, ������ �׳� �ٷ� ����)	
		
		FileOutputStream fout = null; //��ü ����
		
		try {
			
			/*�߿�*/
			//true ���ۼ��� : ������ �ش� ������ ������� �������(�⺻�� false)
			//true �ۼ��� : ������ ������ �ִ°�� �̾ �ۼ��� (append)
			fout = new FileOutputStream("a_byte.txt", true);//�̾ �ۼ�

			//2.������ �����͸� ����� �� write() //IOException �߻� 
			//1byte ������ ����� �Ǳ� ������ -128~127 ������ ���ڸ� ����� ����(��, ���Ͽ��� �ش� ������ ������ ���ڰ� ��ϵ�)
			//������ ����ϸ� ������ �����
			fout.write(97); //-> a�� ����Ǿ�����
			fout.write('b'); //b�� ����
			//fout.write('��'); //?�� ���� (�ν� �Ұ���)
			
			byte[] bArr = {99, 100, 101}; //c,d,e �����
			fout.write(bArr);
			
			fout.write(bArr, 0, 2); //0��°���� 2�� => c,d ����� 
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				} //��Ʈ�� �ݾ��ֱ�
			}//if
		}//try~catch
		
	}
	
	//���α׷� <--���� (�Է� : ���Ϸ� ���� ������ �޾ƿ��� )
	public void fileRead() {
		
		//FileInputStream : "����"�� ���� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ�� 
		//1. FileInputStream ��ü���� --> ��ü ������ ������ΰ� ������� (�ش� ������ ������ FileNoutFoundException�߻� )
		FileInputStream fis = null; //��ü ���� 
		
		try {
			
			fis = new FileInputStream("a_byte.txt");
			
			int value = 0; 
			while((value = fis.read()) != -1) { //read() �ϸ鼭 ����ش�. EoF : ������ ���� ������ -1 ��ȯ => �� ������ ���� �ƴҶ����� �о���ڴ�
				System.out.println(value); //�޾ƿ��� ���� int���ε�, �츰 ���ڷ� ����������
				System.out.println((char)value); //char ������ ����ȯ
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
}
