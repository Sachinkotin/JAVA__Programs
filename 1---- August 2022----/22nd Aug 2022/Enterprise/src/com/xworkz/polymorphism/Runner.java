package com.xworkz.polymorphism;

public class Runner {

	public static void main(String[] args) {
 
		Cricket crk=new Cricket("India","Anil Kumble","Male");
		boolean nm=crk.entertainment();
		System.out.println(nm);
		
		double nm1=crk.presentation();
		System.out.println(nm1);
		System.out.println("********************************");
		
		TestCricket tc1=new TestCricket("India","Anil Kumble","Male","Open Ground");
		boolean tk1=tc1.entertainment();
		System.out.println(tk1);
		
		double tk2=tc1.presentation();
		System.out.println(tk2);
		System.out.println("********************************");
		
		OneDayCricket odc1=new OneDayCricket("Australia","Kapil dev","Male","Irfan Pathan","Virat Kohli");
		boolean mtk1=odc1.entertainment();
		System.out.println(mtk1);
		
		double mtk2=odc1.presentation();
		System.out.println(mtk2);
		
		String mtk3=odc1.manOfSeries();
		System.out.println(mtk3);
		System.out.println("********************************");
		
		T20Cricket t2c1=new T20Cricket("India","Anil Kumble","Male");
		boolean mkd1=t2c1.entertainment();
		System.out.println(mkd1);
		
		double mkd2=t2c1.presentation();
		System.out.println(mkd2);
		
		String mkd3=t2c1.manOfTheMatch();
		System.out.println(mkd3);
		System.out.println("********************************");
		
		
	}

}
