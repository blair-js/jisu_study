package com.loop_hard.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practic15(){
		
		//����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		//��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		//(for�� �̿�)
		//* ���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
		//ex) 2, 3, 5, 7, 11 ��


			System.out.print("���� : ");
			int num = sc.nextInt();
			
			boolean bool = true; //�Ҽ� �Ǻ� ����. �ϴ� �⺻ ���� true�� ������. 
			
			if(num < 2) { //2 �̸� �Է½�
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}else { //2 �̻��� ��� 
				
				for(int i=2; i<num; i++) { //num�� 2���� num-1���� ���� ����
					if(num % i == 0) { //i�߿� �ϳ��� ���������� �� ���ڴ� �Ҽ��� �ƴ� ��  
						bool = false; //�Ҽ��� �ƴ϶�� �� �ٲ��ֱ�
						break; //for Ż��
					}//if
				}//for
				System.out.println(bool ? "�Ҽ��Դϴ�." : "�Ҽ��� �ƴմϴ�."); //����� �����ִ� â 	
			}//if-else
			
		
	}

	public void practic16() {
		
		//�� ������ ��� ���� �����ϳ�, �Է��� ���� 2���� ���� ���
		//���߸� �Է��ϼ̽��ϴ�.���� ����ϸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		//* ���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
		//ex) 2, 3, 5, 7, 11 ��

		while(true) {

			System.out.print("���� : ");
			int num = sc.nextInt();
			
			boolean bool = true; //�Ҽ� �Ǻ� ����. �ϴ� �⺻ ���� true�� ������. 
			
			if(num < 2) { //2 �̸� �Է½�
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}else { //2 �̻��� ��� 
				
				for(int i=2; i<num; i++) {//num�� 2���� num-1���� ���� ����
					if(num % i == 0) { //i�߿� �ϳ��� ���������� �� ���ڴ� �Ҽ��� �ƴ� ��  
						bool = false; //�Ҽ��� �ƴ϶�� �� �ٲ��ֱ�
						break; //for Ż��
					}//if
				}//for
				System.out.println(bool ? "�Ҽ��Դϴ�." : "�Ҽ��� �ƴմϴ�."); //����� �����ִ� â 
				break; //while Ż��
			}//if-else
			
			
		}
		
	}
	
	public void practic17() {
		
		//2���� ����ڰ� �Է��� �������� �Ҽ��� ��� ����ϰ� �Ҽ��� ������ ����ϼ���.
		//��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		//(for�� �̿�)

		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int cnt = 0; //�Ҽ� ���� üũ
		
		if(num < 2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else { 
			for(int i=2; i<=num; i++) { //2���� num���� �Ҽ����� �˻��ϰڴ�.
				boolean bool = true; //�Ҽ� �Ǻ� 
				for(int j=2; j<i; j++) { //�ش� i�� �Ҽ����� �Ǻ��ϱ� ���� 2���� i-1���� ��������  
					if(i%j == 0) {
						bool = false; //�Ҽ� �ƴ� 
						break; //���� for�� Ż�� 
					}//if
				}//���� for
				
				if(bool == true) { //���� for���� �� ���� ���Դµ� true �̸� �Ҽ��̹Ƿ� 
					System.out.print(i + " "); //���� i�� ������ְ�
					cnt++; //���� ����
				}//if
			}//�ٱ� for
			System.out.println("\n2���� " + num + "���� �Ҽ��� ������ " + cnt + "�� �Դϴ�.");
		}//if-else		
	}

	public void practic18() {
		
		//1���� ����ڿ��� �Է� ���� ������ �߿���
		//1) 2�� 3�� ����� ��� ����ϰ�
		//2) 2�� 3�� ������� ������ ����ϼ���.
		//(for�� �̿�)
		//* ����������� �� �̻��� ���� ������ ������ ������ � ���� �ش� ����� ������ ��
		//��� �������� 0�� ������ ��
		
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int cnt = 0; //����� ���� üũ
		
		for(int i=1; i<=num; i++) {
			
			if(i%6 == 0) { //�ּ� ������� ������(2�ε� ���������� 3���ε� ���������� = �� 6�� ����� ��)
				System.out.print(i + " ");
				cnt++; //���� ���� 
			}else if(i%2 == 0 && i%3 != 0) { //2�θ� �������� �� 
				System.out.print(i + " ");
			}else if(i%2 != 0 && i%3 == 0) { //3���θ� �������� �� 
				System.out.print(i + " ");
			}
			
		}//for
		System.out.println("\ncount : " + cnt);
		
	}

	public void practic19() {
		
		//�ϴ� �Է��� ������ 4 ��� �����ϰ� ��Ģ Ȯ��
		//�� 4��, �ִ뿭 4
		// 	   * //����3+��1
		// 	  ** //����2+��2
		// 	 *** //����1+��3
		//	**** //����0+��4 
		//������ 3 -> 2-> 1-> 0 
		//���� 1 -> 2-> 3-> 4 => i�� ���߱� 
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) { //��(1~4��) 
			
			for(int j=1; j<=num-i; j++) { //���� ���
				System.out.print(" ");
			}
			
			for(int s=1; s<=i; s++) { //�� ��� => ���� �� i ����ŭ ������ ��) 
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	
	public void practic20() {
		
		//�ϴ� �Է��� ������ 3�̶�� �����ϰ� ��Ģ Ȯ��
		//�� 5��, �ִ뿭 3 
		//���� �Է��� ���� *2-1 �� => ¦���� Ȧ���� �� �Ȱ��� ��Ģ => �ش� ������ �ุ ������ŭ ���� ��µǰ� ��/�Ʒ��� ���� 1���� �۾����� ��Ģ 
		//�Է��� �� 3 -> 3���� �������� ��/�Ʒ� 1��� 5���� ���� 2��� 4���� ���� 
		//  *
		//  **
		//  ***
		//  **
		//  *
		// �� 1 -> 2 -> 3 -> 2 -> 1
		
		//�׷� ���� ��� ��(�Է��� ���� ��)�� �������� ���
		//���� �Ʒ��� ������ �غ���
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num*2-1; i++) { //�� 
			if(i<num) { //��� �� �������� ��
				for(int j=1; j<=i; j++) { //�ش� �� i��ŭ �� ��� 1���� 1��, 2���� 2�� 
					System.out.print("*");
				}
				System.out.println(); //����
			}else if(i>num) { //��� �� �������� �Ʒ�
				for(int k=1; k<= num-(i-num); k++) { //�� �κ� ������� => 4���� ������3-(������4-������3)=��2��, 5���� ������3-(������5-������3)=��1��
					System.out.print("*");
				}
				System.out.println();
			}else { //��� ��
				for(int s=1; s<=num; s++) {
					System.out.print("*");
				}//for
				System.out.println(); //����
			}
			
			
		}
		
		
	}

	public void practic21() {
		
		//Ʈ�� �����
		//		* 		//����3+��1+����3 => ���� ��*2-1���� �����°��� Ȯ���� �� �ִ�. ������ �ִ���(�Է��� ����)-�������� Ȯ���� �� �ִ�
		//	   ***		//����2+��3+����2
		//	  *****		//����1+��5+����1
		//	 *******	//����0+��7+����0
		// �� 4��, �ִ� 7��(��*2-1)
		// ���� 1 -> 3 -> 5 -> 7 (��� Ȧ��, �ึ�� ���� 2) 

		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) { //���� ���
				System.out.print(" ");
			}

			for(int s=1; s<=i*2-1; s++) { //�� ���
				System.out.print("*");
			}
			
			System.out.println(); //����
		}
		
	}

	public void practic22() {
		
		// �ϴ� 5���̶�� ���� ��� 
		// ù��� ���ุ �� 5�� ��� 
		// ������ ù���� ������ �� ���, ������ ���� ó��
		// *****
		// *   *
		// *   *
		// *   *
		// *****
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num; i++) { //��
			for(int s=1; s<=num; s++) { //�� ���
				
				if(i == 1 || i == num) { //1���̰ų� �Է����������̸� 
					System.out.print("*"); //�� ���
				}else { //������ �� 
					if(s == 1 || s == num) { //1���� �Է�������������
						System.out.print("*"); //�� ���
					}else { //������ ��
						System.out.print(" "); //���� ���
					}//����if-else
				}//�ٱ�if-else
			}//����for
			System.out.println(); //����
		}//�ٱ�for
		
	}

}
