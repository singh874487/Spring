package org.studyeasy.app.dao;

import java.util.List;

import org.studyeasy.app.entity.Product;

public interface ProductDAO {
	
	public List<Product> getProducts();
	
	public void saveProduct(Product product);

	public Product getProductUsingId(int id);

	public void deleteProductUsingId(int id);

}
