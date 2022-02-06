package com.api.homework.hw6;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {

	public DateCalculator() {	}
	
	public long leapDate() {
		
		//1�� 1�� 1�Ϻ��� ���ñ����� �� �� ���� ���
		//1����� ���� �������� �� ������ �����̸� �� ������ 366����, ����̸� 365���� ����
		//�ش� ���� ������ �����̸� 2���� 29�Ϸ� ����̸� 28�Ϸ� ����
		//���� ��¥ ���� ����
		//(31��: 1, 3, 5, 7, 8, 10, 12��/
		//30��: 4, 6, 9, 11��)
		
		//Calendar Ŭ���� �̿� 
		//����(1��1��1��)
		//GregorianCalendar Ŭ������ Calendar Ŭ������ ��ӹ޾����Ƿ�, GregorianCalendar �� ������ ��ü�� �θ� Ŭ������ Calendar Ŭ������ �޾���. 
		//�׷��� Calendar�� �޼ҵ� getTimeInMillis �� ��밡�� => �ؿ��� ����� ���� 
		Calendar base = new GregorianCalendar(1, 1, 1); 
		
		//���糯¥
 		Calendar today = new GregorianCalendar(); //GregorianCalendar Ŭ������ �Ű����� ���� ������ ������ ��¥�� �ڵ����� ��!
		
 		//getTimeInMillis �޼ҵ�� Calender Ŭ������ ������ 1000���� 1�� ���� üũ���� => ��ȯ���� long Ÿ��
 		long diffSec = (today.getTimeInMillis() - base.getTimeInMillis())/1000; 
 		//�� ��¥�� ���̸� 1000���� ���� => �ֳĸ� �ʷ� �����ϱ�(�� �� ���� �ñ�)
 		
 		long diffDay = diffSec/86400; //86400�� �Ϸ��� �� �� �� (24�ð�*60��*60�� = 86400��) => �ϼ��� ���ϰ� ������ ����! (22�࿡�� 1000���� ������ó��)
 		
		return diffDay;
		
	}
	
	public boolean isLeapYear(int year) {
		
		//������ �����̸� true, ����̸� false ����
		//(����: ������ 4�� ����̸鼭,100�� ����� �ƴϰų� 400�� ����� �Ǵ� ��)
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
