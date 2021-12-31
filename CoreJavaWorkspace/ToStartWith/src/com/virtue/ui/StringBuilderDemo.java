package com.virtue.ui;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.length());
		System.out.println(sb.capacity());		// length+16
		System.out.println(sb);
		sb.append("language");
		System.out.println(sb);
		sb.insert(4, " ");
		System.out.println(sb);
		sb.replace(0, 4, "python");
		System.out.println(sb);
		sb.delete(6, sb.length());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
