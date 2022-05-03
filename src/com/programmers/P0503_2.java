package com.programmers;

import java.util.Arrays;

public class P0503_2 {
	//���� ���� �� �����ϱ�
	
	public static void main(String[] args) {
		
		int[] arr = {4, 3, 2, 1};
		
		//1.�� Ǯ�� ���
		
		//���� �迭�� ������������ ����� �ݺ��� ����
		/*for(int i=1; i<arr.length; i++) { //����ü
			for(int j=0; j<i; j++) { //�񱳴���(����ü�� i�������� Ȯ��)
				if(arr[j] > arr[i]) { //�տ��ִ� j������ ���� i��°���� ũ�ٸ� 
					temp(j, i, arr); //�ڸ��� �ٲ��ִ� �޼ҵ� ȣ��
				}
			}
		}//for
		
		int[] newArr;
		
		if(arr.length > 1) {
			//���� ���� �� ���� ���� ������, �ε��� 1������ arr �迭 ������ ���ο� �迭 newArr�� ���
			newArr = Arrays.copyOfRange(arr, 1, arr.length);
		}else {
			newArr = new int[]{-1};
		}
		
		System.out.println(Arrays.toString(newArr));*/
	
		
		//2.�ٸ� Ǯ�̹�� => ���������� ���� �ʾƵ� �ȴ�. ���������� �ϸ� �׽�Ʈ ���̽����� Ż����.
		
		int[] newArr;
		
		//���� ���̰� 1�� ��쿡 ��Ҹ� -1�� �ʱ�ȭ
		if(arr.length == 1) {
			newArr = new int[]{-1};
		}else {
			int minidx = 0; //���� ���� ���� �����ִ� ����� �ε���
			
			for(int i=0; i<arr.length; i++) {
				if(arr[minidx] > arr[i]) { //i��°�� minidx��°���� ������
					minidx = i; //���� �������� �ε����� i�� �ʱ�ȭ
				}
			}//for
			
			//���� �迭���� ���̰� 1���� �迭�� ����
			newArr = new int[arr.length-1];
			
			int cnt = 0; //�� �迭�� �ε����� ǥ���� ����
			
			for(int i=0; i<arr.length; i++) {
				if(i == minidx) continue; //�ּҰ��� �ε����� �ǳʶٰ�
				newArr[cnt++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}

	
	
	/*public static void temp(int idx1, int idx2, int[] arr) {
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}*/

}
