package codeup.practice;

import java.util.Arrays;
import java.util.Scanner;


public class CodeUp {

	public static void main(String[] args) {

		/*1001. 
		Hello ���*/
		//System.out.println("Hello");
		
		/*1002.
		Hello World�� ����Ѵ�.*/
		//System.out.println("Hello World");
		
		/*1003
		Hello
		World
		(�� �ٿ� ���� ���� �ٲ� ���)
		 */
		//���1
		//System.out.println("Hello");
		//System.out.println("World");
		//���2
		//System.out.print("Hello\nWorld");
		
		/*1004
		 'Hello'
		�� ����Ѵ�.
		 */
		//���1
		//System.out.println("\'Hello\'");
		//���2
		//System.out.printf("%s", "'Hello'");
		
		/*1005
		 "Hello World"
		(��, ū����ǥ�� �Բ� ����Ѵ�.)
		 */
		//���1
		//System.out.println("\"Hello\"");
		//���2
		//System.out.printf("%s", "\"Hello\"");

		/*1006
		 "!@#$%^&*()"
		(��, ū����ǥ�� �Բ� ����Ѵ�.)
		 */
		//System.out.println("\"!@#$%^&*()\"");
		
		/*1007
		 "C:\Download\hello.cpp"
		�� ����Ѵ�.
		 */
		//System.out.println("\"C:\\Download\\hello.cpp\"");
	
		/*1008 => Ʋ����
	    ������
		������
		������
		�� �����ڵ带 �̿��Ͽ� ����Ѵ�.
		 */
		//System.out.printf("\u250C\u252C\u2510\n");
		//System.out.printf("\u251C\u253C\u2524\n");
		//System.out.printf("\u2514\u2534\u2518\n");
		
		
		
		/*1010
		 �Էµ� ������ �״�� ����Ѵ�. 
		 */
		Scanner sc = new Scanner(System.in);
		/*int num = sc.nextInt();
		System.out.println(num);*/
		
		//sc.nextLine();
		/*1011
		 �Էµ� ���ڸ� �״�� ����Ѵ�
		 */
		
		/*char c = sc.nextLine().charAt(0);
		System.out.println(c);*/
		
		/*1012
		 �Էµ� �Ǽ����� �״�� ����Ѵ�.
		 */
		/*float f = sc.nextFloat();
		System.out.println(f);*/
		
		/*1013
		�Էµ� �� ������ �������� �����Ͽ� ����Ѵ�.
		*/
		/*int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + " " + num2);*/
		
		/*1014
		2���� ���ڰ� �������� ���еǾ� �Էµȴ�.
		*/
		/*char c1 = sc.nextLine().charAt(0);
		char c2 = sc.nextLine().charAt(0);
		System.out.println(c2 + " " + c1);*/
		
		/*1015
		 ����� �Ҽ��� �� ° �ڸ����� �ݿø� ��, �Ҽ��� ���� ��° �ڸ����� ����Ѵ�.
		(%.2f�� �̿��ϸ� �ȴ�.)
		 */
		/*float f = sc.nextFloat();
		System.out.printf("%.2f", f);*/
		
		/*1017
		�Է¹��� ������ �������� ������ 3�� ����Ѵ�.
		*/
		/*int num = sc.nextInt();
		for(int i=0; i<3; i++) {
			System.out.print(num + " ");
		}*/
		
		/*1018
		�Է¹��� �ð��� "��:��" �������� ����Ѵ�.
		*/
		/*int hour = sc.nextInt();
		int minute = sc.nextInt();
		System.out.println(hour + ":" + minute);*/
		
		/*1019
		�Է¹��� ��, ��, ���� yyyy.mm.dd �������� ����Ѵ�.
		(%02d�� ����ϸ� 2ĭ�� ����� ����ϴµ�, �� �ڸ� ���� ��� �տ� 0�� �ٿ� ����Ѵ�.)
		*/	
		/*int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		System.out.printf("%d.%02d.%02d", year, month, day);*/
		
		/*1020
		'-'�� ������ �ֹι�ȣ 13�ڸ��� ��� �ٿ� ����Ѵ�.
		*/
		/*String regno = sc.nextLine();
		
		for(int i=0; i<regno.length(); i++) {
			if(regno.charAt(i) == '-') {
				continue;
			}else {
				System.out.print(regno.charAt(i));
			}
		}*/
		
		///////////////////////////////////////////////////////////
		
		/*1021
		 �Էµ� �ܾ �״�� ����Ѵ�.
		 */
		//System.out.println(sc.nextLine());
		
		/*1022
		 ������ ���ԵǾ� �ִ� �� ������ �Էµȴ�.
		��, �ԷµǴ� ������ ���� ���� �ܾ�� �����ǰ�, ���ͷ� ������,
		�ִ� ���̴� 2000 ���ڸ� ���� �ʴ´�.
		 */
		//System.out.println(sc.nextLine());
		
		/*1023
		 �Ǽ� 1���� �Էµȴ�.
		(��, �Է°��� ������ 10000�� ���� ������, �Ҽ��� ���� �ڸ����� �ִ� 6�ڸ������̰�
		0�� �ƴ� ���ڷ� �����Ѵ�.)
		 */
		/*String str = sc.nextLine();
		String[] strArr = str.split("\\."); //�ݵ�� \\�� ���־�� ��(.)�� �ν��� �� �ִ�.
		for(String s : strArr) {
			System.out.println(s);
		}*/
		
		/*1024
		�ܾ�(����) �ϳ��� �Է¹޴´�.
		(��, �ܾ��� ���̴� 20�� �����̴�.)
		*/
		/*String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			System.out.println("'" + str.charAt(i) + "'");
		}*/
		
		/*1025
		 �� �ڸ��� ���ڸ� �и��� �� �ٿ� �ϳ��� [ ]�ӿ� �־� ����Ѵ�.
		 */
		/*int n = sc.nextInt();
		for(int i=10000; i>0; i/=10) {
			System.out.println("[" + n/i * i + "]");
			n %= i;
		}
		*/
		
		/*1026
		 �� �� �� ��
		 ��:��:�� �������� �Էµȴ�.
		 �и� ����Ѵ�.
		 */
		/*String time = sc.nextLine();
		String[] timeArr = time.split(":");
		System.out.println(timeArr[1]);*/
		
		/*1027
		 ������� '.'(��)���� ���еǾ� �Էµȴ�.
		 �������
		 �������� �ٲپ� '-'(�뽬, ���̳ʽ�)�� ������ ����Ѵ�.
		 */
		
		/*String date = sc.nextLine();
		String reDate = date.replace('.', '-');
		System.out.println(reDate);*/
		
		/*String date = "2017.1.14";
		String[] dateArr = date.split("\\.");
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(dateArr[2]), Integer.parseInt(dateArr[1]), Integer.parseInt(dateArr[0]));*/
		
		/*1028
		 ���� 1���� �Էµȴ�.
		(��, �ԷµǴ� ������ ������ 0 ~ 4294967295 �̴�.)
		�Էµ� ������ �״�� ����Ѵ�.
		 */
		/*long n = sc.nextLong();
		System.out.println(n);*/
		
		/*1029
		 �Էµ� �Ǽ��� �Ҽ��� ���� 11�ڸ����� �ݿø��Ͽ� ����Ѵ�.
		����
		%.11lf �� ����ϸ� �Ҽ��� ���� 11�ڸ����� ��µȴ�.
		 */
		/*double f = sc.nextDouble();
		System.out.printf("%.11f", f);*/
		
		/*1030
		 ���� 1���� �Էµȴ�.
		��, �ԷµǴ� ������ ������ -9223372036854775808 ~ +9223372036854775807 �̴�.
		�Էµ� ������ �״�� ����Ѵ�.
		 */
		/*long l = sc.nextLong();
		System.out.println(l);*/
		
	}

}
