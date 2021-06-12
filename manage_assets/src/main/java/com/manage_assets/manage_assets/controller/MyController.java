package com.manage_assets.manage_assets.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manage_assets.manage_assets.Service.AssetService;
import com.manage_assets.manage_assets.Service.CategoryService;
import com.manage_assets.manage_assets.entities.Assets;
import com.manage_assets.manage_assets.entities.Category;

@RestController
public class MyController {
	
	@Autowired
	private CategoryService categoryService;
	//get all category list
	
	@Autowired
	private AssetService assetService;
	
	@GetMapping("/category")
	public List<Category> getCategory()
	{
		return this.categoryService.getCategory();
	}
	
	
	@GetMapping("/category/{categoryId}")
	public Optional<Category> getOneCategory(@PathVariable String categoryId)
	{
		return this.categoryService.getOneCategory(Long.parseLong(categoryId));
	}
	
	@PostMapping("/categoryadd")
	public Category addCategory(@RequestBody Category cat)
	{
		return this.categoryService.addCategory(cat);
	}
	
	@PutMapping("/categoryupdate")
	public Category updateCategory(@RequestBody Category cat)
	{
		return this.categoryService.updateCategory(cat);
	}
	
	
	@DeleteMapping("/categorydelete/{categoryId}")
	public String deleteCategory(@PathVariable String categoryId)
	{
		return this.categoryService.deleteCategory(Long.parseLong(categoryId));
	}
	
	
	@GetMapping("/assets")
	public List<Assets> getAsset()
	{
		return this.assetService.getAsset();
	}
	
	@GetMapping("/assets/{assetName}")
	public Assets getOneAsset(@PathVariable String assetName)
	{
		return this.assetService.getOneAsset(assetName);
	}
	
	
	@PostMapping("/assetsadd")
	public Assets addAssets(@RequestBody Assets as)
	{
		return this.assetService.addAssets(as);
	}
	
	
	@PutMapping("/assetsupdate")
	public Assets updateAssets(@RequestBody Assets as)
	{
		return this.assetService.updateAssets(as);
	}
	
	@DeleteMapping("/assetsdelete/{assetName}")
	public String assetDelete(@PathVariable String assetName)
	{
		return this.assetService.deleteAssets(assetName);
	}

	@PutMapping("/assetsassign/{assetName}")
	public String assignAssets(@PathVariable String assetName)
	{
		return this.assetService.assignAssets(assetName);
	}
	
	@PutMapping("/assetsrecover/{assetName}")
	public String recoverAssets(@PathVariable String assetName)
	{
		return this.assetService.recoverAssets(assetName);
	}
	
	
}
