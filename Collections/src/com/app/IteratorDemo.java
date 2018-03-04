package com.app;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorDemo {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(32);
	ll.add(33);
	ll.add(35);
	ll.add(39);
	ll.add(37);
	ll.add(32);
	System.out.println(ll);
	System.out.println("forward direction:");
	ListIterator<Integer> it=ll.listIterator();
	while(it.hasNext()){
		System.out.println(it.next()+"\t");
	}
	System.out.println("Reverse direction:");
	while(it.hasPrevious()){
		System.out.println(it.previous()+"\t");
	}
	System.out.println("Elements:"+ll);

}
}
