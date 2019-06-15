package com.st.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.st.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	//List<Product> findByProdCostEquals/* Is */(double prodCost);
	//List<Product> findByProdCostAndComNameEquals(double prodcost,String comName);
	//List<Product> findByProdCostOrComNameEquals(double prodcost,String comName);
	//List<Product> findByProdCostBetween(double prodcost1,double costy);
	List<Product> findByProdCostOrderByProdNameDesc(double prod);
}
