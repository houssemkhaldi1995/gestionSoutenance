package org.sid.app.controllers;

import org.sid.app.entities.Company;
import org.sid.app.services.CompanyService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

	private final CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}

	@PostMapping("/addcompany/{company}")
	public void add(@PathVariable Company company) {
		companyService.add(company);
	}

	@DeleteMapping("/deletecompany/{company}")
	public void delete(@PathVariable Company company) {
		companyService.delete(company);
	}

	@GetMapping("/getcompany/{companyId}")
	public Company findById(@PathVariable Long companyId) {
		return companyService.findById(companyId);
	}
}
