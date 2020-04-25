package org.studyeasy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Insurance status = context.getBean("carId", Insurance.class);
		System.out.println(status.showStatus());

		context.close();

	}

}

/* points to remember here:
* 
* 	1) Remove Beans.xml file
* 	2) create a java file and annotate @Configuration() and @ComponentScan()
* 	3) add @Component() to the bean classes 
* 
*/
