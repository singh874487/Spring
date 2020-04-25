package org.studyeasy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeInsurance implements Insurance {
	
	@Autowired
	private Offer currentOffer;

	public BikeInsurance() {
	}

	@Autowired(required = false)
	public BikeInsurance(Offer offer123) {
		System.out.println(offer123.getOffer());
	}

	public String showStatus() {

		return "Your Bike is Insured.";
	}

	public Offer getCurrentOffer() {
		return currentOffer;
	}
 
	
}
