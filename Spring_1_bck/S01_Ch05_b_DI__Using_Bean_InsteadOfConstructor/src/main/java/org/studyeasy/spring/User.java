package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {
 
		// Beans.xml file is under src/main/resources/ folder now
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Insurance status = context.getBean("bikeId", Insurance.class);
		
		System.out.println(status.showStatus());
		
		System.out.println(status.getCurrentOffer().getOffer());

		context.close();

	}

}
