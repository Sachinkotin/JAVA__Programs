package com.xworkz.abstractionInSpring.springConfign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.abstractionInSpring.repository.ATMRepo;
import com.xworkz.abstractionInSpring.repository.ATMRepoImpl;
import com.xworkz.abstractionInSpring.repository.BikeGarrageRepo;
import com.xworkz.abstractionInSpring.repository.BikeGarrageRepoImpl;
import com.xworkz.abstractionInSpring.repository.FilmCityRepo;
import com.xworkz.abstractionInSpring.repository.FilmCityRepoImpl;
import com.xworkz.abstractionInSpring.repository.JacketRepo;
import com.xworkz.abstractionInSpring.repository.JacketRepoImpl;
import com.xworkz.abstractionInSpring.repository.JavaInstituteRepo;
import com.xworkz.abstractionInSpring.repository.JavaInstituteRepoImpl;
import com.xworkz.abstractionInSpring.repository.JeansPantRepo;
import com.xworkz.abstractionInSpring.repository.JeansPantRepoImpl;
import com.xworkz.abstractionInSpring.repository.MedicalShopRepo;
import com.xworkz.abstractionInSpring.repository.MedicalShopRepoImpl;
import com.xworkz.abstractionInSpring.repository.PanshopRepo;
import com.xworkz.abstractionInSpring.repository.PanshopRepoImpl;
import com.xworkz.abstractionInSpring.repository.PendriveRepo;
import com.xworkz.abstractionInSpring.repository.PendriveRepoImpl;
import com.xworkz.abstractionInSpring.repository.PoliceStationRepo;
import com.xworkz.abstractionInSpring.repository.PoliceStationRepoImpl;
import com.xworkz.abstractionInSpring.repository.RoboRepo;
import com.xworkz.abstractionInSpring.repository.RoboRepoImpl;
import com.xworkz.abstractionInSpring.repository.SaloonRepo;
import com.xworkz.abstractionInSpring.repository.SaloonRepoImpl;
import com.xworkz.abstractionInSpring.repository.SimRepo;
import com.xworkz.abstractionInSpring.repository.SimRepoImpl;
import com.xworkz.abstractionInSpring.repository.TeaShopRepo;
import com.xworkz.abstractionInSpring.repository.TeaShopRepoImpl;
import com.xworkz.abstractionInSpring.repository.TheaterRepo;
import com.xworkz.abstractionInSpring.repository.TheaterRepoImpl;

@Configuration
@ComponentScan("com.xworkz.abstractionInSpring")

public class SpringConfign {

	@Bean
	public SimRepo simRepo() {
		return new SimRepoImpl();
	}

	@Bean
	public ATMRepo atmRepo() {
		return new ATMRepoImpl();
	}

	@Bean
	public PendriveRepo pendriveRepo() {
		return new PendriveRepoImpl();
	}
	
	@Bean
	public RoboRepo roboRepo() {
		return new RoboRepoImpl();
	}
	
	@Bean
	public TheaterRepo theaterRepo(){
		return new TheaterRepoImpl();
	}
	
	@Bean
	public BikeGarrageRepo bikeGarrageRepo()
	{
		return new BikeGarrageRepoImpl();
	}
	
	@Bean
	public FilmCityRepo filmCityRepo()
	{
		return new FilmCityRepoImpl();
	}
	@Bean
	public JacketRepo jacketRepo() {
		return new JacketRepoImpl();
	}
	
	@Bean
	public JavaInstituteRepo instituteRepo() {
		return new JavaInstituteRepoImpl();
	}
	
	@Bean
	public JeansPantRepo jeansPantRepo(){
		return new JeansPantRepoImpl();
	}
	
	@Bean
	public MedicalShopRepo medicalShopRepo()
	{
		return new MedicalShopRepoImpl();
	}
	@Bean
	public PanshopRepo panshopRepo() {
		return new PanshopRepoImpl();
	}
	
	@Bean
	public PoliceStationRepo policeStationRepo() {
		return new PoliceStationRepoImpl();
	}
	
	@Bean
	public SaloonRepo saloonRepo(){
		return new SaloonRepoImpl();
	}
	
	@Bean
	public TeaShopRepo teaShopRepo()
	{
		return new TeaShopRepoImpl();
	}
	
	

}
