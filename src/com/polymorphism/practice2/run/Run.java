package com.polymorphism.practice2.run;

import com.polymorphism.practice2.model.vo.GalaxyNote9;
import com.polymorphism.practice2.model.vo.SmartPhone;
import com.polymorphism.practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {

		// 2���� ��ü�� ������ �� �ִ� ��ü�迭 ���� (SmartPhoneŸ��)
		SmartPhone[] phone = new SmartPhone[2];
		
		// ������ �ε����� GalaxyNote9, V40 ��ü ���� (�⺻������ �̿�) --> ������
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		// for���� �̿��Ͽ� phone ��ü�迭�� ��� �ε����� ����.
		for(SmartPhone s : phone) {
			// printMaker() ȣ��
			s.printMaker();
			// makeaCall() ȣ��
			s.makeaCall();
			// takeaCall() ȣ��
			s.takeaCall();
			// touch() ȣ��
			s.touch();
			// charge() ȣ��
			s.charge();
			// picture() ȣ��
			s.picture();
			System.out.println(); //����
		}
	}

}
