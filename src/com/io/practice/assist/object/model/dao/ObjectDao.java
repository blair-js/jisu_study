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
		
		//객체를 파일에 출력할때 사용되는 스트림
		//FileOutputStream : 파일출력에 사용되는 "기반" 바이트 스트림 클래스
		//ObjectOutputStream : 객체 단위로 출력시 사용되는 "보조" 바이트 스트림 클래스
		
		Phone ph = new Phone("삼성", 2000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			
			oos.writeObject(ph); //object 형태로 입력 (위에서 생성한 객체 ph 넣기)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
			
			
			Phone ph = (Phone)ois.readObject(); //readObject의 반환형이 Object라 형변환 해주어야 함
			System.out.println(ph); //객체 ph의 toString() 자동호출(Phone 클래스에 오버라이드 해놓음)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
