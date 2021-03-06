package com.virtue.ui;

public class StringDemo {

	public static void main(String[] args) {
		String str = "java";
		//			  0123

		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		// System.out.println(str.charAt(5));			// StringIndexOutOfBoundsException
		System.out.println(str.indexOf("a"));			// first occurance - 1
		System.out.println(str.lastIndexOf("a"));	 	// last occurance  - 3
		
		String str2 = "java language";
		//			   0123456789012
		System.out.println(str2.substring(0,4));	 	// java
		System.out.println(str2.substring(5,13));
		System.out.println(str2.substring(5));
		
		System.out.println(str2.startsWith("ja"));
		System.out.println(str2.endsWith("age"));
		System.out.println(str2.contains("lan"));
		
		System.out.println(str2.contains("ja"));
		
		String str3 = "JAva";
		str3.toUpperCase();
		System.out.println(str3);
		
		str3.toLowerCase();
		System.out.println(str3);
		
		
		str3.concat("language");
		System.out.println(str3);
		
		str3.replace('A', 'a');
		System.out.println(str3);
		
		String str4 = "   java    ";
		System.out.println(str4);
		str4 = str4.trim();
		System.out.println(str4);
		
		
		String str5 = "hello";			// "hello"   is a string literal
		String str6 = "hello";
		System.out.println(str5 == str6);		// true, since hash codes are same
		System.out.println(str5.equals(str6));	// true, since data is also same
		
		String str7 = new String("hello");
		String str8 = new String("hello");
		System.out.println(str7 == str8);		// false, since hash codes are different
		System.out.println(str7.equals(str8));	// since, data is same
		
		String str9 = "HELLO";
		String str10 = "hello";
		System.out.println(str9.equals(str10));	// false
		System.out.println(str9.equalsIgnoreCase(str10));	// true
		
		String str11 = "cat";
		String str12 = "cot";
		System.out.println(str11.compareTo(str12));	// -ve
		System.out.println(str12.compareTo(str11));	// +ve
		
		String str13 = "";
		System.out.println(str13.isEmpty());
		
		
		String str14 = "java is an object-oriented programming,language";
 
		for(String word : str14.split("[-, ]")) {
			System.out.println(word);
		}
	}

}
