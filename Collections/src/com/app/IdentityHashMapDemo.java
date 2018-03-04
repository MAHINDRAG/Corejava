package com.app;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer,String>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = 11;
		Integer i4 = 11;
		System.out.println(i1==i2);
		System.out.println(i3==i4);
		ihm.put(i1, "Mahindra");
		ihm.put(i2, "Kalyan");
		ihm.put(i3, "Rahul");
		ihm.put(i4, "Girish");
		System.out.println(ihm);
		for(Map.Entry<Integer, String> m:ihm.entrySet()){
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
