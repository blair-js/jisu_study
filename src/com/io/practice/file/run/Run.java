package com.io.practice.file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {

		//File : 파일을 제어하기 위한 클래스로 입출력을 제공하지 않는다. --> 파일의 입출력은 입출력 스트림을 사용해야한다. 
		try {
			
			//1.경로지정을 딱히 하지 않으면 현재 project 폴더에 생성된다. 
			File f1 = new File("test.txt"); //메모리 상에만 존재 
			f1.createNewFile(); //createNewFile 메소드를 사용해서 실제 파일을 생성
			
			//2. 존재하는 기본 드라이브나 폴더에 파일생성 
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			//3. 자동으로 폴더를 만들고 파일을 생성하기 => 불가능
			//File f3 = new File("D:\\test2\\test.txt"); //지정된 경로를 찾을 수 없습니다 => 존재하지 않는 폴더 test2를 생성해주진 않음
			//f3.createNewFile();
			
			//4. 폴더를 먼저 만들자
			File testFolder = new File("D:\\test2"); //"확장자를 작성하지 않으면 폴더로 인식"
			testFolder.mkdir(); //D 드라이브에 test 폴더 생성
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			//System.out.println(f3.exists());
			System.out.println(testFolder.exists());
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\parent.txt");
			file.createNewFile();
			
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath()); //절대 경로 => 루트 디렉토리를 포함
			System.out.println(file.getPath()); //상대 경로 => 상대경로는 루트 디렉토리를 포함하지 않는 주소를 갖는 경로 parent\parent.txt
			System.out.println(file.length());
			System.out.println(file.getParent()); //바로 위의 상위폴더 
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
