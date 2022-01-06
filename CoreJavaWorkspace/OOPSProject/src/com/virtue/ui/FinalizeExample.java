package com.virtue.ui;

public class FinalizeExample {
	public static void main(String[] args) {
		FinalizeExample obj = new FinalizeExample();
		System.out.println(obj.hashCode());
		obj = null;
		// calling garbage collector - otherwise sending a request to JVM to collect garbage
		FinalizeExample obj2 = new FinalizeExample();
		System.out.println(obj2.hashCode());
		obj2 = null;
		
		System.gc();
		System.out.println("end of garbage collection");

	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}