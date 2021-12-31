package com.virtue.ui;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String str = scan.nextLine();
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		scan.close();
	}

}
