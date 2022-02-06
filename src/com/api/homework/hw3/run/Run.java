package com.api.homework.hw3.run;

import com.api.homework.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {

		SetDate s = new SetDate();
		System.out.println(s.todayPrint());
		System.out.println(s.setDay());
	}

}
