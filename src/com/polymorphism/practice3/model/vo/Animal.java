package com.polymorphism.practice3.model.vo;

public abstract class Animal {
	
	private String name; 
	private String kinds; 
	
	protected Animal() {	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다. ";
	}

	public abstract void speak(); //추상 메소드를 가지고 있기 때문에 클래스도 추상 클래스로 바뀌어야 한다! 
	
}
