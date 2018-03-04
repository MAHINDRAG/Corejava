package com.app.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RemoveConcurrentMethod {

	public static void main(String[] args) {
		ConcurrentMap<Integer, String> chm = new ConcurrentHashMap<Integer,String>();
		/*
		 * Remove Method
		 */
		chm.put(101, "Mahindra");
		chm.remove(101, "Siva");
		System.out.println(chm); //{101=Mahindra}
		chm.remove(101, "Mahindra");
		System.out.println(chm);//{}

		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Mahindra");
		hm.remove(101);
		System.out.println(hm); //{}
	}
}
