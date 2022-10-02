package com.xworkz.encapsulation.parent;

public class Trainer {

	protected String name;
	protected int experience;
	protected String specialization;

	public Trainer() {
		System.out.println("Default const executed ");
		System.out.println();
	}

	public Trainer(String name, int experience, String specialization) {
		this.name = name;
		this.experience = experience;
		this.specialization = specialization;
		System.out.println("string int string constructor executed");
		System.out.println();
	}

	protected void training() {
		System.out.println("Sir teaches java in a simple way");
	}

	protected void conductInterview() {
		System.out.println("Sir conducts mock interview on every saturday");
	}

	protected void coding() {
		System.out.println("Sir checks the code everyday");
	}

}
