package com.app;

import java.util.Enumeration;
import java.util.Stack;

public class VectorDemo {
public static void main(String[] args) {
	Stack<Double> s=new Stack<Double>();
	s.add(3.14);
	s.add(4.12);
	s.add(5.14);
	s.add(6.14);
	s.push(10.2);
	s.push(13.2);
	s.push(11.2);
	
	System.out.println(s.peek());
	System.out.println(s);
	Enumeration<Double> e=s.elements();
	while(e.hasMoreElements()){
		System.out.println(e.nextElement());
	}
	
	
}
}
