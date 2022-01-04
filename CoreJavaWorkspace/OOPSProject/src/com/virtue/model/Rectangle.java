package com.virtue.model;

public class Rectangle extends Shape {

	public Rectangle() {
		/* no implementation required */
	}

	public Rectangle(double firstDimension, double secondDimension) {
		super(firstDimension, secondDimension);
	}

	@Override
	public double getArea() {
		return getFirstDimension()*getSecondDimension();
	}

}
