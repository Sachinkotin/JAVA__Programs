package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.JeansPantDto;

@Component
public class JeansPantRepoImpl implements JeansPantRepo {

	@Override
	public boolean save(JeansPantDto dto) {
		System.out.println("Inside save in JeansPantRepoImpl ");
		System.out.println(dto);
		return true;
	}

}
