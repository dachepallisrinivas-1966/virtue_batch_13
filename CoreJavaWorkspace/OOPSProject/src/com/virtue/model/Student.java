package com.virtue.model;

public class Student extends Person {
	private int fee;
	
	public Student() {
		/* default constructor */
	}
	
	public Student(String name, int age, int fee) {
		super(name, age);
		this.fee = fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public int getFee() {
		return fee;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%10d", fee);
	}
}
