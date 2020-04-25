package org.studyeasy.app.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.app.entity.Product;
import org.studyeasy.app.service.AppService;

@Controller
public class AppController {

	@Autowired
	private AppService service;

	@RequestMapping("/")
	public String homePage(Model model) {
		List<Product> products = service.getProductList();

		model.addAttribute("productList", products);

		return "homepage";
	}
	
	@RequestMapping("/addProductForm")
	public String addProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "addProductForm";
	}

	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product) {
		
		service.saveProduct(product);
		
		System.out.println("Product Added"+product);
		return "redirect:/";
	}
	
	@GetMapping("updateProductForm")
	public String displayUpdateProductForm(@RequestParam("id") int id,Model model) {
		Product product = service.getProductUsingId(id);
		model.addAttribute("product", product);
		
		System.out.println("update product : "+product);
		return "addProductForm";
	}
	
	@GetMapping("deleteProduct")
	public String deleteProduct(@RequestParam("id") int id) {

		service.deleteProductUsingId(id);

		System.out.println("Product Deleted ");
		return "redirect:/";
	}

}


/*
 * update the homepage -->> add column and update link
 * replace save()  with  saveOrUpdate() in the dao impl class
 * add <form:hidden path="productID" /> in the addProductForm so hibernate will update based on id value available while saveOrUpdate()
 * also specify the complete action path in the addProductForm jsp form   ----- >>>>  action="${pageContext.request.contextPath}/addProduct"
 * 
 * 
 */

/*
 * Add homepage link in addProductForm page
 * define addProductForm() and addProduct() in alternative way
 * 
 */

/*
 * remove @Transactional from DAO Impl and add in Service Impl class
 * 
 */


/*
 * add JSTL maven dependency and then add JSTL tag library in the HTML page
 * 
 * see spring xml file for additional support added
 * 
 */

/*
 * add spring -> spring-tx and spring-orm dependency add c3p0 dependency create
 * spring xml and hibernate xml and include in appConfig.xml , use appConfig.xml
 * in web.xml file
 * 
 * <context:component-scan base-package="org.studyeasy.spring" /> ->> it means
 * class registered as a bean when we do component-scan, when we mark a bean as
 * a component
 * 
 * @Controller, @Repository and @Service are derived from @Component annotation
 * so these are also eligible for component-scan
 * 
 * @Controller(Spring MVC), @Repository(DAO Layer) and @Service(Service layer)
 * 
 * @Controller -> Handles the HTTP requests from web browser
 * 
 * @Repository -> Eligible for persistence exception translation, Converts
 * checked exception into unchecked exception
 * 
 * @Service -> It doesn't currently provide any additional behaviour , but
 * specified intent behaviour
 * 
 * @Transactional -> Automate database transaction [beginning transaction,
 * closing txn and closing resources are taken care by spring if we use this
 * annotation] There are two steps to enable Transaction -> steps defined in
 * step-3 and step-4 in hibernateConfig.xml file
 */

/*
 * add spring-webmvc and mysql-connector-java dependency add DispatcherServlet
 * in web.xml file add SpringSample-servlet.xml in resource folder and include
 * in web.xml under dispatcher servlet
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
 * 3) http://localhost:9080/S01_Ch14_Simple_MVC_a/
 * 
 */
