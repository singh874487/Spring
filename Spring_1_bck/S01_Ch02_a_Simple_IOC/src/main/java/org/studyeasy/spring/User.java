package org.studyeasy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		ApplicationContext context_1 = new FileSystemXmlApplicationContext("Beans.xml");
		Insurance status_1 = context_1.getBean("carId", Insurance.class);
		System.out.println(status_1.showStatus());

		// the above warning can remove by using the child class name		
		FileSystemXmlApplicationContext context_2 = new FileSystemXmlApplicationContext("Beans.xml");
		// since Beans.xml file directly inside the S03-Simple_IOC
		Insurance status_2 = context_2.getBean("carId_2", Insurance.class);
		System.out.println(status_2.showStatus());
		
		context_2.close();
		
		FileSystemXmlApplicationContext context_3 = new FileSystemXmlApplicationContext("/src/main/resources/Beans_2.xml");
		// since Beans.xml file directly inside the /src/main/resources
		Insurance status_3 = context_3.getBean("bike_id", Insurance.class);
		System.out.println(status_3.showStatus());

		context_3.close();
		
		
		ClassPathXmlApplicationContext context_4 = new ClassPathXmlApplicationContext("Beans_2.xml");
		// Beans.xml file is under src folder now
		Insurance status_4 = context_4.getBean("bike_id", Insurance.class);
		System.out.println(status_4.showStatus());

		context_4.close();
		
		
		
		

	}

}

/* points to remember here:
 * 
 * 	1) warning  - can resolve by closing the context using close() present in the child class.
 * 	2) FileSystemXmlApplicationContext class refers the base folder as a project folder so it starts search from outside of all folder
 * 	3) ClassPathXmlApplicationContext class refers src-resource folder as a base folder so start search file src-resource folder.
 * 
 */
	
