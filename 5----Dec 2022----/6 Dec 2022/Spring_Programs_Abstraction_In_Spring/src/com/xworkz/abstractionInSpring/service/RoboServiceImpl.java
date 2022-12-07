package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.RoboDto;
import com.xworkz.abstractionInSpring.repository.RoboRepo;
@Component
public class RoboServiceImpl implements RoboService {

	@Autowired
	@Qualifier("roboRepo")
	RoboRepo repo;
	
	
	@Override
	public boolean validateAndSave(RoboDto dto) {

		
		System.out.println("Inside save method of RoboServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
