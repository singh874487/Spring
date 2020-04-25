package org.studyeasy.spring;

public class BikeInsurance implements Insurance {
	private Offer currentOffer;

	public String showStatus() {

		return "Your Bike is Insured.";
	}

	public Offer getCurrentOffer() {
		return currentOffer;
	}

	public void setCurrentOffer(Offer currentOffer) {
		this.currentOffer = currentOffer;
	}
}
