package question4.main;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import question4.model.Product;

public class Main {

	public static void main(String[] args) {
		
		Product pr1=new Product(1,"FaceWash",185);
		Product pr2=new Product(2,"Moisturizer",50);
		Product pr3=new Product(3,"Hair oil",75);
		Product pr4=new Product(4,"Shampoo",105);
		Product pr5=new Product(5,"Soap",145);
		
		Product pr[]=new Product[5];
		
		pr[0]=pr1;
		pr[1]=pr2;
		pr[2]=pr3;
		pr[3]=pr4;
		pr[4]=pr5;
		
		List<Product> li=Arrays.asList(pr);
	    
		Product maxPriceProduct = li.stream().max((product1,product5)-> 
	    product1.getProductPrice()> product5.getProductPrice() ? 1: -1).get();
		System.out.println("Max product price  : \n"+maxPriceProduct + "\n");

		
		Product minPriceProduct =li.stream().min((product1, product5)->
        product1.getProductPrice() > product5.getProductPrice() ? 1: -1).get();
		System.out.println("Min product price : \n"+minPriceProduct);

		System.out.println("\nProduct Name Starting With S : ");
		
		Stream<String> stream = Stream.of(
	              "FaceWash", "Moisturizer", "Hair Oil", "Shampoo","Soap");
	      stream.filter(str -> str.startsWith("S"))
	      .forEach(System.out::println);
	          
	      System.out.println("\nProduct Price Betwen 100 & 200 :");
	      
	      Iterator<Product> itr=li.iterator();
	      while(itr.hasNext()) {
	    	  li.stream().filter(p ->p.getProductPrice()> 100 && p.getProductPrice()<200)
	    	  .forEach(System.out::println);
	    	  break;
	      }
	}
}
