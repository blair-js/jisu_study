package com.io.practice.assist.object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6193194556343847626L;
	//Phone 누르면 자동으로 생김!!! 신기방기! 역직렬화시 제대로 읽어들일 수 있도록 생성해주는 것! 
	//만약 이게 없다면 자바 내부에서 자동으로 작성을 하게 되는데 ---> 나중에 어떠한 문제가 생겼을 때 값이 달라져버림
	
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
