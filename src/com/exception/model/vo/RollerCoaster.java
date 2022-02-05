package com.exception.model.vo;

public class RollerCoaster {

	public static final double CUTHEIGHT = 110;
	public static final int PRICE = 4500;
	public static final int PERMITNUMBER = 2;
	
	public RollerCoaster() {	}

	@Override
	public String toString() {
		return "RollerCoaster [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
