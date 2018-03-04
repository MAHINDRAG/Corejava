package com.app.lambda.interfaces.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionWithComparator1 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(12,"DELL",25000f));
		list.add(new Product(16,"Lenova",35000f));
		list.add(new Product(9,"Apple",55000f));
		list.add(new Product(8,"xerox",55000f));

		//without using lambda expression
		System.out.println("sorting on the basis of Age");
		Collections.sort(list,new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getId()-(o2.getId());
			}
		});
		
		for(Product p:list){
			System.out.println("ID:"+p.getId()+",Name:"+p.getName()+",Price:"+p.getPrice());
		}
		
		System.out.println("** using lambda expression on the basis of Age **");
		Collections.sort(list,(p1,p2)->{
			return p1.getId() - p2.getId();
		});
		
		for(Product p:list){
			System.out.println("ID:"+p.getId()+",Name:"+p.getName()+",Price:"+p.getPrice());
		}
		
		System.out.println("Soring on the basis of name without using lambda expression");
		list.sort(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Product p:list){
			System.out.println("ID:"+p.getId()+",Name:"+p.getName()+",Price:"+p.getPrice());
		}
		
		System.out.println("Soring on the basis of name with using lambda expression");
		list.sort((p1,p2)->p1.getName().compareTo(p2.getName()));
		
		for(Product p:list){
			System.out.println("ID:"+p.getId()+",Name:"+p.getName()+",Price:"+p.getPrice());
		}
		System.out.println("List: "+list);
	}
}
