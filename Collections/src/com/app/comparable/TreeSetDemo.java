package com.app.comparable;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) 
	{
		TreeSet<String> t=new TreeSet<String>(new MyComparator());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);//[ShobaRani, Roja, Ramulamma, RajaKumari, GangaBhavani]
		
		
	}

}
