package com.interview.emtec;

import java.util.HashMap;

public class HashMapDemo {
	final static int HASH_VALUE = 20;
	public static void main(String[] args) {
         HashMap<String, String> hm = new HashMap<String,String>();
         hm.put("abc", "xyz");
         hm.put("cdf", "jkl");
         System.out.println(hm);
	}
	
	@Override
	public int hashCode() {
		return HASH_VALUE;
	}

}
