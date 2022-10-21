package com.xworkz.jdbcStart.runner;

import com.xworkz.jdbcStart.dto.HospitalDTO;
import com.xworkz.jdbcStart.service.HospitalServiceImplementor;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hdto = new HospitalDTO(1, "Kulgod", "Orthopedic", 12.00);
		HospitalDTO hdto2 = new HospitalDTO(2, "Shreya", "General", 13.00);
		HospitalDTO hdto3 = new HospitalDTO(3, "Jay Ram", "Cardiac", 16.00);
		HospitalDTO hdto4 = new HospitalDTO(4, "Venu", "ENT", 10.00);
		HospitalDTO hdto5 = new HospitalDTO(5, "Konimani", "Orthopedic", 12.00);
		HospitalDTO hdto6 = new HospitalDTO(6, "Mallayya", "General", 16.00);
		HospitalDTO hdto7 = new HospitalDTO(7, "Shetty", "Cardiac", 18.00);
		HospitalDTO hdto8 = new HospitalDTO(8, "Tippu", "ENT", 12.00);
		HospitalDTO hdto9 = new HospitalDTO(9, "Delhi", "General", 10.00);
		HospitalDTO hdto10 = new HospitalDTO(10, "Indira Gandhi", "ENT", 11.00);
		HospitalDTO hdto11 = new HospitalDTO(11, "Manipal", "Cardiac", 11.00);
		HospitalDTO hdto12 = new HospitalDTO(12, "Suhas", "ENT", 13.00);
		HospitalDTO hdto13 = new HospitalDTO(13, "Karidigudda", "General", 17.00);
		HospitalDTO hdto14 = new HospitalDTO(14, "BTM", "Orthopedic", 18.00);
		HospitalDTO hdto15 = new HospitalDTO(15, "Srinagar", "Cardiac", 19.00);
		HospitalDTO hdto16 = new HospitalDTO(16, "Kengeri", "General", 14.00);
		HospitalDTO hdto17 = new HospitalDTO(17, "Kavita", "ENT", 15.00);
		HospitalDTO hdto18 = new HospitalDTO(18, "Harsh", "Cardiac", 13.00);
		HospitalDTO hdto19 = new HospitalDTO(19, "Maldive", "General", 12.00);
		HospitalDTO hdto20 = new HospitalDTO(20, "Sudha", "ENT", 11.00);
		HospitalDTO hdto21 = new HospitalDTO(21, "Melinamani", "Cardiac", 09.00);
		HospitalDTO hdto22= new HospitalDTO(22, "Kambibai", "General", 12.00);
	
		
		
		

		HospitalServiceImplementor hsi = new HospitalServiceImplementor();
		hsi.validateAndSave(hdto);
		hsi.validateAndSave(hdto2);
		hsi.validateAndSave(hdto3);
		hsi.validateAndSave(hdto4);
		hsi.validateAndSave(hdto5);
		hsi.validateAndSave(hdto6);
		hsi.validateAndSave(hdto7);
		hsi.validateAndSave(hdto8);
		hsi.validateAndSave(hdto9);
		hsi.validateAndSave(hdto10);
		hsi.validateAndSave(hdto11);
		hsi.validateAndSave(hdto12);
		hsi.validateAndSave(hdto13);
		hsi.validateAndSave(hdto14);
		hsi.validateAndSave(hdto15);
		hsi.validateAndSave(hdto16);
		hsi.validateAndSave(hdto17);
		hsi.validateAndSave(hdto18);
		hsi.validateAndSave(hdto19);
		hsi.validateAndSave(hdto20);
		hsi.validateAndSave(hdto21);
		hsi.validateAndSave(hdto22);

	}

}
