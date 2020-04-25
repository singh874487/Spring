package org.studyeasy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Insurance status = context.getBean("carId", Insurance.class);
		System.out.println(status.showStatus());
		System.out.println(status.getOffer().getCurrentOffer());
		
		System.out.println(status.getOffer().getExtraOffer());

		context.close();

	}

}



/* points to remember here:
* 
* 	1) create the prop file
* 	1) load the property file in configuration class(AppConfig) file using @PropertySource()
* 	3) create a Bean for property source placeholder configurer using PropertySourcesPlaceholderConfigurer()
* 	4) use the @Value() to initialize the value from prop file on the beans property
* 	5) once the prop file loads, the values from their will be available and can use anywhere in tha app
* 	6) It is like field injection since we are defining values in the prop file and reading from their to feed in the beans properties
* 
* *****************************************
* 	The same thing we can do using setter method as well(we can inject the values directly in the set method)
* 		a) annotate @Autowired on setter method
* 		b) use @Value() as a field binding
* 		c) if we comment @Autowired then default value will be assigned.
* 				-- see Offer class 
* 
* ******************************************
* 	@Value() can be used with field without autowiring however while using it with setter method require autowiring
* 
*/
