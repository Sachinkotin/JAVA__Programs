package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.SimDto;
import com.xworkz.abstractionInSpring.repository.SimRepo;

@Component
public class SimServiceImpl implements SimService {

	@Autowired
	@Qualifier("simRepo")
	private SimRepo repo;
	
	@Override
	public boolean validateAndSave(SimDto dto) {
		System.out.println("Running validateAndSave in SimServiceImpl class");
		repo.save(dto);
		return true;
	}

}
