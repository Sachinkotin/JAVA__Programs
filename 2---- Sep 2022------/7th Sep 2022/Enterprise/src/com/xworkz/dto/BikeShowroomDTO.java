package com.xworkz.dto;

public class BikeShowroomDTO {

//	DTO with 16 properties check
//	DTO (Note): 1. All variables have to be private.
//				2.DTO class will not have any methods in it.
//				3.Use setters and getters to initialise and to get value.
//				4.Default constructor and parameterised Constructor must be present.
//				5.DTO class must be serialisable(to be thought in Interfaces).
//				6.hashcode of Objects must be same.

	
	private String showRoomName;
	private String showRoomFounder;
	private Integer foundedYear;
	private Integer averageNoOfSalesInMonth;
	private Boolean preOwnedBikesAvailable;
	private Integer noOfBikesBelow1lakh;
	private Integer noOfTables;
	private Integer noOfComputers;
	private Integer noOfCCTVCameras;
	private Boolean isItNearToMainRoad;
	private Boolean isThereAnyOffers;
	private Integer noOfBikesWithMoreThan125cc;
	private Boolean emiFacilityAvailable;
	private String showRoomFounderBloodGroup;
	private Long showRoomFounderPhoneNumber;
	private Boolean showRoomFounderIsHeMarried;
	private String showRoomFounderVoterIdNumber;
	private Double showRoomFounderHeightInFeet;
	private Integer showRoomFounderWeightInKg;
	private Boolean showRoomFounderOwnedHouse;
	private String showRoomFounderHouseName;
	private String showRoomFounderBirthPlace;
	private Boolean showRoomFounderIsMale;
	private String ownerName;
	private Long ownerPhoneNumber;
	private String ownerVoterId;
	private Integer ownerAge;
	private String ownerGender;
	private Boolean ownerMarried;
	private String ownerHouseName;
	private String ownerBirthPlace;
	private String ownerBikeName;
	private Integer showRoomPincode;
	private Integer noOfBikesInShowroom;
	private Integer noOfManagers;
	private Integer noOfSecurities;
	private Integer noOfGates;

	public BikeShowroomDTO() {
		super();
	}

	public BikeShowroomDTO(String showRoomName, String showRoomFounder, Integer foundedYear,
			Integer averageNoOfSalesInMonth, Boolean preOwnedBikesAvailable, Integer noOfBikesBelow1lakh,
			Integer noOfTables, Integer noOfComputers, Integer noOfCCTVCameras, Boolean isItNearToMainRoad,
			Boolean isThereAnyOffers, Integer noOfBikesWithMoreThan125cc, Boolean emiFacilityAvailable,
			String showRoomFounderBloodGroup, Long showRoomFounderPhoneNumber, Boolean showRoomFounderIsHeMarried,
			String showRoomFounderVoterIdNumber, Double showRoomFounderHeightInFeet, Integer showRoomFounderWeightInKg,
			Boolean showRoomFounderOwnedHouse, String showRoomFounderHouseName, String showRoomFounderBirthPlace,
			Boolean showRoomFounderIsMale, String ownerName, Long ownerPhoneNumber, String ownerVoterId,
			Integer ownerAge, String ownerGender, Boolean ownerMarried, String ownerHouseName, String ownerBirthPlace,
			String ownerBikeName, Integer showRoomPincode, Integer noOfBikesInShowroom, Integer noOfManagers,
			Integer noOfSecurities, Integer noOfGates) {
		super();
		this.showRoomName = showRoomName;
		this.showRoomFounder = showRoomFounder;
		this.foundedYear = foundedYear;
		this.averageNoOfSalesInMonth = averageNoOfSalesInMonth;
		this.preOwnedBikesAvailable = preOwnedBikesAvailable;
		this.noOfBikesBelow1lakh = noOfBikesBelow1lakh;
		this.noOfTables = noOfTables;
		this.noOfComputers = noOfComputers;
		this.noOfCCTVCameras = noOfCCTVCameras;
		this.isItNearToMainRoad = isItNearToMainRoad;
		this.isThereAnyOffers = isThereAnyOffers;
		this.noOfBikesWithMoreThan125cc = noOfBikesWithMoreThan125cc;
		this.emiFacilityAvailable = emiFacilityAvailable;
		this.showRoomFounderBloodGroup = showRoomFounderBloodGroup;
		this.showRoomFounderPhoneNumber = showRoomFounderPhoneNumber;
		this.showRoomFounderIsHeMarried = showRoomFounderIsHeMarried;
		this.showRoomFounderVoterIdNumber = showRoomFounderVoterIdNumber;
		this.showRoomFounderHeightInFeet = showRoomFounderHeightInFeet;
		this.showRoomFounderWeightInKg = showRoomFounderWeightInKg;
		this.showRoomFounderOwnedHouse = showRoomFounderOwnedHouse;
		this.showRoomFounderHouseName = showRoomFounderHouseName;
		this.showRoomFounderBirthPlace = showRoomFounderBirthPlace;
		this.showRoomFounderIsMale = showRoomFounderIsMale;
		this.ownerName = ownerName;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerVoterId = ownerVoterId;
		this.ownerAge = ownerAge;
		this.ownerGender = ownerGender;
		this.ownerMarried = ownerMarried;
		this.ownerHouseName = ownerHouseName;
		this.ownerBirthPlace = ownerBirthPlace;
		this.ownerBikeName = ownerBikeName;
		this.showRoomPincode = showRoomPincode;
		this.noOfBikesInShowroom = noOfBikesInShowroom;
		this.noOfManagers = noOfManagers;
		this.noOfSecurities = noOfSecurities;
		this.noOfGates = noOfGates;
	}

