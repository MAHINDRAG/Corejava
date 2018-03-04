package com.app.oops;

public class Derived extends Base{

	public Derived() {
		this("ExamVeda");
		System.out.println("Derived");
	}
	
	public Derived(String s){
	  System.out.println(s);	
	}
	
	public static void main(String[] args) {
		new Derived();
	}
}
