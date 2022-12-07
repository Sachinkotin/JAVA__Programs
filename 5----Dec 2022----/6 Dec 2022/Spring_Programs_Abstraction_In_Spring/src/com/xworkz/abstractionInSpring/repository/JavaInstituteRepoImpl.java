package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.JavaInstituteDto;

@Component
public class JavaInstituteRepoImpl implements JavaInstituteRepo {

	@Override
	public boolean save(JavaInstituteDto dto) {
		System.out.println("Inside save in JavaInstituteRepoImpl ");
		System.out.println(dto);
		return true;
	}

}
