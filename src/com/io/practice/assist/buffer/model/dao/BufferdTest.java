package com.io.practice.assist.buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdTest {

	
	public void fileSave() {
		
		//1. ��ݽ�Ʈ�� ���� (� �ܺθ�ü�� �����͸� �ְ���� ���̳ĸ� �������ִ� ����(���) ��Ʈ���� �ݵ�� �ʿ�.
		
		//BufferedWriter bw = null; //��ü ����
		
		/*try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			//���� ��Ʈ���� �Ű������� ��� ��Ʈ���� �־��ֱ�~
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
			bw.newLine(); //������ ���� \n ��� ��� 
			bw.write("�����մϴ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}*/
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			//�̷��� try �����ȿ� �־��ָ� �ڿ��ݳ� (bw ��ü �ݳ�)�� ������ �ʾƵ� �ȴ�~ ��~
			
			bw.write("�ȳ�\n");
			bw.write("�氡�氡");
			bw.newLine(); //������ ���� \n ��� ��� 
			bw.write("����");
			//39~42���� �������� ���������. ������ true�� ������ �ʾƼ� append ���� ����~�⺻�� false
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void fileOpen() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){

			String value = null; 
			
			while((value = br.readLine()) != null) { //EoF�� ������ null�� ������!
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
