package com.app.lambda.interfaces.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionWithComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"HP Laptop",25000f));  
		list.add(new Product(3,"Keyboard",300f));  
		list.add(new Product(2,"Dell Mouse",150f));  
		System.out.println("Sorting on the basis of name..");
		//Without using lambda expression
		Collections.sort(list,new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo((o2.getName()));
			}
		});
		
		for(Product p:list){
			System.out.println("ID:"+p.getId()+",Name:"+p.getName()+",Price:"+p.getPrice());
		}

		//using lambda expression
		Collections.sort(list,(p1,p2)->{
			return p1.getName().compareTo(p2.getName()); 
		});
		for(Product p:list){
			System.out.println(p.getId()+","+p.getName()+","+p.getPrice());
		}
		
	}
}
