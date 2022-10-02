package com.xworkz.inheritance;

public class JavaScript extends ProgrammingLanguage {

	
	public String latestVersion;
	public boolean platformIndependent;
	public int size;
	
	public JavaScript()
	{
		this.latestVersion="1.5.8.9.6L";
		this.platformIndependent=true;
		this.size=544;
	}
	
	public void torisu()
	{
		System.out.println("ProgrammingLanguage Details: ");
		System.out.println("Started in : "+super.startYear);
		System.out.println("Started by company : "+super.companyName);
		System.out.println();
		System.out.println("JavaScript Details: ");
		System.out.println("Latest version is : "+this.latestVersion);
		System.out.println("Is it PlatFormIndependent : "+this.platformIndependent);
		System.out.println("Size in MB :"+this.size);
	}
	
	
}
