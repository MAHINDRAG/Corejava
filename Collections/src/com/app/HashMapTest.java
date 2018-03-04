package com.app;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("Mahi", 100);
		hmap.put("Rakesh", 201);
		hmap.put(null, 236);
		hmap.put("Raja", 500);
		hmap.put("Raja", 403);
		hmap.put("Raju", 435);
		System.out.println(hmap);
		
	}
}
