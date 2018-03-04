package com.app.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s2.compareTo(s1);
	}
}
