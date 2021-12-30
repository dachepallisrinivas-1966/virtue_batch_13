package com.virtue.ui;

import java.util.Arrays;

public class SingleArray2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 45, 34, 5 };
		int[] arr2 = { 10, 20, 45, 34, 5 };
		
		//System.out.println(Arrays.toString(arr));
		
		System.out.println(arr == arr2);	// false
		System.out.println(Arrays.equals(arr, arr2));	// true
		
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 45);
		if (index > 0)
			System.out.println("found");
		else
			System.out.println("not found");
	}

}
