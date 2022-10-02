package com.xworkz.dto.runner;

import com.xworkz.dto.HospitalDTO;

public class HosiptalDTORunner {

	public static void main(String[] args) {

		
	HospitalDTO hsp1=new HospitalDTO();
	System.out.println(hsp1.hashCode());
	hsp1.setHospitalName("Kulagod");
	hsp1.setFounderName("Kishor");
	hsp1.setDirectorName("Gopinath");
	hsp1.setIsDirectorAnAwardeeOfPadmaShri(true);
	hsp1.setFoundedInYear(1972);
	hsp1.setIsItAutonomous(true);
	hsp1.setPerDayOPDVisits(150);
	hsp1.setPlace("Ramdurg");
	hsp1.setPincode(591123);
	hsp1.setNoOfDoctors(9);
	hsp1.setNoOfStaffs(54);
	hsp1.setDentalDoctorName("Ramesh");
	hsp1.setDentalDoctorPhoneNumber(9654781245L);
	hsp1.setMinFee(250);
	hsp1.setStartTime(9.30d);
	hsp1.setEndTime(5.30d);
	hsp1.setSkinDoctorName("Naresh");
	hsp1.setSkinDoctorPhoneNumber(6987451245L);
	hsp1.setNoOfBeds(95);
	hsp1.setNoOfFans(25);
	
	HospitalDTO hsp2=new HospitalDTO();
	System.out.println(hsp2.hashCode());
	hsp2.setHospitalName("Kulagod");
	hsp2.setFounderName("Kishor");
	hsp2.setDirectorName("Gopinath");
	hsp2.setIsDirectorAnAwardeeOfPadmaShri(true);
	hsp2.setFoundedInYear(1972);
	hsp2.setIsItAutonomous(true);
	hsp2.setPerDayOPDVisits(150);
	hsp2.setPlace("Ramdurg");
	hsp2.setPincode(591123);
	hsp2.setNoOfDoctors(9);
	hsp2.setNoOfStaffs(54);
	hsp2.setDentalDoctorName("Ramesh");
	hsp2.setDentalDoctorPhoneNumber(9654781245L);
	hsp2.setMinFee(250);
	hsp2.setStartTime(9.30d);
	hsp2.setEndTime(5.30d);
	hsp2.setSkinDoctorName("Paramesh");
	hsp2.setSkinDoctorPhoneNumber(6987451278L);
	hsp2.setNoOfBeds(125);
	hsp2.setNoOfFans(65);
	
	hsp1.equals(hsp2);
	
	
	}

}
























