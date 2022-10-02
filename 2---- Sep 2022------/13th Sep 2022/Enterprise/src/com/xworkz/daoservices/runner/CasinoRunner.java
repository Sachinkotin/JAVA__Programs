package com.xworkz.daoservices.runner;

import com.xworkz.daoservices.dao.*;
import com.xworkz.daoservices.service.*;
public class CasinoRunner {

	public static void main(String[] args) {

		CasinoDAO casinDao=new CasinoDAOImplementor();
		casinDao.save("Sachin");
		casinDao.save("Suman");
		casinDao.save("Raman");
		casinDao.save("SRK");
		casinDao.save("DadaBhai");
		casinDao.printNames();
		
		//casinDao.checkName("Sach");
		
		CasinoSERVICE casinoService= new CasinoSERVICEImplementor(casinDao);
//		boolean checkAndValidate= casinoService.checkAndValidate("DadaBhai");
//		
//		System.out.println(checkAndValidate);
		casinoService.checkAndValidate("SRK");
		
	}

}
