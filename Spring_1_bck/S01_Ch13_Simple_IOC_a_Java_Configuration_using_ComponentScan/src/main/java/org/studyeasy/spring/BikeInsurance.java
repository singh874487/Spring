package org.studyeasy.spring;

import org.springframework.stereotype.Component;

@Component("bikeId")
public class BikeInsurance implements Insurance {

	public String showStatus() {

		return "Your Bike is Insured";
	}

}
