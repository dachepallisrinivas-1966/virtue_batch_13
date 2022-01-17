package com.virtue.dao;

import java.util.List;

import com.virtue.model.Student;

public interface StudentDAO {
	List<Student> findAll();
	Student findById(int id);
	Student findByName(String name);
	void saveStudent(Student student);
}
