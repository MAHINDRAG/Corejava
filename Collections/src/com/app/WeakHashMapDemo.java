package com.app;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		
		/*
		 * WeakHashMap 
		 */
		WeakHashMap<Temp, String> whm = new WeakHashMap<Temp,String>();
		Temp temp = new Temp();
		whm.put(temp, "Mahindra");
		System.out.println(whm);
		temp = null;
		System.gc();
		try {
			Thread.sleep(4000);
			System.out.println(whm);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("+++++++++++++++++++++++");
		
		/*
		 * HashMap
		 */
		
		HashMap<Temp,String> hm = new HashMap<Temp,String>();
		Temp temp1 = new Temp();
		hm.put(temp1, "Naresh");
		System.out.println("HashMap:"+hm);
		temp1 = null;
		System.gc();
		try {
			Thread.sleep(4000);
			System.out.println("HashMap:"+hm);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
