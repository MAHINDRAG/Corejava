package com.app;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("Mahi");
		h.add("RAJA");
		h.add("RAJA");
		h.add("RAVI");
		h.add(null);
		h.add(null);
		Iterator<String> i=h.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
