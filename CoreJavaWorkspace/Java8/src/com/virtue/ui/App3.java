package com.virtue.ui;

interface A1 {
	static void show() {
		System.out.println("A - show");
	}
}

interface B1 {
	static void show() {
		System.out.println("B - show");
	}
}

class C1 implements A1, B1 {
	public void show() {
		A1.show();
		B1.show();
		System.out.println("C - show");
	}
}


public class App3 {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.show();
	}

}
