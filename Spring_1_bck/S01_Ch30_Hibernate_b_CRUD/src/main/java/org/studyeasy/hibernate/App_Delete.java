package org.studyeasy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App_Delete {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().
				configure("hibernate.config.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			// Create an object
			Users user = new Users();
			// Start transaction
			session.beginTransaction();
			// Perform operation
			user = session.get(Users.class, 2);

			// Delete an object
			 session.delete(user);

			// Commit the transaction
			session.getTransaction().commit();

			System.out.println("-------------------------------------");
			System.out.println("Record deleted : " + user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}

/*
 * add no-arg constructor in entity class
 * delete record using App_Retrieve class
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
 