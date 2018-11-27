package org.sid.app.services;

import java.util.List;
import java.util.stream.Collectors;

import org.sid.app.dao.SpecialityRepository;
import org.sid.app.dto.SpecialityDto;
import org.sid.app.entities.Speciality;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

	private final SpecialityRepository specialityRepository;

	public SpecialityService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	public SpecialityDto add(Speciality speciality) {
		return mapToDto(specialityRepository.save(speciality));
	}

	public void deleteById(Long specialityId) {
		specialityRepository.deleteById(specialityId);
	}

	public SpecialityDto findById(Long specialityId) {
		return specialityRepository.findById(specialityId).map(SpecialityService::mapToDto).orElse(null);
	}

	public List<SpecialityDto> findAll() {
		return specialityRepository.findAll().stream().map(SpecialityService::mapToDto).collect(Collectors.toList());
	}

	public static SpecialityDto mapToDto(Speciality speciality) {
		if (speciality != null) {
			return new SpecialityDto(speciality.getSpecialityId(), speciality.getName(),
					TeacherService.mapToDto(speciality.getDepartmentHead()));
		}
		return null;
	}

}
