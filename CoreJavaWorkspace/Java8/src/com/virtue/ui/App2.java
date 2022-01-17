package com.virtue.ui;

interface A {
	default void show() {
		System.out.println("A - show");
	}
}

interface B {
	default void show() {
		System.out.println("B - show");
	}
}

class C implements A, B {
	@Override
	public void show() {
		A.super.show();
		B.super.show();
		System.out.println("C - show");
	}
}


public class App2 {
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
	}
}
