package com.io.practice.assist.object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.io.practice.assist.object.model.vo.Phone;

public class ObjectsDao {

	//���� �츮�� �ϴ����. �迭�� ����� ���س��´�. -> �̸� ������ �÷����̶�°� ����! 
	/*{
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("LG",10000);
		arr[1] = new Phone("LG1",20000);
		arr[2] = new Phone("LG2",30000);
	}*/
	
	public void fileSave() {
		
		//<���׸���> ����ϴ� ����
		// 1. ��õ� Ÿ���� ��ü�� �����ϵ��� ������ �α� ����
		// 2. �÷��ǿ� ����� ��ü�� ������ ����Ҷ� ����ȯ�ϴ� ������ ���ֱ� ����
		
		ArrayList<Phone> phoneList = new ArrayList<Phone>(); //Phone Ÿ���� ��ü�� ��� list ����
		
		//����ִ� phoneList�� ��ü�� �߰� 
		phoneList.add(new Phone("LG",10000));
		phoneList.add(new Phone("LG1",20000));
		phoneList.add(new Phone("LG2",30000));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))){
			
			//list�� ����ִ� ��ü ����ŭ �ݺ��ؼ� ���� �Է�~
			for(int i=0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i)); //phoneList�� i��°�� �Է�!
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void fileOpen() {

		ArrayList<Phone> phoneList = new ArrayList<Phone>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone1.txt"))){
			
			int i = 0; 
			while(true) {
				phoneList.add((Phone)ois.readObject()); //�о�� ��ü�� ����Ʈ�� �ְ�
				
				System.out.println(phoneList.get(i)); //�ش� i��° ��ü�� ���
				i++;
			}
			
		}catch(EOFException e) {
			System.out.println("���� �б� �Ϸ�");
			return;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
