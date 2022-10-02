package com.xworkz.dto;

public class HospitalDTO {

//	DTO with 16 properties check
//	DTO (Note): 1. All variables have to be private.
//				2.DTO class will not have any methods in it.
//				3.Use setters and getters to initialise and to get value.
//				4.Default constructor and parameterised Constructor must be present.
//				5.DTO class must be serialisable(to be thought in Interfaces).

	private String hospitalName;
	private String founderName;
	private String directorName;
	private Boolean isDirectorAnAwardeeOfPadmaShri;
	private Integer foundedInYear;
	private Boolean isItAutonomous;
	private Integer perDayOPDVisits;
	private String place;
	private Integer pincode;
	private Integer noOfDoctors;
	private Integer noOfStaffs;
	private String dentalDoctorName;
	private Long dentalDoctorPhoneNumber;
	private Integer minFee;
	private Double startTime;
	private Double endTime;
	private String skinDoctorName;
	private Long skinDoctorPhoneNumber;
	private String cardiologistDoctorName;
	private Long cardiologistDoctorPhoneNumber;
	private String orthopedicDoctorName;
	private Long orthopedicDoctorPhoneNumber;
	private Integer noOfBeds;
	private Integer noOfFans;
	private Integer noOfChairs;
	private Integer noOfWheelChairs;
	private Integer noOfFireFightingEquipments;
	private Integer noOfWallClocks;
	private Integer noOfFloors;
	private Integer noOfSecurities;
	private Integer noOfCCTVcameras;
	private Integer noOfRoomsIn1stFloor;
	private Integer noOfRoomsIn2ndFloor;
	private Integer noOfRoomsIn3rdFloor;
	private Boolean isThereHotelNearToHospital;
	private Integer noOfGates;
	private Boolean bloodBankAvailableInHospital;
	private Boolean mriScanningAvailable;
	private String ambulanceNumber;
	private String driverName;
	private Integer driverPhoneNumber;

	public HospitalDTO() {
		super();
	}

