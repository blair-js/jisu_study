package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P0510_2 {
	//������ �������� ���� �迭
	
	public static void main(String[] args) {
		
		int[] arr = {2, 36, 1, 3};
		int n = 1;
		
		//���� Ǯ��
		//����� ��ȯ�� list
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i : arr) { //�迭 arr�� ��� ��Ҹ� �˻�
			if(i%n == 0) { //n���� ������ ��������
				list.add(i); //list�� �߰��ϱ�
			}
		}//for
		
		if(list.isEmpty()) {
			list.add(-1);
		}else {
			Collections.sort(list); //list �������� ����
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		//�ٸ� Ǯ��
		//���ٽ� ���
		//1. ��Ʈ�� ���� : Arrays.stream(arr) => IntStream ����
		//2. ������ ��Ʈ���� ������������ ���� : sorted()
		//3. ��Ʈ���� ���(i)�� Ȯ���Ͽ� n���� ������ ���������� �˻� : filter(i -> i%n == 0)
		//4. ��Ʈ���� �ٽ� �迭�� ���� : toArray()
		int[] newArr = Arrays.stream(arr).sorted().filter(i -> i%n == 0).toArray();
		if(newArr.length == 0) {
			newArr = new int[]{-1};
		}
		//Arrays.sort(newArr); //�� 42�࿡�� sorted()�� ����ϴ� ������� ����
		System.out.println(Arrays.toString(newArr));
	}

}
