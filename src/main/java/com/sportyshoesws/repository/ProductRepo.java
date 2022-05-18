package com.sportyshoesws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoesws.entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Long>{
	public void deleteByProductid(long productid); 
	public Products findByProductid(long productid);
	public List<Products> findByProductcategory(String productcategory);
}
