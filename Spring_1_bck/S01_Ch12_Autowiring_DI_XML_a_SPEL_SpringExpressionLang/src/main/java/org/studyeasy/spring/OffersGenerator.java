package org.studyeasy.spring;

public class OffersGenerator {

	String offerIndia, offerUS;
	
	public OffersGenerator() {
		this.offerIndia="No Offers, please wait for Diwali festival";
		this.offerUS="No current offers in US";
	}

	public String getOfferIndia() {
		return offerIndia;
	}

	public String getOfferUS() {
		return offerUS;
	}
	

}
