package com.st.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.st.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Date is: "+LocalDate.now());
		/*
		 * Optional<Product> pobj=repo.findById(103); if(pobj.isPresent()) { Product
		 * product=pobj.get(); System.out.println(product); }else {
		 * System.out.println("Record is not Found Sorry"); }
		 * //repo.findByProdCostEquals(12.3).forEach(System.out::println);
		 */	
		 //repo.findByProdCostBetween(11.3,15.3).forEach(System.out::println);
		repo.findByProdCostOrderByProdNameDesc(11.3).forEach(s->System.out.println(s));;
	}

	
}
