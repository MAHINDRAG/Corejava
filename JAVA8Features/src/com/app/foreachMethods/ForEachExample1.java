package com.app.foreachMethods;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample1 {

	public static void main(String[] args) {
	   List<String> nameList = new ArrayList<String>();
	   nameList.add("Mahindra");
	   nameList.add("Gopisetty");
	   nameList.add("Adithya");
	   nameList.add("Girish");
	   System.out.println("-- Iterating by passing lambda expression --");
	   nameList.forEach(list->System.out.println(list));
	   System.out.println("-- Iterating by passing method reference --");
	   nameList.forEach(System.out::println);
	   System.out.println("-- forEachOrdered Method --");
	   System.out.println("------------Iterating by passing lambda expression---------------");  
	   nameList.stream().forEachOrdered(list->System.out.println(list));
	   System.out.println("------------Iterating by passing method reference---------------");
	   nameList.stream().forEachOrdered(System.out::println);
	   
	   
	}

}
