package com.virtue.ui;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of cells : ");
		int n = scan.nextInt();
		
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter value : ");
			arr[i] = scan.nextInt();
		}
		
		
		System.out.println("classic for loop ....");
		for(int i = n-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		// System.out.println(arr);
		
		System.out.println("enhanced for loop ...");
		for(double data : arr) {
			System.out.println(data);
		}
		

		scan.close();
	}

}
