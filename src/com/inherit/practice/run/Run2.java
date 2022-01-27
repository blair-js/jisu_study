package com.inherit.practice.run;

import com.inherit.practice.model.vo.Circle;
import com.inherit.practice.model.vo.Point;
import com.inherit.practice.model.vo.Rectangle;

public class Run2 {

	public static void main(String[] args) {

		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		Circle[] cArr = new Circle[2];
		Rectangle[] rArr = new Rectangle[2];
		
		// 위의 사용 데이터를 참고하여 각각 초기화
		cArr[0] = new Circle(1, 2, 3);
		cArr[1] = new Circle(3, 3, 4);
		
		rArr[0] = new Rectangle(-1, -2, 5, 2);
		rArr[1] = new Rectangle(-2, 5, 2, 8);
		
		// 각 도형의 draw 메소드 실행 --> 향상된 for문 이용해서
		System.out.println("===== circle =====");
		for(Circle c : cArr) {
			c.draw();
		}
		System.out.println("===== rectangle =====");
		for(Rectangle r : rArr) {
			r.draw();
		}
		
		System.out.println("====== 다형성 적용시 ======");
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
