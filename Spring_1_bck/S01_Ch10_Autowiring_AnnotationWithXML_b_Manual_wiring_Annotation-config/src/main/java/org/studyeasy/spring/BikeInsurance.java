package org.studyeasy.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class BikeInsurance implements Insurance {

 
	public BikeInsurance() {
	}
	
	@Autowired
	public BikeInsurance(Offer offer123) {
		System.out.println(offer123.getOffer());
	}
 
	public String showStatus() {

		return "Your Bike is Insured.";
	}

}
