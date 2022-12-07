package com.xworkz.abstractionInSpring.service;

import com.xworkz.abstractionInSpring.beans.JacketDto;

public interface JacketService {

	public boolean validateAndSave(JacketDto dto);
}
