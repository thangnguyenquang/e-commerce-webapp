package com.thangnq.eco.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangnq.eco.entity.Category;
import com.thangnq.eco.repository.CategoryRepository;
import com.thangnq.eco.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategoryById(int id) {
		categoryRepository.deleteById(id);	
	}

	@Override
	public Category getCategoryById(int id) {
		Optional<Category> categoryoOptional = categoryRepository.findById(id);
		Category category = null;
		if(categoryoOptional.isPresent()) {
			category = categoryoOptional.get();
		} else {
			throw new RuntimeException("Category not found for id :: " + id);
		}
		return category;
	}


}
