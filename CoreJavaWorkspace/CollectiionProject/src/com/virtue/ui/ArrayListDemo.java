package com.virtue.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//	ArrayList obj = new ArrayList();		-- raw collection (not recommended)
		ArrayList<Integer> list = new ArrayList<>();		// generic collection - typesafe
		list.add(100);
		list.add(200);
		list.add(105);
		list.add(210);
		list.add(57);
		
		System.out.println(list);
		
		list.remove(1);			// index = 1
		
		System.out.println(list);
		
		list.set(0, 101);
		
		System.out.println("-------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------------------------------");
		
		for(int data : list) {
			System.out.println(data);
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println(list.contains(200));
		
		System.out.println("-------------------------------------");
		
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------");
		
		ListIterator<Integer> lit = list.listIterator(1);
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println(list.indexOf(210));
		
		System.out.println("-------------------------------------");
		
		list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println("-------------------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(101); list2.add(105); list2.add(210); list2.add(57);
		System.out.println(list == list2);
		System.out.println(list.equals(list2));
		
//		Vector v = new Vector();
//		v.add(1); v.add(1);	v.add(1);	v.add(1);	v.add(1);	v.add(1);	
//		v.add(1);	v.add(1);	v.add(1);	v.add(1);	v.add(1);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
		
		System.out.println("---------------------------------------------------------------------------");
		
		list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.add(5);  
  
		// fail-fast iteration
		 Iterator<Integer> it2 = list.iterator();  
	     while (it2.hasNext()) {                   
	    	 Integer value = it2.next();              
	         System.out.println("List Value:" + value);  
	         if (value.equals(3)) {  
	             list.remove(value);
	         }
	     }  
	}

}
