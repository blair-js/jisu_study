package com.programmers;

import java.util.Scanner;

public class P0506_5 {
	//�Ҽ� ã��(����)
	//�����佺�׳׽��� ü �̿�
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0; //�Ҽ��� ������ ī������ ����
		
		boolean[] iArr = new boolean[n+1]; //�迭�� �� ��Ұ� �Ҽ����� �ƴ����� �Ǻ��ϱ� ���� boolean Ÿ���� �迭 ����(boolean�� �⺻���� false) 
		iArr[0] = iArr[1] = true; //0�� 1�� �Ҽ��� �ƴϹǷ� true�� �ʱ�ȭ(������ false ����)
		
		for(int i=2; i<=n; i++) { //0�� 1�� ������ 2���� n������ �Ҽ� �˻�
			
			if(iArr[i] == false) { //�ϴ� �迭�� ��� i��°�� false���(**2�� �ݺ��� ù �����̹Ƿ� 2���� Ȯ���ϴµ� 2�� false�̸� �Ҽ��� ����!) 
				cnt++; //�Ҽ� ���� ����
				for(int j=i+i; j<=n; j+=i) { //�Ҽ��� ����� ��� �Ҽ��� �ƴ�(**������ i�� 2�� ��� 2�� �Ҽ������Ƿ� 2�� ������°(4,6,...100)�� ���� ��� true�� �ʱ�ȭ)
					iArr[j] = true; //���� true�� �ٲ��༭ �ٱ��� for�� ����� �ش� i��° �迭 ��ҵ��� pass�� �� �ֵ��� ���ش�.
				}
			}//if
		}//for
		
		System.out.println(cnt);
		
	}

}
