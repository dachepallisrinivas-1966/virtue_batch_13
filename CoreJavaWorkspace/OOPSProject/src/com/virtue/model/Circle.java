package com.virtue.model;

public class Circle extends Shape {

	public Circle() {
		/* no implementation is required */
	}

	public Circle(double firstDimension) {
		super(firstDimension);
	}

	@Override
	public double getArea() {
		return Math.PI*getFirstDimension()*getFirstDimension();
	}

}
