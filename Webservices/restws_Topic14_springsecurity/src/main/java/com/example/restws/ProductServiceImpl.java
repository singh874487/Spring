package com.example.restws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restws.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products = new ArrayList<>();
	private long id = 123;

	public ProductServiceImpl() {
		Product product = new Product();
		product.setId(++id);
		product.setDescription("Java 8");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public long addProduct(Product product) {
		product.setId(++id);
		products.add(product);

		return product.getId();
	}

}