	public String getShowRoomName() {
		return showRoomName;
	}

	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}

	public String getShowRoomFounder() {
		return showRoomFounder;
	}

	public void setShowRoomFounder(String showRoomFounder) {
		this.showRoomFounder = showRoomFounder;
	}

	public Integer getFoundedYear() {
		return foundedYear;
	}

	public void setFoundedYear(Integer foundedYear) {
		this.foundedYear = foundedYear;
	}

	public Integer getAverageNoOfSalesInMonth() {
		return averageNoOfSalesInMonth;
	}

	public void setAverageNoOfSalesInMonth(Integer averageNoOfSalesInMonth) {
		this.averageNoOfSalesInMonth = averageNoOfSalesInMonth;
	}

	public Boolean getPreOwnedBikesAvailable() {
		return preOwnedBikesAvailable;
	}

	public void setPreOwnedBikesAvailable(Boolean preOwnedBikesAvailable) {
		this.preOwnedBikesAvailable = preOwnedBikesAvailable;
	}

	public Integer getNoOfBikesBelow1lakh() {
		return noOfBikesBelow1lakh;
	}

	public void setNoOfBikesBelow1lakh(Integer noOfBikesBelow1lakh) {
		this.noOfBikesBelow1lakh = noOfBikesBelow1lakh;
	}

	public Integer getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(Integer noOfTables) {
		this.noOfTables = noOfTables;
	}

	public Integer getNoOfComputers() {
		return noOfComputers;
	}

	public void setNoOfComputers(Integer noOfComputers) {
		this.noOfComputers = noOfComputers;
	}

	public Integer getNoOfCCTVCameras() {
		return noOfCCTVCameras;
	}

	public void setNoOfCCTVCameras(Integer noOfCCTVCameras) {
		this.noOfCCTVCameras = noOfCCTVCameras;
	}

	public Boolean getIsItNearToMainRoad() {
		return isItNearToMainRoad;
	}

	public void setIsItNearToMainRoad(Boolean isItNearToMainRoad) {
		this.isItNearToMainRoad = isItNearToMainRoad;
	}

	public Boolean getIsThereAnyOffers() {
		return isThereAnyOffers;
	}

	public void setIsThereAnyOffers(Boolean isThereAnyOffers) {
		this.isThereAnyOffers = isThereAnyOffers;
	}

	public Integer getNoOfBikesWithMoreThan125cc() {
		return noOfBikesWithMoreThan125cc;
	}

	public void setNoOfBikesWithMoreThan125cc(Integer noOfBikesWithMoreThan125cc) {
		this.noOfBikesWithMoreThan125cc = noOfBikesWithMoreThan125cc;
	}

	public Boolean getEmiFacilityAvailable() {
		return emiFacilityAvailable;
	}

	public void setEmiFacilityAvailable(Boolean emiFacilityAvailable) {
		this.emiFacilityAvailable = emiFacilityAvailable;
	}

	public String getShowRoomFounderBloodGroup() {
		return showRoomFounderBloodGroup;
	}

	public void setShowRoomFounderBloodGroup(String showRoomFounderBloodGroup) {
		this.showRoomFounderBloodGroup = showRoomFounderBloodGroup;
	}

	public Long getShowRoomFounderPhoneNumber() {
		return showRoomFounderPhoneNumber;
	}

	public void setShowRoomFounderPhoneNumber(Long showRoomFounderPhoneNumber) {
		this.showRoomFounderPhoneNumber = showRoomFounderPhoneNumber;
	}

	public Boolean getShowRoomFounderIsHeMarried() {
		return showRoomFounderIsHeMarried;
	}

	public void setShowRoomFounderIsHeMarried(Boolean showRoomFounderIsHeMarried) {
		this.showRoomFounderIsHeMarried = showRoomFounderIsHeMarried;
	}

	public String getShowRoomFounderVoterIdNumber() {
		return showRoomFounderVoterIdNumber;
	}

	public void setShowRoomFounderVoterIdNumber(String showRoomFounderVoterIdNumber) {
		this.showRoomFounderVoterIdNumber = showRoomFounderVoterIdNumber;
	}

	public Double getShowRoomFounderHeightInFeet() {
		return showRoomFounderHeightInFeet;
	}

	public void setShowRoomFounderHeightInFeet(Double showRoomFounderHeightInFeet) {
		this.showRoomFounderHeightInFeet = showRoomFounderHeightInFeet;
	}

	public Integer getShowRoomFounderWeightInKg() {
		return showRoomFounderWeightInKg;
	}

	public void setShowRoomFounderWeightInKg(Integer showRoomFounderWeightInKg) {
		this.showRoomFounderWeightInKg = showRoomFounderWeightInKg;
	}

	public Boolean getShowRoomFounderOwnedHouse() {
		return showRoomFounderOwnedHouse;
	}

	public void setShowRoomFounderOwnedHouse(Boolean showRoomFounderOwnedHouse) {
		this.showRoomFounderOwnedHouse = showRoomFounderOwnedHouse;
	}

	public String getShowRoomFounderHouseName() {
		return showRoomFounderHouseName;
	}

	public void setShowRoomFounderHouseName(String showRoomFounderHouseName) {
		this.showRoomFounderHouseName = showRoomFounderHouseName;
	}

	public String getShowRoomFounderBirthPlace() {
		return showRoomFounderBirthPlace;
	}

	public void setShowRoomFounderBirthPlace(String showRoomFounderBirthPlace) {
		this.showRoomFounderBirthPlace = showRoomFounderBirthPlace;
	}

	public Boolean getShowRoomFounderIsMale() {
		return showRoomFounderIsMale;
	}

	public void setShowRoomFounderIsMale(Boolean showRoomFounderIsMale) {
		this.showRoomFounderIsMale = showRoomFounderIsMale;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Long getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(Long ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public String getOwnerVoterId() {
		return ownerVoterId;
	}

	public void setOwnerVoterId(String ownerVoterId) {
		this.ownerVoterId = ownerVoterId;
	}

	public Integer getOwnerAge() {
		return ownerAge;
	}

	public void setOwnerAge(Integer ownerAge) {
		this.ownerAge = ownerAge;
	}

	public String getOwnerGender() {
		return ownerGender;
	}

	public void setOwnerGender(String ownerGender) {
		this.ownerGender = ownerGender;
	}

	public Boolean getOwnerMarried() {
		return ownerMarried;
	}

	public void setOwnerMarried(Boolean ownerMarried) {
		this.ownerMarried = ownerMarried;
	}

	public String getOwnerHouseName() {
		return ownerHouseName;
	}

	public void setOwnerHouseName(String ownerHouseName) {
		this.ownerHouseName = ownerHouseName;
	}

	public String getOwnerBirthPlace() {
		return ownerBirthPlace;
	}

	public void setOwnerBirthPlace(String ownerBirthPlace) {
		this.ownerBirthPlace = ownerBirthPlace;
	}

	public String getOwnerBikeName() {
		return ownerBikeName;
	}

	public void setOwnerBikeName(String ownerBikeName) {
		this.ownerBikeName = ownerBikeName;
	}

	public Integer getShowRoomPincode() {
		return showRoomPincode;
	}

	public void setShowRoomPincode(Integer showRoomPincode) {
		this.showRoomPincode = showRoomPincode;
	}

	public Integer getNoOfBikesInShowroom() {
		return noOfBikesInShowroom;
	}

	public void setNoOfBikesInShowroom(Integer noOfBikesInShowroom) {
		this.noOfBikesInShowroom = noOfBikesInShowroom;
	}

	public Integer getNoOfManagers() {
		return noOfManagers;
	}

	public void setNoOfManagers(Integer noOfManagers) {
		this.noOfManagers = noOfManagers;
	}

	public Integer getNoOfSecurities() {
		return noOfSecurities;
	}

	public void setNoOfSecurities(Integer noOfSecurities) {
		this.noOfSecurities = noOfSecurities;
	}

	public Integer getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(Integer noOfGates) {
		this.noOfGates = noOfGates;
	}

	@Override
	public int hashCode() {
		return 1245;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Obj is not Null");
			if (obj instanceof BikeShowroomDTO) {
				System.out.println("Object is of Bike Type");
				BikeShowroomDTO bsd1 = (BikeShowroomDTO) obj;
				if (bsd1.showRoomName.equals(this.showRoomName) && bsd1.showRoomFounder.equals(this.showRoomFounder)
						&& bsd1.foundedYear.equals(this.foundedYear)
						&& bsd1.averageNoOfSalesInMonth.equals(this.averageNoOfSalesInMonth)
						&& bsd1.preOwnedBikesAvailable.equals(this.preOwnedBikesAvailable)
						&& bsd1.noOfBikesBelow1lakh.equals(this.noOfBikesBelow1lakh)
						&& bsd1.noOfTables.equals(this.noOfTables) && bsd1.noOfComputers.equals(this.noOfComputers)
						&& bsd1.noOfCCTVCameras.equals(this.noOfCCTVCameras)
						&& bsd1.isItNearToMainRoad.equals(this.isItNearToMainRoad)
						&& bsd1.isThereAnyOffers.equals(this.isThereAnyOffers)
						&& bsd1.noOfBikesWithMoreThan125cc.equals(this.noOfBikesWithMoreThan125cc)
						&& bsd1.emiFacilityAvailable.equals(this.emiFacilityAvailable)
						&& bsd1.showRoomFounderBloodGroup.equals(this.showRoomFounderBloodGroup)
						&& bsd1.showRoomFounderPhoneNumber.equals(this.showRoomFounderPhoneNumber)
						&& bsd1.showRoomFounderIsHeMarried.equals(this.showRoomFounderIsHeMarried)) {
					System.out.println("Both are Same");
					return true;
				} else {
					System.out.println("Both are Not Same");
				}

			} else {
				System.out.println("Object is NOT of Bike Type");
			}

		} else {
			System.out.println("Object is Null");
		}
		return super.equals(obj);
	}

}
