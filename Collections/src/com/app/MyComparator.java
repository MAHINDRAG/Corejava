package com.app;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String obj1 = o1.toString();
		System.out.println("Obj1 :"+obj1);
		String obj2 = o2.toString();
		System.out.println("Obj2 :"+obj2);
		return obj2.compareTo(obj1);
	}
	

}
