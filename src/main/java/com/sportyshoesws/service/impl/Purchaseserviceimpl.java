package com.sportyshoesws.service.impl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sportyshoesws.entity.Products;
import com.sportyshoesws.entity.Purchase;
import com.sportyshoesws.repository.Purchaserepo;
import com.sportyshoesws.service.Purchaseservice;
@Service
@Transactional
@Component
public class Purchaseserviceimpl implements Purchaseservice {

	@Autowired
	private Purchaserepo purchaserepo;
	
	@Override
	public Purchase createPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return purchaserepo.save(purchase);
	}

	@Override
	public List<Purchase> getAllPurchases() {
		// TODO Auto-generated method stub
		return purchaserepo.findAll();
	}

	@Override
	public Purchase findByPurchaseId(long purchaseid) {
		// TODO Auto-generated method stub
		return purchaserepo.findByPurchaseid(purchaseid);
	}

	@Override
	public List<Products> findByProductCategory(String productcategory) {
		// TODO Auto-generated method stub
		return purchaserepo.findByProductcategory(productcategory);
	}

	@Override
	public List<Purchase> findByPurchaseDate(Date purchaseDate) {
		// TODO Auto-generated method stub
		return purchaserepo.findByPurchaseDate(purchaseDate);
	}

}
