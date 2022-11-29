package com.xworkz.springConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*Note : it is good practice to use @Bean for .class files(Mostly for primitive dt) 
  and @Component for classes having their .java files */

@Configuration
@ComponentScan("com.xworkz.beans")
public class SpringConfiguration {

	@Bean
	public String bikebrand() {
		return "Hero Honda";
	}

	@Bean
	public double bikecost() {
		return 69000.00;
	}

	@Bean
	public double horncost() {
		return 500.00;
	}

	@Bean
	public String horncolor() {
		return "Blue";
	}

	/*******************************************************************/

	@Bean
	public String hotelName() {
		return "Shree Balaji Hotel";
	}

	@Bean
	public int hotelSince() {
		return 1965;
	}

	@Bean
	public double weightmachinecost() {
		return 6500.00;
	}

	@Bean
	public boolean weightmachineisItDigital() {
		return true;
	}

	/*******************************************************************/
	@Bean
	public String hospitalName() {
		return "Kulagod Hospital";
	}

	@Bean
	public String hospitalFounder() {
		return "Dr Gurunath";
	}

	@Bean
	public String ambulanceDriverName() {
		return "Manikanth";
	}

	@Bean
	public String ambulanceBrand() {
		return "TATA Motors";
	}

	/*******************************************************************/

	@Bean
	public String boysPgName() {
		return "Krishna Boys PG";
	}

	@Bean
	public String pgLocation() {
		return "BTM Layout";
	}

	@Bean
	public String pgCookName() {
		return "Lee Man";
	}

	@Bean
	public boolean isCookMarried() {
		return true;
	}

	/*******************************************************************/

	@Bean
	public String schoolName() {
		return "Pragati Vidyalaya";
	}

	@Bean
	public int schoolSince() {
		return 1965;
	}

	@Bean
	public String hmName() {
		return "Nagakalal";
	}

	@Bean
	public int experienceInYears() {
		return 35;
	}

	/*******************************************************************/
	@Bean
	public String instituteName() {
		return "X-Workz";
	}

	@Bean
	public String instituteFounder() {
		return "Omkar";
	}

	@Bean
	public String ownerName() {
		return "Omkar";
	}

	@Bean
	public String vehicleBrand() {
		return "Tata Innova";
	}

	/*******************************************************************/
	
	@Bean
	public String iciciBankLocation() {
		return "Banashankari ";
	}

	@Bean
	public String iciciPincode() {
		return "591123";
	}

	@Bean
	public String bankSecurityName() {
		return "Shyam ";
	}

	@Bean
	public String bankSecurityVehicleBrand() {
		return "TVS Victor";
	}

	/*******************************************************************/
	
	@Bean
	public String cinemaHallName() {
		return "Shambulinga ";
	}

	@Bean
	public String cinemaHallFounder() {
		return "B D Jatti";
	}

	@Bean
	public String cinemaOwnerName() {
		return "Kuresh ";
	}

	@Bean
	public String cinemaOwnerVehicleBrand() {
		return "KIA motors";
	}

	/*******************************************************************/
	
	@Bean
	public String dressShopName() {
		return "Peters England ";
	}

	@Bean
	public String dressShopArea() {
		return "Silk Board";
	}

	@Bean
	public String shopOwnerResidenceArea() {
		return "Vijayangar ";
	}

	@Bean
	public String shopOwnerVehicleBrand() {
		return "Mercedes Benz";
	}

	/*******************************************************************/
	@Bean
	public String parlourName() {
		return "Genelia Parlour";
	}

	@Bean
	public long parlourPhoneNumber() {
		return 3654784512L;
	}

	@Bean
	public int acCost() {
		return 15000;
	}

	@Bean
	public String acBrand() {
		return "Philips";
	}

	/*******************************************************************/
	
	@Bean
	public String parkName() {
		return "Kaveri ";
	}

	@Bean
	public String parkArea() {
		return "J P Nagar";
	}

	@Bean
	public String directionFacing() {
		return "East ";
	}

	@Bean
	public int gateHeightInFeet() {
		return 15;
	}

	/*******************************************************************/
	@Bean
	public String atmName() {
		return "SBI ";
	}

	@Bean
	public String atmLandmark() {
		return "Junipeth Road";
	}

	@Bean
	public int atmAcCost() {
		return 16000;
	}

	@Bean
	public String atmAcBrand() {
		return "Bajaj";
	}

	/*******************************************************************/
	@Bean
	public String coffeeShopName() {
		return "Ganesh Vilas";
	}

	@Bean
	public String coffeeShopLocation() {
		return "SBM Main Road";
	}

	@Bean
	public boolean isHeMale() {
		return false;
	}

	@Bean
	public String counterPersonName() {
		return "Suma";
	}

	/*******************************************************************/
	
	@Bean
	public String generalStoreName() {
		return "Kartik General Store";
	}

	@Bean
	public int generalStorePincode() {
		return 564125;
	}

	@Bean
	public String broomstickBrandName() {
		return "Monkey 650";
	}

	@Bean
	public int broomStickCost() {
		return 180;
	}

	/*******************************************************************/
	@Bean
	public String cementOwnerName() {
		return "M K Nirani";
	}

	@Bean
	public String cementPlace() {
		return "Mudhol";
	}

	@Bean
	public String cementSecurityName() {
		return "Mangesh";
	}

	@Bean
	public String cementSecurityPlace() {
		return "Jamakhandi";
	}

	/*******************************************************************/
	@Bean
	public String busStandName() {
		return "Ramdurg";
	}

	@Bean
	public String busStandDistrict() {
		return "Belagavi";
	}

	@Bean
	public String busStandControllerName() {
		return "Sushila";
	}

	@Bean
	public int controllerSalary() {
		return 54000;
	}

	/*******************************************************************/
	
	@Bean
	public String railPlace() {
		return "Hubli";
	}

	@Bean
	public String railDist() {
		return "Dharwad";
	}

	@Bean
	public boolean isCheckerMale() {
		return false;
	}

	@Bean
	public int checkerAge() {
		return 24;
	}

	/*******************************************************************/
	@Bean
	public int panShopRent() {
		return 40000;
	}

	@Bean
	public String panShopOwner() {
		return "Prasad";
	}

	@Bean
	public String musicPlayerBrand() {
		return "Philips";
	}

	@Bean
	public int musicPlayerCost() {
		return 9000;
	}

	/*******************************************************************/
	
	@Bean
	public int tailorRent() {
		return 10000;
	}

	@Bean
	public String tailorLocation() {
		return "Majestic Bangalore";
	}

	@Bean
	public String tailorSpeakerBrand() {
		return "Lenovo BH-8";
	}

	@Bean
	public int tailorSpeakerCost() {
		return 3000;
	}

/*******************************************************************/
	
	@Bean
	public String autoOwnerName() {
		return "Sundar";
	}

	@Bean
	public int autoCost() {
		return 295000;
	}

	@Bean
	public boolean isMeterWorking() {
		return true;
	}

	@Bean
	public int costPerKm() {
		return 10;
	}


/*******************************************************************/
	
	
	

}
