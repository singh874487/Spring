package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// Beans.xml file is under src/main/resources/ folder now
		// and FileSystemXmlApplicationContext need complete path of it is not outside folder
		BikeInsurance status = context.getBean("myInsurance", BikeInsurance.class);

		System.out.println(status.getCurrentOffer_1());
		System.out.println(status.currentOffer_2);
		
		/*
		 * System.out.println(status.x); System.out.println(status.getY());
		 */
		System.out.println(status.z);

		System.out.println(status.showStatus());
		context.close();

	}

}

/* point to remember here:
 * 
*/

