package com.xworkz.abstractionInSpring.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.abstractionInSpring.beans.ATMDto;
import com.xworkz.abstractionInSpring.beans.PendriveDto;
import com.xworkz.abstractionInSpring.beans.RoboDto;
import com.xworkz.abstractionInSpring.beans.SimDto;
import com.xworkz.abstractionInSpring.beans.TheaterDto;
import com.xworkz.abstractionInSpring.service.ATMService;
import com.xworkz.abstractionInSpring.service.BikeGarrageService;
import com.xworkz.abstractionInSpring.service.FilmCityService;
import com.xworkz.abstractionInSpring.service.JacketService;
import com.xworkz.abstractionInSpring.service.JavaInstituteService;
import com.xworkz.abstractionInSpring.service.JeansPantService;
import com.xworkz.abstractionInSpring.service.MedicalShopService;
import com.xworkz.abstractionInSpring.service.PanShopService;
import com.xworkz.abstractionInSpring.service.PendriveService;
import com.xworkz.abstractionInSpring.service.PoliceStationService;
import com.xworkz.abstractionInSpring.service.RoboService;
import com.xworkz.abstractionInSpring.service.SaloonService;
import com.xworkz.abstractionInSpring.service.SimService;
import com.xworkz.abstractionInSpring.service.TeaShopService;
import com.xworkz.abstractionInSpring.service.TheaterService;
import com.xworkz.abstractionInSpring.springConfign.SpringConfign;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfign.class);
		
		System.err.println("Sim");
		SimService bean = context.getBean(SimService.class);
		bean.validateAndSave(null);
		SimDto dto1= new SimDto(1242, "Jio", "Prepaid", 547812457896L);
		bean.validateAndSave(dto1);
		
		System.err.println("ATM");
		ATMService bean2 = context.getBean(ATMService.class);
		bean2.validateAndSave(null);
		ATMDto dto2= new ATMDto("ICICI Bank", 597896);
		bean2.validateAndSave(dto2);
		
		System.err.println("Pendrive");
		PendriveService bean3 = context.getBean(PendriveService.class);
		bean3.validateAndSave(null);
		PendriveDto pendriveDto=new PendriveDto("HP", 500);
		bean3.validateAndSave(pendriveDto);
		
		System.err.println("Theater");
		TheaterService bean4 = context.getBean(TheaterService.class);
		bean4.validateAndSave(null);
		TheaterDto theaterDto=new TheaterDto("Venkatesh", "Ramdurg");
		bean4.validateAndSave(theaterDto);
		
		System.err.println("Robo");
		RoboService bean5 = context.getBean(RoboService.class);
		bean5.validateAndSave(null);
		RoboDto roboDto=new RoboDto("Michel Jackson", "Bangalore");
		bean5.validateAndSave(roboDto);
		
		System.err.println("BikeGarrage");
		BikeGarrageService bean6 = context.getBean(BikeGarrageService.class);
		bean6.validateAndSave(null);
		
		System.err.println("FilmCity");
		FilmCityService bean7 = context.getBean(FilmCityService.class);
		bean7.validateAndSave(null);
		
		System.err.println("Jacket");
		JacketService bean8 = context.getBean(JacketService.class);
		bean8.validateAndSave(null);
		
		System.err.println("JavaInstitute");
		JavaInstituteService bean9 = context.getBean(JavaInstituteService.class);
		bean9.validateAndSave(null);
		
		System.err.println("JeansPant");
		JeansPantService bean10 = context.getBean(JeansPantService.class);
		bean10.validateAndSave(null);
		
		System.err.println("MedicalShop");
		MedicalShopService bean11 = context.getBean(MedicalShopService.class);
		bean11.validateAndSave(null);
		
		System.err.println("Panshop");
		PanShopService bean12 = context.getBean(PanShopService.class);
		bean12.validateAndSave(null);
		
		System.err.println("PoliceStation");
		PoliceStationService bean13 = context.getBean(PoliceStationService.class);
		bean13.validateAndSave(null);
		
		System.err.println("Saloon");
		SaloonService bean14 = context.getBean(SaloonService.class);
		bean14.validateAndSave(null);
		
		System.err.println("TeaShop");
		TeaShopService bean15 = context.getBean(TeaShopService.class);
		bean15.validateAndSave(null);
		
		
		
		
	}

}
