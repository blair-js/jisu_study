package com.api.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class NewTimeEx1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now(); //������ ��¥ 2022-02-08
		LocalTime now = LocalTime.now(); //���� �ð� 10:43:27.381763300 =
		System.out.println(today);
		System.out.println(now);
		System.out.println("======================================");

		//���� ���ϴ� ������ �����ϱ�
		LocalDate birthDate = LocalDate.of(1992, 9, 3); //1992-09-03
		LocalTime birthTime1 = LocalTime.of(8, 30); //08:30
		LocalTime birthTime2 = LocalTime.of(23, 59, 59); //23:59:59
		System.out.println(birthDate);
		System.out.println(birthTime1);
		System.out.println(birthTime2);
		System.out.println("======================================");

		//�� �ٲ㺸��
		System.out.println(birthDate.withYear(2000)); //�⵵�� 2000���� �ٲ�
		System.out.println(birthDate.plusDays(1)); //�� 1 ����
		System.out.println(birthDate.plus(1, ChronoUnit.DAYS)); //�� 1 ���ϴ� �ٸ� ��� (���� ��, ����)
		System.out.println(birthTime2.truncatedTo(ChronoUnit.HOURS)); //��(hour)���� ���� ������ 0 ���� 23:59:59 => 23:00 ���� �����
		System.out.println(birthTime2.truncatedTo(ChronoUnit.MINUTES)); //��(minute)���� ���� ������ 0 ���� 23:59:59 => 23:59 ���� �����
		System.out.println("======================================");
		
		//ChronoField �� ���� �˾ƺ���
		System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range()); //�Ϸ��� �ð� ���� => 1 - 24 (������ 24�÷� ǥ��)
		System.out.println(ChronoField.CLOCK_HOUR_OF_AMPM.range()); //AM/PM�� �ð� ���� => 1 - 12
		System.out.println(ChronoField.HOUR_OF_DAY.range()); //�Ϸ��� �ð� ���� => 0 - 23 (������ 0�÷� ǥ��)
		System.out.println(ChronoField.HOUR_OF_AMPM.range());  //AM/PM�� �ð� ���� => 0 - 11
		
	}

}
