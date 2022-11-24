package com.xworkz.beans;

public class Bike {

	//used it in SpringConfigrn.xml
	private int price;
	private String brand;
	
	public Bike() {
		System.out.println("Inside default Bike constructor");
	}

	public Bike(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Bike [price=" + price + ", brand=" + brand + "]";
	}
	
	
	
}
