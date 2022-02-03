package com.polymorphism.practice3.run;

import com.polymorphism.practice3.model.vo.Animal;
import com.polymorphism.practice3.model.vo.Cat;
import com.polymorphism.practice3.model.vo.Dog;

public class Run {

	public static void main(String[] args) {

		// Animal Ÿ���� ��ü�迭 ũ�� 5�� ����
		Animal[] ani = new Animal[5];
		// �� �ε����� �������� Dog��ü �Ǵ� Cat��ü�� ����
		// (�̶�, �Ű����� �����ڸ� �̿��Ͽ� ����)
		ani[0] = new Cat("�߿�1", "��1", "������ī", "��");
		ani[1] = new Dog("�۸�1", "��Ƽ��", 5);
		ani[2] = new Cat("�߿�2", "��2", "�ѱ�", "ȭ��Ʈ");
		ani[3] = new Dog("�۸�2", "���", 6);
		ani[4] = new Cat("�߿�3", "��3", "ĳ����", "���ο�");
		// �ݺ����� ���ؼ� �ش� �迭�� 0�� �ε������� ������ �ε���������
		// ��ü�� speak() �޼ҵ� ȣ��
		
		for(Animal a : ani) {
			a.speak();
		}
	}

}
