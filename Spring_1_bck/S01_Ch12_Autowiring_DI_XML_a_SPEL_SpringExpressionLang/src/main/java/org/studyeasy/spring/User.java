package org.studyeasy.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\resources\\Beans.xml");
		// Beans.xml file is under src/main/resources/ folder now
		// and FileSystemXmlApplicationContext need complete path of it is not outside folder
		BikeInsurance status = context.getBean("myInsurance", BikeInsurance.class);

		System.out.println(status.getCurrentOffer_1());
		System.out.println(status.currentOffer_2);
		System.out.println(status.currentOffer_3);
		System.out.println(status.getCurrentOffer_4());
		
		System.out.println(status.x);
		System.out.println(status.getY());
		System.out.println(status.z);

		System.out.println(status.showStatus());
		context.close();

	}

}

/* point to remember here:
* 
* 	1) we can use spring expression lang using syntax ->   #{}
* 	2) we can perform arithmetic operation, string concatanation
* 	3) can call same class method or directly use variables
* 	4) can call other bean method or variables
*/

