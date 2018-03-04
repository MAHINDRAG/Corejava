package com.app.covain;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
   public static void main(String[] args) {
	
	   Set s=new TreeSet();
	   s.add("7");
	   s.add(9);
	   Iterator it=s.iterator();
	   while(it.hasNext()){
		   System.out.println(it.next()+" ");
	   }
}
}
