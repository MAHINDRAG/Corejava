package com.app.foreachMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("101","Lenova",35000,2,"Mahindra"));
		products.add(new Product("102","Dell",35000,2,"EMC"));
		products.add(new Product("103","Apple",35000,2,"TimCook"));
		products.add(new Product("104","HP",35000,2,"Prasad"));
		System.out.println("using constructor");
		products.forEach(product->{
			System.out.println(product+"\n");
		});
		
		System.out.println("***************************");

		Product prod1 = new Product();
		prod1.setId("1000");
		prod1.setName("Colgate");
		prod1.setPrice(30);
		prod1.setQuantity(3);
		prod1.setManufacturer("Mahesh");
		
		Product prod2 = new Product();
		prod2.setId("1001");
		prod2.setName("MysoreSandilSoap");
		prod2.setPrice(45);
		prod2.setQuantity(2);
		prod2.setManufacturer("Arup");
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(prod1);
		productList.add(prod2);
		
		productList.forEach(prod->{
			System.out.println("Product Details:"+prod.getId()+"\t"+prod.getName()+"\t"+prod.getPrice()+"\t"+prod.getQuantity()+"\t"+prod.getManufacturer());
		});
		
		System.out.println("***************************");
		Iterator<Product> listOfProducts = productList.iterator();
		while(listOfProducts.hasNext()) {
			Product product = listOfProducts.next();
			System.out.println(listOfProducts.next());
			System.out.println("ProductName:"+product.getName());
		}
		
		System.out.println("***************************");
		Iterator<Product> listOfProducts2 = productList.listIterator();
		while(listOfProducts2.hasNext()) {
			Product product = listOfProducts2.next();
			System.out.println(listOfProducts2.next());
			System.out.println("ProductID:"+product.getId());
		}
	}
}
