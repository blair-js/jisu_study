package com.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		
		//���̰� 10�� ������ �迭�� ����� �ݺ����� �̿��Ͽ�
		//������� �迭 �ε����� ���� �� �� ���� ������ ���� ����ϼ���
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //�� �ֱ�
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) { //�� ���
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		//���̰� 10�� ������ �迭�� ����� �ݺ����� �̿��Ͽ�
		//�������� �迭 �ε����� ���� �� �� ���� ����ϼ���

		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //�� �ֱ�
			arr[i] = i+1;
		}
		
		for(int i=arr.length-1; i>=0; i--) { //�� ���
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		//����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		//1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		System.out.print("���� ���� : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {
		
		//���̰� 5�� String�迭�� �����ϰ� �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���
		
		String[] arr = new String[5]; 
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("��")) {
				System.out.println(arr[i]);
			}
		}
		
	}

	public void practice5() {
		
		//���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
		//������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("�˻��� ���� :");
		char search = sc.nextLine().charAt(0);
		
		char[] strArr = new char[str.length()];
		int cnt=0; 
		
		for(int i=0; i<strArr.length; i++) { //���� �ϳ��ϳ� �ֱ�
			strArr[i] = str.charAt(i);
		}
		
		System.out.printf("%s �� %c�� �����ϴ� ��ġ(�ε���) : ", str, search);
		for(int i=0; i<strArr.length; i++) { //ã��
			if(strArr[i] == search) {
				System.out.print(i + " ");
				cnt++; 
			}
		}//for
		System.out.printf("\n%c ���� : %d\n", search, cnt);
		
	}

	public void practice6() {
		
		//������ ~ ���ϡ� (����)���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
		//�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		//������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		
		String[] day = new String[7]; 
		day[0] = "��";
		day[1] = "ȭ";
		day[2] = "��";
		day[3] = "��";
		day[4] = "��";
		day[5] = "��";
		day[6] = "��";
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num < 0 || num > 6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println(day[num] + "����");
		}
		
		
	}

	public void practice7() {
		
		//����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
		//�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
		//�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) { //�� �ֱ�
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}
		

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\n�� �� : " + sum);
		
	}

	public void practice8() {
		
		//3�̻��� Ȧ�� ������ �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		//�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		//��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		//�ٽ� ������ �޵��� �ϼ���.
		
		
		while(true) {
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num < 3 || num%2 == 0) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			
			int[] arr = new int[num];
			int midIdx = arr.length/2 +1; //�迭�� �߰� �ε��� (5�̸� 3, 7�̸� 4....)
			
			int midVal = 0; //�迭�� �� ��� ���� 
			for(int i=0; i<arr.length; i++) { //�� �ֱ� 
				if(i < midIdx) {
					arr[i] = i+1; 
				}else {
					arr[i] = midVal-1; //�������� ��� �� ���ؿ��� -1�� ���� ���� 
				}
				midVal = arr[i];
				System.out.print(arr[i] + " "); //�� ���
			}//for
			break; //������
		}//while
		
	}
	
	public void practice9() {
		
		//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
		//������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���.
		//��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.

		String[] chicArr = {"�Ѹ�Ŭ", "���", "�Ķ��̵�", "����", "����"}; 
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		
		boolean bool = false; //ġŲ�� ã���� �ݺ��� �ٷ� ���߱� ���� �Ҹ�Ÿ�� ���� ����
		
		for(int i=0; i<chicArr.length; i++) { //ġŲ ã�� 
			if(chicArr[i].equals(chicken)) {
				System.out.println(chicken + "ġŲ ��� ����");
				bool = true; 
				break; //�ݺ� ������ -> �����ָ� ���ϴ� ġŲ�� ã�������� �迭 ������ ��� ã���� 
			}//if
		}//for
		
		//�ݺ��� �� ������ ���Դµ��� bool�� false ���
		if(bool == false) {
			System.out.println(chicken + "ġŲ�� ���� �޴��Դϴ�.");
		}//if
	
	}

	public void practice10() {
		
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //�� �ֱ�
			arr[i] = (int)(Math.random() *10 +1);
			System.out.print(arr[i] + " "); //�ٷ� �� ���
		}
		
		
	}

	public void practice11() {
		
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
		//�迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
		
		//����?....?????????????...�� �ϴ�
		//������ �迭 ������� �ʰ� �غ���
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) { //�� �ֱ� 
			arr[i] = (int)(Math.random() *10 +1);
			System.out.print(arr[i] + " "); 
		}
		
		int min = arr[0]; //�ϴ� �ּҰ��� ù��° �迭�� ������ ����
		int max = arr[0]; //�ϴ� �ִ밪�� ù��° �迭�� ������ ����
		
		for(int i=1; i<arr.length; i++) { //�ּҰ� Ȯ�� 
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		for(int i=1; i<arr.length; i++) { //�ִ밪 Ȯ�� 
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("\n�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	
	}

	public void practice12() { //�ٽ� Ǯ��
		
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10 ������ ������ �߻����� "�ߺ��� ���� ����" �迭�� �ʱ�ȭ�� �� ����ϼ���.
		
		int[] arr = new int[10];
		
		int i;
		for(i=0; i<arr.length; i++) { //�� ��ü
			for(int j=0; j<i; j++) { //�� ��� 
				int ran = (int)(Math.random() *10 +1);
				if(arr[i] == arr[j]) { //�� ��ü�� �� ����� ���ٸ�, �ٽ� �ݺ�
					i--;
					continue; 
				}else {
					arr[i] = ran;
				}
			}//���� for
		}//�ٱ� for
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice13() {
		
		//�ֹε�Ϲ�ȣ�� String ���ڿ��� �Է� �ް� �Է� ���� �� ���ڿ��� �� �ε��� �� ���ڸ�
		//char[]�� �Ű� ��� (��, ���� �ڸ� ���ĺ��ʹ� *�� ���)
		
	}
}


