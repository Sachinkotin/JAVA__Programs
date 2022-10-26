package com.xworkz.jdbcStart.runner;

import com.xworkz.jdbcStart.dto.PersonDTO;
import com.xworkz.jdbcStart.service.PersonService;
import com.xworkz.jdbcStart.service.PersonServiceImpl;

public class PersonRunner {

	public static void main(String[] args) {

		
		PersonDTO person1 = new PersonDTO(1, "Sagar ", "Sagar.xworkz@gmail.com", 9573480740l, "male", "BE", false,
				false, "infosys", 25000, 23, 1, "kusugal", "hubli", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 647851247104l);
		PersonDTO person2 = new PersonDTO(2, "Pratap", "Pratap.xworkz@gmail.com", 7204250720l, "male", "MBBS", false, false,
				"infosol", 24000, 24, 3, "huligerepura", "maddur", "karnataka", "india", 72056447873441l, "bfdpj4025h",
				true, 203547894620l);
		PersonDTO person3 = new PersonDTO(3, "Sundar", "Sundar.xworkz@gmail.com", 9036650757l, "male", "M.sc",
				false, false, "trempplin", 23000, 27, 2, "kc road", "gadag", "karnataka", "india", 246875214620l,
				"khgdh5620g", true, 698521478512l);
		PersonDTO person4 = new PersonDTO(4, "Shanti", "Shanti.xworkz@gmail.com", 9036924698l, "female", "BE", false,
				false, "infosys", 26000, 27, 2, "despandenagar", "hubli", "karnataka", "india", 59927190500l,
				"khytd45802k", true, 786549247812l);
		PersonDTO person5 = new PersonDTO(5, "Roopa", "Roopa.xworkz@gmail.com", 9785476248l, "female", "MBBS", false,
				false, "tcs", 23000, 29, 3, "gandhicircle", "gadag", "karnataka", "india", 874569120474l, "bilin4263j",
				true, 457981247624l);
		PersonDTO person6 = new PersonDTO(6, "Pallavi", "Pallavi.xworkz@gmail.com", 9745861476l, "female", "BE", false,
				false, "boss", 29000, 23, 1, "stationroad", "channnapatnna", "karnataka", "india", 245789642014l, "dewar5402k",
				true, 644578201104l);
		PersonDTO person7 = new PersonDTO(7, "Kartik", "Kartik.xworkz@gmail.com", 9782456187l, "male", "MBBS", false,
				false, "light", 28000, 25, 2, "hosur", "hubli", "karnataka", "india", 47896587210l, "fertj4580j",
				true, 457896321478l);
		PersonDTO person8 = new PersonDTO(8, "Manju", "Manju.xworkz@gmail.com", 8970816064l, "male", "BE", false,
				false, "wipro", 27000, 24, 1, "aralikatte", "channagiri", "karnataka", "india", 436337588896l, "biapc0441g",
				true, 35870847504l);
		PersonDTO person9 = new PersonDTO(9, "Hema", "Hema.xworkz@gmail.com", 9648751048l, "female", "BE", true,
				false, "deloitte", 25000, 28, 2, "mudhool", "hubli", "karnataka", "india", 852147963104l, "bgfdf4502j",
				true, 78541256904l);
		PersonDTO person10 = new PersonDTO(10, "Shivu", "Shivu.xworkz@gmail.com", 7569841280l, "male", "MBBS", false,
				false, "accenture", 28000, 23, 3, "jamkhandi", "baglakot", "karnataka", "india", 975846752012l, "trewa2354y",
				true, 47586920145l);
		PersonDTO person11 = new PersonDTO(11, "Prema", "Prema.xworkz@gmail.com", 8012456587l, "female", "BE", false,
				false, "ibm", 25000, 30, 3, "rmroad", "ramdurga", "karnataka", "india", 547812901248l, "edfra6540k",
				true, 85014937510l);
		PersonDTO person12 = new PersonDTO(12, "Mona", "Mona.xworkz@gmail.com", 8972156104l, "female", "BE", false,
				false, "capgemini", 26000, 25, 1, "malavalli", "mandya", "karnataka", "india", 568874412661l, "whtfo5482y",
				true, 647851247104l);
		PersonDTO person13 = new PersonDTO(13, "Raju", "Raju.xworkz@gmail.com", 8577669018l, "male", "MBBS", false,
				false, "ibm", 24000, 26, 1, "cjroad", "chittradurga", "karnataka", "india", 447892157910l, "ghgvh5442j",
				true, 545425435212l);
		PersonDTO person14 = new PersonDTO(14, "Shankar", "Shankar.xworkz@gmail.com", 8073480740l, "male", "BCA", false,
				false, "tcs", 25000, 24, 3,"pavgada" , "tumakur", "karnataka", "india", 268849906344l, "rtewa5465z",
				true, 47590225422l);
		PersonDTO person15 = new PersonDTO(15, "Keshav", "Keshav.xworkz@gmail.com", 9088755420l, "male", "BE", false,
				false, "deloitte", 29000, 29, 1, "durganagar", "chikkamaglur", "karnataka", "india", 456462332312l, "sfteg4580g",
				true, 54654335435l);
		PersonDTO person16 = new PersonDTO(16, "Mallu", "Mallu.xworkz@gmail.com", 9853513001l, "male", "MBBS", false,
				false, "accenture", 24000, 25, 2, "tbnagar", "tumakur", "karnataka", "india", 448782147963l, "werti5478p",
				true, 75558974562l);
		PersonDTO person17 = new PersonDTO(17, "Kiran", "Kiran.xworkz@gmail.com", 9087456204l, "male", "BE", false,
				false, "tempplin", 28000, 25, 3, "beachroad", "batkal", "karnataka", "india", 268849906344l, "brtew6874p",
				true, 65365343543l);
		PersonDTO person18 = new PersonDTO(18, "Kavya", "Kavya.xworkz@gmail.com", 8962224577l, "female", "MBBS", false,
				false, "infosol", 26000, 26, 3, "courtroad", "sirsi", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 435436433630l);
		PersonDTO person19 = new PersonDTO(19, "Mallamma", "Mallamma.xworkz@gmail.com", 7845559871l, "female", "BE", false,
				false, "capgemini", 24000, 24, 1, "jamkhandi", "baglakote", "karnataka", "india", 456255458562l, "rtyuh4520k",
				true, 457896212577l);
		PersonDTO person20 = new PersonDTO(20, "Keerti", "Keerti.xworkz@gmail.com", 8741258045l, "female", "BE", false,
				false, "wipro", 26000, 25, 2, "kalghatagi", "hubli", "karnataka", "india", 268844535635l, "biasf4578v",
				true, 787744552361l);
		PersonDTO person21 = new PersonDTO(21, "Shambhu", "Shambhu.xworkz@gmail.com", 8765465120l, "male", "BE", false,
				false, "infosys", 28000, 26, 3, "badami", "bagalkote", "karnataka", "india", 268849906344l, "ydhgg6844e",
				true, 984654654985l);
		PersonDTO person22 = new PersonDTO(22, "Suhas", "Suhas.xworkz@gmail.com", 7845515541l, "male", "MBBS", true,
				false, "accenture", 29000, 24, 2, "rtroad", "mandya", "karnataka", "india", 782395145618l, "iutre4578n",
				true, 64862653352l);
		PersonDTO person23 = new PersonDTO(23, "Praveen", "Praveen.xworkz@gmail.com", 9874512450l, "male", "BE", false,
				false, "cms", 27000, 25, 1, "ayodyanagar", "laknow", "uttarpradesh", "india", 486825741256l, "werds78520k",
				true, 587565645656l);
		PersonDTO person24 = new PersonDTO(24, "Amit", "Amit.xworkz@gmail.com", 7854123608l, "male", "BE", false,
				false, "capgemini", 25000, 27, 2, "kgfroad", "kolar", "karnataka", "india", 688656566546l, "klsio7802g",
				true, 658745100105l);
		PersonDTO person25 = new PersonDTO(25, "Akhila", "Akhila.xworkz@gmail.com", 9956562655l, "female", "MBBS", false,
				false, "tvs", 24000, 26, 3, "anvatti", "shivamogga", "karnataka", "india", 5468898669669l, "hhjho2665d",
				true, 986855656984l);

		PersonDTO person26 = new PersonDTO(26, "Sagar ", "Sagar.xworkz@gmail.com", 9573480740l, "male", "BE", false,
				false, "infosys", 25000, 23, 1, "kusugal", "hubli", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 647851247104l);
		PersonDTO person27 = new PersonDTO(27, "Priya", "Priya.xworkz@gmail.com", 7204250720l, "female", "BE", false, false,
				"infosol", 24000, 24, 3, "huligerepura", "maddur", "karnataka", "india", 72056447873441l, "bfdpj4025h",
				true, 203547894620l);
		PersonDTO person28 = new PersonDTO(28, "Sneha", "Sneha.xworkz@gmail.com", 9036650757l, "female", "M.sc",
				false, false, "trempplin", 23000, 27, 2, "kc road", "gadag", "karnataka", "india", 246875214620l,
				"khgdh5620g", true, 698521478512l);
		PersonDTO person29 = new PersonDTO(29, "Vinay", "Vinay.xworkz@gmail.com", 9036924698l, "male", "BE", false,
				false, "infosys", 26000, 27, 2, "despandenagar", "hubli", "karnataka", "india", 59927190500l,
				"khytd45802k", true, 786549247812l);
		PersonDTO person30 = new PersonDTO(30, "Sukeerti", "Sukeerti.xworkz@gmail.com", 9785476248l, "female", "MBBS", false,
				false, "tcs", 23000, 29, 3, "gandhicircle", "gadag", "karnataka", "india", 874569120474l, "bilin4263j",
				true, 457981247624l);
		PersonDTO person31 = new PersonDTO(31, "Shruti", "Shruti.xworkz@gmail.com", 9745861476l, "female", "BE", false,
				false, "boss", 29000, 23, 1, "stationroad", "channnapatnna", "karnataka", "india", 245789642014l, "dewar5402k",
				true, 644578201104l);
		PersonDTO person32 = new PersonDTO(32, "Shweta", "Shweta.xworkz@gmail.com", 9782456187l, "female", "BE", false,
				false, "light", 28000, 25, 2, "hosur", "hubli", "karnataka", "india", 47896587210l, "fertj4580j",
				true, 457896321478l);
		PersonDTO person33 = new PersonDTO(33, "Yuvi", "Yuvi.xworkz@gmail.com", 8970816064l, "male", "MBBS", false,
				false, "wipro", 27000, 24, 1, "aralikatte", "channagiri", "karnataka", "india", 436337588896l, "biapc0441g",
				true, 35870847504l);
		PersonDTO person34 = new PersonDTO(34, "Supriya", "Supriya.xworkz@gmail.com", 9648751048l, "female", "BE", true,
				false, "deloitte", 25000, 28, 2, "mudhool", "hubli", "karnataka", "india", 852147963104l, "bgfdf4502j",
				true, 78541256904l);
		PersonDTO person35 = new PersonDTO(35, "Shakuntala", "Shakuntala.xworkz@gmail.com", 7569841280l, "female", "BE", false,
				false, "accenture", 28000, 23, 3, "jamkhandi", "baglakot", "karnataka", "india", 975846752012l, "trewa2354y",
				true, 47586920145l);
		PersonDTO person36 = new PersonDTO(36, "Abhiram", "Abhiram.xworkz@gmail.com", 8012456587l, "male", "MBBS", false,
				false, "ibm", 25000, 30, 3, "rmroad", "ramdurga", "karnataka", "india", 547812901248l, "edfra6540k",
				true, 85014937510l);
		PersonDTO person37 = new PersonDTO(37, "Abhishek", "Abhishek.xworkz@gmail.com", 8972156104l, "male", "BE", false,
				false, "capgemini", 26000, 25, 1, "malavalli", "mandya", "karnataka", "india", 568874412661l, "whtfo5482y",
				true, 647851247104l);
		PersonDTO person38 = new PersonDTO(38, "Deepa", "Deepa.xworkz@gmail.com", 8577669018l, "female", "MBBS", false,
				false, "ibm", 24000, 26, 1, "cjroad", "chittradurga", "karnataka", "india", 447892157910l, "ghgvh5442j",
				true, 545425435212l);
		PersonDTO person39 = new PersonDTO(39, "Nagesh", "Nagesh.xworkz@gmail.com", 8073480740l, "male", "BCA", false,
				false, "tcs", 25000, 24, 3,"pavgada" , "tumakur", "karnataka", "india", 268849906344l, "rtewa5465z",
				true, 47590225422l);
		PersonDTO person40 = new PersonDTO(40, "Prashant", "Prashant.xworkz@gmail.com", 9088755420l, "male", "BE", false,
				false, "deloitte", 29000, 29, 1, "durganagar", "chikkamaglur", "karnataka", "india", 456462332312l, "sfteg4580g",
				true, 54654335435l);
		PersonDTO person41 = new PersonDTO(41, "Prasad", "Prasad.xworkz@gmail.com", 9853513001l, "male", "MBBS", false,
				false, "accenture", 24000, 25, 2, "tbnagar", "tumakur", "karnataka", "india", 448782147963l, "werti5478p",
				true, 75558974562l);
		PersonDTO person42 = new PersonDTO(42, "Ashwini", "Ashwini.xworkz@gmail.com", 9087456204l, "female", "BE", false,
				false, "tempplin", 28000, 25, 3, "beachroad", "batkal", "karnataka", "india", 268849906344l, "brtew6874p",
				true, 65365343543l);
		PersonDTO person43 = new PersonDTO(43, "Anupama", "Anupama.xworkz@gmail.com", 8962224577l, "female", "BE", false,
				false, "infosol", 26000, 26, 3, "courtroad", "sirsi", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 435436433630l);
		PersonDTO person44 = new PersonDTO(44, "Mayur", "Mayur.xworkz@gmail.com", 7845559871l, "male", "MBBS", false,
				false, "capgemini", 24000, 24, 1, "jamkhandi", "baglakote", "karnataka", "india", 456255458562l, "rtyuh4520k",
				true, 457896212577l);
		PersonDTO person45 = new PersonDTO(45, "Bhagya", "Bhagya.xworkz@gmail.com", 8741258045l, "female", "BE", false,
				false, "wipro", 26000, 25, 2, "kalghatagi", "hubli", "karnataka", "india", 268844535635l, "biasf4578v",
				true, 787744552361l);
		PersonDTO person46 = new PersonDTO(46, "Pallavi", "Pallavi.xworkz@gmail.com", 8765465120l, "female", "BE", false,
				false, "infosys", 28000, 26, 3, "badami", "bagalkote", "karnataka", "india", 268849906344l, "ydhgg6844e",
				true, 984654654985l);
		PersonDTO person47 = new PersonDTO(47, "Somu", "Somu.xworkz@gmail.com", 7845515541l, "male", "MBBS", true,
				false, "accenture", 29000, 24, 2, "rtroad", "mandya", "karnataka", "india", 782395145618l, "iutre4578n",
				true, 64862653352l);
		PersonDTO person48 = new PersonDTO(48, "Shekhar", "Shekhar.xworkz@gmail.com", 9874512450l, "male", "BE", false,
				false, "cms", 27000, 25, 1, "ayodyanagar", "laknow", "uttarpradesh", "india", 486825741256l, "werds78520k",
				true, 587565645656l);
		PersonDTO person49 = new PersonDTO(49, "Ganesh", "Ganesh.xworkz@gmail.com", 7854123608l, "male", "BE", false,
				false, "capgemini", 25000, 27, 2, "kgfroad", "kolar", "karnataka", "india", 688656566546l, "klsio7802g",
				true, 658745100105l);
		PersonDTO person50 = new PersonDTO(50, "Digant", "Digant.xworkz@gmail.com", 9956562655l, "male", "MBBS", false,
				false, "tvs", 24000, 26, 3, "anvatti", "shivamogga", "karnataka", "india", 5468898669669l, "hhjho2665d",
				true, 986855656984l);

		PersonDTO person51 = new PersonDTO(51, "Sonu ", "Sonu.xworkz@gmail.com", 9573480740l, "male", "BE", false,
				false, "infosys", 25000, 23, 1, "kusugal", "hubli", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 647851247104l);
		PersonDTO person52 = new PersonDTO(52, "Krishna", "Krishna.xworkz@gmail.com", 7204250720l, "male", "BE", false, false,
				"infosol", 24000, 24, 3, "huligerepura", "maddur", "karnataka", "india", 72056447873441l, "bfdpj4025h",
				true, 203547894620l);
		PersonDTO person53 = new PersonDTO(53, "Basavaraj", "Basavaraj.xworkz@gmail.com", 9036650757l, "male", "M.sc",
				false, false, "trempplin", 23000, 27, 2, "kc road", "gadag", "karnataka", "india", 246875214620l,
				"khgdh5620g", true, 698521478512l);
		PersonDTO person54 = new PersonDTO(54, "Abhishek", "Abhishek.xworkz@gmail.com", 9036924698l, "male", "BE", false,
				false, "infosys", 26000, 27, 2, "despandenagar", "hubli", "karnataka", "india", 59927190500l,
				"khytd45802k", true, 786549247812l);
		PersonDTO person55 = new PersonDTO(55, "Raghavendra", "raghavendra.xworkz@gmail.com", 9785476248l, "male", "MBBS", false,
				false, "tcs", 23000, 29, 3, "gandhicircle", "gadag", "karnataka", "india", 874569120474l, "bilin4263j",
				true, 457981247624l);
		PersonDTO person56 = new PersonDTO(56, "Darshan", "darshan.xworkz@gmail.com", 9745861476l, "male", "BE", false,
				false, "boss", 29000, 23, 1, "stationroad", "channnapatnna", "karnataka", "india", 245789642014l, "dewar5402k",
				true, 644578201104l);
		PersonDTO person57 = new PersonDTO(57, "Pratik", "Pratik.xworkz@gmail.com", 9782456187l, "male", "BE", false,
				false, "light", 28000, 25, 2, "hosur", "hubli", "karnataka", "india", 47896587210l, "fertj4580j",
				true, 457896321478l);
		PersonDTO person58 = new PersonDTO(58, "Shantagouda", "Shantagouda.xworkz@gmail.com", 8970816064l, "male", "MBBS", false,
				false, "wipro", 27000, 24, 1, "aralikatte", "channagiri", "karnataka", "india", 436337588896l, "biapc0441g",
				true, 35870847504l);
		PersonDTO person59 = new PersonDTO(59, "Sharan", "Sharan.xworkz@gmail.com", 9648751048l, "male", "BE", true,
				false, "deloitte", 25000, 28, 2, "mudhool", "hubli", "karnataka", "india", 852147963104l, "bgfdf4502j",
				true, 78541256904l);
		PersonDTO person60 = new PersonDTO(60, "Karan", "Karan.xworkz@gmail.com", 7569841280l, "male", "BE", false,
				false, "accenture", 28000, 23, 3, "jamkhandi", "baglakot", "karnataka", "india", 975846752012l, "trewa2354y",
				true, 47586920145l);
		PersonDTO person61 = new PersonDTO(61, "Jyoti", "Jyoti.xworkz@gmail.com", 8012456587l, "female", "MBBS", false,
				false, "ibm", 25000, 30, 3, "rmroad", "ramdurga", "karnataka", "india", 547812901248l, "edfra6540k",
				true, 85014937510l);
		PersonDTO person62 = new PersonDTO(62, "Anand ", "Anand.xworkz@gmail.com", 8972156104l, "male", "BE", false,
				false, "capgemini", 26000, 25, 1, "malavalli", "mandya", "karnataka", "india", 568874412661l, "whtfo5482y",
				true, 647851247104l);
		PersonDTO person63 = new PersonDTO(63, "Gopi", "Gopi.xworkz@gmail.com", 8577669018l, "male", "BE", false,
				false, "ibm", 24000, 26, 1, "cjroad", "chittradurga", "karnataka", "india", 447892157910l, "ghgvh5442j",
				true, 545425435212l);
		PersonDTO person64 = new PersonDTO(64, "Mallinath", "Mallinath.xworkz@gmail.com", 8073480740l, "male", "BCA", false,
				false, "tcs", 25000, 24, 3,"pavgada" , "tumakur", "karnataka", "india", 268849906344l, "rtewa5465z",
				true, 47590225422l);
		PersonDTO person65 = new PersonDTO(65, "Veeresh", "Veeresh.xworkz@gmail.com", 9088755420l, "male", "MBBS", false,
				false, "deloitte", 29000, 29, 1, "durganagar", "chikkamaglur", "karnataka", "india", 456462332312l, "sfteg4580g",
				true, 54654335435l);
		PersonDTO person66 = new PersonDTO(66, "Siddu", "Siddu.xworkz@gmail.com", 9853513001l, "male", "BE", false,
				false, "accenture", 24000, 25, 2, "tbnagar", "tumakur", "karnataka", "india", 448782147963l, "werti5478p",
				true, 75558974562l);
		PersonDTO person67 = new PersonDTO(67, "Laxmi", "Laxmi.xworkz@gmail.com", 9087456204l, "female", "BE", false,
				false, "tempplin", 28000, 25, 3, "beachroad", "batkal", "karnataka", "india", 268849906344l, "brtew6874p",
				true, 65365343543l);
		PersonDTO person68 = new PersonDTO(68, "Parvati", "Parvati.xworkz@gmail.com", 8962224577l, "female", "MBBS", false,
				false, "infosol", 26000, 26, 3, "courtroad", "sirsi", "karnataka", "india", 268849906344l, "bidpn4273j",
				true, 435436433630l);
		PersonDTO person69 = new PersonDTO(69, "Neelamma", "Neelamma.xworkz@gmail.com", 7845559871l, "female", "BE", false,
				false, "capgemini", 24000, 24, 1, "jamkhandi", "baglakote", "karnataka", "india", 456255458562l, "rtyuh4520k",
				true, 457896212577l);
		PersonDTO person70 = new PersonDTO(70, "Chitra", "Chitra.xworkz@gmail.com", 8741258045l, "female", "BE", false,
				false, "wipro", 26000, 25, 2, "kalghatagi", "hubli", "karnataka", "india", 268844535635l, "biasf4578v",
				true, 787744552361l);
		PersonDTO person71 = new PersonDTO(71, "Akshata", "Akshata.xworkz@gmail.com", 8765465120l, "female", "BE", false,
				false, "infosys", 28000, 26, 3, "badami", "bagalkote", "karnataka", "india", 268849906344l, "ydhgg6844e",
				true, 984654654985l);
		PersonDTO person72 = new PersonDTO(72, "Maonj", "Maonj.xworkz@gmail.com", 7845515541l, "male", "MBBS", true,
				false, "accenture", 29000, 24, 2, "rtroad", "mandya", "karnataka", "india", 782395145618l, "iutre4578n",
				true, 64862653352l);
		PersonDTO person73 = new PersonDTO(73, "Gururaj", "Gururaj.xworkz@gmail.com", 9874512450l, "male", "BE", false,
				false, "cms", 27000, 25, 1, "ayodyanagar", "laknow", "uttarpradesh", "india", 486825741256l, "werds78520k",
				true, 587565645656l);
		PersonDTO person74 = new PersonDTO(74, "Jaggu", "Jaggu.xworkz@gmail.com", 7854123608l, "male", "BE", false,
				false, "capgemini", 25000, 27, 2, "kgfroad", "kolar", "karnataka", "india", 688656566546l, "klsio7802g",
				true, 658745100105l);
		PersonDTO person75 = new PersonDTO(75, "Dinesh", "Dinesh.xworkz@gmail.com", 9956562655l, "male", "BE", false,
				false, "tvs", 24000, 26, 3, "anvatti", "bijapur", "karnataka", "india", 5468898669669l, "hhjho2665d",
				true, 986855656984l);


		PersonService service = new PersonServiceImpl();
		service.validAndSave(person1);
		System.out.println(service.validAndSave(person1));
		System.out.println(service.validAndSave(person2));
		System.out.println(service.validAndSave(person3));
		System.out.println(service.validAndSave(person4));
		System.out.println(service.validAndSave(person5));
		System.out.println(service.validAndSave(person6));
		System.out.println(service.validAndSave(person7));
		System.out.println(service.validAndSave(person8));
		System.out.println(service.validAndSave(person9));
		System.out.println(service.validAndSave(person10));
		System.out.println(service.validAndSave(person11));
		System.out.println(service.validAndSave(person12));
		System.out.println(service.validAndSave(person13));
		System.out.println(service.validAndSave(person14));
		System.out.println(service.validAndSave(person15));
		System.out.println(service.validAndSave(person16));
		System.out.println(service.validAndSave(person17));
		System.out.println(service.validAndSave(person18));
		System.out.println(service.validAndSave(person19));
		System.out.println(service.validAndSave(person20));
		System.out.println(service.validAndSave(person21));
		System.out.println(service.validAndSave(person22));
		System.out.println(service.validAndSave(person23));
		System.out.println(service.validAndSave(person24));
		System.out.println(service.validAndSave(person25));
		System.out.println(service.validAndSave(person26));
		System.out.println(service.validAndSave(person27));
		System.out.println(service.validAndSave(person28));
		System.out.println(service.validAndSave(person29));
		System.out.println(service.validAndSave(person30));
		System.out.println(service.validAndSave(person31));
		System.out.println(service.validAndSave(person32));
		System.out.println(service.validAndSave(person33));
		System.out.println(service.validAndSave(person34));
		System.out.println(service.validAndSave(person35));
		System.out.println(service.validAndSave(person36));
		System.out.println(service.validAndSave(person37));
		System.out.println(service.validAndSave(person38));
		System.out.println(service.validAndSave(person39));
		System.out.println(service.validAndSave(person40));
		System.out.println(service.validAndSave(person41));
		System.out.println(service.validAndSave(person42));
		System.out.println(service.validAndSave(person43));
		System.out.println(service.validAndSave(person44));
		System.out.println(service.validAndSave(person45));
		System.out.println(service.validAndSave(person46));
		System.out.println(service.validAndSave(person47));
		System.out.println(service.validAndSave(person48));
		System.out.println(service.validAndSave(person49));
		System.out.println(service.validAndSave(person50));
		System.out.println(service.validAndSave(person51));
		System.out.println(service.validAndSave(person52));
		System.out.println(service.validAndSave(person53));
		System.out.println(service.validAndSave(person54));
		System.out.println(service.validAndSave(person55));
		System.out.println(service.validAndSave(person56));
		System.out.println(service.validAndSave(person57));
		System.out.println(service.validAndSave(person58));
		System.out.println(service.validAndSave(person59));
		System.out.println(service.validAndSave(person60));
		System.out.println(service.validAndSave(person61));
		System.out.println(service.validAndSave(person62));
		System.out.println(service.validAndSave(person63));
		System.out.println(service.validAndSave(person64));
		System.out.println(service.validAndSave(person65));
		System.out.println(service.validAndSave(person66));
		System.out.println(service.validAndSave(person67));
		System.out.println(service.validAndSave(person68));
		System.out.println(service.validAndSave(person69));
		System.out.println(service.validAndSave(person70));
		System.out.println(service.validAndSave(person71));
		System.out.println(service.validAndSave(person72));
		System.out.println(service.validAndSave(person73));
		System.out.println(service.validAndSave(person74));
		System.out.println(service.validAndSave(person75));
		
		
		
		PersonServiceImpl serviceImpl = new PersonServiceImpl();
		serviceImpl.displayAll();
		System.out.println("<================================================>");
		serviceImpl.displayAllAgeGreaterThenOrderByName(27);
		System.out.println("<================================================>");
		serviceImpl.displayAllByGenderDescOrderByName("'female'");
		System.out.println("<================================================>");
		serviceImpl.displayAllBySalaryGreaterThanOrderByDesc(28000);
		System.out.println("<================================================>");
		serviceImpl.displayCount();
		System.out.println("<================================================>");
		serviceImpl.displaySumOfSalary();
		
	}

}
