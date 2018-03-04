package com.app.lambda.interfaces.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressionWithList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mahesh");
		list.add("karthik");
		list.add("Vinayak");
		list.add("Mahindra");
		
		//Without Lambda Expression
		System.out.println("Without Lambda Expressions using for loop");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("Without Lambda Expressions using forEach loop");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("using iterator");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//With Lambda Expression
		System.out.println("With Lambda Expressions using forEach loop");
		list.forEach(
				(n)-> System.out.println(n)
				);
	}
}
