package com.example.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.example.restws.model.Product;

@Path("/productservice")
public interface ProductService {
	
	@GET
	@Path("/products")
	List<Product> getProducts();

	@POST
	@Path("/products")
	long addProduct(Product product);

}
