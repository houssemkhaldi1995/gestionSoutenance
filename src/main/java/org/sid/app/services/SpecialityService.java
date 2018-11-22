package org.sid.app.services;

import java.util.Optional;

import org.sid.app.dao.SpecialityRepository;
import org.sid.app.entities.Speciality;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

	private final SpecialityRepository specialityRepository;

	public SpecialityService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	public void add(Speciality speciality) {
		specialityRepository.save(speciality);
	}

	public void delete(Speciality speciality) {
		specialityRepository.delete(speciality);
	}

	public Speciality findById(Long specialityId) {
		Optional<Speciality> speciality = specialityRepository.findById(specialityId);
		if (speciality.isPresent()) {
			return speciality.get();
		}
		return null;
	}

}
