package org.studyeasy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:OffersList.properties")
//@PropertySource("classpath:src/main/resources/OffersList.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public Offer currentOffer() {
		return new Offer();
	}

	@Bean("carId")
	public CarInsurance insurance() {
		return new CarInsurance(currentOffer());
	}

}
