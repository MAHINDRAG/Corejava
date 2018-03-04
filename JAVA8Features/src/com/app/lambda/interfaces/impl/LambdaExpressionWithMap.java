package com.app.lambda.interfaces.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LambdaExpressionWithMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100, "Mahesh");
		map.put(102,"karthik");
		map.put(101, "vinayak");
		map.put(104, "Mahindra");

		//Without lambda expression using forEach loop
		System.out.println("** Without lambda expression using forEach loop **");
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println("key:"+m.getKey()+", Value:"+m.getValue());
		}

		System.out.println("** using iterator **");
		Set<Entry<Integer, String>> it =map.entrySet();
		for(Entry<Integer, String> s:it){
			System.out.println("key:"+s.getKey()+", Value:"+s.getValue());
		}

		//using lambda expression
		System.out.println("** using lambda expression1 **");
		map.forEach((key,value) -> System.out.println("key:"+key+", value:"+value));
		System.out.println("** using lambda expression2 **");
		map.forEach((key,value)->{
			System.out.println("key:"+key+", value:"+value);
			if(100==key){
				System.out.println("Good Morning Mahesh");
			}
		});
	}
}
