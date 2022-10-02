package com.xworkz.dto.runner;

import com.xworkz.dto.CarShowRoomDTO;
public class CarShowRoomDTORunner {

	public static void main(String[] args) {

		CarShowRoomDTO csr1=new CarShowRoomDTO();
		System.out.println(csr1.hashCode());
		csr1.setOwnerName("Nagesh");
		csr1.setOwnerPhoneNumber(6547812457L);
		csr1.setOwnerVoterId("2VD1035EG");
		csr1.setNoOfCarsInShowroom(55);
		csr1.setNoOfManagers(9);
		csr1.setNoOfSecurities(12);
		csr1.setFoundedYear(1992);
		csr1.setIsThereAnyOffers(true);
		
		
		CarShowRoomDTO csr2=new CarShowRoomDTO();
		System.out.println(csr2.hashCode());
		csr2.setOwnerName("Nagesh");
		csr2.setOwnerPhoneNumber(6547812457L);
		csr2.setOwnerVoterId("2VD1035EG");
		csr2.setNoOfCarsInShowroom(55);
		csr2.setNoOfManagers(9);
		csr2.setNoOfSecurities(12);
		csr2.setFoundedYear(1989);
		csr2.setIsThereAnyOffers(false);
		
	csr1.equals(csr2);
		
	}

}




















