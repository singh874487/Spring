package org.studyeasy.app.service;

import java.util.List;

import org.studyeasy.app.entity.Product;

public interface AppService {

	public List<Product> getProductList();
	
	public void saveProduct(Product product);

}
