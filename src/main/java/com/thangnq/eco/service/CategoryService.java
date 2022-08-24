package com.thangnq.eco.service;

import java.util.List;

import com.thangnq.eco.entity.Category;

public interface CategoryService {
	List<Category>  getAllCategory();
	
	Category addCategory(Category category);
	
	void deleteCategoryById(int id);
	
	Category getCategoryById(int id);
	
}
