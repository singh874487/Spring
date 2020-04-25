package org.studyeasy.spring;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {	

	@RequestMapping("/hello")
	public ModelAndView helloWorld(@Valid @ModelAttribute("info") Information data, BindingResult result) {

		ModelAndView model = new ModelAndView("hello");
		model.addObject("fName", data.getFirstName().toUpperCase());
		model.addObject("lName", data.getLastName().toUpperCase());
		model.addObject("gender", data.getGender());
		model.addObject("myCountry", data.getCountry());
		model.addObject("myMessage", data.getMessage());
		model.addObject("visitedCountries", data.getVisitedCountries());

		if (result.hasErrors()) {
			
			System.out.println("Has Errors :( ");
			model = getBaseModel();
			model.addObject("info",data);
		} else {
			System.out.println("Good to Go!");
		}

		return model;
	}

	@RequestMapping("/")
	public ModelAndView homePage() {
		
		ModelAndView model = null;
		
		model = getBaseModel();

		return model;
	}

	private ModelAndView getBaseModel() {
		
		ModelAndView model = new ModelAndView("index", "info", new Information());
		
		Map<String, String> gender = new HashMap<>();
		gender.put("Male", "Male");
		gender.put("Female", "Female");

		Map<String, String> country = new LinkedHashMap<>();
		country.put("India", "India");
		country.put("USA", "USA");
		country.put("China", "China");
		
		Map<String, String> visitedCountries = new LinkedHashMap<>();
		visitedCountries.put("India", "India");
		visitedCountries.put("USA", "USA");
		visitedCountries.put("China", "China");
		visitedCountries.put("Thailand", "Thailand");
		visitedCountries.put("Sweden", "Sweden");
		visitedCountries.put("Australia", "Australia");
		visitedCountries.put("Pakistan", "Pakistan");
		
		model.addObject("genderList", gender);
		model.addObject("countryList", country);
		model.addObject("visitedCountryList", visitedCountries);
		
		return model;
	}

	
	
}

/*
 * download below dependency for hibernate validator JSR303
 * 			javax validation-api
 * 			hibernate-validator
 * 
 */

/*
 *  we have added html validation in firstname field
 *  we can remove @ModelAttribute from the helloWorld method and it will work fine
 */

/*
 *  update SpringSample-servlet.xml by selecting mvc under namespaces tab
 *  add mvc:annotation-driven tag inside mvc 
 *  add mvc:resources element tag inside mvc
 *  fill entries inside mvc:resources element tag -> 
 *  		location -> /WEB-INF/template/
 *  		mapping -> /files/*
 *  
 *   http://localhost:9080/S01_Ch18_MVC_a_Adding_Enternal_Resources/files/test.txt
 *   
 *   
 *  or if we move test.txt file inside temp folder created inside template folder then use **
 *  fill entries inside mvc:resources element tag -> 
 *  		location -> /WEB-INF/template/
 *  		mapping -> /files/**
 *   
 *   http://localhost:9080/S01_Ch18_MVC_a_Adding_Enternal_Resources/files/temp/test.txt
 */

/*
 * points to remember here:
 * 
 * 1) Not required to add maven dependency for servlet and jsp in pom if using
 * Tomcat configure build path -> libraries -> add Library -> Server runtime ->
 * click next -> select Apache Tomcat -> Apply close 2) if getting exception ->
 * java.lang.ClassNotFoundException: project's properties -> Select
 * "Deployment Assembly" -> Click the "Add..." button -> Select
 * "Java Build Path Entries" ->Select "Maven Dependencies" ->click "Finish"
 * 
 * 
 * 3) http://localhost:9080/S01_Ch14_Simple_MVC_b_Adding_HomePage/
 */

/*
 * The prog will run even if we remove the <init-param> tag from web xml file
 * because SpringSample-servlet.xml file is following the specific format
 * [nameOfServlet-servlet.xml]
 * 
 * xml file name if follow the correct format then not required <init-param> tag
 * in web.xml file
 * 
 */

/*
 * add form in index.jsp , by default the method is get, can see the entered
 * value in url In hello.jsp, we are passing model element in the JSP expression
 * lang ${formName}
 * 
 * 
 */

/*
 * 1) add jstl maven dependency -> jstl-1.2.jar 
 * 2) add jstl api maven dependency
 * -> javax.servlet.jsp.jstl-api-1.2.1.jar 3) search
 * "jstl namespace for core tag" in google and add JSTL taglib directive in
 * hello.jsp page <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
 * %>
 * 
 */

/*
 * while using ModelAndView , always give the alias while adding data into it
 * otherwise might not get correct result in jsp
 * 
 */


/*
 * 	add support for spring tags by adding in index.html
 *  add support for model attribute
 */

/*
 *  can use in jsp
 *  
 *  	<form:select path="country" items="${countryList}">
		</form:select>
 */
 