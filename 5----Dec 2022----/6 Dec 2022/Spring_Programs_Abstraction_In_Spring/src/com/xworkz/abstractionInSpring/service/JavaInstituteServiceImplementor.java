package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.JavaInstituteDto;
import com.xworkz.abstractionInSpring.repository.JavaInstituteRepo;
@Component
public class JavaInstituteServiceImplementor implements JavaInstituteService {

	
	@Autowired
	@Qualifier("instituteRepo")
	JavaInstituteRepo repo;
	
	@Override
	public boolean validateAndSave(JavaInstituteDto dto) {
		System.out.println("Inside save method of JavaInstituteServiceImplementor ");
		this.repo.save(dto);
		return true;
	}

}
