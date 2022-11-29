package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.ATM;
import com.xworkz.beans.Auto;
import com.xworkz.beans.BeautyParlour;
import com.xworkz.beans.Bike;
import com.xworkz.beans.BoysPG;
import com.xworkz.beans.BusStand;
import com.xworkz.beans.CementFactory;
import com.xworkz.beans.CinemaHall;
import com.xworkz.beans.CoffeeShop;
import com.xworkz.beans.DressShop;
import com.xworkz.beans.GeneralStore;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Hotel;
import com.xworkz.beans.ICICIBank;
import com.xworkz.beans.JavaTrainingInstitute;
import com.xworkz.beans.PanShop;
import com.xworkz.beans.Park;
import com.xworkz.beans.PrimarySchool;
import com.xworkz.beans.RailwayStation;
import com.xworkz.beans.TailorShop;
import com.xworkz.springConfiguration.SpringConfiguration;

public class SpringRunner {

	public static void main(String[] args) {

		
	ApplicationContext	spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	System.err.println("No Of Beans Count:  "+spring.getBeanDefinitionCount());
	String [] beanNames=spring.getBeanDefinitionNames();
	System.err.println("Name of Beans Generated are: ");
	for(String i:  beanNames)
	{
		System.out.println(i);
	}
	
	Bike bike=spring.getBean(Bike.class);
	System.err.println("Example 1:");
	System.out.println("Bike Brand is:  "+bike.getBikebrand()+"\n"+"Bike cost is Rs:  "+bike.getBikecost());
	bike.showHornDetails();
	
	Hotel hotel=spring.getBean(Hotel.class);
	System.err.println("Example 2:");
	System.out.println("Hotel Name is:  "+hotel.getHotelName()+"\n"+"Hotel Since:  "+hotel.getHotelSince());
	hotel.showWeightmachineDetails();
	
	Hospital hospital=spring.getBean(Hospital.class);
	System.err.println("Example 3:");
	System.out.println("Hospital Name is:  "+hospital.getHospitalName()+"\n"+"Hospital Founder is:  "+hospital.getHospitalFounder());
	hospital.showAmbulanceDetails();
	
	BoysPG pg=spring.getBean(BoysPG.class);
	System.err.println("Example 4:");
	System.out.println("BoysPgName is:  "+pg.getBoysPgName()+"\n"+"PG Location is:  "+pg.getPgLocation());
	pg.showCookDetails();
	
	PrimarySchool ps=spring.getBean(PrimarySchool.class);
	System.err.println("Example 5:");
	System.out.println("Primary School Name is:  "+ps.getSchoolName()+"\n"+"Shool Start year is:  "+ps.getSchoolSince());
	ps.showHmDetails();
	
	
	JavaTrainingInstitute jti=spring.getBean(JavaTrainingInstitute.class);
	System.err.println("Example 6:");
	System.out.println("Training Institute Name is:  "+jti.getInstituteName()+"\n"+"Institute Founder is:  "+jti.getInstituteFounder());
	jti.showVehicleDetails();
	
	ICICIBank bnk=spring.getBean(ICICIBank.class);
	System.err.println("Example 7:");
	System.out.println("Bank Location is:  "+bnk.getIciciBankLocation()+"\n"+"Bank pincode is:  "+bnk.getIciciPincode());
	bnk.showSecurityDetails();
	
	CinemaHall chl=spring.getBean(CinemaHall.class);
	System.err.println("Example 8:");
	System.out.println("Cinema Hall Name is:  "+chl.getCinemaHallName()+"\n"+"Cinema Hall Founder is:  "+chl.getCinemaHallFounder());
	chl.showhallOwnerDetails();
	
	
	DressShop shp=spring.getBean(DressShop.class);
	System.err.println("Example 9:");
	System.out.println("Dress Shop Name is:  "+shp.getDressShopName()+"\n"+"Shop area is:  "+shp.getDressShopArea());
	shp.showOwnerDetails();
	
	BeautyParlour bps=spring.getBean(BeautyParlour.class);
	System.err.println("Example 10:");
	System.out.println("Parlour Name is:  "+bps.getParlourName()+"\n"+"Parlour Contact Number is:  "+bps.getParlourPhoneNumber());
	bps.showAcDetails();
	
	Park prk=spring.getBean(Park.class);
	System.err.println("Example 11:");
	System.out.println("Park Name is:  "+prk.getParkName()+"\n"+"Park located at :  "+prk.getParkArea());
	prk.showParkMainGateDetails();
	
	ATM atm=spring.getBean(ATM.class);
	System.err.println("Example 12:");
	System.out.println("ATM  Name is:  "+atm.getAtmName()+"\n"+"ATM Landmark is:  "+atm.getAtmLandmark());
	atm.showAcDetails();
	
	CoffeeShop csp=spring.getBean(CoffeeShop.class);
	System.err.println("Example 13:");
	System.out.println("Coffee shop Name is:  "+csp.getCoffeeShopName()+"\n"+"Coffeeshop Landmark is:  "+csp.getCoffeeShopLocation());
	csp.showCounterDetails();
	
	GeneralStore gs=spring.getBean(GeneralStore.class);
	System.err.println("Example 14:");
	System.out.println("General Store  Name is:  "+gs.getGeneralStoreName()+"\n"+"Pincode is:  "+gs.getGeneralStorePincode());
	gs.showBroomstickDetails();
	
	CementFactory cf=spring.getBean(CementFactory.class);
	System.err.println("Example 15:");
	System.out.println("Cement Factory Owner Nname is:  "+cf.getCementOwnerName()+"\n"+"Cement Factory Located at :  "+cf.getCementPlace());
	cf.showGuardDetails();
	
	BusStand bts=spring.getBean(BusStand.class);
	System.err.println("Example 16:");
	System.out.println("Bus Stop Name is:  "+bts.getBusStandName()+"\n"+"Ditrict is:  "+bts.getBusStandDistrict());
	bts.showControllerDetails();
	
	RailwayStation rty=spring.getBean(RailwayStation.class);
	System.err.println("Example 17:");
	System.out.println("Rail Station Name is:  "+rty.getRailPlace()+"\n"+"District is:  "+rty.getRailDist());
	rty.showCheckerDetails();
	
	
	PanShop pp=spring.getBean(PanShop.class);
	System.err.println("Example 18:");
	System.out.println("PanShop Owner  Name is:  "+pp.getPanShopOwner()+"\n"+"PanShop Rent is Rs: "+pp.getPanShopRent());
	pp.showMusicPlayerDetails();
	
	TailorShop tde=spring.getBean(TailorShop.class);
	System.err.println("Example 19:");
	System.out.println("Tailor Works at :  "+tde.getTailorLocation()+"\n"+"Tailor pays rent of Rs:  "+tde.getTailorRent());
	tde.showSpeakerDetails();
	
	Auto atmu=spring.getBean(Auto.class);
	System.err.println("Example 20:");
	System.out.println("Auto Owner  Name is:  "+atmu.getAutoOwnerName()+"\n"+"Cost of Auto is:  "+atmu.getAutoCost());
	atmu.showMeterDetails();
	
	
	
	}

}
