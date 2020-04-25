package org.studyeasy.spring;

import org.springframework.stereotype.Component;

//@Component("offer")
public class Offer {

	private String offer = new String("Get 10% off");

	public String getOffer() {
		return offer;
	}

}
