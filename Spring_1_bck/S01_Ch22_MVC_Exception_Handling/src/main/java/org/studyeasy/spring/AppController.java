package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
		
		listUsers = dao.listUsers(1);
		
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
	
	/*
	 * @ExceptionHandler(Exception.class) public String exceptionHandler(Exception
	 * e) { return "error"; }
	 */
}




/*
 *  Points to remember
 *  make an error in the java file and run the application will get compilation error
 *  create a error.jsp page
 *  write an exception handler method or defined it in seperate class 
 *  add @ControllerAdvice if defining exception handler method in a seperate class
 *  run the application
 *  
 */
 
