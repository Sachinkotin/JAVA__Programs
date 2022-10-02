class Gym
{
	String name;
	int fees;
	String[] equipments;
	Trainer trainer;
	
	
	Gym(String name,int fees,String[] equipments,Trainer trainer)
	{
		this.name=name;
		this.fees=fees;
		this.equipments=equipments;
		this.trainer=trainer;
	}
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.fees);
		
		for (int count=0;count<this.equipments.length;count++)
		{
			System.out.print( " - "+this.equipments[count]);
		}
		System.out.println();
		this.trainer.printData();
		
		
	}
	
	
	
}