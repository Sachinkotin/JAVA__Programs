package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.RoboDto;


@Component
public class RoboRepoImpl implements RoboRepo {

	@Override
	public boolean save(RoboDto dto) {
		
		System.out.println("Inside save in RoboRepoImpl ");
		System.out.println(dto);
		return true;
		
		
	}

}
