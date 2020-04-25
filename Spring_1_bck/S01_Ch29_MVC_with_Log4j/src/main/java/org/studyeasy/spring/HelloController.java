package org.studyeasy.spring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	private static final Logger logger = Logger.getLogger(HelloController.class);

	@RequestMapping("/")
	public String homePage() {
		logger.info("homePage() entered");
		return "home";
	}

	@RequestMapping("/user")
	public ModelAndView userPage() {
		logger.info("userPage() entered");
		ModelAndView model = new ModelAndView("user");
		return model;
	}

	@RequestMapping("/admin")
	public ModelAndView adminPage() {
		logger.warn("adminPage() entered");
		ModelAndView model = new ModelAndView("admin");
		return model;
	}

}



/*
 * 	Points to remember
 * 		add log4j dependency in pom file
 * 		create log4j.properties file inside resource folder
 * 		configure resources folder inside pom file if required
 * 		use logger in java files
 * 
 */
