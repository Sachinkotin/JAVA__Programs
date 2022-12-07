package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.SimDto;

@Component

public class SimRepoImpl implements SimRepo {

	@Override
	public boolean save(SimDto dto) {
		System.out.println("Running save in SimRepoImpl class");
		System.out.println(dto);
		return true;
	}

	
	
	
	
	
	
}
