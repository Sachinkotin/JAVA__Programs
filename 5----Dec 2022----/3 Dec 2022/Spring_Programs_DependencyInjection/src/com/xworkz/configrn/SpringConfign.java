package com.xworkz.configrn;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Education;
import com.xworkz.beans.Name;
import com.xworkz.beans.NuclearPowerPlants;
import com.xworkz.beans.President;
import com.xworkz.beans.PrimeMinister;
import com.xworkz.beans.Salary;
import com.xworkz.beans.StatesOfIndia;
import com.xworkz.beans.UTsOfIndia;
import com.xworkz.beans.VicePresident;

@Configuration
@ComponentScan("com.xworkz.beans")

public class SpringConfign {

	@Bean
	public Name presidentName() {
		Name nm1 = new Name();
		nm1.setFirstName("Rajendra");
		nm1.setMiddleName("M");
		nm1.setLastName("Prasad");
		return nm1;
	}

	@Bean
	public Name vicePresidentName() {
		Name nm2 = new Name("Venkayya", "M", "Naidu");
		return nm2;
	}

	@Bean
	public Name pmName() {
		Name nm3 = new Name("Narendra", "Damodar", "Modi");
		return nm3;
	}

	@Bean
	public Salary pmSalary() {
		Salary pm1 = new Salary(150000.00, 255000.00, 25000.00, 30000.00, 30000.00, 20000.00, 0.00, 15000.00);

		return pm1;
	}

	@Bean
	public Salary presidentSalary() {
		Salary pm2 = new Salary(250000.00, 355000.00, 28000.00, 40000.00, 36000.00, 28000.00, 5000.00, 18000.00);

		return pm2;
	}

	@Bean
	public Salary vicePresidentSalary() {
		Salary pm3 = new Salary(200000.00, 305000.00, 26000.00, 35000.00, 32000.00, 24000.00, 6000.00, 16000.00);

		return pm3;
	}

	@Bean
	public Education pmEducation() {
		Education nm = new Education("2SD95EE038", "Dharwad University", "Electrical Branch", 1995, "Gandhinagar", 0,
				79.05, true);
		return nm;
	}

	@Bean
	public Education presidentEducation() {
		Education nm = new Education("2HBL99EE038", "Karwar University", "Political Science ", 1999, "Delhi", 0, 59.03,
				true);
		return nm;
	}

