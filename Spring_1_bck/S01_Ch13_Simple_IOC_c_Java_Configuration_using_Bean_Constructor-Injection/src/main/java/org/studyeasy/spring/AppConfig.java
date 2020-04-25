package org.studyeasy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Offer currentOffer() {
		return new Offer();
	}
	
	@Bean("carId")
	public CarInsurance insurance() {
		return new CarInsurance(currentOffer());
	}

}
