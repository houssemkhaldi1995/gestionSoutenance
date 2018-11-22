package org.sid.app.controllers;

import org.sid.app.entities.Defense;
import org.sid.app.services.DefenseService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefenseController {

	private final DefenseService defenseService;

	public DefenseController(DefenseService defenseService) {
		super();
		this.defenseService = defenseService;
	}

	@PostMapping("/adddefense/{defense}")
	public void add(@PathVariable Defense defense) {
		defenseService.add(defense);
	}

	@DeleteMapping("/deletedefense/{defense}")
	public void delete(@PathVariable Defense defense) {
		defenseService.delete(defense);
	}

	@GetMapping("/deletedefense/{defenseId}")
	public Defense findById(@PathVariable Long defenseId) {
		return defenseService.findById(defenseId);
	}
}
