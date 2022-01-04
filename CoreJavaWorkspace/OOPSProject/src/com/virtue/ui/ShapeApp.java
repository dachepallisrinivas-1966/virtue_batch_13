package com.virtue.ui;

import com.virtue.model.Circle;
import com.virtue.model.Rectangle;
import com.virtue.model.Shape;

public class ShapeApp {

	public static void main(String[] args) {
		/* without polymorphism */
		Rectangle rectangle = new Rectangle(5,6);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle(9);
		System.out.println(circle.getArea());
		
		/* using polymorphism */
		Shape shape;
		shape = new Rectangle(5,6);
		System.out.println(shape.getArea());
		shape = new Circle(9);
		System.out.println(shape.getArea());
		

	}

}
