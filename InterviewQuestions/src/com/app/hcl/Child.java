package com.app.hcl;

public class Child extends Parent {

	public static void greeting(String message){
		System.out.println("Child:"+message);
	}
	public static void main(String[] args) {
		Child.greeting("Good Morning");
		Parent p = new Child();
		p.greeting("Hi");
	}

}
