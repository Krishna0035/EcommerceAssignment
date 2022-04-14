package com.test.EcommerceAssignment.service;

import java.util.List;

import com.test.EcommerceAssignment.entities.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product updateProduct(int id, Product product);
	
	public List<Product> getAllProduct();
	
	public Product getAProduct(int id);

}
