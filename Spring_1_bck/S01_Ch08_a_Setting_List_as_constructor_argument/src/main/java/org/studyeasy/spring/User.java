package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		// since Beans.xml file directly inside the scr folder
		Insurance status = context.getBean("myInsurance", Insurance.class);
		System.out.println(status.showStatus());

		context.close();

	}

}
