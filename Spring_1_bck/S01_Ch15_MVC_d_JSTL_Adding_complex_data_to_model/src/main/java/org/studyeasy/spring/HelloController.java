package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request) {

		String name = request.getParameter("name").toUpperCase();
		List<String> listOfCourses = getList();
		Date date = new Date();

		ModelAndView model = new ModelAndView("hello");
		model.addObject("myName",name);
		model.addObject("courses",listOfCourses);
		model.addObject("todaysDate",date);

		return model;
	}

	private List<String> getList() {

		List<String> list = new ArrayList<>();
		list.add("Course on Spring FrameWork");
		list.add("JSP, Servlets and JSTL");
		list.add("JAVA for Beginners");
		list.add("Spring in action");
		list.add("Multithreading concepts");

		return list;
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



/*
 * add form in index.jsp , by default the method is get, can see the entered value in url
 * In hello.jsp, we are passing model element in the JSP expression lang ${formName}
 * 
 * 
 */


/*
 *	1) add jstl  maven dependency -> jstl-1.2.jar
 * 	2) add jstl api maven dependency -> javax.servlet.jsp.jstl-api-1.2.1.jar
 * 	3) search "jstl namespace for core tag" in google and add JSTL taglib directive in hello.jsp page
 * 			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 * 
 */


/*
 * 	while using ModelAndView , always give the alias while adding data into it 
 * 	otherwise might not get correct result in jsp
 * 
 */
 