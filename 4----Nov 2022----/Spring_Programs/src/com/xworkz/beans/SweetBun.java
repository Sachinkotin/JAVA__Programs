package com.xworkz.beans;

public class SweetBun {
	
	private int price;
	@Override
	public String toString() {
		return "SweetBun [price=" + price + "]";
	}

	public SweetBun() {
	System.out.println("Inside sweet bun default constructor");
	}
	
	public void show()
	{
		System.out.println("Inside SweetBun show method");
		System.out.println("Taste of Bun is sweet"); 
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
