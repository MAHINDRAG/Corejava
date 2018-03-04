package com.app.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ReplaceConcurrentMethod {
	public static void main(String[] args) {
		ConcurrentMap<Integer, String> chm = new ConcurrentHashMap<Integer,String>();
		/*
		 * Replace Method
		 */
		chm.put(101, "Mahindra");
		chm.replace(101, "Siva","Naresh");
		System.out.println(chm); //{101=Mahindra}
		chm.replace(101, "Mahindra","Adithya");
		System.out.println(chm);//{}

	}
}
