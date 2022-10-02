class Trainer
{
	String name;
	long contactNo;
	int experience;
	int age;
	Gender gender;
	
	Trainer(String name,long contactNo,int experience,int age,Gender gender)
	{
		this.name=name;
		this.contactNo=contactNo;
		this.experience=experience;
		this.age=age;	
		this.gender=gender;
	}
	
	
	
	
	void printData()
	{
		System.out.println(this.name);
		System.out.println(this.contactNo);
		System.out.println(this.experience);
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.gender.value);
		
		
	}
	
	
	
}