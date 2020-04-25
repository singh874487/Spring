package org.studyeasy.spring;

public class BikeInsurance implements Insurance {

	private Offer offer;

	public BikeInsurance() {
	}

	public BikeInsurance(Offer offer) {
		this.offer = offer;
		System.out.println(this.offer.getOffer());
	}

	public String showStatus() {

		return "Your Bike is Insured.";
	}

}
