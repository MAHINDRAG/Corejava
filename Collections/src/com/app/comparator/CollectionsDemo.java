package com.app.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
	//	l.add(new Integer(10));
		//l.add(null);//NullPointerException
		System.out.println("Before sorting :"+l);//[Z, A, K, L, 10]
		System.out.println("Before sorting Collection Search:"+Collections.binarySearch(l, "K",new MyComparator()));
		Collections.sort(l,new MyComparator());
		System.out.println("After sorting :"+l);//[Z, L, K, A, 10]
		System.out.println("Collection Search:"+Collections.binarySearch(l, "L",new MyComparator()));
		System.out.println("Collection Search:"+Collections.binarySearch(l, "l",new MyComparator()));

	}
}
