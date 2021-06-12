package com.manage_assets.manage_assets.Service;

import java.util.List;
import java.util.Optional;

import com.manage_assets.manage_assets.entities.Category;

public interface CategoryService {
	
	public List<Category> getCategory();
	
	public Optional<Category> getOneCategory(Long categoryId);
	
	public Category addCategory(Category cat);
	
	public Category updateCategory(Category cat);

	public String deleteCategory(long categoryId);

}
