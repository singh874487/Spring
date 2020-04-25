package org.studyeasy.spring;

public class BikeInsurance implements Insurance {

	public String showStatus() {
		return "Your Bike is Insured";
	}

	public void start() {
		System.out.println("Start method called");
	}

	public void end() {
		System.out.println("end method called");
	}
}

