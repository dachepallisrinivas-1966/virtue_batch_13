package com.virtue.model;

public class ComplexNumber {
	/* data members (properties) */
	private double realPart;
	private double imaginaryPart;
	
	/* default constructor */
	public ComplexNumber() {
		/* intentionally left blank */
	}
	
	/* parameter constructor */
	public ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	/* copy constructor */
	public ComplexNumber(ComplexNumber existing) {
		this.realPart = existing.realPart;
		this.imaginaryPart = existing.imaginaryPart;
	}
	
	/* methods */
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	
	public double getRealPart() {
		return this.realPart;
	}
	
	public double getImaginaryPart() {
		return this.imaginaryPart;
	}
	
	
	
}
