package org.studyeasy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Insurance status = context.getBean("carId", Insurance.class);
		System.out.println(status.showStatus());
		System.out.println(status.getOffer().getCurrentOffer());

		context.close();

	}

}



/* points to remember here:
* 
* 	1) Remove Beans.xml file
* 	2) remove @Component() from the bean classes if present 
*  	3) create a Java file(AppConfig) and annotate @Configuration() only
*  	3) defining method and annotate @Bean in the Java file(AppConfig) for DI
* 
*/
