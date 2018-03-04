package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfDuplicateElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mahindra");
		al.add("Mahindra");
		al.add("Mahi");
		al.add("Mahi");
		al.add("Mahi");
		al.add("Mahindra");
		al.add("Mahindra");
		al.add("Mahesh");

		System.out.println("Count of Mahindra:"+Collections.frequency(al, "Mahindra"));

		System.out.println("Count all with set");
		Set<String> uniqueset = new HashSet<String>(al);
		for(String temp:uniqueset){
			int count = Collections.frequency(al, temp);
			System.out.println(count);
			System.out.println(temp+":"+Collections.frequency(al, temp));
		}

		System.out.println("Count all with Map");
		Map<String, Integer> map = new HashMap<String,Integer>();
		for(String temp:al){
			Integer count = map.get(temp);
			map.put(temp, (count==null)?1:count+1);	
		}

		printMap(map);
	}
	public static void printMap(Map<String, Integer> map){
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
