package org.example.model;

public class Product {

	private int id;
	private String name;
    private double price;
    
     void  product() {
    	int id=11;
    	String name="Himalaya";
    	double price=99;
    	
    }
    
    
    //seter  //getter
    
     public void setId(int i) {
    	 id=i;
     }
     public int getId() {
    	 return id; 
     }
     public String getName() {
    	 return name;
     }
     
     public void setName(String n) {
    	 name=n;
     }
     
     public void setPrice(double p) {
    	 price=p;
     }
     public double getPrice() {
    	 return price;
     }
     
    
     
     
    
    
}