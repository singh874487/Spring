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
 *  
 *  change the url-pattern [ <url-pattern>/*</url-pattern>] and run then will get -> [No bean named 'springSecurityFilterChain' available]
 *  
 *  create an xml file inside config folder named SpringSecurityConfig.xml using spring plugin-> add security from namespace then we can see security tab -> 
 *  	from sec tab add (authontication-manager) for this application -> add authentication-provider from (authontication-manager) -> 
 *  	add user-service from authentication-provider for example purpose -> add user from user-service ->
 *  	under this user, give name=aman, password=aman, authority=admin -> add another user also with admin authority.
 *  
 *  
 *  sec->beans->add security-http (using http we can restrict the access based on url/ based on the http request)-> add intercept-url ->
 *  	add pattern = /** means we are restricting each and every request coming to the application using "access" field 
 *		search "spring security access expression" to see the available in spring.io doc
 *		access = denyAll  -> this will deny all the request coming to the application
 *  
 *  add form login element from http - form login enable to authenticate a user using login form 
 *	click http->> use-expresion = true
 *  
 *  
 *  Create a third xml file and include spring mvc and sring security xml file in it and finally include only third xml file in web.xml file
 *  	change in web.xml 	  <param-value>classpath:org/studyeasy/spring/config/SpringConfig.xml</param-value>
 */
