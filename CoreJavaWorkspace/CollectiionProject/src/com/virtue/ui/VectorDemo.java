package com.virtue.ui;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("java");
		vector.add("c++");
		vector.add("oracle");
		vector.add("android");
		vector.add("python");
		
		Enumeration<String> courses = vector.elements();
		while (courses.hasMoreElements()) {
			System.out.println(courses.nextElement());
		}
		System.out.println("-------------------------------------");
		
		Iterator<String> it = vector.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------");
		
		
		// fail-safe iteration
		Iterator<String> it2 = vector.iterator();
		while(it2.hasNext()) {
			String course = it2.next();
			if ("c++".equals(course)) {
				it2.remove();
			} else {
				System.out.println(course);
			}
		}
	}

}
