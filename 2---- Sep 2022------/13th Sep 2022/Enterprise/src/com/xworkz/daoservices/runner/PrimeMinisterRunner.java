package com.xworkz.daoservices.runner;

import com.xworkz.daoservices.exceptions.*;
import com.xworkz.daoservices.service.*;
import com.xworkz.daoservices.dao.*;


public class PrimeMinisterRunner {

	public static void main(String[] args) {

	
	PrimeMinisterDAO imp1=new PrimeMinisterDAOImplementor();
	PrimeMinisterService imp2=new PrimeMinisterServiceImplementor(imp1);
	try {
		imp2.validAndSave("Modi");
		imp2.validAndSave("Devegouda");
		imp2.validAndSave("Indira Gandhi");
		imp2.validAndSave("Manamohan Singh");
		imp2.validAndSave("Jawaharlal Nehru");
		imp2.validAndSave("Modi");
		
	}
	catch(PrimeMinisterCheckedException e)
	{
		e.getMessage();
		e.getClass();
		
	}
	
	}
	
	

}
