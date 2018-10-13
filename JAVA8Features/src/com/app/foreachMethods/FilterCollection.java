package com.app.foreachMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class FilterCollection {

	public static void main(String[] args) {

		List<Product> productlist = new ArrayList<Product>();		
		productlist.add(new Product("101","Lenova",35000,2,"Mahindra"));
		productlist.add(new Product("102","Dell",35000,2,"EMC"));
		productlist.add(new Product("103","Apple",35000,2,"TimCook"));
		productlist.add(new Product("104","HP",35000,2,"Prasad"));

		System.out.println("Filter collection using or condition");
		productlist.stream().filter(plist->plist.getId().equals("101") || plist.getId().equals("102"))
		.forEach(plist->{
			System.out.println(plist);
		});

		System.out.println("Filter collection using And condition");
		Stream<Product> filteredData = productlist.stream().filter(plist1->plist1.getId().equals("103") && plist1.getName().equals("Apple"));
		filteredData.forEach(product->{
			System.out.println(product);
		});

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

		Iterator<Product> listOfProducts = productList.iterator();
		while(listOfProducts.hasNext()) {
			Product product = listOfProducts.next();
			if(product.getId().equals("1000")) {
				System.out.println(product);
			}
		}
	}
}
