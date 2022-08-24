package com.thangnq.eco.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangnq.eco.entity.Product;
import com.thangnq.eco.repository.ProductRepository;
import com.thangnq.eco.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(long id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> productOptional = productRepository.findById(id);
		Product product = null;
		if(productOptional.isPresent()) {
			product = productOptional.get();
		} else {
			throw new RuntimeException("Product not found for id :: " + id);
		}
		return product;
	}

	@Override
	public List<Product> getProductsByCategoryId(int id) {
		return productRepository.findProductByCategory_Id(id);
	}

}
