package com.api.homework.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {

	public SetDate() {	}
	
	public String todayPrint() {
		
		//������ ��, ��, ��, ��, ��, �ʸ� �� ������ ���� �� ������ String���� ����
		
		Date d = new Date();
		//SimpleDateFormat sd = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��"); //HH => 21�� 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��"); //hh => 09��
		String today = sd.format(d);
		
		return today; 
		
	}

	public String setDay() {
		
		//��2011�� 3�� 21�� �����ϡ��� �����Ͽ� ���
		SimpleDateFormat sd = new SimpleDateFormat("yyyy�� MM�� dd�� E����");

		Date d = new Date(2011-1900, 3-1, 21);
		String today = sd.format(d);

		//Calendar cal = Calendar.getInstance();
		//cal.set(2011, 3-1, 21);
		//String today = String.valueOf(cal.YEAR); => ����^^^^^^^^^^^^
		
		return today; 
		
	}
	
}
