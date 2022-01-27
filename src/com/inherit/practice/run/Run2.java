package com.inherit.practice.run;

import com.inherit.practice.model.vo.Circle;
import com.inherit.practice.model.vo.Point;
import com.inherit.practice.model.vo.Rectangle;

public class Run2 {

	public static void main(String[] args) {

		// ũ�Ⱑ 2�� Circle, Rectangle ���� ��ü �迭 �Ҵ�
		Circle[] cArr = new Circle[2];
		Rectangle[] rArr = new Rectangle[2];
		
		// ���� ��� �����͸� �����Ͽ� ���� �ʱ�ȭ
		cArr[0] = new Circle(1, 2, 3);
		cArr[1] = new Circle(3, 3, 4);
		
		rArr[0] = new Rectangle(-1, -2, 5, 2);
		rArr[1] = new Rectangle(-2, 5, 2, 8);
		
		// �� ������ draw �޼ҵ� ���� --> ���� for�� �̿��ؼ�
		System.out.println("===== circle =====");
		for(Circle c : cArr) {
			c.draw();
		}
		System.out.println("===== rectangle =====");
		for(Rectangle r : rArr) {
			r.draw();
		}
		
		System.out.println("====== ������ ����� ======");
		Point[] pArr = new Point[4];
		pArr[0] = new Circle(1, 2, 3);
		pArr[1] = new Circle(3, 3, 4);
		pArr[2] = new Rectangle(-1, -2, 5, 2);
		pArr[3] = new Rectangle(-2, 5, 2, 8);
		for(Point p : pArr) {
			p.draw();
		}
		
		
	}

}
