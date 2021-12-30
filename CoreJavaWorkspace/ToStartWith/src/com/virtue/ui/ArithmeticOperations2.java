package com.virtue.ui;

public class ArithmeticOperations2 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c;
		c = a+b;
		System.out.println("Sum = " + c);
		c = a-b;
		System.out.println("Difference = "+c);
		c = a*b;
		System.out.println("Product = "+c);
		c = a/b;
		System.out.println("Quotient = "+c);
		c =a%b;
		System.out.println("Remainder = "+c);
	}
}
