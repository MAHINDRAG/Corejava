package com.app.functioninterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

	static void showDetails(String name,Integer age){
		System.out.println(name+":"+age);
	}
	static void showDetails(Map<Integer, String> map,String mapName){
		System.out.println("-------"+mapName+" Records-----");
		map.forEach((key,value)->System.out.println(key+","+value));
	}
	public static void main(String[] args) {
		BiConsumer<String, Integer> bicon = BiConsumerInterfaceExample::showDetails;
		bicon.accept("Mahindra", 101);
		bicon.accept("karthik", 102);
		BiConsumer<String, Integer> bicon2 = BiConsumerInterfaceExample::showDetails;
		bicon2.accept("Vasu", 105);
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(100, "Mahindra");
		map.put(101, "karthik");
		map.put(102, "Dhanu");
		BiConsumer<Map<Integer, String>, String> bicon3 = BiConsumerInterfaceExample::showDetails;
		bicon3.accept(map, "Student");
	}
}
