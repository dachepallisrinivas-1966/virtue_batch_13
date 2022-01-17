package com.virtue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtue.dao.StudentDAO;
import com.virtue.model.Student;

@RestController
public class MyRestController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping(value = "/students")
	public ResponseEntity<List<Student>> findAll() {
		List<Student> students = studentDAO.findAll();
		// return ResponseEntity.status(HttpStatus.OK).body(students);
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	
	@GetMapping(value = "/students/{id}", params = "id")
	public Student findById(@PathVariable int id) {
		return studentDAO.findById(id);
	}
//	
//	@GetMapping(value = "/students/{name}", params = "name")
//	public Student findByName(@PathVariable String name) {
//		return studentDAO.findByName(name);
//	}
	
//	@PostMapping(value = "/students")
//	public Student saveStudent(@RequestParam int id, @RequestParam String name, @RequestParam String country) {
//		Student student = new Student();
//		student.setId(id);
//		student.setName(name);
//		student.setCountry(country);
//		
//		studentDAO.saveStudent(student);
//		
//		return student;
//	}
	
	@PostMapping(value = "/students")
	public Student saveStudent(@RequestBody Student student) {
		studentDAO.saveStudent(student);
		return student;
	}

	

	
//	@PostMapping(value = "/students")
//	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
//		studentDAO.saveStudent(student);
//		// return ResponseEntity.status(HttpStatus.CREATED).body(student);
//		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
//	}

}
