package com.app.comparable;

import java.util.TreeSet;

/*
 * Write a program to insert String and StringBuffer objects into the TreeSet where the 
 * sorting order is increasing length order. If 2 objects having the same length then 
 * consider they alphabetical order.
 */
public class TreeSetDemo2 {
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("xx");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);//[A, AA, xx, ABC, ABCD]
	}

}
