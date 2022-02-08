package com.io.practice.file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {

		//File : ������ �����ϱ� ���� Ŭ������ ������� �������� �ʴ´�. --> ������ ������� ����� ��Ʈ���� ����ؾ��Ѵ�. 
		try {
			
			//1.��������� ���� ���� ������ ���� project ������ �����ȴ�. 
			File f1 = new File("test.txt"); //�޸� �󿡸� ���� 
			f1.createNewFile(); //createNewFile �޼ҵ带 ����ؼ� ���� ������ ����
			
			//2. �����ϴ� �⺻ ����̺곪 ������ ���ϻ��� 
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			//3. �ڵ����� ������ ����� ������ �����ϱ� => �Ұ���
			//File f3 = new File("D:\\test2\\test.txt"); //������ ��θ� ã�� �� �����ϴ� => �������� �ʴ� ���� test2�� ���������� ����
			//f3.createNewFile();
			
			//4. ������ ���� ������
			File testFolder = new File("D:\\test2"); //"Ȯ���ڸ� �ۼ����� ������ ������ �ν�"
			testFolder.mkdir(); //D ����̺꿡 test ���� ����
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			//System.out.println(f3.exists());
			System.out.println(testFolder.exists());
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\parent.txt");
			file.createNewFile();
			
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath()); //���� ��� => ��Ʈ ���丮�� ����
			System.out.println(file.getPath()); //��� ��� => ����δ� ��Ʈ ���丮�� �������� �ʴ� �ּҸ� ���� ��� parent\parent.txt
			System.out.println(file.length());
			System.out.println(file.getParent()); //�ٷ� ���� �������� 
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
