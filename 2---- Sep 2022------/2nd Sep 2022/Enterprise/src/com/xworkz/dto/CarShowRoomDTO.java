package com.xworkz.dto;

public class CarShowRoomDTO {

//	DTO with 6 properties check
//	DTO (Note): 1. All variables have to be private.
//				2.DTO class will not have any methods in it.
//				3.Use setters and getters to initialise and to get value.
//				4.Default constructor and parameterised Constructor must be present.
//				5.DTO class must be serialisable(to be thought in Interfaces).

	private String showRoomName;
	private String showRoomFounder;
	private Integer foundedYear;
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
	private String ownerCarName;
	private Integer showRoomPincode;
	private Integer noOfCarsInShowroom;
	private Integer noOfManagers;
	private Integer noOfSecurities;
	private Integer noOfGates;
	private Integer averageNoOfSalesInMonth;
	private Boolean preOwnedCarsAvailable;
	private Integer noOfCarsBelow5lakhs;
	private Integer noOfTables;
	private Integer noOfComputers;
	private Integer noOfCCTVCameras;
	private Boolean isItNearToMainRoad;
	private Boolean isThereAnyOffers;
	private Integer noOfWhiteCars;
	private Integer noOfBlueCars;

	public CarShowRoomDTO() {
		super();
	}

	public CarShowRoomDTO(String showRoomName, String showRoomFounder, Integer foundedYear,
			String showRoomFounderBloodGroup, Long showRoomFounderPhoneNumber, Boolean showRoomFounderIsHeMarried,
			String showRoomFounderVoterIdNumber, Double showRoomFounderHeightInFeet, Integer showRoomFounderWeightInKg,
			Boolean showRoomFounderOwnedHouse, String showRoomFounderHouseName, String showRoomFounderBirthPlace,
			Boolean showRoomFounderIsMale, String ownerName, Long ownerPhoneNumber, String ownerVoterId,
			Integer ownerAge, String ownerGender, Boolean ownerMarried, String ownerHouseName, String ownerBirthPlace,
			String ownerCarName, Integer showRoomPincode, Integer noOfCarsInShowroom, Integer noOfManagers,
			Integer noOfSecurities, Integer noOfGates, Integer averageNoOfSalesInMonth, Boolean preOwnedCarsAvailable,
			Integer noOfCarsBelow5lakhs, Integer noOfTables, Integer noOfComputers, Integer noOfCCTVCameras,
			Boolean isItNearToMainRoad, Boolean isThereAnyOffers, Integer noOfWhiteCars, Integer noOfBlueCars) {
		super();
		this.showRoomName = showRoomName;
		this.showRoomFounder = showRoomFounder;
		this.foundedYear = foundedYear;
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
		this.ownerCarName = ownerCarName;
		this.showRoomPincode = showRoomPincode;
		this.noOfCarsInShowroom = noOfCarsInShowroom;
		this.noOfManagers = noOfManagers;
		this.noOfSecurities = noOfSecurities;
		this.noOfGates = noOfGates;
		this.averageNoOfSalesInMonth = averageNoOfSalesInMonth;
		this.preOwnedCarsAvailable = preOwnedCarsAvailable;
		this.noOfCarsBelow5lakhs = noOfCarsBelow5lakhs;
		this.noOfTables = noOfTables;
		this.noOfComputers = noOfComputers;
		this.noOfCCTVCameras = noOfCCTVCameras;
		this.isItNearToMainRoad = isItNearToMainRoad;
		this.isThereAnyOffers = isThereAnyOffers;
		this.noOfWhiteCars = noOfWhiteCars;
		this.noOfBlueCars = noOfBlueCars;
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

	public String getOwnerCarName() {
		return ownerCarName;
	}

	public void setOwnerCarName(String ownerCarName) {
		this.ownerCarName = ownerCarName;
	}

	public Integer getShowRoomPincode() {
		return showRoomPincode;
	}

	public void setShowRoomPincode(Integer showRoomPincode) {
		this.showRoomPincode = showRoomPincode;
	}

	public Integer getNoOfCarsInShowroom() {
		return noOfCarsInShowroom;
	}

	public void setNoOfCarsInShowroom(Integer noOfCarsInShowroom) {
		this.noOfCarsInShowroom = noOfCarsInShowroom;
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

	public Integer getAverageNoOfSalesInMonth() {
		return averageNoOfSalesInMonth;
	}

	public void setAverageNoOfSalesInMonth(Integer averageNoOfSalesInMonth) {
		this.averageNoOfSalesInMonth = averageNoOfSalesInMonth;
	}

	public Boolean getPreOwnedCarsAvailable() {
		return preOwnedCarsAvailable;
	}

	public void setPreOwnedCarsAvailable(Boolean preOwnedCarsAvailable) {
		this.preOwnedCarsAvailable = preOwnedCarsAvailable;
	}

	public Integer getNoOfCarsBelow5lakhs() {
		return noOfCarsBelow5lakhs;
	}

	public void setNoOfCarsBelow5lakhs(Integer noOfCarsBelow5lakhs) {
		this.noOfCarsBelow5lakhs = noOfCarsBelow5lakhs;
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

	public Integer getNoOfWhiteCars() {
		return noOfWhiteCars;
	}

	public void setNoOfWhiteCars(Integer noOfWhiteCars) {
		this.noOfWhiteCars = noOfWhiteCars;
	}

	public Integer getNoOfBlueCars() {
		return noOfBlueCars;
	}

	public void setNoOfBlueCars(Integer noOfBlueCars) {
		this.noOfBlueCars = noOfBlueCars;
	}

	@Override
	public int hashCode() {
		return 564;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not Null");
			if (obj instanceof CarShowRoomDTO) {
				System.out.println("Object is of CarShowRoomType");
				CarShowRoomDTO casted = (CarShowRoomDTO) obj;
				if (casted.ownerName.equals(this.ownerName) && casted.ownerPhoneNumber.equals(this.ownerPhoneNumber)
						&& casted.ownerVoterId.equals(this.ownerVoterId)
						&& casted.noOfCarsInShowroom.equals(this.noOfCarsInShowroom)
						&& casted.noOfManagers.equals(this.noOfManagers)
						&& casted.noOfSecurities.equals(this.noOfSecurities)) {
					System.out.println("Both Are Same");
				} else {
					System.out.println("Both Are NOT Same");
				}
			} else {
				System.out.println("Object is Not of CarShowRoomType");
			}
		} else {
			System.out.println("Object is Null");
		}

		return super.equals(obj);
	}

}
