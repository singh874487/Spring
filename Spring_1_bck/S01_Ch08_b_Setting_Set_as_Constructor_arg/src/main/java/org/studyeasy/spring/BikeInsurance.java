package org.studyeasy.spring;

import java.util.Set;

public class BikeInsurance implements Insurance {

	public BikeInsurance(Set<String> listOfOwner) {
		System.out.println("List of members under Insurance");
		for (String owner : listOfOwner) {
			System.out.println(owner);
		}
	}
	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}
}

