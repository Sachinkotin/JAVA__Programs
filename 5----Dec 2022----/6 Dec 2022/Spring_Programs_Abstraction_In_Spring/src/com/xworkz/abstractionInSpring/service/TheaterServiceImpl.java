package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.TheaterDto;
import com.xworkz.abstractionInSpring.repository.TheaterRepo;

@Component
public class TheaterServiceImpl implements TheaterService {

	@Autowired
	@Qualifier("theaterRepo")
	TheaterRepo repo;
	
	
	@Override
	public boolean validateAndSave(TheaterDto dto) {
		System.out.println("Inside save method of TheaterServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
