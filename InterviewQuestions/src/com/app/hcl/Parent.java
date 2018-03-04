package com.app.hcl;

public class Parent {

	public static void greeting(String message){
		System.out.println("Parent:"+message);
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent.greeting("Good Morning");
	}
}
