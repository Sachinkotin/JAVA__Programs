package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.FilmCityDto;

@Component
public class FilmCityRepoImpl implements FilmCityRepo {

	@Override
	public boolean save(FilmCityDto dto) {
		System.out.println("Inside save in FilmCityRepoImpl ");
		System.out.println(dto);
		return true;
	}

}
