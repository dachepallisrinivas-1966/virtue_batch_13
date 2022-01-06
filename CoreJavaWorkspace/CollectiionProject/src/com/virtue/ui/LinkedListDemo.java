package com.virtue.ui;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//	ArrayList obj = new ArrayList();		-- raw collection (not recommended)
		LinkedList<Integer> list = new LinkedList<>();		// generic collection - typesafe
		list.add(100);
		list.add(200);
		list.add(105);
		list.add(210);
		list.add(57);
		list.add(300);
		list.add(290);
		list.add(310);
		list.add(null);
		
		
		System.out.println(list);
		
		list.remove(1);			// index = 1
		
		System.out.println(list);
		
		list.set(0, 101);
		
		System.out.println("-------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------------");
		
		for(Integer data : list) {
			System.out.println(data);
		}
		
		System.out.println("-------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------");
		
		Iterator<Integer> it2 = list.descendingIterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
//		ListIterator<Integer> lit2 = list.listIterator(list.size());
//		while (lit2.hasPrevious()) {
//			System.out.println(lit2.previous());
//		}
		
		System.out.println("-------------------------------------");
		
		
		
	}

}
