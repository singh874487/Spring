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
 * add spring ->  spring-tx and spring-orm dependency
 * add c3p0 dependency
 * create spring xml and hibernate xml and include in appConfig.xml , use appConfig.xml in web.xml file
 * 
 *  <context:component-scan base-package="org.studyeasy.spring" /> ->> it means class registered as a bean when we do component-scan, when we mark a bean as a component
 *  
 *  @Controller, @Repository and @Service are derived from @Component annotation so these are also eligible for component-scan
 * 
 *	@Controller(Spring MVC), @Repository(DAO Layer) and @Service(Service layer)
 * 
 * 	@Controller -> Handles the HTTP requests from web browser
 * 	@Repository -> Eligible for persistence exception translation, Converts checked exception into unchecked exception
 * 	@Service  -> It doesn't currently provide any additional behaviour , but specified intent behaviour
 * 
 *  @Transactional -> Automate database transaction [beginning transaction, closing txn and closing resources are taken care by spring if we use this annotation]
 *  There are two steps to enable Transaction -> steps defined in step-3 and step-4 in hibernateConfig.xml file
 */


/*	
 * add  spring-webmvc and mysql-connector-java dependency
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
