package com.sportyshoesws.service;

import java.util.Date;
import java.util.List;

import com.sportyshoesws.entity.Products;
import com.sportyshoesws.entity.Purchase;

public interface Purchaseservice {

	
	public Purchase createPurchase(Purchase purchase);
	public List<Purchase> getAllPurchases();
	public Purchase findByPurchaseId(long purchaseid);
	public List<Products> findByProductCategory(String productcategory);
	public List<Purchase> findByPurchaseDate(Date purchaseDate);
}
