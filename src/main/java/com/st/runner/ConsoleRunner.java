package com.st.runner;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.st.entity.Product;
import com.st.repo.ProductRepository;

@Component
public class ConsoleRunner implements ApplicationRunner{

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Date is: "+LocalDate.now());
	Optional<Product> pobj=repo.findById(103);
	if(pobj.isPresent()) {
	Product	product=pobj.get();
	System.out.println(product);
	}else {
		System.out.println("Record is not Found Sorry");
	}

	}

	
}
