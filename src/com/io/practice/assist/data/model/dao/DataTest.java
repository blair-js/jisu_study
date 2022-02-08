package com.io.practice.assist.data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTest {

	// Data outut/input ������Ʈ���� 
	// �����͸� �а� ���µ� �־ byte������ �ƴ� �⺻�ڷ����� ũ��� �а� ���� �ִ�.
	// ��, �� �⺻ �ڷ����� ũ�Ⱑ �ٸ��� ������ ����� ������ ������ �Ȱ��� ������ �о�;ߵȴ�.
	
	public void fileSaveOpen() {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.dat"));
			DataInputStream dis = new DataInputStream(new FileInputStream("d_data.dat"))){
			
			dos.writeUTF("��ȿ��");
			dos.writeInt(94);
			dos.writeChar('A');
			dos.writeBoolean(true);
			dos.writeDouble(15.21);

			while(true) {
				
				//������ �Է��ߴ� ������� �о�;� �Ѵ�!!!!!!!!!!!!!
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
				System.out.println(dis.readChar());
				System.out.println(dis.readBoolean());
				System.out.println(dis.readDouble());
			}
			
		} catch(EOFException e) {
			System.out.println("���� �б� �Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
