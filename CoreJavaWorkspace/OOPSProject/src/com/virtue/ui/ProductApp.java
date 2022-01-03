package com.virtue.ui;

import com.virtue.model.Product;

public class ProductApp {

	public static void main(String[] args) {
		// Product.setTax(18);
		
		Product first = new Product(101, "TV");
		Product second = new Product(102, "Washing Machine");
		Product third = new Product(103, "Refrigerator");
		
		System.out.println(first.getProductId() + "\t" + first.getName() + "\t" + first.getTax());
		System.out.println(second.getProductId() + "\t" + second.getName() + "\t" + second.getTax());
		System.out.println(third.getProductId() + "\t" + third.getName() + "\t" + third.getTax());

	}

}
