package com.app.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetAndHashSetDifference {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(25);
		t.add(-1);
		t.add(335);
		t.add(34);
		t.add(4);
		t.add(15);
		t.add(5);
		System.out.println("TreeSet :"+t);
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(25);
		h.add(-1);
		h.add(335);
		h.add(34);
		h.add(4);
		h.add(15);
		h.add(5);
		h.add(null);
		System.out.println("HashSet :"+h);
	}

}
