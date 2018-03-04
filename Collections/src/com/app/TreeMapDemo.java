package com.app;

import java.util.TreeMap;

public class TreeMapDemo {
	
     public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>(new MyComparator());
    	//TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
    	tm.put(109, "Lohitha");
	    tm.put(107, "Niharika");
	    tm.put(105, "Harini");
	   // tm.put(null, null); //NullPointerException
	    System.out.println(tm);
	}
}
