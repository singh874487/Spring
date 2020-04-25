package org.studyeasy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Offer {

	@Value("${offers.IND}")
	public String currentOffer = "No Offers";
	
	public String extraOffer = "No extra discount";

	public String getCurrentOffer() {
		return currentOffer;
	}

	public void setCurrentOffer(String currentOffer) {
		this.currentOffer = currentOffer;
	}

	public String getExtraOffer() {
		return extraOffer;
	}

	@Autowired
	public void setExtraOffer( @Value("${offers.US}") String extraOffer) {
		this.extraOffer = extraOffer;
	}
	
	

}
