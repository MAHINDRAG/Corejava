package com.app;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(100, "Mahi");
	hm.put(103, "Nari");
	hm.put(103, "Rani");
	hm.put(105,"janardhan");
	hm.put(101, "Raji");
	hm.put(100,"Mahi");
	hm.put(100,"RAki");
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.get(100));
	System.out.println(hm.containsKey(201));
	System.out.println("Before Sorting the elements : ");
	for(Map.Entry<Integer,String> m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	Map<Integer,String> hms=new TreeMap<Integer,String>(hm);
	System.out.println("After Sorting the elements by key:");
	for(Map.Entry<Integer, String> m:hms.entrySet()){
		System.out.println(m.getKey()+"  "+m.getValue() );
	}
	
	System.out.println("After Sorting the elements by value :");
	
	
}
}
