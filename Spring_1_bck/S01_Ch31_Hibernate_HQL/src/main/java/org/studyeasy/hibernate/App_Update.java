package org.studyeasy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App_Update {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().
				configure("hibernate.config.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			// Start transaction
			session.beginTransaction();
			
			session.createQuery("update users set password = 'hello123' where user_id=3 ").executeUpdate();
 
			// better to commit the transaction
			session.getTransaction().commit();
			
			
			System.out.println("-------------------------------------");
			System.out.println("User Updated ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}

/*
 * use executeUpdate() to update the records
 * better to commit the transaction even it is optional
 */

/*
 * add no-arg constructor in entity class
 * update data using App_Retrieve class
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
 