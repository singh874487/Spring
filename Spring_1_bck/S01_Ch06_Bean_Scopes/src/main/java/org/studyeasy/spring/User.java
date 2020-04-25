package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// Beans.xml file is under src/main/resources/ folder now
		Offer offer1 = (Offer) context.getBean("myOffer"); // another way type casting
		
		System.out.println("Offer				                      : "+ offer1.getOffer());
		offer1.setOffer("Get 10% discount on next purchase");
		System.out.println("Offer after modification     		              : " +offer1.getOffer());

		Offer offer2 = (Offer) context.getBean("myOffer"); // bydefault scope is singleton 
		System.out.println("Offer after second attempt to retrieve from container : " + offer2.getOffer()); // so gives same result

		System.out.println("\nBoth beans pointing same object : " +(offer1==offer2));
		System.out.println("\nOffer_1 address : " +offer1); // since scope is singleton so both ref pointing to same memory location
		System.out.println("Offer_2 address : " +offer2); // so both address will be same
		
		context.close();

	}

}


