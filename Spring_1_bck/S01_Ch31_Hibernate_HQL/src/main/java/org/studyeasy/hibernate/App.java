package org.studyeasy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().
				configure("hibernate.config.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			// Create object of the entity class type
			Users user = new Users("rohan123", "12345", "rohan", "singh");
			// Start transaction
			session.beginTransaction();
			// Perform operation
			session.save(user);
			// Commit the transaction
			session.getTransaction().commit();

			System.out.println("Record added");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}


/*
 *  Points to remember
 *  	add hibernate and mySql dependency in pom file
 *  	create hibernate configuration file
 *  	crerate pojo class and corresponding table in DB
 *  	Test the app
 *  	
 * 
 */
 