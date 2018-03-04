package com.app.collection;

import java.util.ArrayList;

public class GetTheValueWithoutInsertingData {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	//	System.out.println(al.get(0));
		/**
		 * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
		 * this is the output for above two lines.
		 */
	//	System.out.println(al.get((Integer) null));
		/**
		 * Exception in thread "main" java.lang.NullPointerException,
		 * Same for LinkedList ,Vector ,Stack , HashMap,LinkedHashMap,TreeSet
		 * 
		 */
		
		/**
		 * 
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println(hm.get(null));//null
		System.out.println(hm.get(0));//null
		* same for LinkedHashMap if reverse also like <String,Integer>
		*/
		
		/**
		 * 
		Hashtable<String,Integer> hm=new Hashtable<String,Integer>();
		System.out.println(hm.get(null));//Exception in thread "main" java.lang.NullPointerException
		System.out.println(hm.get(0));//null
		 * same for TreeMap
		 */
		
		
		
		
		
		  
	
		
	}

}
