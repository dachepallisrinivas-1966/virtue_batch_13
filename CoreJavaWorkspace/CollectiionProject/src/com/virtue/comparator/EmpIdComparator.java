package com.virtue.comparator;

import java.util.Comparator;

import com.virtue.model.Employee;

public class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer firstEmpId = o1.getEmpId();
		Integer secondEmpId = o2.getEmpId();
		
		return firstEmpId.compareTo(secondEmpId);
	}
	
}
