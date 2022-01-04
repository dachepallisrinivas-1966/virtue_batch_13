package com.virtue.ui;

public class ExceptionDemo {
	public static void main(String[] args) {

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c;
			c = a+b;
			System.out.println("Sum = " + c);
			c = a-b;
			System.out.println("Difference = "+c);
			c = a*b;
			System.out.println("Product = "+c);
			try {
				c = a/b;
				System.out.println("Quotient = "+c);
				c =a%b;
				System.out.println("Remainder = "+c);
			} catch(ArithmeticException excep) {
				System.out.println("denominator cannot be 0 - cannot perform division");
			}
			
		} catch(ArrayIndexOutOfBoundsException excep) {
			System.out.println("please give 2 inputs using command line");
		} catch(NumberFormatException excep) {
			System.out.println("both the numbers must be integers only");
		} finally {
			System.out.println("exceptions are handled");
		}
	}
}

