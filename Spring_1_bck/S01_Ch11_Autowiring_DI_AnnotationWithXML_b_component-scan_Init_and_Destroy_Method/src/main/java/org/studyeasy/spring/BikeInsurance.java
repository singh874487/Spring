package org.studyeasy.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("myInsurance")
//@Scope("prototype")
public class BikeInsurance implements Insurance {

	public String showStatus() {
		return "Your Bike is Insured";
	}

	@PostConstruct
	public void initMe() {
		System.out.println("Start method called");
	}

	@PreDestroy
	public void doSomethingBeforeDestroy() {
		System.out.println("end method called : Do something before destroy");
	}
}

