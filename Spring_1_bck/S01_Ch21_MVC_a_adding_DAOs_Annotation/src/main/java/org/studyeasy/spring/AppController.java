package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
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
}
