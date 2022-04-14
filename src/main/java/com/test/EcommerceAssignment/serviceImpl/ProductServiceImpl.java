package com.test.EcommerceAssignment.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.EcommerceAssignment.entities.Product;
import com.test.EcommerceAssignment.repository.ProductRepository;
import com.test.EcommerceAssignment.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(int id, Product product) {
		Product prod = productRepository.findById(id).get();
		
		product.setProductId(prod.getProductId());
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getAProduct(int id) {
		return productRepository.findById(id).get();
	}

}
