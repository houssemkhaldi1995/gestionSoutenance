package org.sid.app.services;

import java.util.Optional;

import org.sid.app.dao.CompanyRepository;
import org.sid.app.entities.Company;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	private final CompanyRepository companyRepository;

	public CompanyService(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}

	public void add(Company company) {
		companyRepository.save(company);
	}

	public void delete(Company company) {
		companyRepository.delete(company);
	}

	public Company findById(Long companyId) {
		Optional<Company> company = companyRepository.findById(companyId);
		if (company.isPresent()) {
			return company.get();
		}
		return null;
	}

}
