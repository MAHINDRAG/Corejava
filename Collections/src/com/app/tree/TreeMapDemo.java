package com.app.tree;

import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.get(null);
		map.put(104, "janardhan");
		map.put(100, "Mahindra");
		map.put(101, "Adithya");
		map.put(100, "Girish");
		map.put(103, null);
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}
}
