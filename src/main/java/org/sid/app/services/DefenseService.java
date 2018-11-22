package org.sid.app.services;

import java.util.Optional;

import org.sid.app.dao.DefenseRepository;
import org.sid.app.entities.Defense;
import org.springframework.stereotype.Service;

@Service
public class DefenseService {

	private final DefenseRepository defenseRepository;

	public DefenseService(DefenseRepository defenseRepository) {
		super();
		this.defenseRepository = defenseRepository;
	}

	public void add(Defense defense) {
		defenseRepository.save(defense);
	}

	public void delete(Defense defense) {
		defenseRepository.delete(defense);
	}

	public Defense findById(Long defenseId) {
		Optional<Defense> defense = defenseRepository.findById(defenseId);
		if (defense.isPresent()) {
			return defense.get();
		}
		return null;
	}
}
