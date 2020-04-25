package org.studyeasy.spring;

public class BikeInsurance implements Insurance {

	public BikeInsurance(Offer myOffer) {
		System.out.println(myOffer.getOffer());
	}

	public String showStatus() {
		return "Your Bike is Insured";
	}
	
}


