package com.sportyshoesws.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sportyshoesws.entity.Products;
import com.sportyshoesws.repository.ProductRepo;
import com.sportyshoesws.service.ProductService;

@Service
@Transactional
@Component
public class Productserviceimpl implements ProductService {

	@Autowired
	private ProductRepo productrepo;
	
	
	@Override
	public Products createProduct(Products products) {
		// TODO Auto-generated method stub
		return productrepo.save(products);
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

	@Override
	public void deleteByProductId(long productid) {
		// TODO Auto-generated method stub
		productrepo.deleteByProductid(productid);
	}


	@Override
	public Products updateProduct(Products products) {
		// TODO Auto-generated method stub
		return productrepo.save(products);
	}

	@Override
	public List<Products> findByProductCategory(String productcategory) {
		// TODO Auto-generated method stub
		return productrepo.findByProductcategory(productcategory);
	}

	@Override
	public Products findByProductId(long productid) {
		// TODO Auto-generated method stub
		return productrepo.findByProductid(productid);
	}

}
