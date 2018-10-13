package com.method.references.impl;

import com.method.references.Sayable;

public class MethodReference {
    public MethodReference() {
		System.out.println("This is constructor");
	}
    
    public void sayHello(){
    	System.out.println("Hello, Good Morning to everyOne");
    }
    
	public static void saySomething(){
		System.out.println("Hello, This is static method ");
		System.out.println("Number :"+Sayable.num);
	}
	public static void main(String[] args) {
		Sayable sayable = MethodReference::saySomething; // Referring static method  
		sayable.say(); // Calling interface method 
		
		Sayable sayable2 = ()->{
			System.out.println("Using Lambda Expression");
		};
		
		sayable2.say();
		
		Sayable sayable3 = MethodReference::new;
		sayable3.say();
		
		MethodReference methodReference = new MethodReference();
		sayable3 = methodReference::sayHello;
		sayable3.say();
	}
}
