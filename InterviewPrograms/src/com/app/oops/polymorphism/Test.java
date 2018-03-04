package com.app.oops.polymorphism;

public class Test {
	public static void main(String[] args) {
	   Parent p = new Parent();
	   p.show();
	   p.print();
	   Child c =new Child();
	   c.show();
	   c.print();
	   Parent p1 = new Child();
	   p1.show();
	   p1.print();
	   
	 /*  Note: If both Parent and Child class methods are non static then it will become overriding and method resolution is based on runtime object. In this case the output is 
	   Parent class
	   Child class
	   Child class
*/
	}
}
