package com.manage_assets.manage_assets.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage_assets.manage_assets.Dao.CategoryDao;
import com.manage_assets.manage_assets.entities.Category;

@Service
public class CategoryServiceimpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	public CategoryServiceimpl()
	{
		
	}
	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}
	
	@Override
	public Optional<Category> getOneCategory(Long categoryId) {
		// TODO Auto-generated method stub
		
		return categoryDao.findById(categoryId);
}
	
	
	@Override
	public Category addCategory(Category cat) {
		// TODO Auto-generated method stub
		categoryDao.save(cat);
		return cat;
	}
	
	@Override
	public Category updateCategory(Category cat) {
		categoryDao.save(cat);
		return cat;
	}

	@Override
	public String  deleteCategory(long categoryId) {
		categoryDao.deleteById(categoryId);
		return "Item deleted";
	}
		
}
