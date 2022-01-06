package com.virtue.model;

public class Employee { // implements Comparable<Employee> {
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		/* no implementation required */
	}
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, empName=%s, salary=%s", empId, empName, salary);
	}

//	@Override
//	public int compareTo(Employee o) {
//		Integer firstId = this.empId;
//		Integer secondId = o.empId;
//		return firstId.compareTo(secondId);
		
//		return empName.compareTo(o.empName);
//	}
	
	
	@Override
	public int hashCode() {
		return empId;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		Employee other = (Employee) o;
		if (empId == other.empId && empName.equals(other.empName) && salary == other.salary)
			result = true;
		return result;
	}

	

	
}
