package com.xworkz.lambdaPractice.Runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.lambdaPractice.DTO.*;
import com.xworkz.lambdaPractice.enums.*;


public class HouseRunner {

	public static void main(String[] args) {

		
		HouseDTO houseDTO1=new HouseDTO(1,"Balaji Nilaya","Raghu",Type.APARTMENT,10,true,OwningType.LEASE,2000);
		HouseDTO houseDTO2=new HouseDTO(2,"Govinda Nilaya","DadaSingh",Type.INDIVIDUAL,20,false,OwningType.OWN,1000);
		HouseDTO houseDTO3=new HouseDTO(3,"Janaki ","Maltesh",Type.VILLA,15,true,OwningType.OWN,800);
		HouseDTO houseDTO4=new HouseDTO(4,"Vishnu Nilaya","Dyamannna",Type.APARTMENT,40,true,OwningType.RENT,600);
		HouseDTO houseDTO5=new HouseDTO(5,"Mahanta Nilaya","Basu",Type.INDIVIDUAL,30,false,OwningType.LEASE,1200);
		HouseDTO houseDTO6=new HouseDTO(6,"Shankar ","Abhi",Type.APARTMENT,20,true,OwningType.OWN,800);
		HouseDTO houseDTO7=new HouseDTO(7,"Gouri Nilaya","Prajwal",Type.VILLA,30,true,OwningType.LEASE,1200);
		HouseDTO houseDTO8=new HouseDTO(8,"Renuka ","Hanamant",Type.APARTMENT,10,false,OwningType.RENT,600);
		HouseDTO houseDTO9=new HouseDTO(9,"Karuna Nilaya","Manoj",Type.INDIVIDUAL,10,true,OwningType.OWN,2000);
		HouseDTO houseDTO10=new HouseDTO(10,"Kartik ","Nandan",Type.APARTMENT,10,true,OwningType.LEASE,2000);
		HouseDTO houseDTO11=new HouseDTO(11,"Geeta Nilaya","Nayana",Type.VILLA,15,false,OwningType.RENT,1200);
		HouseDTO houseDTO12=new HouseDTO(12,"Shobha Nilaya","Kaveri",Type.INDIVIDUAL,10,true,OwningType.LEASE,600);
		HouseDTO houseDTO13=new HouseDTO(13,"Manjula ","Geeta",Type.APARTMENT,20,false,OwningType.OWN,800);
		HouseDTO houseDTO14=new HouseDTO(14,"Bharati Nilaya","Priya",Type.APARTMENT,10,false,OwningType.LEASE,1200);
		HouseDTO houseDTO15=new HouseDTO(15,"Pankaj Nilaya","Shakira",Type.VILLA,10,true,OwningType.RENT,800);
		HouseDTO houseDTO16=new HouseDTO(16,"Ankita ","Santosh",Type.INDIVIDUAL,15,true,OwningType.OWN,600);
		HouseDTO houseDTO17=new HouseDTO(17,"Shastri Nilaya","Veer Pratap",Type.APARTMENT,10,true,OwningType.LEASE,800);
		HouseDTO houseDTO18=new HouseDTO(18,"Darshan ","Pankaj",Type.VILLA,20,false,OwningType.RENT,2000);
		HouseDTO houseDTO19=new HouseDTO(19,"Ganesh Nilaya","Nagesh",Type.APARTMENT,15,false,OwningType.OWN,1200);
		HouseDTO houseDTO20=new HouseDTO(20,"Suhas ","Ganesh",Type.INDIVIDUAL,20,false,OwningType.LEASE,600);
		
		List<HouseDTO> houseDTOs= new ArrayList<HouseDTO>();
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO15);
		houseDTOs.add(houseDTO18);
		houseDTOs.add(houseDTO12);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO13);
		houseDTOs.add(houseDTO19);
		houseDTOs.add(houseDTO11);
		houseDTOs.add(houseDTO20);
		houseDTOs.add(houseDTO17);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO14);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO16);
		houseDTOs.add(houseDTO3);
		
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" sort asc by id ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->{ return Integer.compare(d1.getId(), d2.getId());}).forEach((ref)-> System.out.println(ref));
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" sort desc by id ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->{ return Integer.compare(d2.getId(), d1.getId());}).forEach((ref)-> System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" sort asc by name ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->d1.getName().compareTo(d2.getName())).forEach((ref)-> System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" sort desc by type ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->d2.getType().compareTo(d1.getType())).forEach((ref)-> System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" sort desc by sqfeet ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->{ return Double.compare(d2.getSqFeet(), d1.getSqFeet());}).forEach((ref)-> System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements with loan and  sort desc by owner ");
		System.out.println();
		houseDTOs.stream().filter((ref)-> ref.isLoan()).sorted((d1,d2)->d2.getOwner().compareTo(d1.getOwner())).forEach((ref)-> System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements with out loan and  sort desc by owner ");
		System.out.println();
		houseDTOs.stream().filter((ref)-> !ref.isLoan()).sorted((d1,d2)->d2.getOwner().compareTo(d1.getOwner())).forEach((ref)-> System.out.println(ref));
		
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements with owning type is LEASE ");
		System.out.println();
		houseDTOs.stream().filter((ref)->ref.getOt() == OwningType.LEASE).forEach((ref)-> System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements with type is APARTMENT ");
		System.out.println();
		houseDTOs.stream().filter((ref)-> ref.getType()==Type.APARTMENT ).forEach((ref)->System.out.println(ref));
		
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements with type is VILLA ");
		System.out.println();
		houseDTOs.stream().filter((ref)->ref.getType()==Type.VILLA).forEach((ref)-> System.out.println(ref));
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements order by type and Owning Type asc  ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->d1.getType().compareTo(d2.getType())).sorted((d1,d2)->d1.getOt().compareTo(d2.getOt())).forEach((ref)-> System.out.println(ref));
		
	
		System.out.println();
		System.out.println("********************************************");
		System.out.println();
		System.out.println(" all elements order by name and id desc  ");
		System.out.println();
		houseDTOs.stream().sorted((d1,d2)->d1.getName().compareTo(d2.getName())).sorted((d1,d2)->{ return Integer.compare(d2.getId(), d1.getId());}).forEach((ref)-> System.out.println(ref));
		
	}

}
