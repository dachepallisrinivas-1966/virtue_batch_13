package com.virtue.ui;

import com.virtue.model.Employee;
import com.virtue.model.Manager;
import com.virtue.model.Person;
import com.virtue.model.Student;

public class InheritanceApp {

	public static void main(String[] args) {
		// Person person = new Person("harika", 21);
		//System.out.println(person);
		// System.out.println(person.toString());			// fully qualified name + @ + hashcode in hexa decimal form
		// System.out.println(person.hashCode());			// hashcode in decimal form

		
		Employee employee = new Employee("Srinivas", 55, 45000.0);
		System.out.println(employee);
		
		Student student = new Student("sravya", 20, 30000);
		System.out.println(student);
		
		Manager manager = new Manager("piyush", 22, 60000.0, 7800);
		System.out.println(manager);
	}

}
