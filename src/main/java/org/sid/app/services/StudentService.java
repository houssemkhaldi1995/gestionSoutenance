package org.sid.app.services;

import java.util.Optional;

import org.sid.app.dao.StudentRepository;
import org.sid.app.entities.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public void add(Student student) {
		studentRepository.save(student);
	}

	public void delete(Student student) {
		studentRepository.delete(student);
	}

	public Student findById(Long studentId) {
		Optional<Student> student = studentRepository.findById(studentId);
		if (student.isPresent()) {
			return student.get();
		}
		return null;
	}
}
