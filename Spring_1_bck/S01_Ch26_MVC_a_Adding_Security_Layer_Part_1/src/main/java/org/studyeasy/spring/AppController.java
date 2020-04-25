package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.spring.config.AppConfig;
import org.studyeasy.spring.dao.AppDAOImpl;
import org.studyeasy.spring.model.User;

@Controller
public class AppController {
	


	@RequestMapping("/")
	public ModelAndView homePage() {
		List<User> listUsers = new ArrayList<>();
		ModelAndView model = new ModelAndView("index");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl dao = context.getBean("DAOBean",AppDAOImpl.class);
		
		listUsers = dao.listUsers();
		
		context.close();
		
		System.out.println("listUsers :"+listUsers);
		
		model.addObject("usersList",listUsers);
		
		return model;
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user, Model model) {

		model.addAttribute("user", user);

		return "userForm";
	}
	 
	
	/*
	 * @RequestMapping("/addUser") public String
	 * addUser(@Valid @ModelAttribute("user") User user, Model model, BindingResult
	 * result) {
	 * 
	 * if (result.hasErrors()) { model.addAttribute("user", user); return
	 * "userForm"; } else {
	 * 
	 * if (user.getName() != null && user.getEmail() != null) {
	 * 
	 * AnnotationConfigApplicationContext context = new
	 * AnnotationConfigApplicationContext(AppConfig.class);
	 * 
	 * AppDAOImpl dao = context.getBean("DAOBean", AppDAOImpl.class);
	 * 
	 * dao.addUser(user); context.close();
	 * 
	 * return "forward:/"; } else { return "userForm"; } }
	 * 
	 * }
	 */
	
	
	
	@RequestMapping("/saveUser")
	public String saveUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
		
		String form = null;
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			form = "userForm";

		} else {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

			AppDAOImpl dao = context.getBean("DAOBean", AppDAOImpl.class);

			dao.addUser(user);
			context.close();

			form = "forward:/";
		}

		return form;
	}
	 
}

/*
 *  Points to remember
 *  	download spring jar dependencis [spring-security-core,web,config]
 *  	remove J2EE filter if configure in web.xml file and delete the  filter class as well
 *  	add the filter provided by spring( Filter->select existing class ->org.springframework.web.filter.DelegatingFilterProxy -> give it name [springSecurityFilterChain] -> Finish ))
 *  	check in web.xml file and change the url-pattern [ <url-pattern>/*</url-pattern>]
 *  	renamed spring config file to [SpringMVCConfig.xml], paste it in config folder -> change web.xml <param-value>classpath:org/studyeasy/spring/config/SpringMVCConfig.xml</param-value> and run it
 *  	
 *  	change url-pattern in web.xml file [ <url-pattern>/test</url-pattern>]
 *  	check url -> http://localhost:9080/S01_Ch26_MVC_a_Adding_Security_Layer_Part_1/test
 *  		it should not work will see in part-2		
 *  
 */
