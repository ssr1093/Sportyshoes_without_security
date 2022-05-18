package com.sportyshoesws.service;

import java.util.List;

import com.sportyshoesws.entity.Products;

public interface ProductService {

	public Products createProduct(Products products);
	public List<Products> getAllProducts();
	public void deleteByProductId(long productid);
	public Products findByProductId(long productid);
	public Products updateProduct(Products products);
	public List<Products> findByProductCategory(String productcategory);
}
