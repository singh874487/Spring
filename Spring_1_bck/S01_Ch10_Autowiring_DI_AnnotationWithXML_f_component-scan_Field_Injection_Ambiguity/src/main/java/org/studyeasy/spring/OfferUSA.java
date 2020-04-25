package org.studyeasy.spring;

import org.springframework.stereotype.Component;

@Component
public class OfferUSA implements Offer {

	private String offer = new String("Get 20% off (USA)");

	public String getOffer() {
		return offer;
	}

}
