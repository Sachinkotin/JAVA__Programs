package com.xworkz.dto;

public class PGBoysDTO {

//	DTO with 6 properties check
//	DTO (Note): 1. All variables have to be private.
//				2.DTO class will not have any methods in it.
//				3.Use setters and getters to initialise and to get value.
//				4.Default constructor and parameterised Constructor must be present.
//				5.DTO class must be serialisable(to be thought in Interfaces).

	private String pgName;
	private String ownerName;
	private String ownerPlace;
	private Double ownerAge;
	private Long ownerPhoneNumber;
	private String ownerJob;
	private Double pgAdvance;
	private Double costFor3SharedRoom;
	private Double costFor4SharedRoom;
	private Double costFor5SharedRoom;
	private Double costFor2SharedRoom;
	private Double numberOfRooms;
	private Boolean wifiAvailable;
	private Boolean needToPaySeperateForWifi;
	private Boolean guizerAvailable;
	private Boolean food3TimesAvailable;
	private Integer numberOfRoomsSharedBy4;
	private Integer numberOfRoomsSharedBy5;
	private Integer numberOfRoomsSharedBy3;
	private String mondayBreakfast;
	private String tuesdayBreakfast;
	private String wednesdayBreakfast;
	private String thursdayBreakfast;
	private String fridayBreakfast;
	private String saturdayBreakfast;
	private String sundayBreakfast;
	private Boolean ownerKnowsKannada;
	private String nameOfCook;
	private String placeOfCook;
	private Integer ageOfCook;
	private Boolean cookKnowsKannada;
	private Boolean cookKnowsEnglish;
	private Boolean outsidePersonsAllowed;
	private Integer numberOfFloorsInPG;
	private Boolean solarWaterHeaterAvailable;
	private Boolean washingMachineAvailable;
	private String washingMachineBrand;

	public PGBoysDTO() {
		super();
	}

