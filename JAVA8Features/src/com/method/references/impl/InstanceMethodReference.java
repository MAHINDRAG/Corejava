package com.method.references.impl;

import com.method.references.Sayable;

public class InstanceMethodReference {

	public void saySomething(){
		System.out.println("Hello, this is non static method");
	}
	
	public static void main(String[] args) {
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();// Creating object 
		Sayable sayable = instanceMethodReference::saySomething; // Referring non-static method using reference  
		sayable.say(); // Calling interface method  
		
	    // Referring non-static method using anonymous object 
		Sayable sayable2 = new InstanceMethodReference()::saySomething;
		sayable2.say();// Calling interface method
	}
}
