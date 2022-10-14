package com.xworkz.jdbcStart.service;

import com.xworkz.jdbcStart.dto.HospitalDTO;
import com.xworkz.jdbcStart.repository.HospitalRepositoryImplementor;

public class HospitalServiceImplementor implements HospitalService {


	
	
	@Override
	public boolean validateAndSave(HospitalDTO hdto) {
		int id=hdto.getId() ;
		String name=hdto.getName();
		String specialist=hdto.getSpecialist();
		double openTime=hdto.getOpenTime();
		
		if (id>0 && id<50000)
		{
			System.out.println("Id is valid");
			if(name!= null && name.length()>5 && name.length()<50)
			{
				System.out.println("Name is valid");
				if(specialist != null && specialist.length()>3 && specialist.length()<50)
				{
					System.out.println("Specialist is valid");
					if (openTime > 09.00 && openTime<16.00)
					{
						System.out.println("OpenTime is valid");
						HospitalRepositoryImplementor hri= new HospitalRepositoryImplementor();
						hri.save(hdto);
					}
					else 
					{
						System.err.println("OpenTime is not valid");
					}
					
				}
				else 
				{
					System.err.println("Specialist is not valid");
				}
				
			}
			else 
			{
				System.err.println("Name is not valid");
			}
			
		}
		else 
		{
			System.err.println("Id is not valid");
		}
		
		return false;
	}

	
}
