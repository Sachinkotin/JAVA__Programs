package com.xworkz.dto.runner;

import com.xworkz.dto.BikeShowroomDTO;

public class BikeShowroomDTORunner {

	public static void main(String[] args) {

		BikeShowroomDTO bsk1= new BikeShowroomDTO();
		System.out.println(bsk1.hashCode());
		bsk1.setShowRoomName("HONDA");
		bsk1.setShowRoomFounder("Kamalesh");
		bsk1.setFoundedYear(1982);
		bsk1.setAverageNoOfSalesInMonth(65);
		bsk1.setPreOwnedBikesAvailable(true);
		bsk1.setNoOfBikesBelow1lakh(12);
		bsk1.setNoOfTables(26);
		bsk1.setNoOfComputers(35);
		bsk1.setNoOfCCTVCameras(30);
		bsk1.setIsItNearToMainRoad(true);
		bsk1.setIsThereAnyOffers(true);
		bsk1.setNoOfBikesWithMoreThan125cc(18);
		bsk1.setEmiFacilityAvailable(true);
		bsk1.setShowRoomFounderBloodGroup("B positive");
		bsk1.setShowRoomFounderPhoneNumber(8974512365L);
		bsk1.setShowRoomFounderIsHeMarried(true);
		bsk1.setOwnerAge(35);
		bsk1.setOwnerBikeName("KTM");
		bsk1.setOwnerHouseName("Mahanta Nilaya");
		bsk1.setOwnerGender("Male");
		
		
		
		BikeShowroomDTO bsk2= new BikeShowroomDTO();
		System.out.println(bsk2.hashCode());
		
		bsk2.setShowRoomName("HONDA");
		bsk2.setShowRoomFounder("Kamalesh");
		bsk2.setFoundedYear(1982);
		bsk2.setAverageNoOfSalesInMonth(65);
		bsk2.setPreOwnedBikesAvailable(true);
		bsk2.setNoOfBikesBelow1lakh(12);
		bsk2.setNoOfTables(26);
		bsk2.setNoOfComputers(35);
		bsk2.setNoOfCCTVCameras(30);
		bsk2.setIsItNearToMainRoad(true);
		bsk2.setIsThereAnyOffers(true);
		bsk2.setNoOfBikesWithMoreThan125cc(18);
		bsk2.setEmiFacilityAvailable(true);
		bsk2.setShowRoomFounderBloodGroup("B positive");
		bsk2.setShowRoomFounderPhoneNumber(8974512365L);
		bsk2.setShowRoomFounderIsHeMarried(true);
		bsk2.setOwnerAge(28);
		bsk2.setOwnerBikeName("jupiter");
		bsk2.setOwnerHouseName("Basava Nilaya");
		bsk2.setOwnerGender("Female");
		
		
		
		bsk1.equals(bsk2);
		
		
	}

}



















