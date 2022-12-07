package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.FilmCityDto;
import com.xworkz.abstractionInSpring.repository.FilmCityRepo;

@Component
public class FilmCityServiceImpl implements FilmCityService {

	@Autowired
	@Qualifier("filmCityRepo")
	FilmCityRepo repo;
	
	@Override
	public boolean validateAndSave(FilmCityDto dto) {

		System.out.println("Inside save method of FilmCityServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
