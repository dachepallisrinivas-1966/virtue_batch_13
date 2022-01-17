package com.virtue.ui;

@FunctionalInterface
interface Test6 {
	void printMessage();
}

//class Test6Impl implements Test6 {
//	@Override
//	public void printMessage() {
//		System.out.println("from test6 impl class");
//	}
//}

public class App6 {
	public static void main(String[] args) {
		
//		Test6Impl obj = new Test6Impl();
//		obj.printMessage();
		
		// lambda expression
		Test6 obj = () -> System.out.println("hello");
		obj.printMessage();
		
		// lambda block
		Test6 obj2 = () -> {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		
		obj2.printMessage();
		
	}
}

/*
lambda
	no function name
	arrow symbol
*/
