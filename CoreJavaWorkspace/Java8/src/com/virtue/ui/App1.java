package com.virtue.ui;

interface Test {
	default void show() {
		System.out.println("in default method ...");
	}
	static void display() {
		System.out.println("in static method");
	}
}

class TestImpl implements Test {
	@Override
	public void show() {
		System.out.println("in sub class method ...");
	}
	

} 

public class App1 {
	public static void main(String[] args) {
		// TestImpl obj = new TestImpl();
		// obj.show();

		Test.display();
	}
}
