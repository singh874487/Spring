package org.studyeasy.spring;

import org.springframework.stereotype.Component;

@Component("carId")
public class CarInsurance implements Insurance {

	public String showStatus() {

		return "Your Car is Insured";
	}

}
