package com.virtue.ui;

import com.virtue.model.ComplexNumber;

public class ComplexNumberApp {

	public static void main(String[] args) {
		ComplexNumber first;
		first = new ComplexNumber();
		System.out.println(first);		// com.virtue.model.ComplexNumber@626b2d4a - fully-qualified-class-name@hashcode
		
		first.setRealPart(5);
		first.setImaginaryPart(-6);
		
		System.out.println(first.getRealPart() + "\t" + first.getImaginaryPart());
		System.out.println();
		
		
		ComplexNumber second = new ComplexNumber();
		second.setRealPart(7);
		second.setImaginaryPart(8);
		System.out.println(second.getRealPart() + "\t" + second.getImaginaryPart());
		
		ComplexNumber third = new ComplexNumber();
		third.setRealPart(7);
		third.setImaginaryPart(8);
		System.out.println(third.getRealPart() + "\t" + third.getImaginaryPart());
		
		System.out.println(second == third); 			// compare hashcode	-	false
		System.out.println(second.equals(third));	 	// compare hashcode - 	false
		
		System.out.println(second.getRealPart() == third.getRealPart() && second.getImaginaryPart() == third.getImaginaryPart());
		
		
		ComplexNumber fourth = new ComplexNumber();			// default constructor is called
		System.out.println(fourth.getRealPart() + "\t" + fourth.getImaginaryPart());
		
		ComplexNumber fifth = new ComplexNumber(100, 200);			// parameter constructor is called
		System.out.println(fifth.getRealPart() + "\t" + fifth.getImaginaryPart());
		
		
		ComplexNumber sixth = new ComplexNumber(fifth);					// copy constructor is called
		System.out.println(sixth.getRealPart() + "\t" + sixth.getImaginaryPart());
		
	}	

}
