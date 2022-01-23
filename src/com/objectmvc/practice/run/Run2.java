package com.objectmvc.practice.run;

import com.objectmvc.practice.controller.NonstaticSample2;

public class Run2 {

	public static void main(String[] args) {

		NonstaticSample2 n = new NonstaticSample2();
		
		System.out.print("-ũ�Ⱑ 5�� �迭�� ������ : ");
		int[] arr = n.intArrayAllocation(5); 
		n.display(arr); //�迭 ��� ���
		
		System.out.print("\n-�������� ��� : ");
		n.sortDescending(arr);
		
		System.out.print("\n-�������� ��� : ");
		n.sortAscending(arr);
		
		System.out.print("\n-apple ���ڿ����� p�� ���� : ");
		System.out.println(n.countChar("apple", 'p'));
		
		System.out.print("-13�� 7���� �������� �հ� : ");
		System.out.println(n.totalValue(13, 7));
		
		System.out.print("-programming ���ڿ��� 3�� �ε��� ���� : ");
		System.out.println(n.pCharAt("programming", 3));
		
		System.out.print("-JAVA�� programming�� ��ģ ���ڿ� : ");
		System.out.println(n.pConcat("JAVA", "programming"));
		
	}

}
