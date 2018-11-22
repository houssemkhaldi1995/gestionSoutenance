package org.sid.app.controllers;

import org.sid.app.entities.Speciality;
import org.sid.app.services.SpecialityService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialityController {

	private final SpecialityService specialityService;

	public SpecialityController(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	@PostMapping("/addspeciality/{speciality}")
	public void add(@PathVariable Speciality speciality) {
		specialityService.add(speciality);
	}

	@DeleteMapping("/deletespeciality/{speciality}")
	public void delete(Speciality speciality) {
		specialityService.delete(speciality);
	}

	@GetMapping("/getspeciality/{specialityId}")
	public Speciality findById(@PathVariable Long specialityId) {
		return specialityService.findById(specialityId);
	}
}
