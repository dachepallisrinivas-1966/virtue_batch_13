package com.virtue.ui;

@FunctionalInterface
interface A3 {
	void show();
	
	default void display() {
		System.out.println("A - default display method");
	}
	static void print() {
		System.out.println("A - static print method");
	}
}


class S3 implements A3 {
	@Override
	public void show() {
		System.out.println("Subclass show method");
	}
	
	@Override
	public void display() {
		System.out.println("Subclass display method");
	}

}

public class App4 {
	public static void main(String[] args) {
		S3 obj = new S3();
		obj.show();
		obj.display();
	}
}
