package codeup.practice;

import java.util.Arrays;
import java.util.Scanner;


public class CodeUp {

	public static void main(String[] args) {

		/*1001. 
		Hello 출력*/
		//System.out.println("Hello");
		
		/*1002.
		Hello World를 출력한다.*/
		//System.out.println("Hello World");
		
		/*1003
		Hello
		World
		(두 줄에 걸쳐 줄을 바꿔 출력)
		 */
		//방법1
		//System.out.println("Hello");
		//System.out.println("World");
		//방법2
		//System.out.print("Hello\nWorld");
		
		/*1004
		 'Hello'
		를 출력한다.
		 */
		//방법1
		//System.out.println("\'Hello\'");
		//방법2
		//System.out.printf("%s", "'Hello'");
		
		/*1005
		 "Hello World"
		(단, 큰따옴표도 함께 출력한다.)
		 */
		//방법1
		//System.out.println("\"Hello\"");
		//방법2
		//System.out.printf("%s", "\"Hello\"");

		/*1006
		 "!@#$%^&*()"
		(단, 큰따옴표도 함께 출력한다.)
		 */
		//System.out.println("\"!@#$%^&*()\"");
		
		/*1007
		 "C:\Download\hello.cpp"
		를 출력한다.
		 */
		//System.out.println("\"C:\\Download\\hello.cpp\"");
	
		/*1008 => 틀림ㄴ
	    ┌┬┐
		├┼┤
		└┴┘
		를 유니코드를 이용하여 출력한다.
		 */
		//System.out.printf("\u250C\u252C\u2510\n");
		//System.out.printf("\u251C\u253C\u2524\n");
		//System.out.printf("\u2514\u2534\u2518\n");
		
		
		
		/*1010
		 입력된 정수를 그대로 출력한다. 
		 */
		Scanner sc = new Scanner(System.in);
		/*int num = sc.nextInt();
		System.out.println(num);*/
		
		//sc.nextLine();
		/*1011
		 입력된 문자를 그대로 출력한다
		 */
		
		/*char c = sc.nextLine().charAt(0);
		System.out.println(c);*/
		
		/*1012
		 입력된 실수값을 그대로 출력한다.
		 */
		/*float f = sc.nextFloat();
		System.out.println(f);*/
		
		/*1013
		입력된 두 정수를 공백으로 구분하여 출력한다.
		*/
		/*int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + " " + num2);*/
		
		/*1014
		2개의 문자가 공백으로 구분되어 입력된다.
		*/
		/*char c1 = sc.nextLine().charAt(0);
		char c2 = sc.nextLine().charAt(0);
		System.out.println(c2 + " " + c1);*/
		
		/*1015
		 결과를 소수점 셋 째 자리에서 반올림 해, 소숫점 이하 둘째 자리까지 출력한다.
		(%.2f를 이용하면 된다.)
		 */
		/*float f = sc.nextFloat();
		System.out.printf("%.2f", f);*/
		
		/*1017
		입력받은 정수를 공백으로 구분해 3번 출력한다.
		*/
		/*int num = sc.nextInt();
		for(int i=0; i<3; i++) {
			System.out.print(num + " ");
		}*/
		
		/*1018
		입력받은 시간을 "시:분" 형식으로 출력한다.
		*/
		/*int hour = sc.nextInt();
		int minute = sc.nextInt();
		System.out.println(hour + ":" + minute);*/
		
		/*1019
		입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
		(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
		*/	
		/*int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		System.out.printf("%d.%02d.%02d", year, month, day);*/
		
		/*1020
		'-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
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
		 입력된 단어를 그대로 출력한다.
		 */
		//System.out.println(sc.nextLine());
		
		/*1022
		 공백이 포함되어 있는 한 문장이 입력된다.
		단, 입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝나며,
		최대 길이는 2000 문자를 넘지 않는다.
		 */
		//System.out.println(sc.nextLine());
		
		/*1023
		 실수 1개가 입력된다.
		(단, 입력값은 절댓값이 10000을 넘지 않으며, 소수점 이하 자릿수는 최대 6자리까지이고
		0이 아닌 숫자로 시작한다.)
		 */
		/*String str = sc.nextLine();
		String[] strArr = str.split("\\."); //반드시 \\를 해주어야 점(.)을 인식할 수 있다.
		for(String s : strArr) {
			System.out.println(s);
		}*/
		
		/*1024
		단어(영어) 하나를 입력받는다.
		(단, 단어의 길이는 20자 이하이다.)
		*/
		/*String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			System.out.println("'" + str.charAt(i) + "'");
		}*/
		
		/*1025
		 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
		 */
		int n = sc.nextInt();
		for(int i=10000; i>0; i/=10) {
			System.out.println("[" + n/i * i + "]");
			n %= i;
		}
		
		
	}

}
