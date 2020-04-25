package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {
 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// Beans.xml file is under src/main/resource/ folder now
		Insurance status = context.getBean("carId", Insurance.class);
		
		System.out.println(status.showStatus());

		context.close();
 
	}

}
