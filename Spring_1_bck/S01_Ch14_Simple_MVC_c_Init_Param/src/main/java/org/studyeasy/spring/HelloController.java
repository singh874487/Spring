package org.studyeasy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello";
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

}



/* points to remember here:
* 
* 	1)  Not required to add maven dependency for servlet and jsp in pom if using Tomcat
* 			configure build path -> libraries -> add Library -> Server runtime -> click next -> select Apache Tomcat -> Apply close
* 	2)  if getting exception -> java.lang.ClassNotFoundException: 
* 			project's properties -> Select "Deployment Assembly" -> Click the "Add..." button -> Select "Java Build Path Entries" ->Select "Maven Dependencies" ->click "Finish"
* 
* 
* 	3) http://localhost:9080/S01_Ch14_Simple_MVC_b_Adding_HomePage/
*/





/*
 * The prog will run even if we remove the <init-param> tag from web xml file
 * because SpringSample-servlet.xml file is following the specific format  [nameOfServlet-servlet.xml]
 * 
 * xml file name if follow the correct format then not required <init-param> tag in web.xml file 
 * 
 */


