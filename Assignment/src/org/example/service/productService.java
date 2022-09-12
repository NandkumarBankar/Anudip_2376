package org.example.service;

import org.example.model.Product;

public class productService {
	public void incresePrice(Product product) {
		double total=product.getPrice();
		product.setPrice(total+100);
		
    	
    }
	}


