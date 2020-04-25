package org.studyeasy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BikeInsurance implements Insurance {

	@Autowired
	@Qualifier("offersIndia")
	private Offer currentOffer;

	public BikeInsurance() {
	}

	public String showStatus() {

		return "Your Bike is Insured.";
	}

	public Offer getCurrentOffer() {
		return currentOffer;
	}

}