	public PGBoysDTO(String pgName, String ownerName, String ownerPlace, Double ownerAge, Long ownerPhoneNumber,
			String ownerJob, Double pgAdvance, Double costFor3SharedRoom, Double costFor4SharedRoom,
			Double costFor5SharedRoom, Double costFor2SharedRoom, Double numberOfRooms, Boolean wifiAvailable,
			Boolean needToPaySeperateForWifi, Boolean guizerAvailable, Boolean food3TimesAvailable,
			Integer numberOfRoomsSharedBy4, Integer numberOfRoomsSharedBy5, Integer numberOfRoomsSharedBy3,
			String mondayBreakfast, String tuesdayBreakfast, String wednesdayBreakfast, String thursdayBreakfast,
			String fridayBreakfast, String saturdayBreakfast, String sundayBreakfast, Boolean ownerKnowsKannada,
			String nameOfCook, String placeOfCook, Integer ageOfCook, Boolean cookKnowsKannada,
			Boolean cookKnowsEnglish, Boolean outsidePersonsAllowed, Integer numberOfFloorsInPG,
			Boolean solarWaterHeaterAvailable, Boolean washingMachineAvailable, String washingMachineBrand) {
		super();
		this.pgName = pgName;
		this.ownerName = ownerName;
		this.ownerPlace = ownerPlace;
		this.ownerAge = ownerAge;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerJob = ownerJob;
		this.pgAdvance = pgAdvance;
		this.costFor3SharedRoom = costFor3SharedRoom;
		this.costFor4SharedRoom = costFor4SharedRoom;
		this.costFor5SharedRoom = costFor5SharedRoom;
		this.costFor2SharedRoom = costFor2SharedRoom;
		this.numberOfRooms = numberOfRooms;
		this.wifiAvailable = wifiAvailable;
		this.needToPaySeperateForWifi = needToPaySeperateForWifi;
		this.guizerAvailable = guizerAvailable;
		this.food3TimesAvailable = food3TimesAvailable;
		this.numberOfRoomsSharedBy4 = numberOfRoomsSharedBy4;
		this.numberOfRoomsSharedBy5 = numberOfRoomsSharedBy5;
		this.numberOfRoomsSharedBy3 = numberOfRoomsSharedBy3;
		this.mondayBreakfast = mondayBreakfast;
		this.tuesdayBreakfast = tuesdayBreakfast;
		this.wednesdayBreakfast = wednesdayBreakfast;
		this.thursdayBreakfast = thursdayBreakfast;
		this.fridayBreakfast = fridayBreakfast;
		this.saturdayBreakfast = saturdayBreakfast;
		this.sundayBreakfast = sundayBreakfast;
		this.ownerKnowsKannada = ownerKnowsKannada;
		this.nameOfCook = nameOfCook;
		this.placeOfCook = placeOfCook;
		this.ageOfCook = ageOfCook;
		this.cookKnowsKannada = cookKnowsKannada;
		this.cookKnowsEnglish = cookKnowsEnglish;
		this.outsidePersonsAllowed = outsidePersonsAllowed;
		this.numberOfFloorsInPG = numberOfFloorsInPG;
		this.solarWaterHeaterAvailable = solarWaterHeaterAvailable;
		this.washingMachineAvailable = washingMachineAvailable;
		this.washingMachineBrand = washingMachineBrand;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPlace() {
		return ownerPlace;
	}

	public void setOwnerPlace(String ownerPlace) {
		this.ownerPlace = ownerPlace;
	}

	public Double getOwnerAge() {
		return ownerAge;
	}

	public void setOwnerAge(Double ownerAge) {
		this.ownerAge = ownerAge;
	}

	public Long getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(Long ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public String getOwnerJob() {
		return ownerJob;
	}

	public void setOwnerJob(String ownerJob) {
		this.ownerJob = ownerJob;
	}

	public Double getPgAdvance() {
		return pgAdvance;
	}

	public void setPgAdvance(Double pgAdvance) {
		this.pgAdvance = pgAdvance;
	}

	public Double getCostFor3SharedRoom() {
		return costFor3SharedRoom;
	}

	public void setCostFor3SharedRoom(Double costFor3SharedRoom) {
		this.costFor3SharedRoom = costFor3SharedRoom;
	}

	public Double getCostFor4SharedRoom() {
		return costFor4SharedRoom;
	}

	public void setCostFor4SharedRoom(Double costFor4SharedRoom) {
		this.costFor4SharedRoom = costFor4SharedRoom;
	}

	public Double getCostFor5SharedRoom() {
		return costFor5SharedRoom;
	}

	public void setCostFor5SharedRoom(Double costFor5SharedRoom) {
		this.costFor5SharedRoom = costFor5SharedRoom;
	}

	public Double getCostFor2SharedRoom() {
		return costFor2SharedRoom;
	}

	public void setCostFor2SharedRoom(Double costFor2SharedRoom) {
		this.costFor2SharedRoom = costFor2SharedRoom;
	}

	public Double getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(Double numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public Boolean getWifiAvailable() {
		return wifiAvailable;
	}

	public void setWifiAvailable(Boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}

	public Boolean getNeedToPaySeperateForWifi() {
		return needToPaySeperateForWifi;
	}

	public void setNeedToPaySeperateForWifi(Boolean needToPaySeperateForWifi) {
		this.needToPaySeperateForWifi = needToPaySeperateForWifi;
	}

	public Boolean getGuizerAvailable() {
		return guizerAvailable;
	}

	public void setGuizerAvailable(Boolean guizerAvailable) {
		this.guizerAvailable = guizerAvailable;
	}

	public Boolean getFood3TimesAvailable() {
		return food3TimesAvailable;
	}

	public void setFood3TimesAvailable(Boolean food3TimesAvailable) {
		this.food3TimesAvailable = food3TimesAvailable;
	}

	public Integer getNumberOfRoomsSharedBy4() {
		return numberOfRoomsSharedBy4;
	}

	public void setNumberOfRoomsSharedBy4(Integer numberOfRoomsSharedBy4) {
		this.numberOfRoomsSharedBy4 = numberOfRoomsSharedBy4;
	}

	public Integer getNumberOfRoomsSharedBy5() {
		return numberOfRoomsSharedBy5;
	}

	public void setNumberOfRoomsSharedBy5(Integer numberOfRoomsSharedBy5) {
		this.numberOfRoomsSharedBy5 = numberOfRoomsSharedBy5;
	}

	public Integer getNumberOfRoomsSharedBy3() {
		return numberOfRoomsSharedBy3;
	}

	public void setNumberOfRoomsSharedBy3(Integer numberOfRoomsSharedBy3) {
		this.numberOfRoomsSharedBy3 = numberOfRoomsSharedBy3;
	}

	public String getMondayBreakfast() {
		return mondayBreakfast;
	}

	public void setMondayBreakfast(String mondayBreakfast) {
		this.mondayBreakfast = mondayBreakfast;
	}

	public String getTuesdayBreakfast() {
		return tuesdayBreakfast;
	}

	public void setTuesdayBreakfast(String tuesdayBreakfast) {
		this.tuesdayBreakfast = tuesdayBreakfast;
	}

	public String getWednesdayBreakfast() {
		return wednesdayBreakfast;
	}

	public void setWednesdayBreakfast(String wednesdayBreakfast) {
		this.wednesdayBreakfast = wednesdayBreakfast;
	}

	public String getThursdayBreakfast() {
		return thursdayBreakfast;
	}

	public void setThursdayBreakfast(String thursdayBreakfast) {
		this.thursdayBreakfast = thursdayBreakfast;
	}

	public String getFridayBreakfast() {
		return fridayBreakfast;
	}

	public void setFridayBreakfast(String fridayBreakfast) {
		this.fridayBreakfast = fridayBreakfast;
	}

	public String getSaturdayBreakfast() {
		return saturdayBreakfast;
	}

	public void setSaturdayBreakfast(String saturdayBreakfast) {
		this.saturdayBreakfast = saturdayBreakfast;
	}

	public String getSundayBreakfast() {
		return sundayBreakfast;
	}

	public void setSundayBreakfast(String sundayBreakfast) {
		this.sundayBreakfast = sundayBreakfast;
	}

	public Boolean getOwnerKnowsKannada() {
		return ownerKnowsKannada;
	}

	public void setOwnerKnowsKannada(Boolean ownerKnowsKannada) {
		this.ownerKnowsKannada = ownerKnowsKannada;
	}

	public String getNameOfCook() {
		return nameOfCook;
	}

	public void setNameOfCook(String nameOfCook) {
		this.nameOfCook = nameOfCook;
	}

	public String getPlaceOfCook() {
		return placeOfCook;
	}

	public void setPlaceOfCook(String placeOfCook) {
		this.placeOfCook = placeOfCook;
	}

	public Integer getAgeOfCook() {
		return ageOfCook;
	}

	public void setAgeOfCook(Integer ageOfCook) {
		this.ageOfCook = ageOfCook;
	}

	public Boolean getCookKnowsKannada() {
		return cookKnowsKannada;
	}

	public void setCookKnowsKannada(Boolean cookKnowsKannada) {
		this.cookKnowsKannada = cookKnowsKannada;
	}

	public Boolean getCookKnowsEnglish() {
		return cookKnowsEnglish;
	}

	public void setCookKnowsEnglish(Boolean cookKnowsEnglish) {
		this.cookKnowsEnglish = cookKnowsEnglish;
	}

	public Boolean getOutsidePersonsAllowed() {
		return outsidePersonsAllowed;
	}

	public void setOutsidePersonsAllowed(Boolean outsidePersonsAllowed) {
		this.outsidePersonsAllowed = outsidePersonsAllowed;
	}

	public Integer getNumberOfFloorsInPG() {
		return numberOfFloorsInPG;
	}

	public void setNumberOfFloorsInPG(Integer numberOfFloorsInPG) {
		this.numberOfFloorsInPG = numberOfFloorsInPG;
	}

	public Boolean getSolarWaterHeaterAvailable() {
		return solarWaterHeaterAvailable;
	}

	public void setSolarWaterHeaterAvailable(Boolean solarWaterHeaterAvailable) {
		this.solarWaterHeaterAvailable = solarWaterHeaterAvailable;
	}

	public Boolean getWashingMachineAvailable() {
		return washingMachineAvailable;
	}

	public void setWashingMachineAvailable(Boolean washingMachineAvailable) {
		this.washingMachineAvailable = washingMachineAvailable;
	}

	public String getWashingMachineBrand() {
		return washingMachineBrand;
	}

	public void setWashingMachineBrand(String washingMachineBrand) {
		this.washingMachineBrand = washingMachineBrand;
	}

	@Override
	public int hashCode() {

		return 3886;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Object is not Null");
			if (obj instanceof PGBoysDTO) {
				System.out.println("Object is of PGBoysDTO type");
				PGBoysDTO casted = (PGBoysDTO) obj;
				if (casted.ownerName.equals(this.ownerName)
						&& casted.ownerPhoneNumber.equals(this.ownerPhoneNumber)
						&& casted.ownerPlace.equals(this.ownerPlace) && casted.nameOfCook.equals(this.nameOfCook)
						&& casted.placeOfCook.equals(this.placeOfCook)
						&& casted.ageOfCook.equals(this.ageOfCook)) {
					System.out.println("*****--Both PGs are equal--*****");
					return true;
				} else {
					System.out.println("Both PGs are Not equal");
				}
			} else {
				System.out.println("Object is Not of PGBoysDTO type");
			}
		} else {
			System.out.println("Object is Null");
		}
		return super.equals(obj);
	}

}