	@Bean
	public Education vicePresidentEducation() {
		Education nm = new Education("2KML85EE038", "Manipal University", "B.A.L.L.B", 1995, "Punjab", 0, 81.05, true);
		return nm;
	}
	
	
	@Bean 
	public StatesOfIndia[] statesList()
	{
		StatesOfIndia state1= new StatesOfIndia("Karnataka", "6 crore", "Bangalore", 28, "1,91,780 sq.km", "Basavaraj Bommai", "Kannada");
		
		StatesOfIndia state2= new StatesOfIndia("Kerala", "5 crore", "Trivendram", 25, "1,91,780 sq.km", "P Sundaram", "Malayalam");
		StatesOfIndia state3= new StatesOfIndia("Andhra Pradesh", "5 crore", "Amaravati", 25, "1,91,780 sq.km", "YS Jagan Mohan Reddy", "Telugu");
		StatesOfIndia state4= new StatesOfIndia("Arunachal Pradesh", "5 crore", "Itanagar", 25, "1,91,780 sq.km", " Pema Khandu", "Malayalam");
		StatesOfIndia state5= new StatesOfIndia("Assam", "5 crore", "Dispur", 25, "1,91,780 sq.km", " Himanta Biswa Sarma", "Assamese");
		StatesOfIndia state6= new StatesOfIndia("Bihar", "5 crore", "Patna", 25, "1,91,780 sq.km", " Nitish Kumar", "Hindi");
		StatesOfIndia state7= new StatesOfIndia("Chhattisgarh", "5 crore", "Bilaspur", 25, "1,91,780 sq.km", "Bhupesh Baghel", "Hindi");
		StatesOfIndia state8= new StatesOfIndia("Goa", "5 crore", "Panaji", 25, "1,91,780 sq.km", "Pramod Sawant", "Konkani");
		StatesOfIndia state9= new StatesOfIndia("Gujarat", "5 crore", "Gandhinagar", 25, "1,91,780 sq.km", "Bhupendra Patel", "Gujarati");
		StatesOfIndia state10= new StatesOfIndia("Haryana", "5 crore", "Chandigarh", 25, "1,91,780 sq.km", "Manohar Lal", "Haryani");
		StatesOfIndia state11= new StatesOfIndia("Himachal Pradesh", "5 crore", "Shimla", 25, "1,91,780 sq.km", "Jairam Thakur", "Hindi");
		StatesOfIndia state12= new StatesOfIndia("Jharkhand", "5 crore", "Ranchi", 25, "1,91,780 sq.km", "Hemant Soren", "Hindi");
		StatesOfIndia state13= new StatesOfIndia("Madhya Pradesh", "5 crore", "Bhopal", 25, "1,91,780 sq.km", "Shivraj Singh Chouhan", "Hindi");
		StatesOfIndia state14= new StatesOfIndia("Maharashtra", "5 crore", "Mumbai", 25, "1,91,780 sq.km", " Eknath Shinde", "Marathi");
		StatesOfIndia state15= new StatesOfIndia("Manipur", "5 crore", "Imphal", 25, "1,91,780 sq.km", " N. Biren Singh", "Hindi");
		StatesOfIndia state16= new StatesOfIndia("Meghalaya", "5 crore", "Shillong", 25, "1,91,780 sq.km", "Conrad Kongkal Sangma", "Hindi");
		StatesOfIndia state17= new StatesOfIndia("Mizoram", "5 crore", "Aizwal", 25, "1,91,780 sq.km", "Pu Zoramthanga", "Hindi");
		StatesOfIndia state18=new StatesOfIndia("Nagaland", "5 crore", "Kohima", 25, "1,91,780 sq.km", " Neiphiu Rio", "Hindi");
		StatesOfIndia state19= new StatesOfIndia("Odisha", "5 crore", "Bhubaneshwar", 25, "1,91,780 sq.km", "Naveen Patnaik", "Hindi");
		StatesOfIndia state20= new StatesOfIndia("Punjab", "5 crore", "Chandigarh", 25, "1,91,780 sq.km", " N. Rangaswamy", "Punjabi");
		StatesOfIndia state21= new StatesOfIndia("Rajasthan", "5 crore", "Jaipur", 25, "1,91,780 sq.km", "Bhagwant Singh Mann", "Hindi");
		StatesOfIndia state22= new StatesOfIndia("Sikkim", "5 crore", "Gangtok", 25, "1,91,780 sq.km", " Ashok Gehlot", "Hindi");
		StatesOfIndia state23=new StatesOfIndia("Tamil Nadu", "5 crore", "Chennai", 25, "1,91,780 sq.km", "M. K. Stalin", "Tamil");
		StatesOfIndia state24= new StatesOfIndia("Telangana", "5 crore", "Hyderabad", 25, "1,91,780 sq.km", "K Chandrasekhar Rao", "Telugu");
		StatesOfIndia state25= new StatesOfIndia("Tripura", "5 crore", "Agartala", 25, "1,91,780 sq.km", "Manik Saha", "Hindi");
		StatesOfIndia state26= new StatesOfIndia("Uttar Pradesh", "5 crore", "Lucknow", 25, "1,91,780 sq.km", "Yogi Aditya Nath", "Hindi");
		StatesOfIndia state27= new StatesOfIndia("Uttarakhand", "5 crore", "Dehradun", 25, "1,91,780 sq.km", "Pushkar Singh Dhami", "Hindi");
		StatesOfIndia state28=new StatesOfIndia("West Bengal", "5 crore", "Kolkatta", 25, "1,91,780 sq.km", "Km. Mamata Banerjee", "Bengali");
		
		
		
		StatesOfIndia[] stateList= {state1,state2,state3,state4,state5,state6,state7,state8,
				state9,state10,state11,state12,state13,state14,state15,state16,state17,
				state18,state19,state20,state21,state22,state23,state24,state25,
				state26,state27,state28};
		
		return stateList;
		
		
	}
	
	@Bean
	public UTsOfIndia[] utList()
	{
		UTsOfIndia ut1= new UTsOfIndia("Delhi", 5.06, "Vinai Kumar Saxena",2.00);
		
		UTsOfIndia ut2= new UTsOfIndia("Pondichery", 7.08, "Tamilisai Soundararajan ",0.15);
		UTsOfIndia ut3= new UTsOfIndia("Andaman & Nicobar", 7.08, "Devendra Kumar Joshi",0.15);
		UTsOfIndia ut4= new UTsOfIndia("Chandigarh", 7.08, "Banwarilal Purohit",0.15);
		UTsOfIndia ut5= new UTsOfIndia("Dadra and Nagar Haveli and Daman and Diu", 7.08, "Praful Khoda Patel",0.15);
		UTsOfIndia ut6= new UTsOfIndia("Jammu and Kashmir", 7.08, "Manoj Sinha",0.15);
		UTsOfIndia ut7= new UTsOfIndia("Lakshadweep", 7.08, "Praful Khoda Patel ",0.15);
		UTsOfIndia ut8= new UTsOfIndia("Ladakh", 7.08, "Radha Krishna Mathur",0.15);
		
		UTsOfIndia[] utList= {ut1,ut2,ut3,ut4,ut5,ut6,ut7,ut8,};
		
		return utList;
		
	}
	
	@Bean
	public Collection<NuclearPowerPlants> nuclearPlants()
	{
		return Arrays.asList(new NuclearPowerPlants("Kalpakkam","Tamil Nadu"),new NuclearPowerPlants("Kaiga","Karnataka"));
	}

	
	
}
