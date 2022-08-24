package com.thangnq.eco.service;

import java.util.List;

import com.thangnq.eco.entity.Product;

public interface ProductService {
	List<Product> getAllProduct();
	
	Product addProduct(Product product);
	
	void deleteProductById(long id);
	
	Product getProductById(long id);
	
	List<Product> getProductsByCategoryId(int id);
}
