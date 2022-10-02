package com.xworkz.daoservices.runner;


import com.xworkz.daoservices.dao.*;
import com.xworkz.daoservices.service.*;
public class TouristPlaceRunner {

	public static void main(String[] args) {

		
	TouristPlacesDAO tpdao=new TouristPlacesDAOImplementor();
	try{tpdao.save("Bangalore");
	tpdao.save("Mysore");
	tpdao.save("Kodachadri");
	tpdao.save("Chitradrga");
	tpdao.save("Ramdurg");
	tpdao.save("Tumkur");
	tpdao.save("Hubli");
	tpdao.save("Konnur");
	tpdao.save("Chikpete");
	tpdao.save("Belagavi");
	tpdao.save("Yeshwantpur");
	}
	catch (ArrayIndexOutOfBoundsException aiobe)
	{
		System.out.println(aiobe.getClass());
		System.out.println(aiobe.getMessage());
//		System.out.println(aiobe.getStackTrace());
	}
	
	
	
	tpdao.checkName("Tumkur");
	
	tpdao.printTouristPlaces();
	
	TouristPlaceService tpService = new TouristPlaceServiceImplementor(tpdao);
	tpService.checkAndValidate("Tumk");
	
	}

}
