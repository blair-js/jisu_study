package com.io.practice.assist.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6193194556343847626L;
	//Phone ������ �ڵ����� ����!!! �ű���! ������ȭ�� ����� �о���� �� �ֵ��� �������ִ� ��! 
	//���� �̰� ���ٸ� �ڹ� ���ο��� �ڵ����� �ۼ��� �ϰ� �Ǵµ� ---> ���߿� ��� ������ ������ �� ���� �޶�������
	
	private String brand;
	private int price;
	
	public Phone() {	}

	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [ brand = "+brand +" , price = "+ price+ "]";
	}
}
