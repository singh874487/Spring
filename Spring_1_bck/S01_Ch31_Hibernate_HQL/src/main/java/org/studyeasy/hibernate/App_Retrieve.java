package org.studyeasy.hibernate;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App_Retrieve {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().
				configure("hibernate.config.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
 
			// Start transaction
			session.beginTransaction();
			
			System.out.println("Displaying simple HQL result ");
			
			List<Users> listOfUsers = session.createQuery("from users").getResultList();
 
			for(Users user : listOfUsers) {
				System.out.println(user);
			}
			
			System.out.println("Displaying HQL result with condition ");
			
			List<Users> users = session.createQuery("from users where firstName = 'aman' OR "
					+ " last_name='singh' OR lastName like 'k%m%'").getResultList();
			for (Users user : users) {
				System.out.println(user);
			}
			
			
			// Commit the transaction
			// optional
			//session.getTransaction().commit();
 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}


/*
 *  here where condition is NOT a case sensitive
 *  we can also use pojo property name(firstName) or table column(first_name) name( acceptable)
 */


/*
 * 	list() used in older version of hibernate whereas getResultList() sued in hibernate 5 above version.
 * 
 *  if getting this error   ---- >>>>   java.lang.IllegalArgumentException: org.hibernate.hql.internal.ast.QuerySyntaxException: users is not mapped [from users]
 *   then add @Entity(name = "users") in the entity class
 *  
 *  session.getTransaction().commit(); is optional
 *  
 */	



/*
 * add no-arg constructor in entity class
 * retrieve data using App_Retrieve class
 * 
 */


/*
 *  Points to remember
 *  	add hibernate and mySql dependency in pom file
 *  	create hibernate configuration file
 *  	crerate pojo class and corresponding table in DB
 *  	Test the app
 *  	
 * 
 */
 