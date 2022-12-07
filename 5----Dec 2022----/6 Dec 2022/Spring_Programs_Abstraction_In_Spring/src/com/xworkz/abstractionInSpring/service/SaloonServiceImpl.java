package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.SaloonDto;
import com.xworkz.abstractionInSpring.repository.SaloonRepo;
@Component
public class SaloonServiceImpl implements SaloonService {

	@Autowired
	@Qualifier("saloonRepo")
	SaloonRepo repo;
	
	@Override
	public boolean validateAndSave(SaloonDto dto) {
		System.out.println("Inside save method of SaloonServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
