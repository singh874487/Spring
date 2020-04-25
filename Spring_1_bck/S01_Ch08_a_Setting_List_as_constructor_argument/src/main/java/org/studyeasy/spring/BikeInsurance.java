package org.studyeasy.spring;

import java.util.List;

public class BikeInsurance implements Insurance {

	public BikeInsurance(List<String> listOfOwner) {
		for (String owner : listOfOwner) {
			System.out.println(owner);
		}
	}
	public String showStatus() {
		return "Your Bike is Insured";
	}
 
}

