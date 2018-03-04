package com.app.oops.inheritance;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.methodOne();
		//p.methodTwo();  
		/*
		 * can not find symbol
		 * Symbol : method methodTwo
		 * location : Paarent
		 */
		Child c = new Child();
		c.methodOne();
		c.methodTwo();
		
		Parent p2 = new Child();
		p2.methodOne(); 
		//p2.methodTwo(); //see comment below
		/*
		 * can not find symbol
		 * Symbol : method methodTwo
		 * location : Paarent
		 */
		Child c1 =(Child) new Parent();
		c1.methodOne();
		c1.methodTwo();
		//Child c1 =new Parent();  //see below comment
		/* C.E. incompatible class
		 * Found : Parent
		 * required : Child
		 */
		
		/*1)	Whatever the parent has by default available to the child but whatever the child has by default not available to the parent. Hence on the child reference we can call both parent and child class methods. But on the parent reference we can call only methods available in the parent class and we can’t call child specific methods.
		2)	Parent class reference can be used to hold child class object but by using that reference we can call only methods available in parent class and child specific methods we can’t call.
		3)	Child class reference cannot be used to hold parent class object.
*/
	}
}
