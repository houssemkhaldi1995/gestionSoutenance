package org.sid.app.controllers;

import org.sid.app.entities.Teacher;
import org.sid.app.services.TeacherService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}

	@PostMapping("/addteacher/{teacher}")
	public void add(Teacher teacher) {
		teacherService.add(teacher);
	}

	@DeleteMapping("/deleteteacher/{teacher}")
	public void delete(Teacher teacher) {
		teacherService.delete(teacher);
	}

	@GetMapping("/getteacher/{teacherId}")
	public Teacher findById(Long teacherId) {
		return teacherService.findById(teacherId);
	}
}
