package org.studyeasy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		// change and test using Beans.xml and Beans2.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		// since Beans.xml file directly inside the src folder
		BikeInsurance status = context.getBean("myInsurance", BikeInsurance.class);
		System.out.println(status.getCurrentCondition().getCondition());
		System.out.println(status.getCurrentOffer().getOffer());
 
		context.close();
	}
}




/* points to remeber here:
* 
* 	1) Beans.xml will give correct result if we specify multiple same beans then will get ambiguity
* 		a) To resolve this problem, we can either mark first two beans as autowire-candidate true or mark third as false
* 	2) second solution is to define in parent beans [see Beans2.xml]
* 		a) Don’t give space between the default-autowire-candidates attribute otherwise will not work
* 	3) We can override the default value specify in parent by defining it in local, then parent default setting will be overridden by the local settings
* 
*/



