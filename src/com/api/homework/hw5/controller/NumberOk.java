package com.api.homework.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;
	private Scanner sc = new Scanner(System.in);
	
	public NumberOk() {	}
	
	public void numGame() {
		
		//����ڿ��� ���ڸ� �Է� �ް� �Է� ���� ���ڰ� ������ ������ �� ���� �� ������ ū��, �� �� ���� ���ߴ���, ���߸� ��� ���� ������ ���� �޼ҵ�
		//Ǯ�� Ǯ���µ� ���� �̻�..
		//view�� controller�� �������� �ʾƼ� �� �̻��ѵ�?
		//���̵� �ôµ� ���̻���
		
		int count = 1; //���� Ƚ�� ī��Ʈ
		ran = (int)(Math.random() * 100 + 1);
		//System.out.println("ù����" + ran);

		while(true) {
			
			System.out.print("1���� 100 ������ ������ �ϳ� �Է��ϼ��� : ");
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == ran) {
				System.out.println(count + "�� ���� ������ϴ�.");
				
				while(true) {
					System.out.print("��� �Ͻðڽ��ϱ�?(y/n)");
					String play = sc.nextLine();
					
					if(play.equalsIgnoreCase("y")) {
						break; //���� while Ż���ؼ� 47������ ���� 
					}else if(play.equalsIgnoreCase("n")) {
						System.out.println("������ �����մϴ�.");
						return;
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						continue; //���� while �ݺ� => 27������ �� 
					}
				}//while
				
				System.out.println("���ο� ������ �����մϴ�!"); //���� 36�� if���� ź �� ����� ���ԵǸ�
				count = 1; //���ο� ������ �����ϱ� ������ ī��Ʈ �ٽ� 1�� ����
				ran = (int)(Math.random() * 100 + 1); //���ο� �����̴� ������ ���� ����
				//System.out.println("�����" + ran);
				continue; //�ٱ� while �ݺ��ϰ� �ǹǷ� 23������ �� 
				
			}else if(answer > ran) {
				System.out.println(answer + "���� �۽��ϴ�." + count + "��° ����!");
				count++;
			}else{
				System.out.println(answer + "���� Ů�ϴ�." + count + "��° ����!");
				count++;
			}
			
		}//while
		
	}
	
		//�̰� ���̵� �����ε�..���� �̻��ϴ�..
		//2��° ���� ���ķδ�...��� ���ο������...����?
		/*public void numGame() {
			Scanner sc = new Scanner(System.in);
			String str = "";
			while(true) {
				int ranNum = (int)(Math.random()*100+1);
				System.out.println(ranNum);	// ���� üũ������ �̸� Ȯ���ϱ�
				int i=0;
			
				while(true) {
					i++;
					System.out.print("1���� 100 ������ ������ �ϳ� �Է��ϼ��� : ");
					int num = sc.nextInt();
					sc.nextLine();
					
					if(ranNum < num) {
						System.out.println(num+"���� �۽��ϴ�."+i+"��° ����!! ");
					}	
					else if(ranNum > num) {
						System.out.println(num+"���� Ů�ϴ�."+i+"��° ����!! ");
					}
					else {
						System.out.println(i+"�� ���� ������ϴ�!");
						while(true) {
							System.out.print("���  �Ͻðڽ��ϱ�?(y/n) : ");
							str = sc.nextLine();
							if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
								break;
							else
								System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
								continue;
						}
					}
					if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
						break;
				}
				if(str.equalsIgnoreCase("y")) {
					System.out.println("\n���ο� ������ �����մϴ�!!");
					continue;
				}
				else if(str.equalsIgnoreCase("n")) {
					System.out.println("������ �����մϴ�.");
					return;
				}
			}
		}*/
}
