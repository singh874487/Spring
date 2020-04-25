package org.studyeasy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePage() {
		return "homepage";
	}
	
}


/*	
 * add  spring-webmvc dependency
 * add DispatcherServlet in web.xml file
 * add SpringSample-servlet.xml in resource folder and include in web.xml under dispatcher servlet
 */


/* points to remember here:
* 
* 	1)  Not required to add maven dependency for servlet and jsp in pom if using Tomcat
* 			configure build path -> libraries -> add Library -> Server runtime -> click next -> select Apache Tomcat -> Apply close
* 	2)  if getting exception -> java.lang.ClassNotFoundException: 
* 			project's properties -> Select "Deployment Assembly" -> Click the "Add..." button -> Select "Java Build Path Entries" ->Select "Maven Dependencies" ->click "Finish"
* 
* 
* 	3) http://localhost:9080/S01_Ch14_Simple_MVC_a/
* 
*/
