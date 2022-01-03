package com.virtue.ui;

class	A {
	public A() {
		
	}
	public A(int x) {
		System.out.println("A - value of x = " + x);
	}

}

class	B extends  A {
	public B(int y) {
		System.out.println("B - value of y = " + y);
	}
}

public class Test {

	public static void main(String[] args) {
		B obj = new B(200);

	}

}
