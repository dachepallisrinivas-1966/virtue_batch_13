package com.virtue.ui;

public class FunctionDemo {

	// function definition
	static int factorial(int num) {				// num is formal parameter
		int fact = 1, i;
		for(i = num; i >= 2; i--) {
			fact *= i;
		}
		return fact;
	}

	// recursive function
	static int factorial2(int num) {
		if (num == 0)
			return 1;
		else
			return num*factorial2(num-1);
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "! = " + factorial2(i));   // function calling - i is actual parameter
		}
	}

}