	public HospitalDTO(String hospitalName, String founderName, String directorName,
			Boolean isDirectorAnAwardeeOfPadmaShri, Integer foundedInYear, Boolean isItAutonomous,
			Integer perDayOPDVisits, String place, Integer pincode, Integer noOfDoctors, Integer noOfStaffs,
			String dentalDoctorName, Long dentalDoctorPhoneNumber, Integer minFee, Double startTime, Double endTime,
			String skinDoctorName, Long skinDoctorPhoneNumber, String cardiologistDoctorName,
			Long cardiologistDoctorPhoneNumber, String orthopedicDoctorName, Long orthopedicDoctorPhoneNumber,
			Integer noOfBeds, Integer noOfFans, Integer noOfChairs, Integer noOfWheelChairs,
			Integer noOfFireFightingEquipments, Integer noOfWallClocks, Integer noOfFloors, Integer noOfSecurities,
			Integer noOfCCTVcameras, Integer noOfRoomsIn1stFloor, Integer noOfRoomsIn2ndFloor,
			Integer noOfRoomsIn3rdFloor, Boolean isThereHotelNearToHospital, Integer noOfGates,
			Boolean bloodBankAvailableInHospital, Boolean mriScanningAvailable, String ambulanceNumber,
			String driverName, Integer driverPhoneNumber) {
		super();
		this.hospitalName = hospitalName;
		this.founderName = founderName;
		this.directorName = directorName;
		this.isDirectorAnAwardeeOfPadmaShri = isDirectorAnAwardeeOfPadmaShri;
		this.foundedInYear = foundedInYear;
		this.isItAutonomous = isItAutonomous;
		this.perDayOPDVisits = perDayOPDVisits;
		this.place = place;
		this.pincode = pincode;
		this.noOfDoctors = noOfDoctors;
		this.noOfStaffs = noOfStaffs;
		this.dentalDoctorName = dentalDoctorName;
		this.dentalDoctorPhoneNumber = dentalDoctorPhoneNumber;
		this.minFee = minFee;
		this.startTime = startTime;
		this.endTime = endTime;
		this.skinDoctorName = skinDoctorName;
		this.skinDoctorPhoneNumber = skinDoctorPhoneNumber;
		this.cardiologistDoctorName = cardiologistDoctorName;
		this.cardiologistDoctorPhoneNumber = cardiologistDoctorPhoneNumber;
		this.orthopedicDoctorName = orthopedicDoctorName;
		this.orthopedicDoctorPhoneNumber = orthopedicDoctorPhoneNumber;
		this.noOfBeds = noOfBeds;
		this.noOfFans = noOfFans;
		this.noOfChairs = noOfChairs;
		this.noOfWheelChairs = noOfWheelChairs;
		this.noOfFireFightingEquipments = noOfFireFightingEquipments;
		this.noOfWallClocks = noOfWallClocks;
		this.noOfFloors = noOfFloors;
		this.noOfSecurities = noOfSecurities;
		this.noOfCCTVcameras = noOfCCTVcameras;
		this.noOfRoomsIn1stFloor = noOfRoomsIn1stFloor;
		this.noOfRoomsIn2ndFloor = noOfRoomsIn2ndFloor;
		this.noOfRoomsIn3rdFloor = noOfRoomsIn3rdFloor;
		this.isThereHotelNearToHospital = isThereHotelNearToHospital;
		this.noOfGates = noOfGates;
		this.bloodBankAvailableInHospital = bloodBankAvailableInHospital;
		this.mriScanningAvailable = mriScanningAvailable;
		this.ambulanceNumber = ambulanceNumber;
		this.driverName = driverName;
		this.driverPhoneNumber = driverPhoneNumber;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Boolean getIsDirectorAnAwardeeOfPadmaShri() {
		return isDirectorAnAwardeeOfPadmaShri;
	}

	public void setIsDirectorAnAwardeeOfPadmaShri(Boolean isDirectorAnAwardeeOfPadmaShri) {
		this.isDirectorAnAwardeeOfPadmaShri = isDirectorAnAwardeeOfPadmaShri;
	}

	public Integer getFoundedInYear() {
		return foundedInYear;
	}

	public void setFoundedInYear(Integer foundedInYear) {
		this.foundedInYear = foundedInYear;
	}

	public Boolean getIsItAutonomous() {
		return isItAutonomous;
	}

	public void setIsItAutonomous(Boolean isItAutonomous) {
		this.isItAutonomous = isItAutonomous;
	}

	public Integer getPerDayOPDVisits() {
		return perDayOPDVisits;
	}

	public void setPerDayOPDVisits(Integer perDayOPDVisits) {
		this.perDayOPDVisits = perDayOPDVisits;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Integer getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(Integer noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public Integer getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(Integer noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public String getDentalDoctorName() {
		return dentalDoctorName;
	}

	public void setDentalDoctorName(String dentalDoctorName) {
		this.dentalDoctorName = dentalDoctorName;
	}

	public Long getDentalDoctorPhoneNumber() {
		return dentalDoctorPhoneNumber;
	}

	public void setDentalDoctorPhoneNumber(Long dentalDoctorPhoneNumber) {
		this.dentalDoctorPhoneNumber = dentalDoctorPhoneNumber;
	}

	public Integer getMinFee() {
		return minFee;
	}

	public void setMinFee(Integer minFee) {
		this.minFee = minFee;
	}

	public Double getStartTime() {
		return startTime;
	}

	public void setStartTime(Double startTime) {
		this.startTime = startTime;
	}

	public Double getEndTime() {
		return endTime;
	}

	public void setEndTime(Double endTime) {
		this.endTime = endTime;
	}

	public String getSkinDoctorName() {
		return skinDoctorName;
	}

	public void setSkinDoctorName(String skinDoctorName) {
		this.skinDoctorName = skinDoctorName;
	}

	public Long getSkinDoctorPhoneNumber() {
		return skinDoctorPhoneNumber;
	}

	public void setSkinDoctorPhoneNumber(Long skinDoctorPhoneNumber) {
		this.skinDoctorPhoneNumber = skinDoctorPhoneNumber;
	}

	public String getCardiologistDoctorName() {
		return cardiologistDoctorName;
	}

	public void setCardiologistDoctorName(String cardiologistDoctorName) {
		this.cardiologistDoctorName = cardiologistDoctorName;
	}

	public Long getCardiologistDoctorPhoneNumber() {
		return cardiologistDoctorPhoneNumber;
	}

	public void setCardiologistDoctorPhoneNumber(Long cardiologistDoctorPhoneNumber) {
		this.cardiologistDoctorPhoneNumber = cardiologistDoctorPhoneNumber;
	}

	public String getOrthopedicDoctorName() {
		return orthopedicDoctorName;
	}

	public void setOrthopedicDoctorName(String orthopedicDoctorName) {
		this.orthopedicDoctorName = orthopedicDoctorName;
	}

	public Long getOrthopedicDoctorPhoneNumber() {
		return orthopedicDoctorPhoneNumber;
	}

	public void setOrthopedicDoctorPhoneNumber(Long orthopedicDoctorPhoneNumber) {
		this.orthopedicDoctorPhoneNumber = orthopedicDoctorPhoneNumber;
	}

	public Integer getNoOfBeds() {
		return noOfBeds;
	}

	public void setNoOfBeds(Integer noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	public Integer getNoOfFans() {
		return noOfFans;
	}

	public void setNoOfFans(Integer noOfFans) {
		this.noOfFans = noOfFans;
	}

	public Integer getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(Integer noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public Integer getNoOfWheelChairs() {
		return noOfWheelChairs;
	}

	public void setNoOfWheelChairs(Integer noOfWheelChairs) {
		this.noOfWheelChairs = noOfWheelChairs;
	}

	public Integer getNoOfFireFightingEquipments() {
		return noOfFireFightingEquipments;
	}

	public void setNoOfFireFightingEquipments(Integer noOfFireFightingEquipments) {
		this.noOfFireFightingEquipments = noOfFireFightingEquipments;
	}

	public Integer getNoOfWallClocks() {
		return noOfWallClocks;
	}

	public void setNoOfWallClocks(Integer noOfWallClocks) {
		this.noOfWallClocks = noOfWallClocks;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Integer getNoOfSecurities() {
		return noOfSecurities;
	}

	public void setNoOfSecurities(Integer noOfSecurities) {
		this.noOfSecurities = noOfSecurities;
	}

	public Integer getNoOfCCTVcameras() {
		return noOfCCTVcameras;
	}

	public void setNoOfCCTVcameras(Integer noOfCCTVcameras) {
		this.noOfCCTVcameras = noOfCCTVcameras;
	}

	public Integer getNoOfRoomsIn1stFloor() {
		return noOfRoomsIn1stFloor;
	}

	public void setNoOfRoomsIn1stFloor(Integer noOfRoomsIn1stFloor) {
		this.noOfRoomsIn1stFloor = noOfRoomsIn1stFloor;
	}

	public Integer getNoOfRoomsIn2ndFloor() {
		return noOfRoomsIn2ndFloor;
	}

	public void setNoOfRoomsIn2ndFloor(Integer noOfRoomsIn2ndFloor) {
		this.noOfRoomsIn2ndFloor = noOfRoomsIn2ndFloor;
	}

	public Integer getNoOfRoomsIn3rdFloor() {
		return noOfRoomsIn3rdFloor;
	}

	public void setNoOfRoomsIn3rdFloor(Integer noOfRoomsIn3rdFloor) {
		this.noOfRoomsIn3rdFloor = noOfRoomsIn3rdFloor;
	}

	public Boolean getIsThereHotelNearToHospital() {
		return isThereHotelNearToHospital;
	}

	public void setIsThereHotelNearToHospital(Boolean isThereHotelNearToHospital) {
		this.isThereHotelNearToHospital = isThereHotelNearToHospital;
	}

	public Integer getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(Integer noOfGates) {
		this.noOfGates = noOfGates;
	}

	public Boolean getBloodBankAvailableInHospital() {
		return bloodBankAvailableInHospital;
	}

	public void setBloodBankAvailableInHospital(Boolean bloodBankAvailableInHospital) {
		this.bloodBankAvailableInHospital = bloodBankAvailableInHospital;
	}

	public Boolean getMriScanningAvailable() {
		return mriScanningAvailable;
	}

	public void setMriScanningAvailable(Boolean mriScanningAvailable) {
		this.mriScanningAvailable = mriScanningAvailable;
	}

	public String getAmbulanceNumber() {
		return ambulanceNumber;
	}

	public void setAmbulanceNumber(String ambulanceNumber) {
		this.ambulanceNumber = ambulanceNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Integer getDriverPhoneNumber() {
		return driverPhoneNumber;
	}

	public void setDriverPhoneNumber(Integer driverPhoneNumber) {
		this.driverPhoneNumber = driverPhoneNumber;
	}

	@Override
	public int hashCode() {

		return 6389;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("**--Object is NOT Null--**");
			if (obj instanceof HospitalDTO) {
				System.out.println("**--Object is of Hospital type--**");
				HospitalDTO casted = (HospitalDTO) obj;
				if (casted.hospitalName.equals(this.hospitalName) && casted.founderName.equals(this.founderName)
						&& casted.directorName.equals(this.directorName)
						&& casted.isDirectorAnAwardeeOfPadmaShri.equals(this.isDirectorAnAwardeeOfPadmaShri)
						&& casted.foundedInYear.equals(this.foundedInYear)
						&& casted.isItAutonomous.equals(this.isItAutonomous)
						&& casted.perDayOPDVisits.equals(this.perDayOPDVisits) && casted.place.equals(this.place)
						&& casted.pincode.equals(this.pincode) && casted.noOfDoctors.equals(this.noOfDoctors)
						&& casted.noOfStaffs.equals(this.noOfStaffs)
						&& casted.dentalDoctorName.equals(this.dentalDoctorName)
						&& casted.dentalDoctorPhoneNumber.equals(this.dentalDoctorPhoneNumber)
						&& casted.minFee.equals(this.minFee) && casted.startTime.equals(this.startTime)
						&& casted.endTime.equals(this.endTime)) {
					System.out.println("-*-*Both Objects are Same*-*-");
					return true;
				} else {
					System.out.println("But Both Objects are NOT Same");
				}

			} else {
				System.out.println("Object is NOT of Hospital type");
			}
		} else {
			System.out.println("Object is Null");
		}
		return super.equals(obj);
	}

}
