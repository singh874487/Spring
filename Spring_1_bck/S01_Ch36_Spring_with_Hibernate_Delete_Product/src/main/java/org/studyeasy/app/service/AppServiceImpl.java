package org.studyeasy.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studyeasy.app.dao.ProductDAO;
import org.studyeasy.app.entity.Product;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	private ProductDAO productDao;

	@Override
	@Transactional
	public List<Product> getProductList() {
		List<Product> products = productDao.getProducts();
		return products;
	}

	@Override
	@Transactional
	public void saveProduct(Product product) {
		
		productDao.saveProduct(product);
		
	}

	@Override
	@Transactional
	public Product getProductUsingId(int id) {
		Product Product = productDao.getProductUsingId(id);
		return Product;
	}

	@Override
	@Transactional
	public void deleteProductUsingId(int id) {
		productDao.deleteProductUsingId(id);
	}

}
