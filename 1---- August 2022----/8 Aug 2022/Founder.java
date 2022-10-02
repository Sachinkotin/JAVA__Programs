class Founder 
{
	String name;
	String birthPlace;
	int since;
	boolean isHeAlive;
	int incomeInLakh;
	Profession profession;

Founder(String name,String birthPlace,int since,boolean isHeAlive,int incomeInLakh,Profession profession)
	{
		this.name=name;
		this.birthPlace=birthPlace;
		this.since=since;
		this.isHeAlive=isHeAlive;
		this.incomeInLakh=incomeInLakh;
		this.profession=profession;
	}

	
void printData()
{
	System.out.println(this.name);
	System.out.println(this.birthPlace);
	System.out.println(this.since);
	System.out.println(this.isHeAlive);
	System.out.println(this.incomeInLakh);
	System.out.println(this.profession);
}


	
	
	
}