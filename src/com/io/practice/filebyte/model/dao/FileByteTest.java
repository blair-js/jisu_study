package com.io.practice.filebyte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {
	
	// "바이트 기반 스트림" 가지고 데이터 입출력 해보기!
	// "바이트 스트림" : 데이터를 1바이트 단위로 전송하는 통로다! (좁은 통로임.. 1바이트면 한글은 깨짐..)
	// "기반 스트림" : 외부매체랑 직접적으로 연결되는 통로다!
	
	// "바이트 기반 스트림"   --> 외부매체를 지정하고 그 외부매체와 직접적으로 연결된 통로에 데이터를 1바이트 단위로 전송하겠다!! (입력 및 출력)
	
	// XXXInputStream	: XXX매체로부터 데이터를 입력받는 통로 (외부매체로 부터  데이터 읽어오겠다. 가져오겠다.)
	// XXXOutputStream	: XXX매체로 데이터를 출력하는 통로 (외부매체에 데이터 쓰겠다. 빼내겠다.)
	
	// File Input/Output Stream 		--> 외부 매체로 파일로 지정!
	// Audio Input/Output Stream		--> 외부 매체로 오디오장치로 지정!
	// Piped Input/Output Stream		--> 외부 매체로 또다른 프로세스로 지정! (프로세스간 통신)
	
	
	//프로그램 --> 외부매체(파일)  ( 출력 : 프로그램 내의 데이터를 파일로 내보내기 , 즉 파일로 저장)
	public void fileSave() {
		
		//FileOutputStream : "파일"로 데이터를 1바이트 단위로 출력하는 스트림 
		//1. FileOutputStream 객체 생성시 연결통로가 만들어짐 (해당 파일이 없으면 자동으로 새로 만들어지고 연결, 있으면 그냥 바로 연결)	
		
		FileOutputStream fout = null; //객체 선언
		
		try {
			
			/*중요*/
			//true 미작성시 : 기존에 해당 파일이 있을경우 덮어씌워짐(기본값 false)
			//true 작성시 : 기존에 파일이 있는경우 이어서 작성됨 (append)
			fout = new FileOutputStream("a_byte.txt", true);//이어서 작성

			//2.파일의 데이터를 출력할 때 write() //IOException 발생 
			//1byte 단위로 출력이 되기 때문에 -128~127 까지의 숫자만 출력이 가능(단, 파일에는 해당 숫자의 고유한 문자가 기록됨)
			//음수를 출력하면 깨져서 저장됨
			fout.write(97); //-> a로 저장되어있음
			fout.write('b'); //b로 저장
			//fout.write('강'); //?로 저장 (인식 불가임)
			
			byte[] bArr = {99, 100, 101}; //c,d,e 저장됨
			fout.write(bArr);
			
			fout.write(bArr, 0, 2); //0번째부터 2개 => c,d 저장됨 
			
			
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
				} //스트림 닫아주기
			}//if
		}//try~catch
		
	}
	
	//프로그램 <--파일 (입력 : 파일로 부터 데이터 받아오기 )
	public void fileRead() {
		
		//FileInputStream : "파일"로 부터 데이터를 1바이트 단위로 입력받는 스트림 
		//1. FileInputStream 객체생성 --> 객체 생성시 연결통로가 만들어짐 (해당 파일이 없으면 FileNoutFoundException발생 )
		FileInputStream fis = null; //객체 선언 
		
		try {
			
			fis = new FileInputStream("a_byte.txt");
			
			int value = 0; 
			while((value = fis.read()) != -1) { //read() 하면서 담아준다. EoF : 파일의 끝을 만나면 -1 반환 => 즉 파일의 끝이 아닐때까지 읽어오겠다
				System.out.println(value); //받아오는 값이 int형인데, 우린 문자로 저장했으니
				System.out.println((char)value); //char 형으로 형변환
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
