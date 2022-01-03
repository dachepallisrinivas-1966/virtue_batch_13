package com.virtue.model;

public class Product {
	
	static {
		System.out.println("in static block ...");
	}
	
	// data members 		(instance variables)
	private int productId;
	private String name;

	// static data member	(class variables)
	private static int tax;			
	
	public Product(int productId, String name) {
		System.out.println("in constructor ...");
		this.productId = productId;
		this.name = name;
	}
	
	// static method
	public static void setTax(int productTax) {
		tax = productTax;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTax() {
		return tax;
	}
	
}
