package com.app.functioninterface;

@FunctionalInterface
public interface Sayable extends Doable{

	public void say(String msg);  // abstract method
	
	// It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}
