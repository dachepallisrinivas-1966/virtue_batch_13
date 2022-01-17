package com.virtue.ui;

import java.util.ArrayList;

public class App8 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("srinivas");
		names.add("roni");
		names.add("himanshi");
		names.add("shubam");
		names.add("khushboo");
		
		// names.forEach(name -> System.out.println(name));
		
		names.stream()
			.filter(n -> n.startsWith("s"))
			.map( n -> n.toUpperCase())
			.forEach(n -> System.out.println(n));
		
	}
	

}
