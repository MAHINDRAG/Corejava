package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("First:"+ll.get(0));
		ll.add(45);
		ll.add(46);
		ll.add(47);
		ll.add(48);
		System.out.println(ll.get(3));
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(new Integer(23));
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(111);
		al.add(null);
		Iterator<Integer> i = al.iterator();
		
		System.out.println(al);
		System.out.println(al.size());
		List<Object> list2=new ArrayList<Object>(new HashSet<Object>(al));
		System.out.println(list2);
		List<Object> list3=new ArrayList<Object>(new LinkedHashSet<Object>(al));
		System.out.println(list3);
		*/
		
		/*al.remove(new Integer(30));
		al.remove(1);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+"\t");
		}
		for(int v:al){
			System.out.println(v);
		}
		System.out.println(al.contains(111));
		ArrayList<Integer> al1=new ArrayList<Integer>(al);
		al1.add(87);
		System.out.println(al1);
		ArrayList<Integer>  al2=new ArrayList<Integer>();
		al2.addAll(al);
		al2.addAll(al1);
		System.out.println(al2);*/
		
		/*
		 * To sort elements of List according to natural sorting order.
		 */
		ArrayList<String> l=new ArrayList<String>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));//ClassCastException
		//l.add(null);//NullPointerException
		System.out.println("Before sorting :"+l);//[Z, A, K, N]
	    System.out.println("Before sorting Collection Search:"+Collections.binarySearch(l, "k"));
		Collections.sort(l);
		System.out.println("After sorting :"+l);//[A, K, N, Z]
        System.out.println("Collection Search:"+Collections.binarySearch(l, "k"));
        System.out.println("Collection Search:"+Collections.binarySearch(l, "K"));
	}

}
