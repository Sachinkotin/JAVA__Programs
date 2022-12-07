package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.TheaterDto;


@Component
public class TheaterRepoImpl implements TheaterRepo {

	@Override
	public boolean save(TheaterDto dto) {

		System.out.println("Inside save in TheaterRepoImpl ");
		System.out.println(dto);
		return true;
	}

	
	
	
}
