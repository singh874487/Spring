package org.studyeasy.spring;

public class CarInsurance implements Insurance {

	Offer offer;

	public CarInsurance(Offer offer) {
		this.offer = offer;
	}

	public String showStatus() {

		return "Your Car is Insured";
	}

	public Offer getOffer() {
		return offer;
	}

	
	
}
