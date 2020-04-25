package org.studyeasy.spring;

import org.springframework.stereotype.Component;

@Component
public class OffersIndia implements Offer {

	private String offer = new String("Get 10% off (India)");

	public String getOffer() {
		return offer;
	}

}
