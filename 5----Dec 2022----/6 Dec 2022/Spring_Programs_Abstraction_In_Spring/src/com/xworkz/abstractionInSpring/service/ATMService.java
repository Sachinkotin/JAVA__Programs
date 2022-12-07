package com.xworkz.abstractionInSpring.service;

import com.xworkz.abstractionInSpring.beans.ATMDto;

public interface ATMService {

	
	public boolean validateAndSave(ATMDto dto);
	
}
