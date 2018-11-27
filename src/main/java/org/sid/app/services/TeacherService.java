package org.sid.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.sid.app.dao.TeacherRepository;
import org.sid.app.dto.TeacherDto;
import org.sid.app.entities.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

	private final TeacherRepository teacherRepository;

	public TeacherService(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	public TeacherDto add(Teacher teacher) {
		return mapToDto(teacherRepository.save(teacher));
	}

	public void deleteById(Long teacherId) {
		teacherRepository.deleteById(teacherId);
	}

	public TeacherDto findById(Long teacherId) {
		return teacherRepository.findById(teacherId).map(TeacherService::mapToDto).orElse(null);
	}

	public List<TeacherDto> findAll() {
		return teacherRepository.findAll().stream().map(TeacherService::mapToDto).collect(Collectors.toList());
	}

	public static TeacherDto mapToDto(Teacher teacher) {
		if (teacher != null) {
			return new TeacherDto(teacher.getTeacherId(), teacher.getFirstName(), teacher.getLastName(),
					teacher.getAge(), teacher.getEmail(), teacher.getTel(), teacher.getCountry(), teacher.getCity(),
					teacher.getZip());
		}
		return null;
	}
}
