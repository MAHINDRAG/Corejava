package com.app;

import java.util.ArrayList;

public class CollectionToArray {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(23));
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(null);
		System.out.println("collection output :"+al);
		//converting collection into Array
	    Object arr[]=al.toArray();
	    System.out.println("Array output:");
	    for(Object o:arr){
	    	System.out.print(o+"\t");
	    }

}
}