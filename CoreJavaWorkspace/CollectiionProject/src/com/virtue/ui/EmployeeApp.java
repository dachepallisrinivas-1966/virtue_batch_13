package com.virtue.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import com.virtue.comparator.EmpIdComparator;
import com.virtue.comparator.EmpNameComparator;
import com.virtue.comparator.SalaryComparator;
import com.virtue.model.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "srinivas", 30000.0));
		list.add(new Employee(103, "vandana", 60000.0));
		list.add(new Employee(102, "varshini", 25000.0));
		list.add(new Employee(106, "ramya", 15000.0));
		list.add(new Employee(104, "sravya", 29000.0));
		list.add(new Employee(105, "priya", 31000.0));
		
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
		
		ListIterator<Employee> it = list.listIterator(list.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		System.out.println("------------------------------------------------");
		
		// Collections.sort(list);
		
		Collections.sort(list, new EmpIdComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
		
		Collections.sort(list, new EmpNameComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
		
		Collections.sort(list, new SalaryComparator());
		for(Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------------------");
	}

}
