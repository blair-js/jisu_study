package com.io.practice.assist.object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.practice.assist.object.model.vo.Phone;

public class ObjectDao {

	public void fileSave() {
		
		//��ü�� ���Ͽ� ����Ҷ� ���Ǵ� ��Ʈ��
		//FileOutputStream : ������¿� ���Ǵ� "���" ����Ʈ ��Ʈ�� Ŭ����
		//ObjectOutputStream : ��ü ������ ��½� ���Ǵ� "����" ����Ʈ ��Ʈ�� Ŭ����
		
		Phone ph = new Phone("�Ｚ", 2000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			
			oos.writeObject(ph); //object ���·� �Է� (������ ������ ��ü ph �ֱ�)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
			
			
			Phone ph = (Phone)ois.readObject(); //readObject�� ��ȯ���� Object�� ����ȯ ���־�� ��
			System.out.println(ph); //��ü ph�� toString() �ڵ�ȣ��(Phone Ŭ������ �������̵� �س���)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
