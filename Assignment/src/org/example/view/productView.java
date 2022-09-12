package org.example.view;
import org.example.model.Product;
import org.example.service.productService;

public class productView {

	public static void main(String[] args) {
		
		Product probj=new Product();
		
		probj.setId(1);
		System.out.println(probj.getId());
		
		probj.setName("Himalaya");
		System.out.println(probj.getName());
		
		probj.setPrice(100);
		System.out.println(probj.getPrice());
		
		productService prsobj=new productService();
		
		
		
		
		
	}

}
