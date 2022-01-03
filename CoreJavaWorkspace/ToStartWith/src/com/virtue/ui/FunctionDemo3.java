package com.virtue.ui;

public class FunctionDemo3 {
	
	static double average(int[] arr) {
		int sum = 0;
		for(int data : arr) {
			sum += data;
		}
		return sum/arr.length;
	}

	static double average2(int ... arr) {
		int sum = 0;
		for(int data : arr) {
			sum += data;
		}
		return sum/arr.length;
	}
	
	public static void main(String[] args) {
		
		System.out.println(average(new int[] {10,20,30,40,50,60,70}));
		System.out.println(average(new int[] {1,2,3}));
		System.out.println(average(new int[] {11,22,33,44}));
		
		System.out.println(average2(10,20,30,40,50,60,70));
		System.out.println(average2(1,2,3));
		System.out.println(average2(11,22,33,44));
		
		
	}

}
