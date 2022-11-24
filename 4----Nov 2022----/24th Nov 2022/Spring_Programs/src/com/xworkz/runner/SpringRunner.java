package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.beans.Bike;
import com.xworkz.beans.Film;
import com.xworkz.beans.Hotel;
import com.xworkz.beans.Park;
import com.xworkz.beans.SweetBun;
import com.xworkz.springconfig.SpringConfig;

public class SpringRunner {

	public static void main(String[] args) {

		
		System.err.println("****--Application context using Annotations started--****");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		SweetBun bun = context.getBean(SweetBun.class);
		bun.show();
		System.out.println(bun);
		System.out.println(bun.hashCode());
		bun.setPrice(62);
		System.out.println(bun);
		System.out.println(bun.hashCode());
		System.out.println("------------*************--------------");
		
		Park park1=context.getBean(Park.class);
		park1.showPark();
		System.out.println(park1.hashCode());
		
		System.out.println("------------*************--------------");
		
		Hotel hot1=context.getBean(Hotel.class);
		System.out.println(hot1);
		System.out.println(hot1.hashCode());
		System.out.println("------------*************--------------");
		
		
		String value = context.getBean("cycle", String.class);
		System.out.println(value);
		System.out.println(value.hashCode());
		System.out.println("------------*************--------------");
		
		String horse1=context.getBean("horse", String.class);
		System.out.println(horse1);
		System.out.println(horse1.hashCode());

		System.out.println("*****************************************************************************");
		
		/*********************************************************************/
		System.err.println("****--Application context using xml file started--****");
		
		ApplicationContext context27 = new ClassPathXmlApplicationContext("com/xworkz/springconfig/SpringConfigrn.xml");
		SweetBun buns=context27.getBean("bun", SweetBun.class);
		System.out.println(buns);
		System.out.println(buns.hashCode());
		buns.show();
		System.out.println("**********************************************");
		SweetBun buns1=context27.getBean("bun1", SweetBun.class);
		System.out.println(buns1);
		System.out.println(buns1.hashCode());
		System.out.println("**********************************************");
		SweetBun buns2=context27.getBean("bun2", SweetBun.class);
		System.out.println(buns2);
		System.out.println(buns2.hashCode());
		System.out.println("**********************************************");
		SweetBun buns3=context27.getBean("bun3", SweetBun.class);
		System.out.println(buns3);
		System.out.println(buns3.hashCode());
		System.out.println("**********************************************");
		SweetBun buns4=context27.getBean("bun4", SweetBun.class);
		System.out.println(buns4);
		System.out.println(buns4.hashCode());
		System.out.println("**********************************************");
		SweetBun buns5=context27.getBean("bun5", SweetBun.class);
		System.out.println(buns5);
		System.out.println(buns5.hashCode());
		System.out.println("**********************************************");
		SweetBun buns6=context27.getBean("bun6", SweetBun.class);
		System.out.println(buns6);
		System.out.println(buns6.hashCode());
		System.out.println("**********************************************");
		SweetBun buns7=context27.getBean("bun7", SweetBun.class);
		System.out.println(buns7);
		System.out.println(buns7.hashCode());
		System.out.println("**********************************************");
		SweetBun buns8=context27.getBean("bun8", SweetBun.class);
		System.out.println(buns8);
		System.out.println(buns8.hashCode());
		System.out.println("**********************************************");
		SweetBun buns9=context27.getBean("bun9", SweetBun.class);
		System.out.println(buns9);
		System.out.println(buns9.hashCode());
		System.out.println("**********************************************");
		SweetBun buns10=context27.getBean("bun10", SweetBun.class);
		System.out.println(buns10);
		System.out.println(buns10.hashCode());
		System.out.println("**********************************************");
		SweetBun buns11=context27.getBean("bun11", SweetBun.class);
		System.out.println(buns11);
		System.out.println(buns11.hashCode());
		System.out.println("**********************************************");
		SweetBun buns12=context27.getBean("bun12", SweetBun.class);
		System.out.println(buns12);
		System.out.println(buns12.hashCode());
		System.out.println("**********************************************");
		SweetBun buns13=context27.getBean("bun13", SweetBun.class);
		System.out.println(buns13);
		System.out.println(buns13.hashCode());
		System.out.println("**********************************************");
		SweetBun buns14=context27.getBean("bun14", SweetBun.class);
		System.out.println(buns14);
		System.out.println(buns14.hashCode());
		System.out.println("**********************************************");
		SweetBun buns15=context27.getBean("bun15", SweetBun.class);
		System.out.println(buns15);
		System.out.println(buns15.hashCode());
		System.out.println("**********************************************");
		SweetBun buns16=context27.getBean("bun16", SweetBun.class);
		System.out.println(buns16);
		System.out.println(buns16.hashCode());
		System.out.println("**********************************************");
		SweetBun buns17=context27.getBean("bun17", SweetBun.class);
		System.out.println(buns17);
		System.out.println(buns17.hashCode());
		System.out.println("**********************************************");
		SweetBun buns18=context27.getBean("bun18", SweetBun.class);
		System.out.println(buns18);
		System.out.println(buns18.hashCode());
		System.out.println("**********************************************");
		SweetBun buns19=context27.getBean("bun19", SweetBun.class);
		System.out.println(buns19);
		System.out.println(buns19.hashCode());
		System.out.println("**********************************************");
		SweetBun buns20=context27.getBean("bun20", SweetBun.class);
		System.out.println(buns20);
		System.out.println(buns20.hashCode());
		System.out.println("**********************************************");
		SweetBun buns21=context27.getBean("bun21", SweetBun.class);
		System.out.println(buns21);
		System.out.println(buns21.hashCode());
		System.out.println("**********************************************");
		SweetBun buns22=context27.getBean("bun22", SweetBun.class);
		System.out.println(buns22);
		System.out.println(buns22.hashCode());
		System.out.println("**********************************************");
		SweetBun buns23=context27.getBean("bun23", SweetBun.class);
		System.out.println(buns23);
		System.out.println(buns23.hashCode());
		System.out.println("**********************************************");
		SweetBun buns24=context27.getBean("bun24", SweetBun.class);
		System.out.println(buns24);
		System.out.println(buns24.hashCode());
		System.out.println("**********************************************");
		SweetBun buns25=context27.getBean("bun25", SweetBun.class);
		System.out.println(buns25);
		System.out.println(buns25.hashCode());
		System.out.println("**********************************************");
		SweetBun buns26=context27.getBean("bun26", SweetBun.class);
		System.out.println(buns26);
		System.out.println(buns26.hashCode());
		System.out.println("**********************************************");
		SweetBun buns27=context27.getBean("bun27", SweetBun.class);
		System.out.println(buns27);
		System.out.println(buns27.hashCode());
		System.out.println("**********************************************");
		SweetBun buns28=context27.getBean("bun28", SweetBun.class);
		System.out.println(buns28);
		System.out.println(buns28.hashCode());
		System.out.println("**********************************************");
		SweetBun buns29=context27.getBean("bun29", SweetBun.class);
		System.out.println(buns29);
		System.out.println(buns29.hashCode());
		System.out.println("**********************************************");
		SweetBun buns30=context27.getBean("bun30", SweetBun.class);
		System.out.println(buns30);
		System.out.println(buns30.hashCode());
		System.out.println("**********************************************");
		
		SweetBun buns31=context27.getBean("bun31", SweetBun.class);
		System.out.println(buns31);
		System.out.println(buns31.hashCode());
		System.out.println("**********************************************");
		SweetBun buns32=context27.getBean("bun32", SweetBun.class);
		System.out.println(buns32);
		System.out.println(buns32.hashCode());
		System.out.println("**********************************************");
		SweetBun buns33=context27.getBean("bun33", SweetBun.class);
		System.out.println(buns33);
		System.out.println(buns33.hashCode());
		System.out.println("**********************************************");
		SweetBun buns34=context27.getBean("bun34", SweetBun.class);
		System.out.println(buns34);
		System.out.println(buns34.hashCode());
		System.out.println("**********************************************");
		SweetBun buns35=context27.getBean("bun35", SweetBun.class);
		System.out.println(buns35);
		System.out.println(buns35.hashCode());
		System.out.println("**********************************************");
		SweetBun buns36=context27.getBean("bun36", SweetBun.class);
		System.out.println(buns36);
		System.out.println(buns36.hashCode());
		System.out.println("**********************************************");
		SweetBun buns37=context27.getBean("bun37", SweetBun.class);
		System.out.println(buns37);
		System.out.println(buns37.hashCode());
		System.out.println("**********************************************");
		SweetBun buns38=context27.getBean("bun38", SweetBun.class);
		System.out.println(buns38);
		System.out.println(buns38.hashCode());
		System.out.println("**********************************************");
		SweetBun buns39=context27.getBean("bun39", SweetBun.class);
		System.out.println(buns39);
		System.out.println(buns39.hashCode());
		System.out.println("**********************************************");
		SweetBun buns40=context27.getBean("bun40", SweetBun.class);
		System.out.println(buns40);
		System.out.println(buns40.hashCode());
		System.out.println("**********************************************");
		SweetBun buns41=context27.getBean("bun41", SweetBun.class);
		System.out.println(buns41);
		System.out.println(buns41.hashCode());
		System.out.println("**********************************************");
		SweetBun buns42=context27.getBean("bun42", SweetBun.class);
		System.out.println(buns42);
		System.out.println(buns42.hashCode());
		System.out.println("**********************************************");
		SweetBun buns43=context27.getBean("bun43", SweetBun.class);
		System.out.println(buns43);
		System.out.println(buns43.hashCode());
		System.out.println("**********************************************");
		SweetBun buns44=context27.getBean("bun44", SweetBun.class);
		System.out.println(buns44);
		System.out.println(buns44.hashCode());
		System.out.println("**********************************************");
		SweetBun buns45=context27.getBean("bun45", SweetBun.class);
		System.out.println(buns45);
		System.out.println(buns45.hashCode());
		System.out.println("**********************************************");
		SweetBun buns46=context27.getBean("bun46", SweetBun.class);
		System.out.println(buns46);
		System.out.println(buns46.hashCode());
		System.out.println("**********************************************");
		SweetBun buns47=context27.getBean("bun47", SweetBun.class);
		System.out.println(buns47);
		System.out.println(buns47.hashCode());
		System.out.println("**********************************************");
		SweetBun buns48=context27.getBean("bun48", SweetBun.class);
		System.out.println(buns48);
		System.out.println(buns48.hashCode());
		System.out.println("**********************************************");
		SweetBun buns49=context27.getBean("bun49", SweetBun.class);
		System.out.println(buns29);
		System.out.println(buns29.hashCode());
		System.out.println("**********************************************");
		SweetBun buns50=context27.getBean("bun50", SweetBun.class);
		System.out.println(buns50);
		System.out.println(buns50.hashCode());
		System.out.println("**********************************************");
		
		SweetBun buns51=context27.getBean("bun51", SweetBun.class);
		System.out.println(buns51);
		System.out.println(buns51.hashCode());
		System.out.println("**********************************************");
		SweetBun buns52=context27.getBean("bun52", SweetBun.class);
		System.out.println(buns52);
		System.out.println(buns52.hashCode());
		System.out.println("**********************************************");
		SweetBun buns53=context27.getBean("bun53", SweetBun.class);
		System.out.println(buns53);
		System.out.println(buns53.hashCode());
		System.out.println("**********************************************");
		SweetBun buns54=context27.getBean("bun54", SweetBun.class);
		System.out.println(buns54);
		System.out.println(buns54.hashCode());
		System.out.println("**********************************************");
		SweetBun buns55=context27.getBean("bun55", SweetBun.class);
		System.out.println(buns55);
		System.out.println(buns55.hashCode());
		System.out.println("**********************************************");
		SweetBun buns56=context27.getBean("bun56", SweetBun.class);
		System.out.println(buns56);
		System.out.println(buns56.hashCode());
		System.out.println("**********************************************");
		SweetBun buns57=context27.getBean("bun57", SweetBun.class);
		System.out.println(buns57);
		System.out.println(buns57.hashCode());
		System.out.println("**********************************************");
		SweetBun buns58=context27.getBean("bun58", SweetBun.class);
		System.out.println(buns58);
		System.out.println(buns58.hashCode());
		System.out.println("**********************************************");
		SweetBun buns59=context27.getBean("bun59", SweetBun.class);
		System.out.println(buns59);
		System.out.println(buns59.hashCode());
		System.out.println("**********************************************");
		SweetBun buns60=context27.getBean("bun60", SweetBun.class);
		System.out.println(buns60);
		System.out.println(buns60.hashCode());
		System.out.println("**********************************************");
		
		
		Bike biker1=context27.getBean("bike1", Bike.class);
		System.out.println(biker1);
		System.out.println(biker1.hashCode());
		System.out.println("**********************************************");
		Bike biker2=context27.getBean("bike2", Bike.class);
		System.out.println(biker2);
		System.out.println(biker2.hashCode());
		System.out.println("**********************************************");
		Bike biker3=context27.getBean("bike3", Bike.class);
		System.out.println(biker3);
		System.out.println(biker3.hashCode());
		System.out.println("**********************************************");
		Bike biker4=context27.getBean("bike4", Bike.class);
		System.out.println(biker4);
		System.out.println(biker4.hashCode());
		System.out.println("**********************************************");
		Bike biker5=context27.getBean("bike5", Bike.class);
		System.out.println(biker5);
		System.out.println(biker5.hashCode());
		System.out.println("**********************************************");
		Bike biker6=context27.getBean("bike6", Bike.class);
		System.out.println(biker6);
		System.out.println(biker6.hashCode());
		System.out.println("**********************************************");
		Bike biker7=context27.getBean("bike7", Bike.class);
		System.out.println(biker7);
		System.out.println(biker7.hashCode());
		System.out.println("**********************************************");
		Bike biker8=context27.getBean("bike8", Bike.class);
		System.out.println(biker8);
		System.out.println(biker8.hashCode());
		System.out.println("**********************************************");
		Bike biker9=context27.getBean("bike9", Bike.class);
		System.out.println(biker9);
		System.out.println(biker9.hashCode());
		System.out.println("**********************************************");
		Bike biker10=context27.getBean("bike10", Bike.class);
		System.out.println(biker10);
		System.out.println(biker10.hashCode());
		System.out.println("**********************************************");
		Bike biker11=context27.getBean("bike11", Bike.class);
		System.out.println(biker11);
		System.out.println(biker11.hashCode());
		System.out.println("**********************************************");
		Bike biker12=context27.getBean("bike12", Bike.class);
		System.out.println(biker12);
		System.out.println(biker12.hashCode());
		System.out.println("**********************************************");
		Bike biker13=context27.getBean("bike13", Bike.class);
		System.out.println(biker13);
		System.out.println(biker13.hashCode());
		System.out.println("**********************************************");
		Bike biker14=context27.getBean("bike14", Bike.class);
		System.out.println(biker14);
		System.out.println(biker14.hashCode());
		System.out.println("**********************************************");
		Bike biker15=context27.getBean("bike15", Bike.class);
		System.out.println(biker15);
		System.out.println(biker15.hashCode());
		System.out.println("**********************************************");
		Bike biker16=context27.getBean("bike16", Bike.class);
		System.out.println(biker16);
		System.out.println(biker16.hashCode());
		System.out.println("**********************************************");
		Bike biker17=context27.getBean("bike17", Bike.class);
		System.out.println(biker17);
		System.out.println(biker17.hashCode());
		System.out.println("**********************************************");
		Bike biker18=context27.getBean("bike18", Bike.class);
		System.out.println(biker18);
		System.out.println(biker18.hashCode());
		System.out.println("**********************************************");
		Bike biker19=context27.getBean("bike19", Bike.class);
		System.out.println(biker19);
		System.out.println(biker19.hashCode());
		System.out.println("**********************************************");
		Bike biker20=context27.getBean("bike20", Bike.class);
		System.out.println(biker20);
		System.out.println(biker20.hashCode());
		System.out.println("**********************************************");
		Bike biker21=context27.getBean("bike21", Bike.class);
		System.out.println(biker21);
		System.out.println(biker21.hashCode());
		System.out.println("**********************************************");
		Bike biker22=context27.getBean("bike22", Bike.class);
		System.out.println(biker22);
		System.out.println(biker22.hashCode());
		System.out.println("**********************************************");
		Bike biker23=context27.getBean("bike23", Bike.class);
		System.out.println(biker23);
		System.out.println(biker23.hashCode());
		System.out.println("**********************************************");
		Bike biker24=context27.getBean("bike24", Bike.class);
		System.out.println(biker24);
		System.out.println(biker24.hashCode());
		System.out.println("**********************************************");
		Bike biker25=context27.getBean("bike25", Bike.class);
		System.out.println(biker25);
		System.out.println(biker25.hashCode());
		System.out.println("**********************************************");
		Bike biker26=context27.getBean("bike26", Bike.class);
		System.out.println(biker26);
		System.out.println(biker26.hashCode());
		System.out.println("**********************************************");
		Bike biker27=context27.getBean("bike27", Bike.class);
		System.out.println(biker27);
		System.out.println(biker27.hashCode());
		System.out.println("**********************************************");
		Bike biker28=context27.getBean("bike28", Bike.class);
		System.out.println(biker28);
		System.out.println(biker28.hashCode());
		System.out.println("**********************************************");
		Bike biker29=context27.getBean("bike29", Bike.class);
		System.out.println(biker29);
		System.out.println(biker29.hashCode());
		System.out.println("**********************************************");
		Bike biker30=context27.getBean("bike30", Bike.class);
		System.out.println(biker30);
		System.out.println(biker30.hashCode());
		System.out.println("**********************************************");
		Bike biker31=context27.getBean("bike31", Bike.class);
		System.out.println(biker31);
		System.out.println(biker31.hashCode());
		System.out.println("**********************************************");
		Bike biker32=context27.getBean("bike32", Bike.class);
		System.out.println(biker32);
		System.out.println(biker32.hashCode());
		System.out.println("**********************************************");
		Bike biker33=context27.getBean("bike33", Bike.class);
		System.out.println(biker33);
		System.out.println(biker33.hashCode());
		System.out.println("**********************************************");
		Bike biker34=context27.getBean("bike34", Bike.class);
		System.out.println(biker34);
		System.out.println(biker34.hashCode());
		System.out.println("**********************************************");
		Bike biker35=context27.getBean("bike35", Bike.class);
		System.out.println(biker35);
		System.out.println(biker35.hashCode());
		System.out.println("**********************************************");
		Bike biker36=context27.getBean("bike36", Bike.class);
		System.out.println(biker36);
		System.out.println(biker36.hashCode());
		System.out.println("**********************************************");
		Bike biker37=context27.getBean("bike37", Bike.class);
		System.out.println(biker37);
		System.out.println(biker37.hashCode());
		System.out.println("**********************************************");
		Bike biker38=context27.getBean("bike38", Bike.class);
		System.out.println(biker38);
		System.out.println(biker38.hashCode());
		System.out.println("**********************************************");
		Bike biker39=context27.getBean("bike39", Bike.class);
		System.out.println(biker39);
		System.out.println(biker39.hashCode());
		System.out.println("**********************************************");
		Bike biker40=context27.getBean("bike40", Bike.class);
		System.out.println(biker40);
		System.out.println(biker40.hashCode());
		System.out.println("**********************************************");
		Bike biker41=context27.getBean("bike41", Bike.class);
		System.out.println(biker41);
		System.out.println(biker41.hashCode());
		System.out.println("**********************************************");
		Bike biker42=context27.getBean("bike42", Bike.class);
		System.out.println(biker2);
		System.out.println(biker2.hashCode());
		System.out.println("**********************************************");
		Bike biker43=context27.getBean("bike43", Bike.class);
		System.out.println(biker43);
		System.out.println(biker43.hashCode());
		System.out.println("**********************************************");
		Bike biker44=context27.getBean("bike44", Bike.class);
		System.out.println(biker44);
		System.out.println(biker44.hashCode());
		System.out.println("**********************************************");
		Bike biker45=context27.getBean("bike45", Bike.class);
		System.out.println(biker5);
		System.out.println(biker5.hashCode());
		System.out.println("**********************************************");
		Bike biker46=context27.getBean("bike46", Bike.class);
		System.out.println(biker46);
		System.out.println(biker46.hashCode());
		System.out.println("**********************************************");
		Bike biker47=context27.getBean("bike47", Bike.class);
		System.out.println(biker47);
		System.out.println(biker47.hashCode());
		System.out.println("**********************************************");
		Bike biker48=context27.getBean("bike48", Bike.class);
		System.out.println(biker48);
		System.out.println(biker48.hashCode());
		System.out.println("**********************************************");
		Bike biker49=context27.getBean("bike49", Bike.class);
		System.out.println(biker49);
		System.out.println(biker49.hashCode());
		System.out.println("**********************************************");
		Bike biker50=context27.getBean("bike50", Bike.class);
		System.out.println(biker50);
		System.out.println(biker50.hashCode());
		System.out.println("**********************************************");
		Bike biker51=context27.getBean("bike51", Bike.class);
		System.out.println(biker51);
		System.out.println(biker51.hashCode());
		System.out.println("**********************************************");
		Bike biker52=context27.getBean("bike52", Bike.class);
		System.out.println(biker52);
		System.out.println(biker52.hashCode());
		System.out.println("**********************************************");
		Bike biker53=context27.getBean("bike53", Bike.class);
		System.out.println(biker53);
		System.out.println(biker53.hashCode());
		System.out.println("**********************************************");
		Bike biker54=context27.getBean("bike54", Bike.class);
		System.out.println(biker54);
		System.out.println(biker54.hashCode());
		System.out.println("**********************************************");
		Bike biker55=context27.getBean("bike55", Bike.class);
		System.out.println(biker55);
		System.out.println(biker55.hashCode());
		System.out.println("**********************************************");
		Bike biker56=context27.getBean("bike56", Bike.class);
		System.out.println(biker56);
		System.out.println(biker56.hashCode());
		System.out.println("**********************************************");
		Bike biker57=context27.getBean("bike57", Bike.class);
		System.out.println(biker57);
		System.out.println(biker57.hashCode());
		System.out.println("**********************************************");
		Bike biker58=context27.getBean("bike58", Bike.class);
		System.out.println(biker58);
		System.out.println(biker58.hashCode());
		System.out.println("**********************************************");
		Bike biker59=context27.getBean("bike59", Bike.class);
		System.out.println(biker59);
		System.out.println(biker59.hashCode());
		System.out.println("**********************************************");
		Bike biker60=context27.getBean("bike60", Bike.class);
		System.out.println(biker60);
		System.out.println(biker60.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl1=context27.getBean("hotel1", Hotel.class);
		System.out.println(hotl1);
		System.out.println(hotl1.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl2=context27.getBean("hotel2", Hotel.class);
		System.out.println(hotl2);
		System.out.println(hotl2.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl3=context27.getBean("hotel3", Hotel.class);
		System.out.println(hotl3);
		System.out.println(hotl3.hashCode());
		System.out.println("**********************************************");
		Hotel hotl4=context27.getBean("hotel4", Hotel.class);
		System.out.println(hotl4);
		System.out.println(hotl4.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl5=context27.getBean("hotel5", Hotel.class);
		System.out.println(hotl5);
		System.out.println(hotl5.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl6=context27.getBean("hotel6", Hotel.class);
		System.out.println(hotl6);
		System.out.println(hotl6.hashCode());
		System.out.println("**********************************************");
		Hotel hotl7=context27.getBean("hotel7", Hotel.class);
		System.out.println(hotl7);
		System.out.println(hotl7.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl8=context27.getBean("hotel8", Hotel.class);
		System.out.println(hotl8);
		System.out.println(hotl8.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl9=context27.getBean("hotel9", Hotel.class);
		System.out.println(hotl9);
		System.out.println(hotl9.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl10=context27.getBean("hotel10", Hotel.class);
		System.out.println(hotl10);
		System.out.println(hotl10.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl11=context27.getBean("hotel11", Hotel.class);
		System.out.println(hotl11);
		System.out.println(hotl11.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl12=context27.getBean("hotel12", Hotel.class);
		System.out.println(hotl12);
		System.out.println(hotl12.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl13=context27.getBean("hotel13", Hotel.class);
		System.out.println(hotl13);
		System.out.println(hotl13.hashCode());
		System.out.println("**********************************************");
		Hotel hotl14=context27.getBean("hotel14", Hotel.class);
		System.out.println(hotl14);
		System.out.println(hotl14.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl15=context27.getBean("hotel15", Hotel.class);
		System.out.println(hotl15);
		System.out.println(hotl15.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl16=context27.getBean("hotel16", Hotel.class);
		System.out.println(hotl16);
		System.out.println(hotl16.hashCode());
		System.out.println("**********************************************");
		Hotel hotl17=context27.getBean("hotel17", Hotel.class);
		System.out.println(hotl17);
		System.out.println(hotl17.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl18=context27.getBean("hotel18", Hotel.class);
		System.out.println(hotl18);
		System.out.println(hotl18.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl19=context27.getBean("hotel19", Hotel.class);
		System.out.println(hotl19);
		System.out.println(hotl19.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl20=context27.getBean("hotel20", Hotel.class);
		System.out.println(hotl20);
		System.out.println(hotl20.hashCode());
		System.out.println("**********************************************");

		Hotel hotl21=context27.getBean("hotel21", Hotel.class);
		System.out.println(hotl21);
		System.out.println(hotl21.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl22=context27.getBean("hotel22", Hotel.class);
		System.out.println(hotl22);
		System.out.println(hotl22.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl23=context27.getBean("hotel23", Hotel.class);
		System.out.println(hotl23);
		System.out.println(hotl23.hashCode());
		System.out.println("**********************************************");
		Hotel hotl24=context27.getBean("hotel24", Hotel.class);
		System.out.println(hotl24);
		System.out.println(hotl24.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl25=context27.getBean("hotel25", Hotel.class);
		System.out.println(hotl25);
		System.out.println(hotl25.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl26=context27.getBean("hotel26", Hotel.class);
		System.out.println(hotl26);
		System.out.println(hotl26.hashCode());
		System.out.println("**********************************************");
		Hotel hotl27=context27.getBean("hotel27", Hotel.class);
		System.out.println(hotl27);
		System.out.println(hotl27.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl28=context27.getBean("hotel28", Hotel.class);
		System.out.println(hotl28);
		System.out.println(hotl28.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl29=context27.getBean("hotel29", Hotel.class);
		System.out.println(hotl29);
		System.out.println(hotl29.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl30=context27.getBean("hotel30", Hotel.class);
		System.out.println(hotl30);
		System.out.println(hotl30.hashCode());
		System.out.println("**********************************************");

		Hotel hotl31=context27.getBean("hotel31", Hotel.class);
		System.out.println(hotl31);
		System.out.println(hotl31.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl32=context27.getBean("hotel32", Hotel.class);
		System.out.println(hotl32);
		System.out.println(hotl32.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl33=context27.getBean("hotel33", Hotel.class);
		System.out.println(hotl33);
		System.out.println(hotl33.hashCode());
		System.out.println("**********************************************");
		Hotel hotl34=context27.getBean("hotel34", Hotel.class);
		System.out.println(hotl34);
		System.out.println(hotl34.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl35=context27.getBean("hotel35", Hotel.class);
		System.out.println(hotl35);
		System.out.println(hotl35.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl36=context27.getBean("hotel36", Hotel.class);
		System.out.println(hotl36);
		System.out.println(hotl36.hashCode());
		System.out.println("**********************************************");
		Hotel hotl37=context27.getBean("hotel37", Hotel.class);
		System.out.println(hotl37);
		System.out.println(hotl37.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl38=context27.getBean("hotel38", Hotel.class);
		System.out.println(hotl38);
		System.out.println(hotl38.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl39=context27.getBean("hotel39", Hotel.class);
		System.out.println(hotl39);
		System.out.println(hotl39.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl40=context27.getBean("hotel40", Hotel.class);
		System.out.println(hotl40);
		System.out.println(hotl40.hashCode());
		System.out.println("**********************************************");

		Hotel hotl41=context27.getBean("hotel41", Hotel.class);
		System.out.println(hotl41);
		System.out.println(hotl41.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl42=context27.getBean("hotel42", Hotel.class);
		System.out.println(hotl42);
		System.out.println(hotl42.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl43=context27.getBean("hotel43", Hotel.class);
		System.out.println(hotl43);
		System.out.println(hotl43.hashCode());
		System.out.println("**********************************************");
		Hotel hotl44=context27.getBean("hotel44", Hotel.class);
		System.out.println(hotl44);
		System.out.println(hotl44.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl45=context27.getBean("hotel45", Hotel.class);
		System.out.println(hotl45);
		System.out.println(hotl45.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl46=context27.getBean("hotel46", Hotel.class);
		System.out.println(hotl46);
		System.out.println(hotl46.hashCode());
		System.out.println("**********************************************");
		Hotel hotl47=context27.getBean("hotel47", Hotel.class);
		System.out.println(hotl47);
		System.out.println(hotl47.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl48=context27.getBean("hotel48", Hotel.class);
		System.out.println(hotl48);
		System.out.println(hotl48.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl49=context27.getBean("hotel49", Hotel.class);
		System.out.println(hotl49);
		System.out.println(hotl49.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl50=context27.getBean("hotel50", Hotel.class);
		System.out.println(hotl50);
		System.out.println(hotl50.hashCode());
		System.out.println("**********************************************");

		Hotel hotl51=context27.getBean("hotel51", Hotel.class);
		System.out.println(hotl51);
		System.out.println(hotl51.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl52=context27.getBean("hotel52", Hotel.class);
		System.out.println(hotl52);
		System.out.println(hotl52.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl53=context27.getBean("hotel53", Hotel.class);
		System.out.println(hotl53);
		System.out.println(hotl53.hashCode());
		System.out.println("**********************************************");
		Hotel hotl54=context27.getBean("hotel54", Hotel.class);
		System.out.println(hotl54);
		System.out.println(hotl54.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl55=context27.getBean("hotel55", Hotel.class);
		System.out.println(hotl55);
		System.out.println(hotl55.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl56=context27.getBean("hotel56", Hotel.class);
		System.out.println(hotl56);
		System.out.println(hotl56.hashCode());
		System.out.println("**********************************************");
		Hotel hotl57=context27.getBean("hotel57", Hotel.class);
		System.out.println(hotl57);
		System.out.println(hotl57.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl58=context27.getBean("hotel58", Hotel.class);
		System.out.println(hotl58);
		System.out.println(hotl58.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl59=context27.getBean("hotel59", Hotel.class);
		System.out.println(hotl59);
		System.out.println(hotl59.hashCode());
		System.out.println("**********************************************");
		
		Hotel hotl60=context27.getBean("hotel60", Hotel.class);
		System.out.println(hotl60);
		System.out.println(hotl60.hashCode());
		System.out.println("**********************************************");
		
		
		
		Park shotl1=context27.getBean("park1", Park.class);
		System.out.println(shotl1);
		System.out.println(shotl1.hashCode());
		System.out.println("**********************************************");
		
		Park shotl2=context27.getBean("park2", Park.class);
		System.out.println(shotl2);
		System.out.println(shotl2.hashCode());
		System.out.println("**********************************************");
		
		Park shotl3=context27.getBean("park3", Park.class);
		System.out.println(shotl3);
		System.out.println(shotl3.hashCode());
		System.out.println("**********************************************");
		Park shotl4=context27.getBean("park4", Park.class);
		System.out.println(shotl4);
		System.out.println(shotl4.hashCode());
		System.out.println("**********************************************");
		
		Park shotl5=context27.getBean("park5", Park.class);
		System.out.println(shotl5);
		System.out.println(shotl5.hashCode());
		System.out.println("**********************************************");
		
		Park shotl6=context27.getBean("park6", Park.class);
		System.out.println(shotl6);
		System.out.println(shotl6.hashCode());
		System.out.println("**********************************************");
		Park shotl7=context27.getBean("park7", Park.class);
		System.out.println(shotl7);
		System.out.println(shotl7.hashCode());
		System.out.println("**********************************************");
		
		Park shotl8=context27.getBean("park8", Park.class);
		System.out.println(shotl8);
		System.out.println(shotl8.hashCode());
		System.out.println("**********************************************");
		
		Park shotl9=context27.getBean("park9", Park.class);
		System.out.println(shotl9);
		System.out.println(shotl9.hashCode());
		System.out.println("**********************************************");
		
		Park shotl10=context27.getBean("park10", Park.class);
		System.out.println(shotl10);
		System.out.println(shotl10.hashCode());
		System.out.println("**********************************************");
		
		Park shotl11=context27.getBean("park11", Park.class);
		System.out.println(shotl11);
		System.out.println(shotl11.hashCode());
		System.out.println("**********************************************");
		
		Park shotl12=context27.getBean("park12", Park.class);
		System.out.println(shotl12);
		System.out.println(shotl12.hashCode());
		System.out.println("**********************************************");
		
		Park shotl13=context27.getBean("park13", Park.class);
		System.out.println(shotl13);
		System.out.println(shotl13.hashCode());
		System.out.println("**********************************************");
		Park shotl14=context27.getBean("park14", Park.class);
		System.out.println(shotl14);
		System.out.println(shotl14.hashCode());
		System.out.println("**********************************************");
		
		Park shotl15=context27.getBean("park15", Park.class);
		System.out.println(shotl15);
		System.out.println(shotl15.hashCode());
		System.out.println("**********************************************");
		
		Park shotl16=context27.getBean("park16", Park.class);
		System.out.println(shotl16);
		System.out.println(shotl16.hashCode());
		System.out.println("**********************************************");
		Park shotl17=context27.getBean("park17", Park.class);
		System.out.println(shotl17);
		System.out.println(shotl17.hashCode());
		System.out.println("**********************************************");
		
		Park shotl18=context27.getBean("park18", Park.class);
		System.out.println(shotl18);
		System.out.println(shotl18.hashCode());
		System.out.println("**********************************************");
		
		Park shotl19=context27.getBean("park19", Park.class);
		System.out.println(shotl19);
		System.out.println(shotl19.hashCode());
		System.out.println("**********************************************");
		
		Park shotl20=context27.getBean("park20", Park.class);
		System.out.println(shotl20);
		System.out.println(shotl20.hashCode());
		System.out.println("**********************************************");

		Park shotl21=context27.getBean("park21", Park.class);
		System.out.println(shotl21);
		System.out.println(shotl21.hashCode());
		System.out.println("**********************************************");
		
		Park shotl22=context27.getBean("park22", Park.class);
		System.out.println(shotl22);
		System.out.println(shotl22.hashCode());
		System.out.println("**********************************************");
		
		Park shotl23=context27.getBean("park23", Park.class);
		System.out.println(shotl23);
		System.out.println(shotl23.hashCode());
		System.out.println("**********************************************");
		Park shotl24=context27.getBean("park24", Park.class);
		System.out.println(shotl24);
		System.out.println(shotl24.hashCode());
		System.out.println("**********************************************");
		
		Park shotl25=context27.getBean("park25", Park.class);
		System.out.println(shotl25);
		System.out.println(shotl25.hashCode());
		System.out.println("**********************************************");
		
		Park shotl26=context27.getBean("park26", Park.class);
		System.out.println(shotl26);
		System.out.println(shotl26.hashCode());
		System.out.println("**********************************************");
		Park shotl27=context27.getBean("park27", Park.class);
		System.out.println(shotl27);
		System.out.println(shotl27.hashCode());
		System.out.println("**********************************************");
		
		Park shotl28=context27.getBean("park28", Park.class);
		System.out.println(shotl28);
		System.out.println(shotl28.hashCode());
		System.out.println("**********************************************");
		
		Park shotl29=context27.getBean("park29", Park.class);
		System.out.println(shotl29);
		System.out.println(shotl29.hashCode());
		System.out.println("**********************************************");
		
		Park shotl30=context27.getBean("park30", Park.class);
		System.out.println(shotl30);
		System.out.println(shotl30.hashCode());
		System.out.println("**********************************************");

		Park shotl31=context27.getBean("park31", Park.class);
		System.out.println(shotl31);
		System.out.println(shotl31.hashCode());
		System.out.println("**********************************************");
		
		Park shotl32=context27.getBean("park32", Park.class);
		System.out.println(shotl32);
		System.out.println(shotl32.hashCode());
		System.out.println("**********************************************");
		
		Park shotl33=context27.getBean("park33", Park.class);
		System.out.println(shotl33);
		System.out.println(shotl33.hashCode());
		System.out.println("**********************************************");
		Park shotl34=context27.getBean("park34", Park.class);
		System.out.println(shotl34);
		System.out.println(shotl34.hashCode());
		System.out.println("**********************************************");
		
		Park shotl35=context27.getBean("park35", Park.class);
		System.out.println(shotl35);
		System.out.println(shotl35.hashCode());
		System.out.println("**********************************************");
		
		Park shotl36=context27.getBean("park36", Park.class);
		System.out.println(shotl36);
		System.out.println(shotl36.hashCode());
		System.out.println("**********************************************");
		Park shotl37=context27.getBean("park37", Park.class);
		System.out.println(shotl37);
		System.out.println(shotl37.hashCode());
		System.out.println("**********************************************");
		
		Park shotl38=context27.getBean("park38", Park.class);
		System.out.println(shotl38);
		System.out.println(shotl38.hashCode());
		System.out.println("**********************************************");
		
		Park shotl39=context27.getBean("park39", Park.class);
		System.out.println(shotl39);
		System.out.println(shotl39.hashCode());
		System.out.println("**********************************************");
		
		Park shotl40=context27.getBean("park40", Park.class);
		System.out.println(shotl40);
		System.out.println(shotl40.hashCode());
		System.out.println("**********************************************");

		Park shotl41=context27.getBean("park41", Park.class);
		System.out.println(shotl41);
		System.out.println(shotl41.hashCode());
		System.out.println("**********************************************");
		
		Park shotl42=context27.getBean("park42", Park.class);
		System.out.println(shotl42);
		System.out.println(shotl42.hashCode());
		System.out.println("**********************************************");
		
		Park shotl43=context27.getBean("park43", Park.class);
		System.out.println(shotl43);
		System.out.println(shotl43.hashCode());
		System.out.println("**********************************************");
		Park shotl44=context27.getBean("park44", Park.class);
		System.out.println(shotl44);
		System.out.println(shotl44.hashCode());
		System.out.println("**********************************************");
		
		Park shotl45=context27.getBean("park45", Park.class);
		System.out.println(shotl45);
		System.out.println(shotl45.hashCode());
		System.out.println("**********************************************");
		
		Park shotl46=context27.getBean("park46", Park.class);
		System.out.println(shotl46);
		System.out.println(shotl46.hashCode());
		System.out.println("**********************************************");
		Park shotl47=context27.getBean("park47", Park.class);
		System.out.println(shotl47);
		System.out.println(shotl47.hashCode());
		System.out.println("**********************************************");
		
		Park shotl48=context27.getBean("park48", Park.class);
		System.out.println(shotl48);
		System.out.println(shotl48.hashCode());
		System.out.println("**********************************************");
		
		Park shotl49=context27.getBean("park49", Park.class);
		System.out.println(shotl49);
		System.out.println(shotl49.hashCode());
		System.out.println("**********************************************");
		
		Park shotl50=context27.getBean("park50", Park.class);
		System.out.println(shotl50);
		System.out.println(shotl50.hashCode());
		System.out.println("**********************************************");

		Park shotl51=context27.getBean("park51", Park.class);
		System.out.println(shotl51);
		System.out.println(shotl51.hashCode());
		System.out.println("**********************************************");
		
		Park shotl52=context27.getBean("park52", Park.class);
		System.out.println(shotl52);
		System.out.println(shotl52.hashCode());
		System.out.println("**********************************************");
		
		Park shotl53=context27.getBean("park53", Park.class);
		System.out.println(shotl53);
		System.out.println(shotl53.hashCode());
		System.out.println("**********************************************");
		Park shotl54=context27.getBean("park54", Park.class);
		System.out.println(shotl54);
		System.out.println(shotl54.hashCode());
		System.out.println("**********************************************");
		
		Park shotl55=context27.getBean("park55", Park.class);
		System.out.println(shotl55);
		System.out.println(shotl55.hashCode());
		System.out.println("**********************************************");
		
		Park shotl56=context27.getBean("park56", Park.class);
		System.out.println(shotl56);
		System.out.println(shotl56.hashCode());
		System.out.println("**********************************************");
		Park shotl57=context27.getBean("park57", Park.class);
		System.out.println(shotl57);
		System.out.println(shotl57.hashCode());
		System.out.println("**********************************************");
		
		Park shotl58=context27.getBean("park58", Park.class);
		System.out.println(shotl58);
		System.out.println(shotl58.hashCode());
		System.out.println("**********************************************");
		
		Park shotl59=context27.getBean("park59", Park.class);
		System.out.println(shotl59);
		System.out.println(shotl59.hashCode());
		System.out.println("**********************************************");
		
		Park shotl60=context27.getBean("park60", Park.class);
		System.out.println(shotl60);
		System.out.println(shotl60.hashCode());
		System.out.println("**********************************************");
		
		Film shotl601=context27.getBean("film1", Film.class);
		System.out.println(shotl601);
		System.out.println(shotl601.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl2=context27.getBean("film2", Film.class);
		System.out.println(sshotl2);
		System.out.println(sshotl2.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl3=context27.getBean("film3", Film.class);
		System.out.println(sshotl3);
		System.out.println(sshotl3.hashCode());
		System.out.println("**********************************************");
		Film sshotl4=context27.getBean("film4", Film.class);
		System.out.println(sshotl4);
		System.out.println(sshotl4.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl5=context27.getBean("film5", Film.class);
		System.out.println(sshotl5);
		System.out.println(sshotl5.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl6=context27.getBean("film6", Film.class);
		System.out.println(sshotl6);
		System.out.println(sshotl6.hashCode());
		System.out.println("**********************************************");
		Film sshotl7=context27.getBean("film7", Film.class);
		System.out.println(sshotl7);
		System.out.println(sshotl7.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl8=context27.getBean("film8", Film.class);
		System.out.println(sshotl8);
		System.out.println(sshotl8.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl9=context27.getBean("film9", Film.class);
		System.out.println(sshotl9);
		System.out.println(sshotl9.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl10=context27.getBean("film10", Film.class);
		System.out.println(sshotl10);
		System.out.println(sshotl10.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl11=context27.getBean("film11", Film.class);
		System.out.println(sshotl11);
		System.out.println(sshotl11.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl12=context27.getBean("film12", Film.class);
		System.out.println(sshotl12);
		System.out.println(sshotl12.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl13=context27.getBean("film13", Film.class);
		System.out.println(sshotl13);
		System.out.println(sshotl13.hashCode());
		System.out.println("**********************************************");
		Film sshotl14=context27.getBean("film14", Film.class);
		System.out.println(sshotl14);
		System.out.println(sshotl14.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl15=context27.getBean("film15", Film.class);
		System.out.println(sshotl15);
		System.out.println(sshotl15.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl16=context27.getBean("film16", Film.class);
		System.out.println(sshotl16);
		System.out.println(sshotl16.hashCode());
		System.out.println("**********************************************");
		Film sshotl17=context27.getBean("film17", Film.class);
		System.out.println(sshotl17);
		System.out.println(sshotl17.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl18=context27.getBean("film18", Film.class);
		System.out.println(sshotl18);
		System.out.println(sshotl18.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl19=context27.getBean("film19", Film.class);
		System.out.println(sshotl19);
		System.out.println(sshotl19.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl20=context27.getBean("film20", Film.class);
		System.out.println(sshotl20);
		System.out.println(sshotl20.hashCode());
		System.out.println("**********************************************");

		Film sshotl21=context27.getBean("film21", Film.class);
		System.out.println(sshotl21);
		System.out.println(sshotl21.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl22=context27.getBean("film22", Film.class);
		System.out.println(sshotl22);
		System.out.println(sshotl22.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl23=context27.getBean("film23", Film.class);
		System.out.println(sshotl23);
		System.out.println(sshotl23.hashCode());
		System.out.println("**********************************************");
		Film sshotl24=context27.getBean("film24", Film.class);
		System.out.println(sshotl24);
		System.out.println(sshotl24.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl25=context27.getBean("film25", Film.class);
		System.out.println(sshotl25);
		System.out.println(sshotl25.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl26=context27.getBean("film26", Film.class);
		System.out.println(sshotl26);
		System.out.println(sshotl26.hashCode());
		System.out.println("**********************************************");
		Film sshotl27=context27.getBean("film27", Film.class);
		System.out.println(sshotl27);
		System.out.println(sshotl27.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl28=context27.getBean("film28", Film.class);
		System.out.println(sshotl28);
		System.out.println(sshotl28.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl29=context27.getBean("film29", Film.class);
		System.out.println(sshotl29);
		System.out.println(sshotl29.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl30=context27.getBean("film30", Film.class);
		System.out.println(sshotl30);
		System.out.println(sshotl30.hashCode());
		System.out.println("**********************************************");

		Film sshotl31=context27.getBean("film31", Film.class);
		System.out.println(sshotl31);
		System.out.println(sshotl31.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl32=context27.getBean("film32", Film.class);
		System.out.println(sshotl32);
		System.out.println(sshotl32.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl33=context27.getBean("film33", Film.class);
		System.out.println(sshotl33);
		System.out.println(sshotl33.hashCode());
		System.out.println("**********************************************");
		Film sshotl34=context27.getBean("film34", Film.class);
		System.out.println(sshotl34);
		System.out.println(sshotl34.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl35=context27.getBean("film35", Film.class);
		System.out.println(sshotl35);
		System.out.println(sshotl35.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl36=context27.getBean("film36", Film.class);
		System.out.println(sshotl36);
		System.out.println(sshotl36.hashCode());
		System.out.println("**********************************************");
		Film sshotl37=context27.getBean("film37", Film.class);
		System.out.println(sshotl37);
		System.out.println(sshotl37.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl38=context27.getBean("film38", Film.class);
		System.out.println(sshotl38);
		System.out.println(sshotl38.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl39=context27.getBean("film39", Film.class);
		System.out.println(sshotl39);
		System.out.println(sshotl39.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl40=context27.getBean("film40", Film.class);
		System.out.println(sshotl40);
		System.out.println(sshotl40.hashCode());
		System.out.println("**********************************************");

		Film sshotl41=context27.getBean("film41", Film.class);
		System.out.println(sshotl41);
		System.out.println(sshotl41.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl42=context27.getBean("film42", Film.class);
		System.out.println(sshotl42);
		System.out.println(sshotl42.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl43=context27.getBean("film43", Film.class);
		System.out.println(sshotl43);
		System.out.println(sshotl43.hashCode());
		System.out.println("**********************************************");
		Film sshotl44=context27.getBean("film44", Film.class);
		System.out.println(sshotl44);
		System.out.println(sshotl44.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl45=context27.getBean("film45", Film.class);
		System.out.println(sshotl45);
		System.out.println(sshotl45.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl46=context27.getBean("film46", Film.class);
		System.out.println(sshotl46);
		System.out.println(sshotl46.hashCode());
		System.out.println("**********************************************");
		Film sshotl47=context27.getBean("film47", Film.class);
		System.out.println(sshotl47);
		System.out.println(sshotl47.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl48=context27.getBean("film48", Film.class);
		System.out.println(sshotl48);
		System.out.println(sshotl48.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl49=context27.getBean("film49", Film.class);
		System.out.println(sshotl49);
		System.out.println(sshotl49.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl50=context27.getBean("film50", Film.class);
		System.out.println(sshotl50);
		System.out.println(sshotl50.hashCode());
		System.out.println("**********************************************");

		Film sshotl51=context27.getBean("film51", Film.class);
		System.out.println(sshotl51);
		System.out.println(sshotl51.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl52=context27.getBean("film52", Film.class);
		System.out.println(sshotl52);
		System.out.println(sshotl52.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl53=context27.getBean("film53", Film.class);
		System.out.println(sshotl53);
		System.out.println(sshotl53.hashCode());
		System.out.println("**********************************************");
		Film sshotl54=context27.getBean("film54", Film.class);
		System.out.println(sshotl54);
		System.out.println(sshotl54.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl55=context27.getBean("film55", Film.class);
		System.out.println(sshotl55);
		System.out.println(sshotl55.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl56=context27.getBean("film56", Film.class);
		System.out.println(sshotl56);
		System.out.println(sshotl56.hashCode());
		System.out.println("**********************************************");
		Film sshotl57=context27.getBean("film57", Film.class);
		System.out.println(sshotl57);
		System.out.println(sshotl57.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl58=context27.getBean("film58", Film.class);
		System.out.println(sshotl58);
		System.out.println(sshotl58.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl59=context27.getBean("film59", Film.class);
		System.out.println(sshotl59);
		System.out.println(sshotl59.hashCode());
		System.out.println("**********************************************");
		
		Film sshotl60=context27.getBean("film60", Film.class);
		System.out.println(sshotl60);
		System.out.println(sshotl60.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl21=context27.getBean("film61", Film.class);
		System.out.println(ssshotl21);
		System.out.println(ssshotl21.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl22=context27.getBean("film62", Film.class);
		System.out.println(ssshotl22);
		System.out.println(ssshotl22.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl23=context27.getBean("film63", Film.class);
		System.out.println(ssshotl23);
		System.out.println(ssshotl23.hashCode());
		System.out.println("**********************************************");
		Film ssshotl24=context27.getBean("film64", Film.class);
		System.out.println(ssshotl24);
		System.out.println(ssshotl24.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl25=context27.getBean("film65", Film.class);
		System.out.println(ssshotl25);
		System.out.println(ssshotl25.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl26=context27.getBean("film66", Film.class);
		System.out.println(ssshotl26);
		System.out.println(ssshotl26.hashCode());
		System.out.println("**********************************************");
		Film ssshotl27=context27.getBean("film67", Film.class);
		System.out.println(ssshotl27);
		System.out.println(ssshotl27.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl28=context27.getBean("film68", Film.class);
		System.out.println(ssshotl28);
		System.out.println(ssshotl28.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl29=context27.getBean("film69", Film.class);
		System.out.println(ssshotl29);
		System.out.println(ssshotl29.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl30=context27.getBean("film70", Film.class);
		System.out.println(ssshotl30);
		System.out.println(ssshotl30.hashCode());
		System.out.println("**********************************************");

		Film ssshotl31=context27.getBean("film71", Film.class);
		System.out.println(ssshotl31);
		System.out.println(ssshotl31.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl32=context27.getBean("film72", Film.class);
		System.out.println(ssshotl32);
		System.out.println(ssshotl32.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl33=context27.getBean("film73", Film.class);
		System.out.println(ssshotl33);
		System.out.println(ssshotl33.hashCode());
		System.out.println("**********************************************");
		Film ssshotl34=context27.getBean("film74", Film.class);
		System.out.println(ssshotl34);
		System.out.println(ssshotl34.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl35=context27.getBean("film75", Film.class);
		System.out.println(ssshotl35);
		System.out.println(ssshotl35.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl36=context27.getBean("film76", Film.class);
		System.out.println(ssshotl36);
		System.out.println(ssshotl36.hashCode());
		System.out.println("**********************************************");
		Film ssshotl37=context27.getBean("film77", Film.class);
		System.out.println(ssshotl37);
		System.out.println(ssshotl37.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl38=context27.getBean("film78", Film.class);
		System.out.println(sshotl38);
		System.out.println(ssshotl38.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl39=context27.getBean("film79", Film.class);
		System.out.println(ssshotl39);
		System.out.println(ssshotl39.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl40=context27.getBean("film80", Film.class);
		System.out.println(ssshotl40);
		System.out.println(ssshotl40.hashCode());
		System.out.println("**********************************************");

		Film ssshotl41=context27.getBean("film81", Film.class);
		System.out.println(ssshotl41);
		System.out.println(ssshotl41.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl42=context27.getBean("film82", Film.class);
		System.out.println(ssshotl42);
		System.out.println(ssshotl42.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl43=context27.getBean("film83", Film.class);
		System.out.println(ssshotl43);
		System.out.println(ssshotl43.hashCode());
		System.out.println("**********************************************");
		Film ssshotl44=context27.getBean("film84", Film.class);
		System.out.println(ssshotl44);
		System.out.println(ssshotl44.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl45=context27.getBean("film85", Film.class);
		System.out.println(ssshotl45);
		System.out.println(ssshotl45.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl46=context27.getBean("film86", Film.class);
		System.out.println(ssshotl46);
		System.out.println(ssshotl46.hashCode());
		System.out.println("**********************************************");
		Film ssshotl47=context27.getBean("film87", Film.class);
		System.out.println(ssshotl47);
		System.out.println(ssshotl47.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl48=context27.getBean("film88", Film.class);
		System.out.println(ssshotl48);
		System.out.println(ssshotl48.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl49=context27.getBean("film89", Film.class);
		System.out.println(ssshotl49);
		System.out.println(ssshotl49.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl50=context27.getBean("film90", Film.class);
		System.out.println(ssshotl50);
		System.out.println(ssshotl50.hashCode());
		System.out.println("**********************************************");

		Film ssshotl51=context27.getBean("film91", Film.class);
		System.out.println(ssshotl51);
		System.out.println(ssshotl51.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl52=context27.getBean("film92", Film.class);
		System.out.println(ssshotl52);
		System.out.println(ssshotl52.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl53=context27.getBean("film93", Film.class);
		System.out.println(ssshotl53);
		System.out.println(ssshotl53.hashCode());
		System.out.println("**********************************************");
		Film ssshotl54=context27.getBean("film94", Film.class);
		System.out.println(ssshotl54);
		System.out.println(ssshotl54.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl55=context27.getBean("film95", Film.class);
		System.out.println(ssshotl55);
		System.out.println(ssshotl55.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl56=context27.getBean("film96", Film.class);
		System.out.println(ssshotl56);
		System.out.println(ssshotl56.hashCode());
		System.out.println("**********************************************");
		Film ssshotl57=context27.getBean("film97", Film.class);
		System.out.println(ssshotl57);
		System.out.println(ssshotl57.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl58=context27.getBean("film98", Film.class);
		System.out.println(ssshotl58);
		System.out.println(ssshotl58.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl59=context27.getBean("film99", Film.class);
		System.out.println(ssshotl59);
		System.out.println(ssshotl59.hashCode());
		System.out.println("**********************************************");
		
		Film ssshotl60=context27.getBean("film100", Film.class);
		System.out.println(ssshotl60);
		System.out.println(ssshotl60.hashCode());
		System.out.println("**********************************************");
		
	}

}
