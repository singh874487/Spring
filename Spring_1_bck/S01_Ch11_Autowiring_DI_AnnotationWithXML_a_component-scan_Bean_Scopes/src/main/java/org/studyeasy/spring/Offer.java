package org.studyeasy.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myOffer")
//@Scope("prototype")
public class Offer {
	private String offer = new String("No Current Offers");

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
}
