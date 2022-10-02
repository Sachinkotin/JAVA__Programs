package com.xworkz.inheritance;

public class Institute {

public String courseOffered;
public String placeName;
public int noOfStaff;
public int fee;
public long phone;

public Institute(String courseOffered,String placeName,int noOfStaff,int fee,long phone)
{
	

	this.courseOffered=courseOffered;
	this.placeName=placeName;
	this.noOfStaff=noOfStaff;
	this.fee=fee;
	this.phone=phone;
}

public void torisu()
{
	
System.out.println("Institute Details: ");
System.out.println("Courses offered is "+this.courseOffered);
System.out.println("Place is "+this.placeName);
System.out.println("No of Staff "+this.noOfStaff);
System.out.println("Fee "+this.fee);
System.out.println("Contact No: "+this.phone);





}

}
