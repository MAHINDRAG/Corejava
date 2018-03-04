package com.app.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentMap<Integer, String> chm = new ConcurrentHashMap<Integer,String>();
		/*
		 * putIfAbset Method
		 */
		chm.put(101, "Mahindra");
		chm.putIfAbsent(101, "Siva");
		System.out.println(chm); //{101=Mahindra}
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Mahindra");
		hm.put(101, "Siva");
		System.out.println(hm); //{101=Siva}
		
		
	}
}
