package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		BikeInsurance status = context.getBean("myInsurance", BikeInsurance.class);
		System.out.println(status.getCurrentCondition().getCondition());
		System.out.println(status.getCurrentOffer().getOffer());
 
		context.close();
	}
}


