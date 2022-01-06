package com.virtue.ui;

public class CloningApp {
	public static void main(String[] args) {
		Course t1 = new Course("oracle", 6000);
		System.out.println(t1);

		Course t2 = (Course)t1.clone();
		t2.setFee(6500);
		System.out.println(t2);
		System.out.println(t1);
	}

}
