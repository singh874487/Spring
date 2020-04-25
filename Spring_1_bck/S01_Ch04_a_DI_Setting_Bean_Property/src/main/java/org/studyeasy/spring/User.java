package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {
 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// Beans.xml file is under src/main/resources/ folder now
		Insurance status = context.getBean("bikeId", Insurance.class);
		
		System.out.println(status.showStatus());
		System.out.println(status);

		context.close();

 
	}

}
