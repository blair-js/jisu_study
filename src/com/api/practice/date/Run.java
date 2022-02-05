package com.api.practice.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Run {

	public static void main(String[] args) {

		/*
		 * 1. Date (java.util ��Ű��)
		 * - Date�� ��¥�� �ٷ�� ���� �����Ǵ� Ŭ����
		 * - �ڹٰ��� �ʱ⿡ ���ϰ� ���� �ϼ����� ����, �ٱ������� ���⵵ �������� ����
		 * - 1970�� 1�� 1�� 0�� 0�� 0�ʸ� �������� milliseconds ������ �����
		 * - Date�� ���������� �⵵�� +1900, ���� +1�� �ڵ����� ����. => �Ʒ� ���� ����, �ٵ� ���� ���ö��� �� �ڵ����� ���� ����...�̻��ϱ�^^
		 */
		
		// ���� �ð�(Date �⺻ ����) : ��ǻ���� �ð�
		Date today = new Date();
		System.out.println(today);
		
		// ���� ���ϴ� ��¥(Date�� �Ű����� �ִ� ������)
		Date today1 = new Date(120, 0, 28);	// 2020.01.28 -> (120+1900, 0+1, 28)
		System.out.println(today1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		System.out.println(sdf.format(today1));
		
		// �ð��� ���� ���ϴ� �� �̾� ����
		System.out.println("�ð� : " + today.getTime());
		System.out.println("��¥ : " + today.getDate());
		System.out.println("���� : " + today.getDay());
		System.out.println("�� : " + today.getHours());
		System.out.println("�� : " + today.getMinutes());
		System.out.println("�� : " + (today.getMonth() + 1));	// ����
		System.out.println("�� : " + today.getSeconds());
		System.out.println("�� : " + (today.getYear() + 1900));	// ����
		
		String curTime = new SimpleDateFormat("yyyy MM dd HH mm ss").format(new Date());
		System.out.println(curTime);
		
		
		System.out.println("------------ Ķ���� -------------");
		// 2. Calendar
		// - ���������� ���� +1 �ڵ� (�⵵�� �����Է�)
		//   ex) 20��� ������ �׳� 20�⵵�� �ν�, 2020�� �Է��ؾ� �� ���� 2020�� �Է�
		// - TimeZone ��� ����
		// - filed number ���� ����(�޼ҵ� ���� ���� ���� ����)
		
		Calendar calendar = Calendar.getInstance(); 
		calendar.set(2020, 1, 28);
		System.out.println(calendar.get(GregorianCalendar.DATE));
		System.out.println(calendar.getTime());
		
		
		System.out.println("------------ �׷����� Ķ���� -------------");
		// �����̶�? �⵵��(4�� ����̸鼭, 100�� ����� �ƴϰų�)
		//              (400�� �����)�� �Ǵ� �ذ� ����(1���� 366�Ϸ� ���(=2���� 29���� ��))
		
		// �����콺���� �ټ��� ���� ���� ������ �׷�����
		// (1���� 365 1/4��(365.2422��))
		// 1) �� ���� ������ 4�� ����� �ƴϸ� ������� 2���� 28�ϸ� �ִ�.
		// 2) ���� ������ 4�� ����鼭 100�� ����� �ƴϸ� ����(2�� 29��)�� �����Ѵ�.
		// 3) ���� ������ 100�� ����̸鼭 400�� ����� �ƴ� �� �� �ش� ������� �����Ѵ�.
		// 4) ���� ������ 400�� ����� ����(2�� 29��)�� �����Ѵ�.
		
		// 2)�� ��
		// 2008�� (����, 366��)
		
		// 3)�� ��
		// 2300�� (���, 365��)
		
		// 4)�� ��
		// 2400�� (����, 366��)
		
		
	}

}
