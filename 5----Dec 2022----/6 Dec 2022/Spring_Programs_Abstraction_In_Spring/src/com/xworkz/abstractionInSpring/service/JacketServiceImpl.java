package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.JacketDto;
import com.xworkz.abstractionInSpring.repository.JacketRepo;
@Component
public class JacketServiceImpl implements JacketService {

	@Autowired
	@Qualifier("jacketRepo")
	JacketRepo repo;
	
	@Override
	public boolean validateAndSave(JacketDto dto) {
		System.out.println("Inside save method of JacketServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
