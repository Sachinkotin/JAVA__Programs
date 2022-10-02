class Hospital
{
	String name;
	double consultationFees;
	String [] equipments;
	Specialisation specialisation;
	Founder founder;
	
	Hospital(String name,double consultationFees,String [] equipments,Specialisation specialisation,
	Founder founder)
	{
		this.name=name;
		this.consultationFees=consultationFees;
		this.equipments=equipments;
		this.specialisation=specialisation;
		this.founder=founder;		
	}
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.consultationFees);
		System.out.println(this.specialisation);
				
		for (int count=0;count<this.equipments.length;count++)
		{
			System.out.print("-"+this.equipments[count]);
		}
			System.out.println();
		System.out.println("Founder Details : ");
		this.founder.printData();
		
	}
	

	
}