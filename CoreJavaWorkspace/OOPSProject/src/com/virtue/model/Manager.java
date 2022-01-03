package com.virtue.model;

public class Manager extends Employee {

	private int bonus;
	
	public Manager() {
		/* default constructor */
	}

	public Manager(String name, int age, double salary, int bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%10d", bonus);
	}
}
