package com.xworkz.daoservices.service;


import com.xworkz.daoservices.dao.*;
public class TouristPlaceServiceImplementor implements TouristPlaceService{

	TouristPlacesDAO tpDAO;
	
	public TouristPlaceServiceImplementor(TouristPlacesDAO tpDAO )
	{
		this.tpDAO=tpDAO;
	}
	
	
	
	
	@Override
	public boolean checkAndValidate(String name) {

		if(name != null && name.length()>2 && name.length()<25)
		{
			if(this.tpDAO.checkName(name))
			{
				System.out.println(name +" is checked and Validated");
				return true;
			}
			else 
			{
				System.err.println(name +" is Not checked and Not Validated");
				return false;
			}
		}
		else
		{
			return false;
		}
			
	}
}
