package org.sid.app.services;

import java.util.Optional;

import org.sid.app.dao.TeacherRepository;
import org.sid.app.entities.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

	private final TeacherRepository teacherRepository;

	public TeacherService(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	public void add(Teacher teacher) {
		teacherRepository.save(teacher);
	}

	public void delete(Teacher teacher) {
		teacherRepository.delete(teacher);
	}

	public Teacher findById(Long teacherId) {
		Optional<Teacher> teacher = teacherRepository.findById(teacherId);
		if (teacher.isPresent()) {
			return teacher.get();
		}
		return null;
	}
}
