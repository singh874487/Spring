package org.studyeasy.spring;

import org.springframework.stereotype.Component;

//@Component("bikeId")
@Component
public class BikeInsurance implements Insurance {

 
	public BikeInsurance() {
	}
 
	public String showStatus() {

		return "Your Bike is Insured.";
	}

}
