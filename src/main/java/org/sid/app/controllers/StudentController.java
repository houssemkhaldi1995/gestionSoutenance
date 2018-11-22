package org.sid.app.controllers;

import org.sid.app.entities.Student;
import org.sid.app.services.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@PostMapping("/addstudent/{student}")
	public void add(@PathVariable Student student) {
		studentService.add(student);
	}

	@DeleteMapping("/deletestudent/{student}")
	public void delete(@PathVariable Student student) {
		studentService.delete(student);
	}

	@GetMapping("/getstudent/{studentId}")
	public Student findById(@PathVariable Long studentId) {
		return studentService.findById(studentId);
	}
}
