package com.virtue.ui;

@FunctionalInterface
interface Test7 {
	void printNaturalNumbers(int m, int n);
}

public class App7 {
	public static void main(String[] args) {
		// lambda block
		Test7 obj2 = (a,b) -> {
			for(int i = a; i <= b; i++) {
				System.out.println(i);
			}
		};
		
		obj2.printNaturalNumbers(10, 15);
	}
}

/*
lambda
	no function name
	arrow symbol
*/
