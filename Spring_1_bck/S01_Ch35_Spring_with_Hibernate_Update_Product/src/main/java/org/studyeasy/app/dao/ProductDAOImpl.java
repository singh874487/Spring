package org.studyeasy.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.studyeasy.app.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {

		// getting session object from the sessionFactory
		Session currentSession = sessionFactory.getCurrentSession();
		
		// Create Query
		Query<Product> theQuery = currentSession.createQuery("from products", Product.class);
		
		List<Product> products = theQuery.getResultList();
		
		System.out.println("products "+products);
		
		return products;
	}

	@Override
	public void saveProduct(Product product) {
		
		// getting session object from the sessionFactory
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(product);
		
	}

	@Override
	public Product getProductUsingId(int id) {

		// getting session object from the sessionFactory
		Session currentSession = sessionFactory.getCurrentSession();

		Product product = currentSession.get(Product.class, id);

		return product;
	}

}


/*
 * import Query from import org.hibernate.query.Query;
 * 
 */
