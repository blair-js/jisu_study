package com.backjoon;

import java.util.Scanner;

public class B4153 {
	
	//���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. 
	//�־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.
	
	//��Ÿ��� ���� : �� ���� ���̰� ���� ��, �� ���� ������ ���Ѱ��� �� ���� ������ �����ϴٸ� �����ﰢ�� �̴�. 
	//ex : �� ���� ���̰� a, b, c ��� ���� => a������+b������=c������ or b������+c������=a������ or a������+c������=b������ 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			//�� ���� ���̸� �Է¹޴´�.
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			//a,b,c ��� 0�̸� �ݺ� ���� 
			if(a == 0 && a == 0 && a == 0) {
				break;
			}
			
			if((a*a + b*b) == c*c) {
				System.out.println("right");
			}else if((a*a + c*c) == b*b){
				System.out.println("right");
			}else if((b*b + c*c) == a*a){
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		
		}//while
			
		
	}

}
