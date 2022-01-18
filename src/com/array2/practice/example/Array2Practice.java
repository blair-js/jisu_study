package com.array2.practice.example;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {

	Scanner sc = new Scanner(System.in);
	
	 public void practice1() {
		 
		 //1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
		 //2) ����� ������ ���ʴ�� ����ϼ���.
		 
		 int[][] arr = new int[4][4];
		 
		 int num = 1; //�ʱⰪ 
		 
		 for(int i=0; i<arr.length; i++) { //��
			 for(int j=0; j<arr[i].length; j++) { //��(�ش� ���� ��� ������ŭ �ݺ�)
				 arr[i][j] = num++; 
				 System.out.printf("%2d " , arr[i][j]); //2�ڸ����� ���
			 }
			 System.out.println();//�� �� ������ ����
		 }
		 
		 
	 }
	
	 public void practice2() {
		 
		 //4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		 //1) 16 ~ 1�� ���� ���� �Ųٷ� �����ϼ���.
		 //2) ����� ������ ���ʴ�� ����ϼ���.
		 
		 int[][] arr = new int[4][4];
		 
		 int num = 16; //�ʱⰪ 
		 
		 for(int i=0; i<arr.length; i++) { //��
			 for(int j=0; j<arr[i].length; j++) { //��(�ش� ���� ��� ������ŭ �ݺ�)
				 arr[i][j] = num--; 
				 System.out.printf("%2d " , arr[i][j]); //2�ڸ����� ���
			 }
			 System.out.println();//�� �� ������ ����
		 }
		 
	 }

	 public void practice3() {
		
		 //3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		 //�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� ��(0, 0)���� ���� �������� ���� �� ����ϼ���.
		 
		 int[][] arr = new int[3][3]; 
		 
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 System.out.printf("(%d, %d)", i, j);
			 }
			 System.out.println();
		 }
		 
	 }

	 public void practice4() { //�ٽ�
		 
		 //4�� 4�� 2���� �迭�� �����Ͽ� 
		 //0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
		 //�Ʒ��� ����ó�� ó���ϼ���.
		 
		 int[][] arr = new int[4][4];
		 
		 for(int i=0; i<arr.length; i++) { //2�� 2�� �� �ֱ� 
			 int rowSum = 0; //�ึ�� �հ�� �ʱ�ȭ �Ǿ�� �ϹǷ� �� �ݺ��� �ȿ� �ִ´�. 
			 if(i < 3) { //0~2��
				 for(int j=0; j<arr[i].length; j++) {
					 if(j < 3) { //0~2��
						 arr[i][j] = (int)(Math.random()*10 +1);
						 rowSum += arr[i][j];
					 }else { //3����
						 arr[i][j] = rowSum;
					 }
				 }//for
			 }else { //3�ุ
				
				 
				 
				 
			 }//if-else
		 }//for 
		 
		 //Ȯ��
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(Arrays.toString(arr[i]) + " ");
		 }
		 
		 
	 }

	 public void practice5() {
		 
		 //2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է� �޵�, 1~10���� ���ڰ� �ƴϸ�
		 //���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
		 //ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
		 //(char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ���� 90�� Z�� ��Ÿ��)

		 
		 while(true) {
			 System.out.print("�� ũ�� : ");
			 int row = sc.nextInt();
			 System.out.print("�� ũ�� : ");
			 int col = sc.nextInt();
			 
			 if(row < 1 || row > 10 || col < 1 || col > 10) {
				 System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				 continue;
			 }
			 
			 char[][] arr = new char[row][col];
			 
			 for(int i=0; i<arr.length; i++) {
				 for(int j=0; j<arr[i].length; j++) {
					 arr[i][j] = (char)(int)(Math.random() * 26 + 65);
					 System.out.print(arr[i][j] + " ");
				 }
				 System.out.println();
			 }
			 break;
		 }//while
	 }

	 public void practice6() {
		 
		 String[][] strArr = new String[][] {{"��", "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", 
			 "��", "��", "��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "! ", "��", "!! "}};
			 
		 for(int i=0; i<strArr.length; i++) {
			 for(int j=0; j<strArr[i].length; j++) {
				 System.out.print(strArr[j][i]);
			 }
			 System.out.println();
		 }
			 
	 }

	 public void practice7() {
		 
		 //����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� �ش� ���� ũ�⵵ �޾�
		 //������ ���� �迭�� ���� �� �Ҵ��ϼ���.
		 //�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.

		 System.out.print("���� ũ�� : ");
		 int row = sc.nextInt();
		 
		 char[][] arr = new char[row][];
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(i + "���� ũ�� : ");
			 arr[i] = new char[sc.nextInt()];
		 }
		 char ch = 'a';
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 arr[i][j] = ch++;
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }

	 public void practice8() { //�ٽ� 
		 
		 //1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
		 //3�� 2���� 2���� �迭 2���� �̿��Ͽ� �д��� ������ ����.
		 //1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
		 //<�⼮��>
		 //1. ���ǰ� 2. ������ 3. ����� 4. ����� 5. ���̹� 6. �ں���
		 //7. �ۼ��� 8. ������ 9. ������ 10. ��õ�� 11. ��ǳǥ 12. ȫ����
		 
		 String[] attn = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "����ǥ", "ȫ����"};
		 
		 String[][] one = new String[3][2];
		 String[][] two = new String[3][2];
		 
		 int idx1 = 0; 
		 System.out.println("== 1�д� == ");
		 for(int i=0; i<one.length; i++) {
			 for(int j=0; j<one[i].length; j++) {
				 one[i][j] = attn[idx1++];
				 System.out.print(one[i][j] + " ");
			 }
			 System.out.println();
		 }
		 System.out.println("== 2�д� == ");
		 for(int i=0; i<two.length; i++) {
			 for(int j=0; j<two[i].length; j++) {
				 two[i][j] = attn[idx1++];
				 System.out.print(two[i][j] + " ");
			 }
			 System.out.println();
		 }
		 
		 
		 
	 }

	 public void practice9() { //�ٽ�
		 
	 }
}

