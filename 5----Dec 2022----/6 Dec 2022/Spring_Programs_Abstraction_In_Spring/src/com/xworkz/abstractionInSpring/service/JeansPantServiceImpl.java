package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.JeansPantDto;
import com.xworkz.abstractionInSpring.repository.JeansPantRepo;
@Component
public class JeansPantServiceImpl implements JeansPantService {

	
	@Autowired
	@Qualifier("jeansPantRepo")
	JeansPantRepo repo;
	
	@Override
	public boolean validateAndSave(JeansPantDto dto) {
		System.out.println("Inside save method of JeansPantServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
