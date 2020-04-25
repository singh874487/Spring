package org.studyeasy.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\resources\\Beans.xml");
		// Beans.xml file is under src/main/resources/ folder now
		// and FileSystemXmlApplicationContext need complete path of it is not outside folder
		Insurance status = context.getBean("myInsurance", Insurance.class);
		System.out.println(status.showStatus());

		context.close();

	}

}

/* point to remeber here:
* 
* 	1) if using prototype scope then destroy method will not call
* 	2) destroy method will call for singleton scope
* 
*/

