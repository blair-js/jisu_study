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

	//원래 우리가 하던방식. 배열의 사이즈를 정해놓는다. -> 이를 보완한 컬렉션이라는게 있음! 
	/*{
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("LG",10000);
		arr[1] = new Phone("LG1",20000);
		arr[2] = new Phone("LG2",30000);
	}*/
	
	public void fileSave() {
		
		//<제네릭스> 사용하는 이유
		// 1. 명시된 타입의 객체만 저장하도록 제한을 두기 위해
		// 2. 컬렉션에 저장된 객체를 꺼내서 사용할때 형변환하는 절차를 없애기 위해
		
		ArrayList<Phone> phoneList = new ArrayList<Phone>(); //Phone 타입의 객체만 담는 list 생성
		
		//비어있는 phoneList에 객체들 추가 
		phoneList.add(new Phone("LG",10000));
		phoneList.add(new Phone("LG1",20000));
		phoneList.add(new Phone("LG2",30000));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone1.txt"))){
			
			//list에 담겨있는 객체 수만큼 반복해서 파일 입력~
			for(int i=0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i)); //phoneList의 i번째를 입력!
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
				phoneList.add((Phone)ois.readObject()); //읽어온 객체를 리스트에 넣고
				
				System.out.println(phoneList.get(i)); //해당 i번째 객체를 출력
				i++;
			}
			
		}catch(EOFException e) {
			System.out.println("파일 읽기 완료");
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
