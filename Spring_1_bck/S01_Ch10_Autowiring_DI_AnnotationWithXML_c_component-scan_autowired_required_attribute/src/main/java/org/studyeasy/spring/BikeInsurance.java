package org.studyeasy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bikeId")
public class BikeInsurance implements Insurance {

	public BikeInsurance() {
	}

	@Autowired(required = false)
	public BikeInsurance(Offer offer123) {
		System.out.println(offer123.getOffer());
	}

	public String showStatus() {

		return "Your Bike is Insured.";
	}

}
