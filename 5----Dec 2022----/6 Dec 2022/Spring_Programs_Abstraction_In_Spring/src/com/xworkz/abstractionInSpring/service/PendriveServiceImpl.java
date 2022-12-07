package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.PendriveDto;
import com.xworkz.abstractionInSpring.repository.PendriveRepo;

@Component
public class PendriveServiceImpl implements PendriveService {

	
	@Autowired
	@Qualifier("pendriveRepo")
	PendriveRepo repo;

	@Override
	public boolean validateAndSave(PendriveDto dto) {

		System.out.println("Inside a validateAndSave of PendriveServiceImpl ");
		System.out.println(dto);
		return true;
	}

}
